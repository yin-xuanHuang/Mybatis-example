package org.xujin.mybtais.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @ClassName: User
 * @Description: TODO
 * @author Xu,Jin Software_King@qq.com
 * @date 2015-12-20 下午8:43:47
 * @Website http://www.xujin.org
 * 
 */
public class User implements Serializable {

  private static final long serialVersionUID = 1L;
  private int id;
  private String username;// 用户姓名
  private String sex;// 性别
  private Date birthday;// 生日
  private String address;// 地址

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday
        + ", address=" + address + "]";
  }

}
