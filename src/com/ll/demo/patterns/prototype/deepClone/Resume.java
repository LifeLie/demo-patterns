package com.ll.demo.patterns.prototype.deepClone;

/**
 * 简历
 *
 * @author ll
 * @date 2018/9/14 上午11:03
 */
public class Resume implements Cloneable {

    private String name;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    // 提供Clone方法调用的私有构造器函数，以便克隆工作经历的数据
    private Resume(WorkExperience workExperience) {
        this.workExperience = workExperience.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String compeny, String date) {
        this.workExperience.setCompany(compeny);
        this.workExperience.setDate(date);
    }

    @Override
    public Resume clone() {
        // 调用私有构造方法，让工作经历克隆完成，然后再给这个简历对象的相关字段赋值，最终返回一个深度复制的简历对象
        Resume resume = new Resume(this.workExperience);
        resume.setName(this.name);
        return resume;
    }

    public void disPlay() {
        System.out.println("Resume{" +
                "name='" + name +
                "', workExperienc{company='" + workExperience.getCompany() +
                "',date='" + workExperience.getDate() +
                "'}}");
    }
}
