package com.me.rating.service.entites;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.me.rating.service.util.Constant;

import lombok.Data;

@Data
@Document(Constant.USERRATINGS)
public class Rating {

	@Id
	private String ratindId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;
}
