package deob;

@ObfuscatedName("ig")
public class class228 {

	@ObfuscatedName("ig.aw")
	public class136[] field2657;

	@ObfuscatedName("ig.at")
	public int field2656;

	public class228(class591 arg0, int arg1) {
		this.field2657 = new class136[arg1];
		this.field2656 = arg0.method10339();
		for (int var3 = 0; var3 < this.field2657.length; var3++) {
			class136 var4 = new class136(this.field2656, arg0, false);
			this.field2657[var3] = var4;
		}
		this.method4724();
	}

	@ObfuscatedName("ig.af(B)V")
	public void method4724() {
		class136[] var1 = this.field2657;
		for (int var2 = 0; var2 < var1.length; var2++) {
			class136 var3 = var1[var2];
			if (var3.field1634 >= 0) {
				var3.field1637 = this.field2657[var3.field1634];
			}
		}
	}

	@ObfuscatedName("ig.aw(I)I")
	public int method4725() {
		return this.field2657.length;
	}

	@ObfuscatedName("ig.at(II)Lfa;")
	public class136 method4726(int arg0) {
		return arg0 >= this.method4725() ? null : this.field2657[arg0];
	}

	@ObfuscatedName("ig.ac(B)[Lfa;")
	public class136[] method4736() {
		return this.field2657;
	}

	@ObfuscatedName("ig.ap(Lfh;II)V")
	public void method4728(class147 arg0, int arg1) {
		this.method4740(arg0, arg1, null, false);
	}

	@ObfuscatedName("ig.aq(Lfh;I[ZZB)V")
	public void method4740(class147 arg0, int arg1, boolean[] arg2, boolean arg3) {
		int var5 = arg0.method3610();
		int var6 = 0;
		class136[] var7 = this.method4736();
		for (int var8 = 0; var8 < var7.length; var8++) {
			class136 var9 = var7[var8];
			if (arg2 == null || arg2[var6] == arg3) {
				arg0.method3612(arg1, var9, var6, var5);
			}
			var6++;
		}
	}
}
