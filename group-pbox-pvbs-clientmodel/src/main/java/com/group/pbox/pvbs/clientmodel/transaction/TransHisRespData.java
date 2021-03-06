package com.group.pbox.pvbs.clientmodel.transaction;

import java.util.Date;

public class TransHisRespData
{
    private String id;

    private String sourceAccountId;

    private String targetAccountId;

    private String currency;

    private Date createTime;

    private double transferAmount;

    private String transferType;

    private String sourceAccountNum;

    private String targetAccountNum;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getSourceAccountId()
    {
        return sourceAccountId;
    }

    public void setSourceAccountId(String sourceAccountId)
    {
        this.sourceAccountId = sourceAccountId;
    }

    public String getTargetAccountId()
    {
        return targetAccountId;
    }

    public void setTargetAccountId(String targetAccountId)
    {
        this.targetAccountId = targetAccountId;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public double getTransferAmount()
    {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount)
    {
        this.transferAmount = transferAmount;
    }

    public String getTransferType()
    {
        return transferType;
    }

    public void setTransferType(String transferType)
    {
        this.transferType = transferType;
    }

    public String getSourceAccountNum()
    {
        return sourceAccountNum;
    }

    public void setSourceAccountNum(String sourceAccountNum)
    {
        this.sourceAccountNum = sourceAccountNum;
    }

    public String getTargetAccountNum()
    {
        return targetAccountNum;
    }

    public void setTargetAccountNum(String targetAccountNum)
    {
        this.targetAccountNum = targetAccountNum;
    }
}
