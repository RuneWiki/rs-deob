package deob;

import java.util.HashMap;

@ObfuscatedName("qv")
public class class424 {

	@ObfuscatedName("qv.ap")
	public final HashMap field5062 = new HashMap();

	@ObfuscatedName("qv.aq")
	public class450 field5056 = new class450(0, 0);

	@ObfuscatedName("qv.ao")
	public int[] field5057 = new int[2048];

	@ObfuscatedName("qv.as")
	public int[] field5053 = new int[2048];

	@ObfuscatedName("qv.al")
	public int field5052 = 0;

	public class424() {
		method2128();
	}

	@ObfuscatedName("cx.af(I)V")
	public static void method2128() {
		Statics.field5244 = new int[2000];
		int var0 = 0;
		int var1 = 240;
		byte var2 = 12;
		while (var0 < 16) {
			int var3 = class295.method5109((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
			Statics.field5244[var0] = var3;
			var0++;
			var1 -= var2;
		}
		int var4 = 48;
		int var5 = var4 / 6;
		while (var0 < Statics.field5244.length) {
			int var6 = var0 * 2;
			int var7 = class295.method5109((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
			while (var0 < var6 && var0 < Statics.field5244.length) {
				Statics.field5244[var0] = var7;
				var0++;
			}
			var4 -= var5;
		}
	}

	@ObfuscatedName("qv.aw(II)V")
	public void method7889(int arg0) {
		int var2 = arg0 * 2 + 1;
		double[] var3 = class451.method7584(0.0D, (double) ((float) arg0 / 3.0F), arg0);
		double var4 = var3[arg0] * var3[arg0];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;
		for (int var8 = 0; var8 < var2; var8++) {
			for (int var9 = 0; var9 < var2; var9++) {
				int var10 = var6[var2 * var8 + var9] = (int) (var3[var8] * var3[var9] / var4 * 256.0D);
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}
		class606 var11 = new class606(var6, var2, var2);
		this.field5062.put(arg0, var11);
	}

	@ObfuscatedName("qv.at(IB)Lxt;")
	public class606 method7890(int arg0) {
		if (!this.field5062.containsKey(arg0)) {
			this.method7889(arg0);
		}
		return (class606) this.field5062.get(arg0);
	}

	@ObfuscatedName("qv.ac(III)V")
	public final void method7898(int arg0, int arg1) {
		if (this.field5052 < this.field5057.length) {
			this.field5057[this.field5052] = arg0;
			this.field5053[this.field5052] = arg1;
			this.field5052++;
		}
	}

	@ObfuscatedName("qv.ap(B)V")
	public final void method7888() {
		this.field5052 = 0;
	}

	@ObfuscatedName("qv.aq(IILxt;FB)V")
	public final void method7893(int arg0, int arg1, class606 arg2, float arg3) {
		int var5 = (int) (arg3 * 18.0F);
		class606 var6 = this.method7890(var5);
		int var7 = var5 * 2 + 1;
		class450 var8 = new class450(0, 0, arg2.field6020, arg2.field6021);
		class450 var9 = new class450(0, 0);
		this.field5056.method8287(var7, var7);
		System.nanoTime();
		for (int var10 = 0; var10 < this.field5052; var10++) {
			int var11 = this.field5057[var10];
			int var12 = this.field5053[var10];
			int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
			int var14 = (int) ((float) arg2.field6021 - (float) (var12 - arg1) * arg3) - var5;
			this.field5056.method8286(var13, var14);
			this.field5056.method8289(var8, var9);
			this.method7894(var6, arg2, var9);
		}
		System.nanoTime();
		System.nanoTime();
		for (int var15 = 0; var15 < arg2.field6019.length; var15++) {
			if (arg2.field6019[var15] == 0) {
				arg2.field6019[var15] = -16777216;
			} else {
				int var16 = (arg2.field6019[var15] + 64 - 1) / 256;
				if (var16 <= 0) {
					arg2.field6019[var15] = -16777216;
				} else {
					if (var16 > Statics.field5244.length) {
						var16 = Statics.field5244.length;
					}
					int var17 = Statics.field5244[var16 - 1];
					arg2.field6019[var15] = var17 | 0xFF000000;
				}
			}
		}
		System.nanoTime();
	}

	@ObfuscatedName("qv.ao(Lxt;Lxt;Lrw;B)V")
	public void method7894(class606 arg0, class606 arg1, class450 arg2) {
		if (arg2.field5163 == 0 || arg2.field5164 == 0) {
			return;
		}
		int var4 = 0;
		int var5 = 0;
		if (arg2.field5161 == 0) {
			var4 = arg0.field6020 - arg2.field5163;
		}
		if (arg2.field5160 == 0) {
			var5 = arg0.field6021 - arg2.field5164;
		}
		int var6 = arg0.field6020 * var5 + var4;
		int var7 = arg2.field5160 * arg1.field6020 + arg2.field5161;
		for (int var8 = 0; var8 < arg2.field5164; var8++) {
			for (int var9 = 0; var9 < arg2.field5163; var9++) {
				int var10001 = var7++;
				arg1.field6019[var10001] += arg0.field6019[var6++];
			}
			var6 += arg0.field6020 - arg2.field5163;
			var7 += arg1.field6020 - arg2.field5163;
		}
	}
}
