package deob;

@ObfuscatedName("wn")
public class class589 {

	@ObfuscatedName("wn.al")
	public static final int[] field5906 = new int[17];

	static {
		field5906[0] = 0;
		for (int var0 = 0; var0 < 2048; var0 += 128) {
			int var1 = (var0 >> 7) + 1;
			int var3 = 0;
			if (var0 > 0 && var0 < 1024) {
				var3 |= 0x110;
			}
			if (var0 > 512 && var0 < 1536) {
				var3 |= 0x440;
			}
			if (var0 > 1024) {
				var3 |= 0x220;
			}
			if (var0 > 1536 || var0 < 512) {
				var3 |= 0x880;
			}
			if (var0 == 0 || var0 == 1024) {
				var3 |= 0x30;
			}
			if (var0 == 512 || var0 == 1536) {
				var3 |= 0x480;
			}
			field5906[var1] = var3;
		}
	}

	public class589() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("vq.af(Lky;Lwm;I)Lrw;")
	public static class450 method10060(class280 arg0, class587 arg1) {
		int var2 = arg1.field5903;
		int var3 = arg1.field5900;
		int var4 = arg1.field5901;
		int var5 = arg1.field5902;
		int var6 = arg0.method5844();
		int var7 = arg0.method5831();
		int var8 = arg0.method5833();
		int var9 = class537.field5572[var6 & 0x7FF];
		double var10 = (double) var9 / 65536.0D;
		double var14 = class537.method4516(var6);
		int var16 = (int) ((double) var2 * var10 - (double) var3 * var14);
		int var17 = (int) ((double) var2 * var14 + (double) var3 * var10);
		int var18 = var7 + var16;
		int var19 = var8 + var17;
		int var20 = (int) ((double) var4 * var10 - (double) var5 * var14);
		int var21 = (int) ((double) var4 * var14 + (double) var5 * var10);
		int var22 = (int) ((double) var4 * var10 + (double) var5 * var14);
		int var23 = (int) ((double) var5 * var10 - (double) var4 * var14);
		int var24 = var18 - var20;
		int var25 = var19 + var21;
		int var26 = var18 + var22;
		int var27 = var19 + var23;
		int var28 = var18 + var20;
		int var29 = var19 - var21;
		int var30 = var18 - var22;
		int var31 = var19 - var23;
		int var32 = Math.min(var24, Math.min(var26, Math.min(var28, var30)));
		int var33 = Math.max(var24, Math.max(var26, Math.max(var28, var30)));
		int var34 = Math.min(var25, Math.min(var27, Math.min(var29, var31)));
		int var35 = Math.max(var25, Math.max(var27, Math.max(var29, var31)));
		int var36 = var33 - var32 + 1;
		int var37 = var35 - var34 + 1;
		class450[] var38 = class450.field5165;
		synchronized (class450.field5165) {
			class450 var39;
			if (class450.field5162 == 0) {
				var39 = new class450(var32, var34, var36, var37);
			} else {
				class450.field5162--;
				class450.field5165[class450.field5162].method8286(var32, var34);
				class450.field5165[class450.field5162].method8287(var36, var37);
				var39 = class450.field5165[class450.field5162];
			}
			return var39;
		}
	}
}
