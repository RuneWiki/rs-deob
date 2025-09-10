package deob;

import java.io.IOException;

@ObfuscatedName("dz")
public class class93 {

	@ObfuscatedName("dz.af")
	public class439 field1300 = new class439();

	@ObfuscatedName("dz.aw")
	public int field1291 = 0;

	@ObfuscatedName("dz.at")
	public class591 field1292 = new class591(5000);

	@ObfuscatedName("dz.ac")
	public class609 field1309;

	@ObfuscatedName("dz.ap")
	public class590 field1294 = new class590(40000);

	@ObfuscatedName("dz.aq")
	public class331 field1305 = null;

	@ObfuscatedName("dz.ao")
	public int field1295 = 0;

	@ObfuscatedName("dz.as")
	public boolean field1297 = true;

	@ObfuscatedName("dz.al")
	public int field1298 = 0;

	@ObfuscatedName("dz.au")
	public int field1299 = 0;

	@ObfuscatedName("dz.ai")
	public int field1290 = 0;

	@ObfuscatedName("dz.aa")
	public int field1301;

	@ObfuscatedName("dz.am")
	public class331 field1296;

	@ObfuscatedName("dz.an")
	public class331 field1303;

	@ObfuscatedName("dz.ar")
	public class331 field1307;

	@ObfuscatedName("dz.ae")
	public class512 field1302;

	@ObfuscatedName("dz.af(I)V")
	public final void method2868() {
		this.field1300.method8082();
		this.field1291 = 0;
	}

	@ObfuscatedName("dz.aw(B)V")
	public final void method2869() throws IOException {
		if (this.field1302 == null || this.field1291 <= 0) {
			return;
		}
		this.field1292.field5920 = 0;
		while (true) {
			class330 var1 = (class330) this.field1300.method8092();
			if (var1 == null || var1.field3666 > this.field1292.field5917.length - this.field1292.field5920) {
				this.field1302.method9429(this.field1292.field5917, 0, this.field1292.field5920);
				this.field1299 = 0;
				break;
			}
			this.field1292.method10330(var1.field3665.field5917, 0, var1.field3666);
			this.field1291 -= var1.field3666;
			var1.method2234();
			var1.field3665.method10292();
			var1.method6488();
		}
	}

	@ObfuscatedName("dz.at(Lmy;S)V")
	public final void method2874(class330 arg0) {
		this.field1300.method8093(arg0);
		arg0.field3666 = arg0.field3665.field5920;
		arg0.field3665.field5920 = 0;
		this.field1291 += arg0.field3666;
	}

	@ObfuscatedName("dz.ac(B)V")
	public void method2886() {
		if (this.field1302 != null) {
			this.field1302.method9422();
			this.field1302 = null;
		}
	}

	@ObfuscatedName("dz.ap(I)V")
	public void method2872() {
		this.field1302 = null;
	}

	@ObfuscatedName("dz.aq(I)Ltf;")
	public class512 method2873() {
		return this.field1302;
	}

	@ObfuscatedName("dz.ao(Ltf;B)V")
	public void method2883(class512 arg0) {
		this.field1302 = arg0;
	}
}
