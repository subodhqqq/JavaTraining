/**
 * Created by Subodh on 04/01/2022.
 */
var UserName =document.getElementById("UserName").value;
var Full_Name =document.getElementById("Full_Name").value;
function  checkValidation() {

    if (UserName || Full_Name === "") {
     alert("enter bodth field")
    }
}