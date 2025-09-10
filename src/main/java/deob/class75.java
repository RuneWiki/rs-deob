package deob;

@ObfuscatedName("ck")
public class class75 extends class545 {

	@ObfuscatedName("ck.aw")
	public int field1027;

	@ObfuscatedName("ck.at")
	public int field1022;

	@ObfuscatedName("ck.ac")
	public int field1023;

	@ObfuscatedName("ck.ap")
	public int field1037;

	@ObfuscatedName("ck.aq")
	public int field1025;

	@ObfuscatedName("ck.ao")
	public int field1026;

	@ObfuscatedName("ck.as")
	public int field1036;

	@ObfuscatedName("ck.al")
	public int field1028;

	@ObfuscatedName("ck.au")
	public int field1029;

	@ObfuscatedName("ck.ai")
	public int field1030;

	@ObfuscatedName("ck.aa")
	public int field1024;

	@ObfuscatedName("ck.am")
	public int field1032 = 0;

	@ObfuscatedName("ck.an")
	public int field1033 = -1;

	@ObfuscatedName("ck.ar")
	public int field1034 = 31;

	@ObfuscatedName("ck.ae")
	public String[] field1021;

	@ObfuscatedName("ck.af(II)V")
	public void method2359(int arg0) {
		this.field1034 = arg0;
	}

	@ObfuscatedName("ck.aw([Ljava/lang/String;I)V")
	public void method2360(String[] arg0) {
		this.field1021 = arg0;
	}

	@ObfuscatedName("ck.at(II)Z")
	public boolean method2361(int arg0) {
		if (arg0 >= 0 && arg0 <= 4) {
			return (this.field1034 & 0x1 << arg0) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ck.ac(IB)Z")
	public boolean method2369(int arg0) {
		return this.field1021 != null && arg0 >= 0 && arg0 < this.field1021.length && this.field1021[arg0] != null;
	}

	@ObfuscatedName("ck.ap(II)Ljava/lang/String;")
	public String method2363(int arg0) {
		return this.field1021 == null || arg0 < 0 || arg0 >= this.field1021.length ? null : this.field1021[arg0];
	}
}
