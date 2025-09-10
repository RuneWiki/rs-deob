package deob;

@ObfuscatedName("rp")
public class class468 {

	public class468() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fu.af(Lsp;ILsk;I)I")
	public static int method3602(class470 arg0, int arg1, class469 arg2) {
		int var3 = 0;
		if (!arg0.method8901()) {
			arg0.method8910(0);
			return var3;
		}
		class216 var4 = arg0.method8916();
		if (var4.field2494 == -1) {
			var3 |= 0x8;
		}
		if (var4.method4490()) {
			arg0.method8910(0);
		} else {
			arg0.method8910(arg0.method8909() + arg1);
		}
		int var5;
		if (!var4.method4467()) {
			var5 = var3 | method1745(arg0, arg1, arg2);
			return var5;
		}
		int var7 = arg1;
		int var8 = 0;
		class216 var9 = arg0.method8916();
		if (var9.field2494 > 0 && arg1 > 0) {
			var7 = arg1 - (arg1 - 1) / var9.field2494 * var9.field2494;
		}
		int var10 = arg0.method8900();
		int var11 = arg0.method8955();
		while (true) {
			int var12;
			do {
				if (var7 <= 0) {
					arg0.method8914(var10, var11);
					var5 = var3 | var8;
					return var5;
				}
				var7--;
				var10++;
				var8 |= 0x4;
				if ((var8 & 0x2) == 0 && arg2 != null) {
					arg2.method8896(var9, var10);
				}
				var12 = var9.method4468();
			} while (var10 < var12);
			var11++;
			var8 |= 0x1;
			var10 -= var9.field2494;
			if (var11 >= var9.field2487) {
				var8 |= 0x2;
			}
			if (var10 < 0 || var10 >= var12) {
				var8 |= 0x2;
				var10 = 0;
			}
			if ((var8 & 0x2) == 0 && arg2 != null) {
				arg2.method8896(var9, var10);
			}
		}
	}

	@ObfuscatedName("bv.aw(Lsp;ILsk;I)I")
	public static int method1745(class470 arg0, int arg1, class469 arg2) {
		int var3 = 0;
		class216 var4 = arg0.method8916();
		if (var4.field2494 > 0 && var4.field2478 > 0) {
			arg1 %= var4.field2478;
		}
		int var5 = arg0.method8900();
		int var6 = arg0.method8962();
		int var7 = arg0.method8955();
		if (var5 >= var4.field2475.length) {
			var5 = 0;
			var6 = 0;
		}
		int var8 = arg1 + var6;
		while (true) {
			do {
				if (var8 <= var4.field2461[var5]) {
					arg0.method8959(var5, var8, var7);
					return var3;
				}
				var8 -= var4.field2461[var5];
				var5++;
				var3 |= 0x4;
				if ((var3 & 0x2) == 0 && arg2 != null) {
					arg2.method8896(var4, var5);
				}
			} while (var5 < var4.field2475.length);
			var7++;
			var3 |= 0x1;
			var5 -= var4.field2494;
			if (var7 >= var4.field2487) {
				var3 |= 0x2;
			}
			if (var5 < 0 || var5 >= var4.field2475.length) {
				var3 |= 0x2;
				var5 = 0;
			}
			if ((var3 & 0x2) == 0 && arg2 != null) {
				arg2.method8896(var4, var5);
			}
		}
	}
}
