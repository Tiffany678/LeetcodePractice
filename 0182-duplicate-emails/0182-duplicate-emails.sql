SELECT email from Person
Group BY email
Having count(email) >1;
