<%--
  Created by IntelliJ IDEA.
  User: Link
  Date: 2020/12/27
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>栏目管理</title>
    <link href="../../css/style.css" rel="stylesheet" type="text/css">
    <script>
        function xiugai2()
        {
            var str = confirm("是否确定修改栏目名称？");
            if(str == true)
            {
                alert("确定修改！");
            }
            else
            {
                alert("取消修改！");
            }
        }


    </script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td height="25" align="center" valign="bottom" class="td06"> <table width="100%"  border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td width="2%" valign="middle" background="../../images/bg_03.gif">&nbsp;</td>
                    <td width="2%" valign="middle" background="../../images/bg_03.gif"><img src="../../images/main_28.gif" width="9" height="9" align="absmiddle"></td>
                    <td height="30" valign="middle" background="../../images/bg_03.gif"><div align="left"><font color="#FFFFFF">栏目修改</font></div></td>
                </tr>
            </table></td>
        </tr>
    </table>
    <form name="form1" method="post" action="${pageContext.request.contextPath}/desktop/news/updatenewslabel.do?id=${NewsLabel.id}">
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">
            <tr>
                <td class="td_02">栏目名称</td>
                <td class="td_02"><input value="${NewsLabel.label_name}" name="label_name" type="text" class="input" style="width:99% "></td>
            </tr>
            <tr>
                <td class="td_02">上级栏目名称</td>
                <td class="td_02">
                    <select name="pid" style="width:99%">
                    <option value="0">无</option>
                    <option value="1" ${NewsLabel.pid=='1'?'selected':''}>体育新闻</option>
                    <option value="2" ${NewsLabel.pid=='2'?'selected':''}>娱乐新闻</option>
                    <option value="3" ${NewsLabel.pid=='3'?'selected':''}>时政新闻</option>
                </select></td>
            </tr>
            <tr>
                <td width="14%" class="td_02">栏目描述</td>
                <td width="86%" class="td_02">
                    <textarea name="label_content" rows="5" style="width:99% ">${NewsLabel.label_content}</textarea>
                </td>
            </tr>
        </table>
        <br>
        <table width="95%"  border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td class="td_page"><div align="center">

                    <input name="Submit1" type="submit" class="buttonface02" value="  修 改  " onClick="xiugai2()">
                    &nbsp;&nbsp;
                    <input name="Submit2" type="reset" class="buttonface02" value="  重 置  ">
                    &nbsp;
                    <input name="Submit3" type="submit" class="buttonface02" id="close" value="  关 闭  " onclick="localStorage.setItem('1',2);window.close();" >
                </div></td>
            </tr>
        </table>
        <p>&nbsp;</p>
    </form>
</center>
</body>
</html>
