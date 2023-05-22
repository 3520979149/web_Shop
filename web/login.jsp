 <%--
  Created by IntelliJ IDEA.
  User: 北
  Date: 2023/3/27
  Time: 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <!-- 导入字体图标 -->
    <link rel="stylesheet" href="./css/login.css">

</head>

<body>
<div class="shell">
    <div class="container a-container" id="a-container">
        <form action="/login?action=info" method="post" class="form" id="b-form">
            <h2 class="form_title title">登入账号</h2>
            <span class="form_span">用户名登录</span>
            <input type="text" class="form_input" placeholder="昵称" id="loginName" name="userName"/>
            <input type="password" class="form_input" placeholder="密码" name="userPwd"/>
            <span class="form_span" style="width: 350px; height: 40px;">${message}</span>
            <a class="form_link">忘记密码？</a>
            <input type="submit" class="button" value="SIGN IN">
        </form>
    </div>

    <div class="container b-container" id="b-container" >
        <form action="/login?action=add" method="post" class="form" id="a-form">
            <h2 class="form_title title">创建账号</h2>
            <span class="form_span">电子邮箱注册</span>
            <input type="text" class="form_input" placeholder="昵称"  name="userName"/>
            <input type="text" class="form_input" placeholder="邮箱"  name="userEmail"/>
            <input type="password" class="form_input" placeholder="密码" name="userPwd"/>
            <span class="form_span" style="width: 350px; height: 40px;">${register}</span>
            <input type="submit" class="button" value="SIGN UP"/>
        </form>

    </div>

    <div class="switch" id="switch-cnt">
        <div class="switch_circle"></div>
        <div class="switch_circle switch_circle-t"></div>
        <div class="switch_container" id="switch-c1">
            <h2 class="switch_title title" style="letter-spacing: 0;">Hello Friend！</h2>
            <p class="switch_description description">去注册一个账号，成为尊贵的粉丝会员，让我们踏入奇妙的旅途！</p>
            <button class="switch_button button switch-btn">SIGN UP</button>
        </div>

        <div class="switch_container is-hidden" id="switch-c2">
            <h2 class="switch_title title" style="letter-spacing: 0;">Welcome Back！</h2>
            <p class="switch_description description">已经有账号了嘛，去登入账号来进入奇妙世界吧！！！</p>
            <button class="switch_button button switch-btn">SIGN IN</button>

        </div>
    </div>
</div>
</body>

</html>
<script type="text/javascript">
    let switchCtn = document.querySelector("#switch-cnt");
    let switchC1 = document.querySelector("#switch-c1");
    let switchC2 = document.querySelector("#switch-c2");
    let switchCircle = document.querySelectorAll(".switch_circle");
    let switchBtn = document.querySelectorAll(".switch-btn");
    let aContainer = document.querySelector("#a-container");
    let bContainer = document.querySelector("#b-container");
    let allButtons = document.querySelectorAll(".submit");

    let getButtons = (e) => e.preventDefault()
    let changeForm = (e) => {
        // 修改类名
        switchCtn.classList.add("is-gx");
        setTimeout(function () {
            switchCtn.classList.remove("is-gx");
        }, 1500)
        switchCtn.classList.toggle("is-txr");
        switchCircle[0].classList.toggle("is-txr");
        switchCircle[1].classList.toggle("is-txr");

        switchC1.classList.toggle("is-hidden");
        switchC2.classList.toggle("is-hidden");
        aContainer.classList.toggle("is-txl");
        bContainer.classList.toggle("is-txl");
        bContainer.classList.toggle("is-z");
    }
    // 点击切换
    let shell = (e) => {
        for (var i = 0; i < allButtons.length; i++)
            allButtons[i].addEventListener("click", getButtons);
        for (var i = 0; i < switchBtn.length; i++)
            switchBtn[i].addEventListener("click", changeForm)
    }
    window.addEventListener("load", shell);


</script>
</body>

</html>
