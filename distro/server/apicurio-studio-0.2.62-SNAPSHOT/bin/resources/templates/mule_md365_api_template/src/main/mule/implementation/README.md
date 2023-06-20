Mule API starter project template

This Template API 2.0 is a mule api project template that you can use as a starting point for development of your own implementation.


##Mule Flows Overview
The example that follows contains the following <flow> elements:

##create-empty-contact-subflow
Creates an empty contact entity that is required later in other flows.
[GET] The HTTP endpoint listens to the following URL: http://localhost:8081/createContact

##create-empty-opportunity-subflow
Creates an empty opportunity entity that is required later in other flows.
[GET] The HTTP endpoint listens to the following URL: http://localhost:8081/createOpportunity

##create-account-subflow
Creates an account with specified attributes and also associates the account with a contact.
[POST] HTTP endpoint listens to the following URL: http://localhost:8081/createAccount = Request example: {"AccountName":"Test Account Name","CreditOnHold":true,"CreditLimit":1000,"ContactID":"<ID>"}

##create-multiple-entities-subflow
Creates multiple entities of the same type in a single batch request.
[POST] The HTTP endpoint listens to the following URL: http://localhost:8081/createMultipleAccounts
Request example: [{"AccountName":"Account Name 1","CreditOnHold":true,"CreditLimit":1500},{"AccountName":"Account Name 2","CreditOnHold":false,"CreditLimit":2000}]

##update-multiple-entities-subflow
Updates multiple entities of the same type in a single batch request.
[POST] The HTTP endpoint listens to the following URL: http://localhost:8081/updateMultipleAccounts
Request example: [{"EntityId":"<ID>","AccountName":"Updated Name 1"},{"EntityId":"<ID>","AccountName":"Updated Name 2"}]

##delete-entity-subflow
Deletes an entity of a specified type.
[POST] The HTTP endpoint listens to the following URL: http://localhost:8081/deleteAccount
Request example: {"EntityId":"<ID>"}

##retrieve-entity-subflow
Retrieves an entity of a specified type.
[POST] The HTTP endpoint listens to the following URL: http://localhost:8081/retrieveAccount
Request example: {"EntityId":"<ID>"}

##retrieve-multiple-entities-by-url-subflow
Retrieves multiple entities based on a URL request.
[GET] The HTTP endpoint listens to the following URL: http://localhost:8081/retrieveAccountsByURL

##retrieve-multiple-entities-by-query-subflow
Retrieves multiple entities based on Datasense Query Language.
[GET] The HTTP endpoint listens to the following URL: http://localhost:8081/retrieveAccountsByQuery

Browse to http://localhost:8081 to test the flows, or you can POST JSONs using a tool like curl, or any other tool (Chrome/Mozilla Firefox extensions) that lets you POST a body when calling the URL.