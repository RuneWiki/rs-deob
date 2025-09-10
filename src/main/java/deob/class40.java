package deob;

@ObfuscatedName("bz")
public class class40 extends class541 {

	@ObfuscatedName("bz.af")
	public int field268;

	@ObfuscatedName("bz.aw")
	public int field262;

	@ObfuscatedName("bz.at")
	public int field264;

	@ObfuscatedName("bz.ac")
	public String field265;

	@ObfuscatedName("bz.ap")
	public class614 field273;

	@ObfuscatedName("bz.aq")
	public String field267;

	@ObfuscatedName("bz.ao")
	public String field272;

	@ObfuscatedName("bz.as")
	public class505 field269 = class505.field5416;

	@ObfuscatedName("bz.al")
	public class505 field270 = class505.field5416;

	public class40(int arg0, String arg1, String arg2, String arg3) {
		this.method743(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("bz.af(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public void method743(int arg0, String arg1, String arg2, String arg3) {
		int var5 = ++class92.field1285 - 1;
		this.field268 = var5;
		this.field262 = client.field413;
		this.field264 = arg0;
		this.field265 = arg1;
		this.method749();
		this.field267 = arg2;
		this.field272 = arg3;
		this.method740();
		this.method760();
	}

	@ObfuscatedName("bz.aw(B)V")
	public void method740() {
		this.field269 = class505.field5416;
	}

	@ObfuscatedName("bz.at(I)Z")
	public final boolean method744() {
		if (class505.field5416 == this.field269) {
			this.method742();
		}
		return class505.field5417 == this.field269;
	}

	@ObfuscatedName("bz.ac(I)V")
	public void method742() {
		this.field269 = Statics.field280.field643.method9265(this.field273) ? class505.field5417 : class505.field5419;
	}

	@ObfuscatedName("bz.ap(I)V")
	public void method760() {
		this.field270 = class505.field5416;
	}

	@ObfuscatedName("bz.aq(I)Z")
	public final boolean method739() {
		if (class505.field5416 == this.field270) {
			this.method745();
		}
		return class505.field5417 == this.field270;
	}

	@ObfuscatedName("bz.ao(B)V")
	public void method745() {
		this.field270 = Statics.field280.field646.method9265(this.field273) ? class505.field5417 : class505.field5419;
	}

	@ObfuscatedName("bz.as(I)V")
	public final void method749() {
		if (this.field265 == null) {
			this.field273 = null;
		} else {
			this.field273 = new class614(client.method35(this.field265), Statics.field1293);
		}
	}
}
