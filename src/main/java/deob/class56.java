package deob;

@ObfuscatedName("cg")
public class class56 extends class541 {

	@ObfuscatedName("cg.af")
	public static class321 field801 = new class321(128);

	@ObfuscatedName("cg.aw")
	public class427[] field795;

	@ObfuscatedName("cg.at")
	public String field796;

	@ObfuscatedName("cg.ac")
	public int[] field797;

	@ObfuscatedName("cg.ap")
	public int[] field802;

	@ObfuscatedName("cg.aq")
	public String[] field799;

	@ObfuscatedName("cg.ao")
	public int field800;

	@ObfuscatedName("cg.as")
	public int field798;

	@ObfuscatedName("cg.al")
	public int field803;

	@ObfuscatedName("cg.au")
	public int field805;

	@ObfuscatedName("mw.af(II)Lcg;")
	public static class56 method6468(int arg0) {
		class56 var1 = (class56) field801.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field3842.method7692(arg0, 0);
		if (var2 == null) {
			return null;
		} else {
			class56 var3 = method3527(var2);
			field801.method6454(var3, (long) arg0);
			return var3;
		}
	}

	@ObfuscatedName("av.aw(IIIB)Lcg;")
	public static class56 method292(int arg0, int arg1, int arg2) {
		int var3 = class393.method4100(arg1, arg0);
		class56 var4 = method2760(var3, arg0);
		if (var4 != null) {
			return var4;
		}
		int var5 = Statics.method6483(arg2, arg0);
		class56 var6 = method2760(var5, arg0);
		if (var6 == null) {
			int var7 = arg0 + -512;
			class56 var9 = method2760(var7, arg0);
			return var9 == null ? null : var9;
		} else {
			return var6;
		}
	}

	@ObfuscatedName("dw.at(IIB)Lcg;")
	public static class56 method2760(int arg0, int arg1) {
		class56 var2 = (class56) field801.method6463((long) (arg0 << 16));
		if (var2 != null) {
			return var2;
		}
		String var3 = String.valueOf(arg0);
		int var4 = Statics.field3842.method7715(var3);
		if (var4 == -1) {
			return null;
		}
		byte[] var5 = Statics.field3842.method7775(var4);
		if (var5 != null) {
			if (var5.length <= 1) {
				return null;
			}
			class56 var6 = method3527(var5);
			if (var6 != null) {
				field801.method6454(var6, (long) (arg0 << 16));
				return var6;
			}
		}
		return null;
	}

	@ObfuscatedName("fy.ac([BI)Lcg;")
	public static class56 method3527(byte[] arg0) {
		class56 var1 = new class56();
		class591 var2 = new class591(arg0);
		var2.field5920 = var2.field5917.length - 2;
		int var3 = var2.method10341();
		int var4 = var2.field5917.length - 2 - var3 - 12;
		var2.field5920 = var4;
		int var5 = var2.method10345();
		var1.field800 = var2.method10341();
		var1.field798 = var2.method10341();
		var1.field803 = var2.method10341();
		var1.field805 = var2.method10341();
		int var6 = var2.method10339();
		if (var6 > 0) {
			var1.field795 = var1.method1962(var6);
			for (int var7 = 0; var7 < var6; var7++) {
				int var8 = var2.method10341();
				class427 var9 = new class427(var8 > 0 ? class337.method3774(var8) : 1);
				var1.field795[var7] = var9;
				while (var8-- > 0) {
					int var10 = var2.method10345();
					int var11 = var2.method10345();
					var9.method7940(new class544(var11), (long) var10);
				}
			}
		}
		var2.field5920 = 0;
		var1.field796 = var2.method10349();
		var1.field797 = new int[var5];
		var1.field802 = new int[var5];
		var1.field799 = new String[var5];
		int var12 = 0;
		while (var2.field5920 < var4) {
			int var13 = var2.method10341();
			switch(var13) {
				case 3:
					var1.field799[var12] = var2.method10350();
					break;
				case 21:
				case 38:
				case 39:
				case 63:
					var1.field802[var12] = var2.method10339();
					break;
				default:
					if (var13 <= 99) {
						var1.field802[var12] = var2.method10345();
					} else {
						var1.field802[var12] = var2.method10339();
					}
			}
			var1.field797[var12++] = var13;
		}
		return var1;
	}

	@ObfuscatedName("tv.ap(I)V")
	public static void method9537() {
		field801.method6456();
	}

	@ObfuscatedName("cg.aq(IB)[Lqm;")
	public class427[] method1962(int arg0) {
		return new class427[arg0];
	}
}
