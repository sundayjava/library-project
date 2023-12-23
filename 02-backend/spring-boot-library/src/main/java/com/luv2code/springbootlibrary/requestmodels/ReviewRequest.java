package com.luv2code.springbootlibrary.requestmodels;

import java.util.Optional;

public class ReviewRequest {
    private double rating;
    private Long bookId;
    private Optional<String> reviewDescription;

    public ReviewRequest() {
    }

    public ReviewRequest(double rating, Long bookId, Optional<String> reviewDescription) {
        this.rating = rating;
        this.bookId = bookId;
        this.reviewDescription = reviewDescription;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Optional<String> getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(Optional<String> reviewDescription) {
        this.reviewDescription = reviewDescription;
    }
}
