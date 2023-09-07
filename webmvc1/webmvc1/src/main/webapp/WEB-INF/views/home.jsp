<html>
<body>
    <form action="/showAll">
        <button type="submit">Fetch All Trainees</button>
    </form>
    <form action="/showOne">
            Id:<input type="text" name="id"/><br/>
            <button type="submit">Fetch All Trainees</button>
    </form>
    <form action="/create" method="post">
        Id:<input type="text" name="employeeId"/><br/>
        Name:<input type="text" name="employeeName"/><br/>
        Age:<input type="text" name="employeeAge"/><br/>
        Department:<input type="text" name="employeeDepartment"/><br/>
        Age:<input type="text" name="employeeAge"/><br/>
        <button type="submit">Insert a Employee</button>
    </form>
    <form action="/update" method="put">
            Id:<input type="text" name="employeeId"/><br/>
            Name:<input type="text" name="employeeName"/><br/>
            Age:<input type="text" name="employeeAge"/><br/>
            Department:<input type="text" name="employeeDepartment"/><br/>
            Age:<input type="text" name="employeeAge"/><br/>
        <button type="submit">Updating a Employee</button>
    </form>
    <form action="/delete" method="delete">
        Id:<input type="text" name="id"/><br/>
        <button type="submit">Delete Trainee By Id</button>
    </form>
    <form action="/">
            <button type="submit">Back</button>
        </form>
    </body>
</html>