package deob;

@ObfuscatedName("cr")
public class class63 extends class545 {

	@ObfuscatedName("cr.af")
	public static class429 field868 = new class429(32);

	@ObfuscatedName("cr.aw")
	public int[] field869 = new int[] { -1 };

	@ObfuscatedName("cr.at")
	public int[] field870 = new int[] { 0 };

	@ObfuscatedName("ov.af(IIB)I")
	public static int method7518(int arg0, int arg1) {
		class63 var2 = (class63) field868.method7973((long) arg0);
		if (var2 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < var2.field869.length) {
			return var2.field869[arg1];
		} else {
			return -1;
		}
	}

	@ObfuscatedName("fs.aw(III)I")
	public static int method3519(int arg0, int arg1) {
		class63 var2 = (class63) field868.method7973((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < var2.field870.length) {
			return var2.field870[arg1];
		} else {
			return 0;
		}
	}

	@ObfuscatedName("hw.at(IIB)I")
	public static int method4089(int arg0, int arg1) {
		class63 var2 = (class63) field868.method7973((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			int var3 = 0;
			for (int var4 = 0; var4 < var2.field870.length; var4++) {
				if (var2.field869[var4] == arg1) {
					var3 += var2.field870[var4];
				}
			}
			return var3;
		}
	}

	@ObfuscatedName("ed.ac(IIIII)V")
	public static void method3335(int arg0, int arg1, int arg2, int arg3) {
		class63 var4 = (class63) field868.method7973((long) arg0);
		if (var4 == null) {
			var4 = new class63();
			field868.method7975(var4, (long) arg0);
		}
		if (var4.field869.length <= arg1) {
			int[] var5 = new int[arg1 + 1];
			int[] var6 = new int[arg1 + 1];
			for (int var7 = 0; var7 < var4.field869.length; var7++) {
				var5[var7] = var4.field869[var7];
				var6[var7] = var4.field870[var7];
			}
			for (int var8 = var4.field869.length; var8 < arg1; var8++) {
				var5[var8] = -1;
				var6[var8] = 0;
			}
			var4.field869 = var5;
			var4.field870 = var6;
		}
		var4.field869[arg1] = arg2;
		var4.field870[arg1] = arg3;
	}

	@ObfuscatedName("as.ap(II)V")
	public static void method55(int arg0) {
		class63 var1 = (class63) field868.method7973((long) arg0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.field869.length; var2++) {
				var1.field869[var2] = -1;
				var1.field870[var2] = 0;
			}
		}
	}

	@ObfuscatedName("ha.aq(II)V")
	public static void method3907(int arg0) {
		class63 var1 = (class63) field868.method7973((long) arg0);
		if (var1 != null) {
			var1.method2234();
		}
	}

	@ObfuscatedName("vt.ao(I)V")
	public static void method10039() {
		field868 = new class429(32);
	}
}
