package com.trang.TrangWebYTe.mapper;

import com.trang.TrangWebYTe.model.News;
import com.trang.TrangWebYTe.model.NewsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NewsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	long countByExample(NewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int deleteByExample(NewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int deleteByPrimaryKey(Integer idnews);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int insert(News record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int insertSelective(News record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	List<News> selectByExample(NewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	News selectByPrimaryKey(Integer idnews);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int updateByPrimaryKeySelective(News record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table news
	 * @mbg.generated  Sun Dec 19 00:24:21 ICT 2021
	 */
	int updateByPrimaryKey(News record);
}