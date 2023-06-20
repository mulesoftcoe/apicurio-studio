/*
 * Copyright 2018 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apicurio.hub.api.beans;

/**
 * @author eric.wittmann@gmail.com
 */
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = CodegenTemplateTypeDeserializer.class)
public enum CodegenTemplateType {

    connectors_version_template("connectors_version_template"),
    mule_http_sync_api_template("mule_http_sync_api_template"),
    mule_batch_api_template("mule_batch_api_template"),
    mule_kafka_sync_exp_api_template("mule_kafka_sync_exp_api_template"),
    mule_kafka_sync_sys_api_template("mule_kafka_sync_sys_api_template"),
    mule_md365_api_template("mule_md365_api_template"),
    mule_qr_code_generator_api_template("mule_qr_code_generator_api_template"),
    mule_sfdc_sync_sys_api_template("mule_sfdc_sync_sys_api_template"),
    mule_sftp_sync_exp_api_template("mule_sftp_sync_exp_api_template"),
    mule_sftp_sync_sys_api_template("mule_sftp_sync_sys_api_template"),
    mule_sharepoint_sys_api_template("mule_sharepoint_sys_api_template"),
    mule_sync_process_api_template("mule_sync_process_api_template");


    final String templateName;

    CodegenTemplateType(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }
}
