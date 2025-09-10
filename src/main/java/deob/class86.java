package deob;

@ObfuscatedName("dw")
public class class86 extends class234 {

	@ObfuscatedName("dw.aw")
	public int field1222;

	@ObfuscatedName("dw.at")
	public int field1223;

	@ObfuscatedName("dw.ac")
	public int field1224;

	@ObfuscatedName("dw.ap")
	public int field1225;

	@ObfuscatedName("dw.aq")
	public int field1226;

	@ObfuscatedName("dw.ao")
	public boolean field1227;

	@ObfuscatedName("dw.as")
	public int field1228 = 31;

	@ObfuscatedName("dw.al")
	public class177 field1221;

	@ObfuscatedName("dw.af(II)V")
	public void method2738(int arg0) {
		this.field1228 = arg0;
	}

	@ObfuscatedName("dw.aw(II)Z")
	public boolean method2755(int arg0) {
		if (arg0 >= 0 && arg0 <= 4) {
			return (this.field1228 & 0x1 << arg0) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("dw.at(I)Ljn;")
	public final class242 method1847() {
		class214 var1 = class214.method2737(this.field1222);
		return this.field1221 == null ? var1.method4418(this.field1223) : var1.method4361(this.field1221);
	}

	@ObfuscatedName("dw.ac(I)Lgq;")
	public class177 method2741() {
		return this.field1221;
	}

	@ObfuscatedName("dw.ap(Lgq;B)V")
	public void method2747(class177 arg0) {
		this.field1221 = arg0;
	}

	@ObfuscatedName("dw.aq(B)V")
	public void method2753() {
		this.field1221 = null;
	}
}
