package designPattern.builder;

public class ClassIc {

	private String id;

	private String uid;
	private String gid;
	private String pid;
	private String mid;
	private String sid;
	
	public ClassIc(ClassIcBuilder builder) {
		this.id=builder.id;
		this.uid=builder.uid;
		this.gid=builder.gid;
		this.pid=builder.pid;
		this.mid=builder.mid;
		this.sid=builder.sid;
	}

	public ClassIc(String id, String uid, String gid, String pid, String mid, String sid) {
		super();
		this.id = id;
		this.uid = uid;
		this.gid = gid;
		this.pid = pid;
		this.mid = mid;
		this.sid = sid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public static class ClassIcBuilder {
		private String id;
		private String uid;
		private String gid;
		private String pid;
		private String mid;
		private String sid;

		ClassIcBuilder id(String idVal) {
			this.id = idVal;
			return this;
		}

		ClassIcBuilder uid(String uidVal) {
			this.uid = uidVal;
			return this;
		}

		ClassIcBuilder pid(String pidVal) {
			this.pid = pidVal;
			return this;
		}

		ClassIcBuilder sid(String midVal) {
			this.sid = midVal;
			return this;
		}

		ClassIcBuilder mid(String midVal) {
			this.mid = midVal;
			return this;
		}

		ClassIcBuilder gid(String gidVal) {
			this.gid = gidVal;
			return this;
		}

		ClassIc build() {
				ClassIc classIc= new ClassIc(this);
				return classIc;
			}

	}

}
