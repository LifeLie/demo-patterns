package com.ll.demo.patterns.prototype.deepClone;

/**
 * 工作经历
 *
 * @author 良辰
 * @date 2018/9/14 上午10:42
 */
public class WorkExperience implements Cloneable {

    // 公司名称
    private String company;

    // 工作时间
    private String date;

    public WorkExperience() {
    }

    public WorkExperience(String company, String date) {
        this.company = company;
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    protected WorkExperience clone()  {
        try {
            return (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
