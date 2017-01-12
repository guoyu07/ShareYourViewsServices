package com.omnie.shareyourviewservice.hibermapping;

// Generated Sep 1, 2015 2:49:52 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "shareyourviewdb")
public class Category implements java.io.Serializable {

	private long catId;
	private String catName;
	private Set<PostCategory> postCategories = new HashSet<PostCategory>(0);

	public Category() {
	}

	public Category(long catId) {
		this.catId = catId;
	}

	public Category(long catId, String catName, Set<PostCategory> postCategories) {
		this.catId = catId;
		this.catName = catName;
		this.postCategories = postCategories;
	}

	@Id
	@Column(name = "CAT_ID", unique = true, nullable = false)
	public long getCatId() {
		return this.catId;
	}

	public void setCatId(long catId) {
		this.catId = catId;
	}

	@Column(name = "CAT_NAME", length = 100)
	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<PostCategory> getPostCategories() {
		return this.postCategories;
	}

	public void setPostCategories(Set<PostCategory> postCategories) {
		this.postCategories = postCategories;
	}

}
