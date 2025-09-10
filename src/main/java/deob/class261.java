package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("kw")
public class class261 {

	@ObfuscatedName("kw.ai")
	public static class567 field3112 = null;

	@ObfuscatedName("kw.aa")
	public static class567 field3109 = null;

	@ObfuscatedName("kw.av")
	public static class567 field3105 = null;

	public class261() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("bs.af(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
	public static void method407(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
		if (arg1 != null && !arg1.isEmpty()) {
			arg0 = arg0 + "-" + arg1;
		}
		Statics.field3111 = arg4;
		Statics.field1578 = arg3;
		try {
			Statics.field3306 = System.getProperty("os.name");
		} catch (Exception var59) {
			Statics.field3306 = "Unknown";
		}
		Statics.field3107 = Statics.field3306.toLowerCase();
		Statics.field1204 = null;
		try {
			Statics.field1204 = System.getProperty("jagex.userhome");
		} catch (Exception var58) {
		}
		if (Statics.field1204 == null) {
			try {
				Statics.field1204 = System.getProperty("user.home");
			} catch (Exception var57) {
			}
		}
		if (Statics.field1204 != null) {
			Statics.field1204 = Statics.field1204 + "/";
		}
		try {
			if (Statics.field3107.startsWith("win")) {
				if (Statics.field1204 == null) {
					Statics.field1204 = System.getenv("USERPROFILE");
				}
			} else if (Statics.field1204 == null) {
				Statics.field1204 = System.getenv("HOME");
			}
			if (Statics.field1204 != null) {
				Statics.field1204 = Statics.field1204 + "/";
			}
		} catch (Exception var56) {
		}
		if (Statics.field1204 == null) {
			Statics.field1204 = "~/";
		}
		Statics.field5982 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1204, "/tmp/", "" };
		Statics.field4412 = new String[] { ".jagex_cache_" + Statics.field1578, ".file_store_" + Statics.field1578 };
		int var9 = 0;
		label491: while (var9 < 4) {
			String var10 = var9 == 0 ? "" : "" + var9;
			Statics.field3110 = new File(Statics.field1204, "jagex_cl_" + arg0 + "_" + arg2 + var10 + ".dat");
			String var11 = null;
			String var12 = null;
			boolean var13 = false;
			if (Statics.field3110.exists()) {
				class566 var14 = null;
				try {
					var14 = new class566(Statics.field3110, "rw", 10000L);
					class591 var15 = new class591((int) var14.method10081());
					while (var15.field5920 < var15.field5917.length) {
						int var16 = var14.method10070(var15.field5917, var15.field5920, var15.field5917.length - var15.field5920);
						if (var16 == -1) {
							throw new IOException();
						}
						var15.field5920 += var16;
					}
					var15.field5920 = 0;
					int var17 = var15.method10339();
					if (var17 < 1 || var17 > 3) {
						throw new IOException("" + var17);
					}
					int var18 = 0;
					if (var17 > 1) {
						var18 = var15.method10339();
					}
					if (var17 <= 2) {
						var11 = var15.method10502();
						if (var18 == 1) {
							var12 = var15.method10502();
						}
					} else {
						var11 = var15.method10352();
						if (var18 == 1) {
							var12 = var15.method10352();
						}
					}
				} catch (Exception var61) {
					var61.printStackTrace();
				} finally {
					try {
						if (var14 != null) {
							var14.method10067();
						}
					} catch (IOException var55) {
					}
				}
				if (var11 != null) {
					File var24 = new File(var11);
					if (!var24.exists()) {
						var11 = null;
					}
				}
				if (var11 != null) {
					File var25 = new File(var11, "test.dat");
					if (!method77(var25, true)) {
						var11 = null;
					}
				}
			}
			if (var11 == null && var9 == 0) {
				label464: for (int var26 = 0; var26 < Statics.field4412.length; var26++) {
					for (int var27 = 0; var27 < Statics.field5982.length; var27++) {
						File var28 = new File(Statics.field5982[var27] + Statics.field4412[var26] + File.separatorChar + arg0 + File.separatorChar);
						if (var28.exists() && method77(new File(var28, "test.dat"), true)) {
							var11 = var28.toString();
							var13 = true;
							break label464;
						}
					}
				}
			}
			if (var11 == null) {
				var11 = Statics.field1204 + File.separatorChar + "jagexcache" + var10 + File.separatorChar + arg0 + File.separatorChar + arg2 + File.separatorChar;
				var13 = true;
			}
			if (var12 != null) {
				File var29 = new File(var12);
				File var30 = new File(var11);
				try {
					File[] var31 = var29.listFiles();
					File[] var32 = var31;
					for (int var33 = 0; var33 < var32.length; var33++) {
						File var34 = var32[var33];
						File var35 = new File(var30, var34.getName());
						boolean var36 = var34.renameTo(var35);
						if (!var36) {
							throw new IOException();
						}
					}
				} catch (Exception var60) {
					var60.printStackTrace();
				}
				var13 = true;
			}
			if (var13) {
				method10149(new File(var11), null);
			}
			File var38 = new File(var11);
			Statics.field100 = var38;
			if (!Statics.field100.exists()) {
				Statics.field100.mkdirs();
			}
			File[] var39 = Statics.field100.listFiles();
			if (var39 != null) {
				File[] var40 = var39;
				for (int var41 = 0; var41 < var40.length; var41++) {
					File var42 = var40[var41];
					if (!method77(var42, false)) {
						var9++;
						continue label491;
					}
				}
			}
			break;
		}
		File var43 = Statics.field100;
		Statics.field3118 = var43;
		if (!Statics.field3118.exists()) {
			throw new RuntimeException("");
		}
		class263.field3116 = true;
		method2080();
		field3112 = new class567(new class566(class263.method4092("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		field3109 = new class567(new class566(class263.method4092("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Statics.field3108 = new class567[Statics.field3111];
		for (int var44 = 0; var44 < Statics.field3111; var44++) {
			Statics.field3108[var44] = new class567(new class566(class263.method4092("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
		}
	}

	@ObfuscatedName("vw.aw(Ljava/io/File;Ljava/io/File;I)V")
	public static void method10149(File arg0, File arg1) {
		try {
			class566 var2 = new class566(Statics.field3110, "rw", 10000L);
			class591 var3 = new class591(500);
			var3.method10320(3);
			var3.method10320(arg1 == null ? 0 : 1);
			var3.method10538(arg0.getPath());
			if (arg1 != null) {
				var3.method10538(arg1.getPath());
			}
			var2.method10085(var3.field5917, 0, var3.field5920);
			var2.method10067();
		} catch (IOException var5) {
			var5.printStackTrace();
		}
	}

	@ObfuscatedName("au.at(Ljava/io/File;ZB)Z")
	public static boolean method77(File arg0, boolean arg1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(arg0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (Exception var5) {
			return false;
		}
	}

	@ObfuscatedName("bo.ac(Ljava/lang/String;Ljava/lang/String;ZI)Lvx;")
	public static class566 method496(String arg0, String arg1, boolean arg2) {
		File var3 = new File(Statics.field100, "preferences" + arg0 + ".dat");
		if (var3.exists()) {
			try {
				return new class566(var3, "rw", 10000L);
			} catch (IOException var14) {
			}
		}
		String var6 = "";
		if (Statics.field1578 == 33) {
			var6 = "_rc";
		} else if (Statics.field1578 == 34) {
			var6 = "_wip";
		}
		File var7 = new File(Statics.field1204, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
		if (!arg2 && var7.exists()) {
			try {
				return new class566(var7, "rw", 10000L);
			} catch (IOException var13) {
			}
		}
		try {
			return new class566(var3, "rw", 10000L);
		} catch (IOException var12) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cr.ap(I)V")
	public static void method2080() {
		try {
			File var0 = new File(Statics.field1204, "random.dat");
			if (var0.exists()) {
				field3105 = new class567(new class566(var0, "rw", 25L), 24, 0);
			} else {
				label34: for (int var1 = 0; var1 < Statics.field4412.length; var1++) {
					for (int var2 = 0; var2 < Statics.field5982.length; var2++) {
						File var3 = new File(Statics.field5982[var2] + Statics.field4412[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							field3105 = new class567(new class566(var3, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (field3105 == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				int var5 = var4.read();
				var4.seek(0L);
				var4.write(var5);
				var4.seek(0L);
				var4.close();
				field3105 = new class567(new class566(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var7) {
		}
	}

	@ObfuscatedName("cg.aq(S)[B")
	public static byte[] method1974() {
		byte[] var0 = new byte[24];
		try {
			field3105.method10092(0L);
			field3105.method10095(var0);
			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
			}
			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var3 = 0; var3 < 24; var3++) {
				var0[var3] = -1;
			}
		}
		return var0;
	}

	@ObfuscatedName("vf.ao(Lwb;II)V")
	public static void method10024(class591 arg0, int arg1) {
		if (field3105 == null) {
			return;
		}
		try {
			field3105.method10092(0L);
			field3105.method10113(arg0.field5917, arg1, 24);
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("ax.as(I)V")
	public static void method321() {
		try {
			field3112.method10091();
			for (int var0 = 0; var0 < Statics.field3111; var0++) {
				Statics.field3108[var0].method10091();
			}
			field3109.method10091();
			field3105.method10091();
		} catch (Exception var2) {
		}
	}
}
