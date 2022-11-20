/**
 * 
 */
 function logg(){
	let mail = document.getElementById("exampleInputEmail1").value;
	let status = true;
	if(mail ==""){
		document.getElementById("usn").innerHTML = "Please enter your email";
		document.getElementById("exampleInputEmail1").style.boxShadow = "0px 0px 7px red";
		document.getElementById("exampleInputEmail1").style.border = "2px solid red";
		status = false;
	}
	return status;
}