package deob;

@ObfuscatedName("jj")
public class class236 extends class541 {

	@ObfuscatedName("jj.af")
	public class223[] field2809;

	public class236(class413 arg0, class413 arg1, int arg2) {
		int var4 = arg0.method7702(arg2);
		this.field2809 = new class223[var4];
		class230 var5 = null;
		int[] var6 = arg0.method7708(arg2);
		for (int var7 = 0; var7 < var6.length; var7++) {
			byte[] var8 = arg0.method7692(arg2, var6[var7]);
			if (var5 == null) {
				int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
				byte[] var10 = arg1.method7699(var9, 0);
				var5 = new class230(var9, var10);
			}
			this.field2809[var6[var7]] = new class223(var8, var5);
		}
	}

	@ObfuscatedName("lc.af(Lpx;Lpx;II)Ljj;")
	public static class236 method6241(class413 arg0, class413 arg1, int arg2) {
		boolean var3 = true;
		int var4 = -1;
		int[] var5 = arg0.method7708(arg2);
		for (int var6 = 0; var6 < var5.length; var6++) {
			byte[] var7 = arg0.method7699(arg2, var5[var6]);
			if (var7 == null) {
				var3 = false;
			} else if (var4 == -1) {
				var4 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
			}
		}
		if (var4 == -1) {
			var3 = false;
		} else {
			byte[] var8 = arg1.method7699(var4, 0);
			if (var8 == null) {
				var3 = false;
			}
		}
		if (!var3) {
			return null;
		}
		try {
			return new class236(arg0, arg1, arg2);
		} catch (Exception var10) {
			return null;
		}
	}

	@ObfuscatedName("jj.aw(IB)Z")
	public boolean method5060(int arg0) {
		return this.field2809[arg0].field2591;
	}
}
