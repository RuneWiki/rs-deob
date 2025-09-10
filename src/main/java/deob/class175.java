package deob;

@ObfuscatedName("gu")
public class class175 extends class168 {

	// $FF: synthetic field
	public final class169 this$0;

	@ObfuscatedName("gu.af")
	public String field1936;

	@ObfuscatedName("gu.aw")
	public byte field1937;

	@ObfuscatedName("gu.at")
	public byte field1938;

	public class175(class169 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("gu.af(Lwb;I)V")
	public void method3670(class591 arg0) {
		this.field1936 = arg0.method10349();
		if (this.field1936 != null) {
			arg0.method10339();
			this.field1937 = arg0.method10340();
			this.field1938 = arg0.method10340();
		}
	}

	@ObfuscatedName("gu.aw(Lgm;I)V")
	public void method3671(class172 arg0) {
		arg0.field1920 = this.field1936;
		if (this.field1936 != null) {
			arg0.field1918 = this.field1937;
			arg0.field1922 = this.field1938;
		}
	}
}
