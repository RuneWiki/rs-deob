package deob;

import java.util.ArrayList;
import java.util.HashMap;

@ObfuscatedName("sd")
public class class483 {

	@ObfuscatedName("sd.ap")
	public static final Object field5318 = new Object();

	@ObfuscatedName("sd.aq")
	public static int field5330 = 0;

	@ObfuscatedName("sd.ao")
	public static int field5320 = 0;

	@ObfuscatedName("sd.as")
	public static int field5324 = 0;

	@ObfuscatedName("sd.al")
	public static int field5322 = 0;

	@ObfuscatedName("sd.au")
	public static int field5323 = 1000;

	@ObfuscatedName("sd.ai")
	public static int field5317 = 250;

	@ObfuscatedName("sd.aa")
	public static int field5325 = 100;

	@ObfuscatedName("sd.am")
	public static int field5326 = 50;

	@ObfuscatedName("sd.an")
	public static byte[][] field5327 = new byte[1000][];

	@ObfuscatedName("sd.ar")
	public static byte[][] field5328 = new byte[250][];

	@ObfuscatedName("sd.ae")
	public static byte[][] field5319 = new byte[100][];

	@ObfuscatedName("sd.ay")
	public static byte[][] field5329 = new byte[50][];

	@ObfuscatedName("sd.ah")
	public static ArrayList field5332 = new ArrayList();

	static {
		new HashMap();
		field5332.clear();
		field5332.add(100);
		field5332.add(5000);
		field5332.add(10000);
		field5332.add(30000);
	}

	public class483() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("pp.af(IZI)[B")
	public static byte[] method7629(int arg0, boolean arg1) {
		Object var2 = field5318;
		synchronized (field5318) {
			if ((arg0 == 100 || arg0 < 100 && arg1) && field5330 > 0) {
				byte[] var3 = field5327[--field5330];
				field5327[field5330] = null;
				return var3;
			}
			if ((arg0 == 5000 || arg0 < 5000 && arg1) && field5320 > 0) {
				byte[] var4 = field5328[--field5320];
				field5328[field5320] = null;
				return var4;
			}
			if ((arg0 == 10000 || arg0 < 10000 && arg1) && field5324 > 0) {
				byte[] var5 = field5319[--field5324];
				field5319[field5324] = null;
				return var5;
			}
			if ((arg0 == 30000 || arg0 < 30000 && arg1) && field5322 > 0) {
				byte[] var6 = field5329[--field5322];
				field5329[field5322] = null;
				return var6;
			}
			if (Statics.field918 != null) {
				for (int var7 = 0; var7 < Statics.field5331.length; var7++) {
					if ((Statics.field5331[var7] == arg0 || arg0 < Statics.field5331[var7] && arg1) && Statics.field5296[var7] > 0) {
						byte[] var8 = Statics.field918[var7][--Statics.field5296[var7]];
						Statics.field918[var7][Statics.field5296[var7]] = null;
						return var8;
					}
				}
			}
			if (arg1 && Statics.field5331 != null) {
				for (int var9 = 0; var9 < Statics.field5331.length; var9++) {
					if (arg0 <= Statics.field5331[var9] && Statics.field5296[var9] < Statics.field918[var9].length) {
						return new byte[Statics.field5331[var9]];
					}
				}
			}
		}
		return new byte[arg0];
	}

	@ObfuscatedName("fy.aw(IB)[B")
	public static byte[] method3520(int arg0) {
		return method7629(arg0, false);
	}

	@ObfuscatedName("ld.at([BI)V")
	public static void method6335(byte[] arg0) {
		Object var1 = field5318;
		synchronized (field5318) {
			if (arg0.length == 100 && field5330 < field5323) {
				field5327[++field5330 - 1] = arg0;
			} else if (arg0.length == 5000 && field5320 < field5317) {
				field5328[++field5320 - 1] = arg0;
			} else if (arg0.length == 10000 && field5324 < field5325) {
				field5319[++field5324 - 1] = arg0;
			} else if (arg0.length == 30000 && field5322 < field5326) {
				field5329[++field5322 - 1] = arg0;
			} else if (Statics.field918 != null) {
				for (int var2 = 0; var2 < Statics.field5331.length; var2++) {
					if (Statics.field5331[var2] == arg0.length && Statics.field5296[var2] < Statics.field918[var2].length) {
						Statics.field918[var2][Statics.field5296[var2]++] = arg0;
						return;
					}
				}
			}
		}
	}
}
