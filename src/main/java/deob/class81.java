package deob;

@ObfuscatedName("ds")
public class class81 extends class545 {

	@ObfuscatedName("ds.at")
	public class188 field1182;

	@ObfuscatedName("ds.ac")
	public class439 field1184 = new class439();

	public class81(class188 arg0) {
		this.field1182 = arg0;
	}

	@ObfuscatedName("ds.af(IIIII)V")
	public void method2655(int arg0, int arg1, int arg2, int arg3) {
		class77 var5 = null;
		int var6 = 0;
		for (class77 var7 = (class77) this.field1184.method8092(); var7 != null; var7 = (class77) this.field1184.method8106()) {
			var6++;
			if (var7.field1110 == arg0) {
				var7.method2460(arg0, arg1, arg2, arg3);
				return;
			}
			if (var7.field1110 <= arg0) {
				var5 = var7;
			}
		}
		if (var5 != null) {
			class439.method8081(new class77(arg0, arg1, arg2, arg3), var5);
			if (var6 >= 4) {
				this.field1184.method8092().method2234();
			}
		} else if (var6 < 4) {
			this.field1184.method8083(new class77(arg0, arg1, arg2, arg3));
		}
	}

	@ObfuscatedName("ds.aw(II)Lch;")
	public class77 method2656(int arg0) {
		class77 var2 = (class77) this.field1184.method8092();
		if (var2 == null || var2.field1110 > arg0) {
			return null;
		}
		for (class77 var3 = (class77) this.field1184.method8106(); var3 != null && var3.field1110 <= arg0; var3 = (class77) this.field1184.method8106()) {
			var2.method2234();
			var2 = var3;
		}
		if (this.field1182.field2050 + var2.field1111 + var2.field1110 > arg0) {
			return var2;
		} else {
			var2.method2234();
			return null;
		}
	}

	@ObfuscatedName("ds.at(B)Z")
	public boolean method2657() {
		return this.field1184.method8087();
	}
}
