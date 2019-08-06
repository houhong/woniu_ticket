package com.houhong.entry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ProjectName: 8yuefen项目
 * @Package: com.houhong.entry
 * @ClassName: ElecText
 * @Description: 这是一个javabean
 * @Author: layker
 * @CreateDate: 2019/8/5 0:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/5 0:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: javabean$
 * @Description TODO
 */
@Entity
public class ElecText  implements Serializable {
    @Id
    private String textID;//javabean的测试类
    @Column
    private String textName;
    private String textDate;
    private String textRemark;

    public ElecText() {
    }

    public ElecText(String textID, String textName, String textDate, String textRemark) {
        this.textID = textID;
        this.textName = textName;
        this.textDate = textDate;
        this.textRemark = textRemark;
    }

    public String getTextID() {
        return textID;
    }

    public void setTextID(String textID) {
        this.textID = textID;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public String getTextDate() {
        return textDate;
    }

    public void setTextDate(String textDate) {
        this.textDate = textDate;
    }

    public String getTextRemark() {
        return textRemark;
    }

    public void setTextRemark(String textRemark) {
        this.textRemark = textRemark;
    }

    @Override
    public String toString() {
        return "ElecText{" + "textID='" + textID + '\'' + ", textName='" + textName + '\'' + ", textDate='" + textDate + '\'' + ", textRemark='" + textRemark + '\'' + '}';
    }
}
