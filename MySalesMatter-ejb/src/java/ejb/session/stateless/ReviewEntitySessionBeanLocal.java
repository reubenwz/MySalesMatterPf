/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.ReviewEntity;
import java.util.List;
import javax.ejb.Local;
import util.exception.CreateNewReviewException;
import util.exception.InputDataValidationException;
import util.exception.ListingNotFoundException;
import util.exception.ReviewNotFoundException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdateReviewException;
import util.exception.UserNotFoundException;

/**
 *
 * @author reuben
 */
@Local
public interface ReviewEntitySessionBeanLocal {
    public ReviewEntity createNewReviewEntity(ReviewEntity newReviewEntity, Long reviewerId, Long listingId) throws UnknownPersistenceException, InputDataValidationException, CreateNewReviewException, UserNotFoundException, ListingNotFoundException;
    public List<ReviewEntity> retrieveAllReviews();
    public ReviewEntity retrieveReviewByReviewId(Long reviewId) throws ReviewNotFoundException;
    public void updateReview(ReviewEntity reviewEntity) throws InputDataValidationException, ReviewNotFoundException, UpdateReviewException;
    public void deleteReview(Long reviewId) throws ReviewNotFoundException;
    public List<ReviewEntity> getReviewsByUserId(Long userId) throws UserNotFoundException;
}
