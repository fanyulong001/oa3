<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>栏目管理</title>
    <link href="../../css/style.css" rel="stylesheet" type="text/css">
    <script language="javascript" src="../../js/util.js"></script>


    <script>
        function shanchu() {
            var str = confirm("是否确定删除上级栏目？");
            if (str === true) {
                alert("确定删除！");
            } else
            {
                alert("取消删除！");
            }
        }
        localStorage.setItem('1',1)
        window.addEventListener("storage", function (e){
            if (e.newValue==2)
            location.reload()})
    </script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td height="25" align="center" valign="bottom" class="td06">
                <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                    <tr>
                        <td width="2%" valign="middle" background="../../images/bg_03.gif">&nbsp;</td>
                        <td width="2%" valign="middle" background="../../images/bg_03.gif"><img
                                src="../../images/main_28.gif" width="9" height="9" align="absmiddle"></td>
                        <td height="30" valign="middle" background="../../images/bg_03.gif">
                            <div align="left"><font color="#FFFFFF">栏目管理</font></div>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <form name="form1" method="post" action="">
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">
            <tr>
                <td colspan="2" class="td_02"><SPAN class=td_title>根据栏目名称查询</SPAN></td>
            </tr>
            <tr>
                <td width="14%" class="td_02">栏目名称</td>
                <td width="86%" class="td_02">
                    <select name="select" class="input"  style="width:99% " onchange="window.location=this.value">
                        <option value="#">---请选择---</option>
                        <option value="${pageContext.request.contextPath}/desktop/news/querynewslabel.do" ${URL=='querynewslabel.do'?'selected':''}>所有栏目</option>
                        <option value="${pageContext.request.contextPath}/desktop/news/querysportnewslabel.do" ${URL=='querysportnewslabel.do'?'selected':''}>体育新闻</option>
                        <option value="${pageContext.request.contextPath}/desktop/news/queryennewslabel.do" ${URL=='queryennewslabel.do'?'selected':''}>娱乐新闻</option>
                        <option value="${pageContext.request.contextPath}/desktop/news/querygonewslabel.do" ${URL=='querygonewslabel.do'?'selected':''}>时政新闻</option>
                    </select>
                </td>
            </tr>
            <!--  <tr>
               <td class="td_02">二级栏目名称</td>
               <td class="td_02">
                 <select name="select" class="input" style="width:99% ">
                   <option value="1" selected>--请选择--</option>
                   <option value="2">天下足球</option>
                   <option value="3">我猜</option>
                 </select>
               </td>
             </tr> -->
        </table>
        <br>
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td class="td_page" align="left">
                    <div align="right">
                        <input  name="Submit" type="submit" class="buttonface02" value="添加栏目"
                               onClick="javascript:windowOpen('toaddnewslabel.do','','',700,300,'','','')">
                    </div>
                </td>
            </tr>
        </table>
        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">

            <tr>
                <td colspan="5" align="right" class="td07"><img src="../../images/1.gif" width="4" height="5"
                                                                align="absmiddle"> <a href="${pageContext.request.contextPath}/desktop/news/${URL}?pageno=1">首页</a>　 <img src="../../images/2.gif"
                                                                                            width="3" height="5"
                                                                                            align="absmiddle"> <a href="${pageContext.request.contextPath}/desktop/news/${URL}?pageno=${page.pageno-1>1 ? page.pageno-1:1} ">上一页</a>　 <img
                        src="../../images/2-2.gif" width="3" height="5" align="absmiddle"> <a href="${pageContext.request.contextPath}/desktop/news/${URL}?pageno=${page.pageno+1<page.totalPages ? page.pageno+1:page.totalPages}">下一页</a>　 <img
                        src="../../images/3.gif" width="4" height="5" align="absmiddle"> <a href="${pageContext.request.contextPath}/desktop/news/${URL}?pageno=${page.totalPages}">末页</a>  当前为第 ${page.pageno} 页 共 ${page.totalPages} 页 ${page.totalRow} 条记录
                </td>
            </tr>
            <tr>
                <td width="17%" class="td_top">栏目名称</td>
                <td width="15%" class="td_top">上级栏目名称</td>
                <td width="44%" class="td_top">栏目描述</td>
                <td width="12%" class="td_top">删除</td>
                <td width="12%" class="td_top">修改</td>
            </tr>
            <c:forEach items="${page.datas}" var="nl">
                <tr>
                    <td class="td07">${nl.label_name}</td>
                    <td class="td07">${nl.parent.label_name}</td>
                    <td class="td07">${nl.label_content}</td>
                    <td class="td07"><a href="${pageContext.request.contextPath}/desktop/news/deletenewslabel.do?id=${nl.id}">删除</a></td>
                    <td class="td07"><a href="#"
                                        onClick="javascript:windowOpen('toupdatenewslabel.do?id=${nl.id}','','',670,260,'no','yes','100','100')">修改</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td class="td07">&nbsp;</td>
                <td class="td07">&nbsp;</td>
                <td class="td07">&nbsp;</td>
                <td class="td07">&nbsp;</td>
                <td class="td07">&nbsp;</td>
            </tr>
            <tr>
                <td class="td07">&nbsp;</td>
                <td class="td07">&nbsp;</td>
                <td class="td07">&nbsp;</td>
                <td class="td07">&nbsp;</td>
                <td class="td07">&nbsp;</td>
            </tr>
        </table>
        <p>&nbsp;</p>
    </form>
</center>
</body>
</html>

