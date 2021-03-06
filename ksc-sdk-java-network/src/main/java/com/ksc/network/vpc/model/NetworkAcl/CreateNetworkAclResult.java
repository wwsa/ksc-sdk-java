
package com.ksc.network.vpc.model.NetworkAcl;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of CreateNetworkAcl.
 * </p>
 */
@ToString
public class CreateNetworkAclResult implements Serializable, Cloneable {


	private String CreateTime;

    private String VpcId;

    private String NetworkAclName;

    private String NetworkAclId;

    private String RequestId;

    private String Description;

    private com.ksc.internal.SdkInternalList<NetworkAclEntry> NetworkAclEntrySet;


    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String vpcId) {
        VpcId = vpcId;
    }

    public String getNetworkAclName() {
        return NetworkAclName;
    }

    public void setNetworkAclName(String networkAclName) {
        NetworkAclName = networkAclName;
    }

    public String getNetworkAclId() {
        return NetworkAclId;
    }

    public void setNetworkAclId(String networkAclId) {
        NetworkAclId = networkAclId;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public java.util.List<NetworkAclEntry> getNetworkAclEntrySet() {
        if (NetworkAclEntrySet == null) {
            NetworkAclEntrySet = new com.ksc.internal.SdkInternalList<NetworkAclEntry>();
        }
        return NetworkAclEntrySet;
    }


    public void setNetworkAclEntrySet(java.util.Collection<NetworkAclEntry> aclEntry) {
        if (aclEntry == null) {
            this.NetworkAclEntrySet = null;
            return;
        }

        this.NetworkAclEntrySet = new com.ksc.internal.SdkInternalList<NetworkAclEntry>(aclEntry);
    }

    public CreateNetworkAclResult withNetworkAclEntrySet(NetworkAclEntry... aclEntry) {
        if (this.NetworkAclEntrySet == null) {
            setNetworkAclEntrySet(new com.ksc.internal.SdkInternalList<NetworkAclEntry>(aclEntry.length));
        }
        for (NetworkAclEntry ele : aclEntry) {
            this.NetworkAclEntrySet.add(ele);
        }
        return this;
    }

    public CreateNetworkAclResult withNetworkAclEntrySet(java.util.Collection<NetworkAclEntry> aclEntry) {
        setNetworkAclEntrySet(aclEntry);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateNetworkAclResult that = (CreateNetworkAclResult) o;

        if (!CreateTime.equals(that.CreateTime)) return false;
        if (!VpcId.equals(that.VpcId)) return false;
        if (!NetworkAclName.equals(that.NetworkAclName)) return false;
        if (!NetworkAclId.equals(that.NetworkAclId)) return false;
        if (!RequestId.equals(that.RequestId)) return false;
        return Description.equals(that.Description);
    }

    @Override
    public int hashCode() {
        int result = CreateTime.hashCode();
        result = 31 * result + VpcId.hashCode();
        result = 31 * result + NetworkAclName.hashCode();
        result = 31 * result + NetworkAclId.hashCode();
        result = 31 * result + RequestId.hashCode();
        result = 31 * result + Description.hashCode();
        return result;
    }

    @Override
    public CreateNetworkAclResult clone() {
        try {
            return (CreateNetworkAclResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}