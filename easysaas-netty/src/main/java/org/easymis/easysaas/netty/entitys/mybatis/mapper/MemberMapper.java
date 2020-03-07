package org.easymis.easysaas.netty.entitys.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.easymis.easysaas.netty.entitys.mybatis.dto.Member;

public interface MemberMapper {
	@Select("<script>" + "SELECT * FROM member WHERE phone_number=#{phoneNumber}" + "</script>")
	Member findByPhoneNumber(@Param("phoneNumber") String phoneNumber);

	@Select("select * from member t WHERE t.member_id = #{memberId}")
	Member get(@Param("phoneNumber") String phoneNumber, @Param("password") String password);

	@Insert("insert into Member(id, Member_no, sex, age, company_name, department, position, password, head_url, phone_number, email, modify_time, create_time, name, enabled)"
			+ "values"
			+ "(#{id},#{MemberNo},#{sex},#{age},#{companyName},#{department},#{position},#{password},#{headUrl},#{phoneNumber},#{email},#{modifyTime},#{createTime},#{name},#{enabled})")
	int insertByBean(Member bean);
}
