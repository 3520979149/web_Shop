function checkName(){
    var flag=false;
    var userName=document.getElementById("userName").values();
    if(userName.length==0){
        // document.getElementById("n_msg").innerHTML="昵称不能为空！";
    }else if(userName.indexOf(a-z)==-1||email.indexOf(1-9)==-1){
        // document.getElementById("n_msg").innerHTML="昵称中必须包含字母和数字";
    }else{
        flag=true;
    }
    return flag;
}
function checkPwd(){
    var flag=false;
    var pwd=document.getElementsByName("userPwd").value;
    if(pwd.length==0){
        // document.getElementById("p_msg").innerHTML="密码不能为空！";
    }else if(pwd.length<6){
        // document.getElementById("p_msg").innerHTML="密码长度不能小于6位";
    }else{
        flag=true;
        // document.getElementById("p_msg").innerHTML="√";
    }
    return flag;
}
function checkEmail(){
    var flag=false;
    var email=document.getElementsByName("userEmail").value;
    if(email.length==0){
        // document.getElementById("e_msg").innerHTML="邮箱不能为空！";
    }else if(email.indexOf("@")==-1||email.indexOf(".")==-1){
        // document.getElementById("e_msg").innerHTML="邮箱中必须包含@和.";
    }else{
        flag=true;
        document.getElementById("e_msg").innerHTML="√";
    }
    return flag;
}
function checkFrom() {
    if (!(checkPwd() & checkEmail())) {
        return false;
    } else {
        return true;
    }
}