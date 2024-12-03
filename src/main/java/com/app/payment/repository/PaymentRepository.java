package com.app.payment.repository;

import com.app.payment.entity.Payment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * payrepository.
 */
@Repository
public interface PaymentRepository extends MongoRepository<Payment, ObjectId> {
}
