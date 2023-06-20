package com.utils;
import java.io.ByteArrayOutputStream;

import java.io.IOException;

import java.util.Base64;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;

import com.google.zxing.MultiFormatWriter;

import com.google.zxing.WriterException;

import com.google.zxing.client.j2se.MatrixToImageWriter;

import com.google.zxing.common.BitMatrix;

 public class GenerateQrCode {

//static function that creates QR Code

public static String generateQRcode(String data, int heightOfQR, int widthOfQR) throws WriterException, IOException

{

    String charset = "UTF-8";

    //the BitMatrix class represents the 2D matrix of bits

    //MultiFormatWriter is a factory class that finds the appropriate Writer subclass for the BarcodeFormat requested and encodes the barcode with the supplied contents.

    BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, widthOfQR, heightOfQR);

    //System.out.print( MatrixToImageWriter.toBufferedImage(matrix));

    //Converting BitMatrix to PNG

    String imageString = null;

    ByteArrayOutputStream bos = new ByteArrayOutputStream();

    try {

    ImageIO.write(MatrixToImageWriter.toBufferedImage(matrix), "png", bos);

    byte[] imageBytes = bos.toByteArray();

    //Convert PNG to Base64 String

    Base64.Encoder encoder = Base64.getEncoder();

    imageString = encoder.encodeToString(imageBytes);

    bos.close();

    } catch (IOException e) { e.printStackTrace(); }

    //Return Base64 String to Calling Function

    return imageString;

    }

};