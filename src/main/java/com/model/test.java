package com.model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class test {


    public static void main(String[] args)  {
        User user = new User();
        user.setUserId(1);
        user.setUsername("John Doe");
        user.setUseremailid("john.doe@example.com");
        user.setAge(25);
        user.setCurrentTimeOfWritingArticles("4");
        user.setAllowedForArticleReviewing("4");
        user.setProficiency3("hj");
        user.setProficiency4("");
        user.setProficiency5("Y");
        user.setRating(5);
        user.setBlocklisted(0);
        user.setFuturedate(new Date(System.currentTimeMillis() + 86400000)); // 1 day in the future
        user.setFutureOrPresentdate(getPastOrFutureDate(34));
        user.setPastOrPresentdate(new Date(System.currentTimeMillis() - 86400000)); // 1 day in the past
        user.setRange(2);
        user.setUrl("https://www.example.com");
        user.setCreditCardExample("4532015112830366");

        List<String> errors = UserValidator.validate(user);
        if (errors.isEmpty()) {
        	System.out.println("Valid user data provided");
            Transaction tr = null;
            try (Session session = HBUtil.getSesFactory().openSession()) {
                tr = (Transaction)session.beginTransaction();
                session.merge(user);
                tr.commit();
                System.out.println("User data persisted successfully");
            } catch (Exception x) {
                if (tr != null) {
                	try {
                        tr.rollback();
                        System.out.println("Transaction rolled back due to an error");
                    } catch (RuntimeException rbEx) {
                        System.err.println("Couldn’t roll back transaction " + rbEx);
                    }
                }x.printStackTrace();
            }
        }
        else {
            System.out.println("Validation failed:");
            errors.forEach(System.out::println);
        }
    }
    
    
    public static Date getPastOrFutureDate(int days)
	{
		Calendar calendar =Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, days);
		return calendar.getTime();
	}
}

