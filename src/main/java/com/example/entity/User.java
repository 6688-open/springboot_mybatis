package com.example.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author wangjia
 *  EqualsAndHashCode 对userName 进行比较  不关心别的字段 userName
 */
public class User implements Serializable {

    private Integer id;
    private Integer sex;
    /**
     * 入参校验 直接返回错误
     * public void test(@Validated (GroupInterface.class) User user) //{}
     *
     * .@NotBlank(message = "pin不能为空")  只能是字符串
     */
    private String userName;
    /**
     * 1 @JsonFormat 返回给前端数据 自动将Date -----> String
     *       fasterxml maven jar包
     *     . @ResponseBody返回json数据的时候，才会返回格式化的yyyy-MM-dd HH:mm:ss时间
     *      直接输出不可以
     * 2  @DateTimeFormat   接收前端传来的参数  String -----> Date
     *    引入依赖 joda-time
     *
     */
    private Date createTime;

    private String salt;
    private String password;


    private BigDecimal totalNum;
    private BigDecimal userNum;

    /**
     * 执行系统
     */
    private Byte eoType;
    /**
     * 标记位
     */
    private String eoMark;



    public User(Integer id, Integer sex, String userName, Date createTime, String salt, String password, BigDecimal totalNum, BigDecimal userNum, Byte eoType, String eoMark) {
        this.id = id;
        this.sex = sex;
        this.userName = userName;
        this.createTime = createTime;
        this.salt = salt;
        this.password = password;
        this.totalNum = totalNum;
        this.userNum = userNum;
        this.eoType = eoType;
        this.eoMark = eoMark;
    }

    public User() {
    }

    public User(Integer id) {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getUserNum() {
        return userNum;
    }

    public void setUserNum(BigDecimal userNum) {
        this.userNum = userNum;
    }

    public BigDecimal getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(BigDecimal totalNum) {
        this.totalNum = totalNum;
    }

    public Byte getEoType() {
        return eoType;
    }

    public void setEoType(Byte eoType) {
        this.eoType = eoType;
    }

    public String getEoMark() {
        return eoMark;
    }

    public void setEoMark(String eoMark) {
        this.eoMark = eoMark;
    }

}
