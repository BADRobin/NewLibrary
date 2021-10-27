<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/templates/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Список пользователей</h1>
        </div>

        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>имя</th>
                <th>Email</th>
                <th>телефон</th>
                <th>Имя пользователя</th>
                <th>Состояние</th>
            </tr>
            </thead>
            <c:forEach items="${peopleList}" var="people">
                <tr>
                    <td>${people.people_name}</td>
                    <td>${people.people_email}</td>
                    <td>${people.people_phone}</td>
                    <td>${people.people_username}</td>
                    <c:if test="${people.enabled == true}">
                        <td>активный</td>
                    </c:if>
                    <c:if test="${people.enabled == false}">
                        <td>неактивный</td>
                    </c:if>

                </tr>
            </c:forEach>
        </table>
        <div class="pager">
            <br>
            <li>
                <a href="<c:url value="/admin"/>">
                    <span class="glyphicon glyphicon-backward"></span> Назад
                </a>
            </li>
        </div>

<%@ include file="/WEB-INF/views/templates/footer.jsp" %>