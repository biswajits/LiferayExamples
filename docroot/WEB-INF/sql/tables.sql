create table emp_Employee (
	employeeId LONG not null primary key IDENTITY,
	companyId LONG,
	userId LONG,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	eMail VARCHAR(75) null,
	phoneNo VARCHAR(75) null
);