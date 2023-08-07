package io.apicurio.hub.api.fmpp;

import io.apicurio.hub.api.fmpp.setting.Settings;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MuleAppGenerator {


    protected Settings settings;
    protected String openApiDoc;

    protected static Charset utf8 = StandardCharsets.UTF_8;
    /**
     * Configure the settings.
     *
     * @param settings
     */
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * Generates a JaxRs project and streams the generated ZIP to the given
     * output stream.
     *
     * @param output
     * @throws IOException
     */
    public final void generate(OutputStream output) throws IOException {
        StringBuilder log = new StringBuilder();

        try (ZipOutputStream zos = new ZipOutputStream(output)) {
            try {
                settings.execute(zos,openApiDoc);
               /* String templateType=settings.getProject().getAttributes().get("templateType");
                    String specPath = "out/templateType/"+"src/main/resources/" +"META-INF/openapi.json";
                    log.append("Generating " + specPath + "\r\n");
                    zos.putNextEntry(new ZipEntry(specPath));
                    zos.write(this.openApiDoc.getBytes(utf8));
                    zos.closeEntry();*/

            } catch (Exception e) {
                // If we get an error, put an PROJECT_GENERATION_ERROR file into the ZIP.
                zos.putNextEntry(new ZipEntry("PROJECT_GENERATION_FAILED.txt"));
                zos.write("An unexpected server error was encountered while generating the project.  See\r\n".getBytes());
                zos.write("the details of the error below.\r\n\r\n".getBytes());
                zos.write("Generation Log:\r\n\r\n".getBytes());
                zos.write(log.toString().getBytes("utf8"));
                zos.write("\r\n\r\nServer Stack Trace:\r\n".getBytes());

                PrintWriter writer = new PrintWriter(zos);
                e.printStackTrace(writer);
                writer.flush();
                zos.closeEntry();
            }
            finally {
                //zos.getZipFileWriter().close();
               // cleanupSession();
            }
        }
    }

    

    /**
     * Generate the JaxRs project.
     *
     * @throws IOException
     */
    public ByteArrayOutputStream generate() throws IOException {
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            this.generate(output);
            return output;
        }
    }

    public void setOpenApiDocument(String content) {
        this.openApiDoc = content;
    }

    public void setOpenApiDocument(URL url) throws IOException {
        InputStream is = url.openStream();

        try {
            this.setOpenApiDocument(is);
        } catch (Throwable var6) {
            if (is != null) {
                try {
                    is.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }
            }

            throw var6;
        }

        if (is != null) {
            is.close();
        }

    }

    public void setOpenApiDocument(InputStream stream) throws IOException {
        this.openApiDoc = IOUtils.toString(stream, utf8);
    }

}
