package com.xuyh.servers.dao;

public class User {
	private String mUserName = "";
	private String mUserPass = "";
	private int    mUserAge  = 0;
	
	
	public User(String mUserName, String mUserPass, int mUserAge) {
		super();
		this.mUserName = mUserName;
		this.mUserPass = mUserPass;
		this.mUserAge = mUserAge;
	}

	@Override
	public String toString() {
		return "User [mUserName=" + mUserName + ", mUserPass=" + mUserPass
				+ ", mUserAge=" + mUserAge + "]";
	}
	
	public String getUserName() {
		return mUserName;
	}
	public void setUserName(String mUserName) {
		this.mUserName = mUserName;
	}
	public String getUserPass() {
		return mUserPass;
	}
	public void setUserPass(String mUserPass) {
		this.mUserPass = mUserPass;
	}
	public int getUserAge() {
		return mUserAge;
	}
	public void setUserAge(int mUserAge) {
		this.mUserAge = mUserAge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mUserAge;
		result = prime * result
				+ ((mUserName == null) ? 0 : mUserName.hashCode());
		result = prime * result
				+ ((mUserPass == null) ? 0 : mUserPass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (mUserAge != other.mUserAge)
			return false;
		if (mUserName == null) {
			if (other.mUserName != null)
				return false;
		} else if (!mUserName.equals(other.mUserName))
			return false;
		if (mUserPass == null) {
			if (other.mUserPass != null)
				return false;
		} else if (!mUserPass.equals(other.mUserPass))
			return false;
		return true;
	}
}
