package com.model;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="validUserData")

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long userId;
    private String username;
    private String useremailid;
    private int age;
    private String currentTimeOfWritingArticles;
    private String allowedForArticleReviewing;
    private String proficiency3;
    private String proficiency4;
    private String proficiency5;
    private int rating;
    private int blocklisted;
    private Date futuredate;
    private Date futureOrPresentdate;
    private Date pastOrPresentdate;
    private int rangeEx;
    private String url;
    private String creditCardExample;
    
    
    
    
	public User() {
		super();
	}
	public User(long userId, String username, String useremailid, int age, String currentTimeOfWritingArticles,
			String allowedForArticleReviewing, String proficiency3, String proficiency4, String proficiency5,
			int rating, int blocklisted, Date futuredate, Date futureOrPresentdate, Date pastOrPresentdate, int rangeEx,
			String url, String creditCardExample) {
		super();
		this.userId = userId;
		this.username = username;
		this.useremailid = useremailid;
		this.age = age;
		this.currentTimeOfWritingArticles = currentTimeOfWritingArticles;
		this.allowedForArticleReviewing = allowedForArticleReviewing;
		this.proficiency3 = proficiency3;
		this.proficiency4 = proficiency4;
		this.proficiency5 = proficiency5;
		this.rating = rating;
		this.blocklisted = blocklisted;
		this.futuredate = futuredate;
		this.futureOrPresentdate = futureOrPresentdate;
		this.pastOrPresentdate = pastOrPresentdate;
		this.rangeEx = rangeEx;
		this.url = url;
		this.creditCardExample = creditCardExample;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremailid() {
		return useremailid;
	}
	public void setUseremailid(String useremailid) {
		this.useremailid = useremailid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCurrentTimeOfWritingArticles() {
		return currentTimeOfWritingArticles;
	}
	public void setCurrentTimeOfWritingArticles(String currentTimeOfWritingArticles) {
		this.currentTimeOfWritingArticles = currentTimeOfWritingArticles;
	}
	public String getAllowedForArticleReviewing() {
		return allowedForArticleReviewing;
	}
	public void setAllowedForArticleReviewing(String allowedForArticleReviewing) {
		this.allowedForArticleReviewing = allowedForArticleReviewing;
	}
	public String getProficiency3() {
		return proficiency3;
	}
	public void setProficiency3(String proficiency3) {
		this.proficiency3 = proficiency3;
	}
	public String getProficiency4() {
		return proficiency4;
	}
	public void setProficiency4(String proficiency4) {
		this.proficiency4 = proficiency4;
	}
	public String getProficiency5() {
		return proficiency5;
	}
	public void setProficiency5(String proficiency5) {
		this.proficiency5 = proficiency5;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getBlocklisted() {
		return blocklisted;
	}
	public void setBlocklisted(int blocklisted) {
		this.blocklisted = blocklisted;
	}
	public Date getFuturedate() {
		return futuredate;
	}
	public void setFuturedate(Date futuredate) {
		this.futuredate = futuredate;
	}
	public Date getFutureOrPresentdate() {
		return futureOrPresentdate;
	}
	public void setFutureOrPresentdate(Date futureOrPresentdate) {
		this.futureOrPresentdate = futureOrPresentdate;
	}
	public Date getPastOrPresentdate() {
		return pastOrPresentdate;
	}
	public void setPastOrPresentdate(Date pastOrPresentdate) {
		this.pastOrPresentdate = pastOrPresentdate;
	}
	public int getRange() {
		return rangeEx;
	}
	public void setRange(int range) {
		this.rangeEx = range;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreditCardExample() {
		return creditCardExample;
	}
	public void setCreditCardExample(String creditCardExample) {
		this.creditCardExample = creditCardExample;
	}

  
}
