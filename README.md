## Json to Java Object

This is a simple repo made to help demonstrate the steps for creating a Java object from a json format file or
response.

Please look under the test directory to see different ways of creating a POJO from json.

### SimplePojo Class

This class contains a simple java object with relevant getter methods. In the test you can see I have created a json
object which is being passed into the `gson.fromJson()` method and assigned to a SimplePojo object. 

In my tests I am asserting that the getter methods of the SimplePojo instance are returning the correct values from the original 
json object.

### AnnotationPojo Class

This class is another simple java object with the addition of annotations from the Gson library `com.google.gson.annotations.çName`.
You might wonder why you would use this class. One of the reasons you might use this library is when you have specific 
domain language and your models are created around this. If you are consuming third party api's which most likely be in the
form of a json response you may come across 'keys' in a `key : value` that don't conform to your model.

So instead of changing your model you use the serialized name provided in the json response inside the annotation. So when your
pojo is instantiated using the gson library it will automatically assign the valued from the json to the correct instance 
variables of your pojo.

In my test as above I am asserting that the getter methods of the AnnotationPojo instance are returning the correct values from the original json object.
 
##### Example:

json response

````
{
    "custom_field_102": "Lee"
}

````

model 
````
class SomeClass

   @SerializedName("custom_field_102") String name;

````


###### Disclaimer

This is a MIT licensed repo. Please let me know if there are any errors and if you have any feedback. I will add to this repo 
other complicated json structures over time.

