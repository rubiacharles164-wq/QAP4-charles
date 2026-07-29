package com.groupx.Member;

import com.groupx.Tournament.Tournament.Tournament;
import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long MemberID;
    private String MemberName;
    private String MailingAddress;
    private String Email;
    private String PhoneNum;
    private Date Date;
    private String MemberShipType;

    public Member(Tournament tournament) {
    }

    public long getMemberID() {
        return MemberID;
    }

    public void setMemberID(long MemberID) {
        this.MemberID = MemberID;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getMailingAddress() {
        return MailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        MailingAddress = mailingAddress;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public String getMemberShipType() {
        return MemberShipType;
    }

    public void setMemberShipType(String memberShipType) {
        MemberShipType = memberShipType;
    }

    
}
