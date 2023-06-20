Mule API starter project template

This Template API 2.0 is a mule api project template that you can use for QR code generator in Mule.

## introduction
A QR code (can be abbreviated as quick response code) is a type of matrix barcode. 
Currently we don't have any Mule component that can generate QR code from provided String/URI in Mulesoft.It can generate user provided string/URL to qr code in mule 4.
We can create our own java function by using qr library in this case we will use ZXing and call it from Mulesoft.
I am gonna talk about the solution where we can use 3rd party java library "ZXing" that can help us to create QR code. We will provide a string to the function that can help us to convert any string(URL/String etc) to QR code.

## Prerequisites
MuleSoft Anypoint Studio 7.x or later
JDK 1.8 or later
Anypoint Platform account (if deploying to CloudHub)

##Getting Started
Clone this repository to your local machine.
Open the project in Anypoint Studio.
Run the application in Anypoint Studio to generate a QR code.
To generate a different QR code, update the data queryParams as per your requirements in the HTTP request.
Deploy the application to CloudHub if desired.