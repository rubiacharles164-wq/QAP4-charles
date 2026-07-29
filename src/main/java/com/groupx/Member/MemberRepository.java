package com.groupx.Member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface MemberRepository extends CrudRepository<Member, Long>{


    List<Member> findMemberByMemberName(String MemberName);

    List<Member> findMemberByPhoneNum(String PhoneNum);

    List<Member> findMemberByMemberShipType(String MemberType);


}
