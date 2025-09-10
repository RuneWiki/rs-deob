package deob;

@ObfuscatedName("al")
public class class9 {

	@ObfuscatedName("al.af")
	public final int field29;

	@ObfuscatedName("al.aw")
	public final int field27;

	@ObfuscatedName("al.at")
	public final String field28;

	public class9(int arg0, int arg1, String arg2) {
		this.field29 = arg0;
		this.field27 = arg1;
		this.field28 = arg2;
	}

	public class9(class591 arg0) {
		this(arg0.method10339(), arg0.method10339(), arg0.method10350());
	}

	@ObfuscatedName("al.af()Ljava/lang/String;")
	public String method57() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field27) + this.field28;
	}

	@ObfuscatedName("al.aw()I")
	public int method56() {
		return this.field27;
	}
}
