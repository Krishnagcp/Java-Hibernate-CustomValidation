package com.model;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;
	

public class UserValidator {

    public static List<String> validate(User user) {
        List<String> errors = new ArrayList<>();
        validateUserId(user.getUserId(), errors);
        validateUsername(user.getUsername(), errors);
        validateUseremailid(user.getUseremailid(), errors);
        validateAge(user.getAge(), errors);
        validateCurrentTimeOfWritingArticles(user.getCurrentTimeOfWritingArticles(), errors);
        validateAllowedForArticleReviewing(user.getAllowedForArticleReviewing(), errors);
        validateProficiency3(user.getProficiency3(), errors);
        validateProficiency4(user.getProficiency4(), errors);
        validateProficiency5(user.getProficiency5(), errors);
        validateRating(user.getRating(), errors);
        validateBlocklisted(user.getBlocklisted(), errors);
        validateFuturedate(user.getFuturedate(), errors);
        validateFutureOrPresentdate(user.getFutureOrPresentdate(), errors);
        validatePastOrPresentdate(user.getPastOrPresentdate(), errors);
        validateRange(user.getRange(), errors);
        validateUrl(user.getUrl(), errors);
        validateCreditCardExample(user.getCreditCardExample(), errors);
        return errors;
    }

    private static void validateUserId(long userId, List<String> errors) {
        if (userId <= 0) {
            errors.add("Invalid id. Pls Enter your id");
        }
    }

    private static void validateUsername(String username, List<String> errors) {
        if (username == null || username.isEmpty()) {
            errors.add("Enter your name");
        }
        if (username.length() < 3 || username.length() > 20) {
            errors.add("Invalid name. Size should be between 3 and 20");
        }
    }

    private static void validateUseremailid(String useremailid, List<String> errors) {
        if (useremailid == null || useremailid.isEmpty()) {
            errors.add("Please enter your email id");
        }
        if (!useremailid.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            errors.add("Invalid Email address, enter proper email ID");
        }
    }

    private static void validateAge(int age, List<String> errors) {
        if (age < 0 || age > 999) {
            errors.add("Invalid age");
        }
    }

    private static void validateCurrentTimeOfWritingArticles(String currentTimeOfWritingArticles, List<String> errors) {
        try {
            int articles = Integer.parseInt(currentTimeOfWritingArticles);
            if (articles > 5) {
                errors.add("Invalid number of articles. Maximum allowed is 5");
            }
        } catch (NumberFormatException e) {
            errors.add("Invalid number format for articles");
        }
    }

    private static void validateAllowedForArticleReviewing(String allowedForArticleReviewing, List<String> errors) {
        try {
            int articles = Integer.parseInt(allowedForArticleReviewing);
            if (articles < 3) {
                errors.add("Invalid number of articles for review. Minimum should be 3");
            }
        } catch (NumberFormatException e) {
            errors.add("Invalid number format for articles");
        }
    }

    private static void validateProficiency3(String proficiency3, List<String> errors) {
        if (proficiency3 == null || proficiency3.isEmpty()) {
            errors.add("Proficiency level 3 should not be blank");
        }
    }

    private static void validateProficiency4(String proficiency4, List<String> errors) {
        if (proficiency4 != null && !proficiency4.isEmpty()) {
            errors.add("Proficiency level 4 should be blank");
        }
    }

    private static void validateProficiency5(String proficiency5, List<String> errors) {
        if (!proficiency5.matches("[YNyn]")) {
            errors.add("Invalid Proficiency level 5. Enter Y or N");
        }
    }

    private static void validateRating(int rating, List<String> errors) {
        if (rating <= 0) {
            errors.add("Invalid Rating. Value should be positive");
        }
    }

    private static void validateBlocklisted(int blocklisted, List<String> errors) {
        if (blocklisted > 0) {
            errors.add("Invalid Blocklisted Status. Input Value should be negative or zero");
        }
    }

    private static void validateFuturedate(Date futuredate, List<String> errors) {
        if (futuredate == null || futuredate.before(new Date())) {
            errors.add("Invalid Date. It should be provided as future date");
        }
    }

    private static void validateFutureOrPresentdate(Date futureOrPresentdate, List<String> errors) {
        if (futureOrPresentdate == null || futureOrPresentdate.before(new Date())) {
            errors.add("Invalid Date. It should be provided as future or present date");
        }
    }

    private static void validatePastOrPresentdate(Date pastOrPresentdate, List<String> errors) {
        if (pastOrPresentdate == null || pastOrPresentdate.after(new Date())) {
            errors.add("Invalid Date. It should be provided as past or present date");
        }
    }

    private static void validateRange(int range, List<String> errors) {
        if (range < 1 || range > 3) {
            errors.add("Invalid value. Value must be in specified range");
        }
    }

    private static void validateUrl(String url, List<String> errors) {
        if (url == null || !url.matches("^(http|https)://.*$")) {
            errors.add("Invalid URL");
        }
    }

    private static void validateCreditCardExample(String creditCardExample, List<String> errors) {
        if (!isValidCreditCardNumber(creditCardExample)) {
            errors.add("Invalid Credit Card Number");
        }
    }

    private static boolean isValidCreditCardNumber(String creditCardNumber) {
        // Implement Luhn Algorithm for credit card validation
        int[] creditDigits = new int[creditCardNumber.length()];
        
        for (int i = 0; i < creditCardNumber.length(); i++) {
            creditDigits[i] = Character.getNumericValue(creditCardNumber.charAt(i));
        }
        
        for (int i = creditDigits.length - 2; i >= 0; i -= 2) {
            int doubled = creditDigits[i] * 2;
            if (doubled > 9) {
                doubled = doubled / 10 + doubled % 10;
            }
            creditDigits[i] = doubled;
        }
        
        int sum = 0;
        for (int digit : creditDigits) {
            sum += digit;
        }
        
        return sum % 10 == 0;
    }
}


