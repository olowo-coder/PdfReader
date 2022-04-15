select loan_no, count(borrower.loan_no)  from loan join borrower on loan.loan_no = borrower.loan_no group by loan.loan_no;

select * from loan;