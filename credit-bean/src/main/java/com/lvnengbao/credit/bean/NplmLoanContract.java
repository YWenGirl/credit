package com.lvnengbao.credit.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class NplmLoanContract implements Serializable {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  @Column
  private String loanContractNum;
  @Column
  private String borrowerId;
  @Column
  private String ecifId;
  @Column
  private String proCategoryCode;
  @Column
  private String proCategoryName;
  @Column
  private long productInfoId;
  @Column
  private long loanInstalments;
  @Column
  private String loanInstalmentUnit;
  @Column
  private long loanAmount;
  @Column
  private long preFee;
  @Column
  private long putAmount;
  @Column
  private String creditType;
  @Column
  private String payMod;
  @Column
  private String repayWay;
  @Column
  private String loanType;
  @Column
  private long saleDepartmentId;
  @Column
  private String repayAccountName;
  @Column
  private String repayAcctIdenType;
  @Column
  private String repayAcctIdenNum;
  @Column
  private String repayAccount;
  @Column
  private String repayAccountType;
  @Column
  private String repayAccountBankid;
  @Column
  private String repayActBranchNo;
  @Column
  private String repayAccountBankName;
  @Column
  private String publicPrivate;
  @Column
  private String repayActProvince;
  @Column
  private String repayAccountCity;
  @Column
  private String posStatus;
  @Column
  private java.sql.Date startDate;
  @Column
  private java.sql.Date endDate;
  @Column
  private String contractSource;
  @Column
  private long repayBalance;
  @Column
  private String contractType;
  @Column
  private String creator;
  @Column
  private String updater;
  @Column
  private java.sql.Timestamp createTime;
  @Column
  private java.sql.Timestamp updateTime;
  @Column
  private String remark;
  @Column
  private String cycleCreditId;
  @Column
  private String updateType;



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(String loanContractNum) {
    this.loanContractNum = loanContractNum;
  }


  public String getBorrowerId() {
    return borrowerId;
  }

  public void setBorrowerId(String borrowerId) {
    this.borrowerId = borrowerId;
  }


  public String getEcifId() {
    return ecifId;
  }

  public void setEcifId(String ecifId) {
    this.ecifId = ecifId;
  }


  public String getProCategoryCode() {
    return proCategoryCode;
  }

  public void setProCategoryCode(String proCategoryCode) {
    this.proCategoryCode = proCategoryCode;
  }


  public String getProCategoryName() {
    return proCategoryName;
  }

  public void setProCategoryName(String proCategoryName) {
    this.proCategoryName = proCategoryName;
  }


  public long getProductInfoId() {
    return productInfoId;
  }

  public void setProductInfoId(long productInfoId) {
    this.productInfoId = productInfoId;
  }


  public long getLoanInstalments() {
    return loanInstalments;
  }

  public void setLoanInstalments(long loanInstalments) {
    this.loanInstalments = loanInstalments;
  }


  public String getLoanInstalmentUnit() {
    return loanInstalmentUnit;
  }

  public void setLoanInstalmentUnit(String loanInstalmentUnit) {
    this.loanInstalmentUnit = loanInstalmentUnit;
  }


  public long getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(long loanAmount) {
    this.loanAmount = loanAmount;
  }


  public long getPreFee() {
    return preFee;
  }

  public void setPreFee(long preFee) {
    this.preFee = preFee;
  }


  public long getPutAmount() {
    return putAmount;
  }

  public void setPutAmount(long putAmount) {
    this.putAmount = putAmount;
  }


  public String getCreditType() {
    return creditType;
  }

  public void setCreditType(String creditType) {
    this.creditType = creditType;
  }


  public String getPayMod() {
    return payMod;
  }

  public void setPayMod(String payMod) {
    this.payMod = payMod;
  }


  public String getRepayWay() {
    return repayWay;
  }

  public void setRepayWay(String repayWay) {
    this.repayWay = repayWay;
  }


  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }


  public long getSaleDepartmentId() {
    return saleDepartmentId;
  }

  public void setSaleDepartmentId(long saleDepartmentId) {
    this.saleDepartmentId = saleDepartmentId;
  }


  public String getRepayAccountName() {
    return repayAccountName;
  }

  public void setRepayAccountName(String repayAccountName) {
    this.repayAccountName = repayAccountName;
  }


  public String getRepayAcctIdenType() {
    return repayAcctIdenType;
  }

  public void setRepayAcctIdenType(String repayAcctIdenType) {
    this.repayAcctIdenType = repayAcctIdenType;
  }


  public String getRepayAcctIdenNum() {
    return repayAcctIdenNum;
  }

  public void setRepayAcctIdenNum(String repayAcctIdenNum) {
    this.repayAcctIdenNum = repayAcctIdenNum;
  }


  public String getRepayAccount() {
    return repayAccount;
  }

  public void setRepayAccount(String repayAccount) {
    this.repayAccount = repayAccount;
  }


  public String getRepayAccountType() {
    return repayAccountType;
  }

  public void setRepayAccountType(String repayAccountType) {
    this.repayAccountType = repayAccountType;
  }


  public String getRepayAccountBankid() {
    return repayAccountBankid;
  }

  public void setRepayAccountBankid(String repayAccountBankid) {
    this.repayAccountBankid = repayAccountBankid;
  }


  public String getRepayActBranchNo() {
    return repayActBranchNo;
  }

  public void setRepayActBranchNo(String repayActBranchNo) {
    this.repayActBranchNo = repayActBranchNo;
  }


  public String getRepayAccountBankName() {
    return repayAccountBankName;
  }

  public void setRepayAccountBankName(String repayAccountBankName) {
    this.repayAccountBankName = repayAccountBankName;
  }


  public String getPublicPrivate() {
    return publicPrivate;
  }

  public void setPublicPrivate(String publicPrivate) {
    this.publicPrivate = publicPrivate;
  }


  public String getRepayActProvince() {
    return repayActProvince;
  }

  public void setRepayActProvince(String repayActProvince) {
    this.repayActProvince = repayActProvince;
  }


  public String getRepayAccountCity() {
    return repayAccountCity;
  }

  public void setRepayAccountCity(String repayAccountCity) {
    this.repayAccountCity = repayAccountCity;
  }


  public String getPosStatus() {
    return posStatus;
  }

  public void setPosStatus(String posStatus) {
    this.posStatus = posStatus;
  }


  public java.sql.Date getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Date startDate) {
    this.startDate = startDate;
  }


  public java.sql.Date getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Date endDate) {
    this.endDate = endDate;
  }


  public String getContractSource() {
    return contractSource;
  }

  public void setContractSource(String contractSource) {
    this.contractSource = contractSource;
  }


  public long getRepayBalance() {
    return repayBalance;
  }

  public void setRepayBalance(long repayBalance) {
    this.repayBalance = repayBalance;
  }


  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getCycleCreditId() {
    return cycleCreditId;
  }

  public void setCycleCreditId(String cycleCreditId) {
    this.cycleCreditId = cycleCreditId;
  }


  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }

}
