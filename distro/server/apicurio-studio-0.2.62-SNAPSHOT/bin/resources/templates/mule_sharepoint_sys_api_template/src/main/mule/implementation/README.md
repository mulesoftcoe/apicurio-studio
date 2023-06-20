Mule API starter project template

This Template API 2.0 is a mule api project template that you can use as a starting point for development of your own SharePoint Connector implementation.

## SharePoint Connector for Mule 4
This connector provides access to SharePoint Online and SharePoint 2013 on-premises using MuleSoft Anypoint Platform. It uses the SharePoint REST API to interact with SharePoint resources.

## Prerequisites
MuleSoft Anypoint Studio 7.x or later
Mule Runtime 4.x or later
SharePoint Online or SharePoint 2013 on-premises instance
SharePoint account credentials

## Installation
Download the latest version of the SharePoint Connector from the MuleSoft Exchange.
Install the connector in your Anypoint Studio environment.
Add the connector to your Mule project by including it as a dependency in your pom.xml file:

<dependency>
    <groupId>com.mulesoft.connectors</groupId>
    <artifactId>mule-sharepoint-connector</artifactId>
    <version>${mule.sharepoint.version}</version>
    <classifier>mule-plugin</classifier>
</dependency>

Make sure to replace ${mule.sharepoint.version} with the version of the connector you installed.

## Getting Started
Create a new Mule project in Anypoint Studio.
Add the SharePoint connector to your Mule project.
Configure the SharePoint connector with your SharePoint account credentials and endpoint in properties.yaml under src/main/resources/properties.
Use the connector in your Mule flows to interact with SharePoint resources, such as lists and libraries.
For detailed information on how to configure and use the SharePoint connector, please refer to the connector documentation "https://docs.mulesoft.com/sharepoint-connector/3.5/sharepoint-connector-reference".