package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("em")
public class class153 {

    @ObfuscatedName("em.l")
    public static class232 field2276 = null;

    @ObfuscatedName("em.h")
    public static class232 field2282 = null;

    @ObfuscatedName("em.i")
    public static class232 field2284 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.f(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2112(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2281 = arg3;
        Statics.field1958 = arg2;
        try {
            Statics.field644 = System.getProperty("os.name");
        } catch (Exception var20) {
            Statics.field644 = "Unknown";
        }
        Statics.field591 = Statics.field644.toLowerCase();
        try {
            Statics.field2279 = System.getProperty("user.home");
            if (Statics.field2279 != null) {
                Statics.field2279 = Statics.field2279 + "/";
            }
        } catch (Exception var19) {
        }
        try {
            if (Statics.field591.startsWith("win")) {
                if (Statics.field2279 == null) {
                    Statics.field2279 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2279 == null) {
                Statics.field2279 = System.getenv("HOME");
            }
            if (Statics.field2279 != null) {
                Statics.field2279 = Statics.field2279 + "/";
            }
        } catch (Exception var18) {
        }
        if (Statics.field2279 == null) {
            Statics.field2279 = "~/";
        }
        Statics.field1399 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2279, "/tmp/", "" };
        Statics.field983 = new String[] { ".jagex_cache_" + Statics.field1958, ".file_store_" + Statics.field1958 };
        int var7 = 0;
        label87: while (var7 < 4) {
            Statics.field2280 = method1846(arg0, arg1, var7);
            if (!Statics.field2280.exists()) {
                Statics.field2280.mkdirs();
            }
            File[] var8 = Statics.field2280.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label87;
                }
                File var11 = var9[var10];
                boolean var14;
                try {
                    RandomAccessFile var12 = new RandomAccessFile(var11, "rw");
                    int var13 = var12.read();
                    var12.seek(0L);
                    var12.write(var13);
                    var12.seek(0L);
                    var12.close();
                    var14 = true;
                } catch (Exception var17) {
                    var14 = false;
                }
                if (!var14) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class139.method2324(Statics.field2280);
        method990();
        field2282 = new class232(new class231(class139.method2812("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2284 = new class232(new class231(class139.method2812("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field607 = new class232[Statics.field2281];
        for (int var16 = 0; var16 < Statics.field2281; var16++) {
            Statics.field607[var16] = new class232(new class231(class139.method2812("main_file_cache.idx" + var16), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("cj.e(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1846(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2283 = new File(Statics.field2279, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2283.exists()) {
            try {
                class231 var7 = new class231(Statics.field2283, "rw", 10000L);
                class123 var8 = new class123((int) var7.method3957());
                while (var8.field2052 < var8.field2053.length) {
                    int var9 = var7.method3944(var8.field2053, var8.field2052, var8.field2053.length - var8.field2052);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2052 += var9;
                }
                var8.field2052 = 0;
                int var10 = var8.method2522();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2522();
                }
                if (var10 <= 2) {
                    var4 = var8.method2383();
                    if (var11 == 1) {
                        var5 = var8.method2383();
                    }
                } else {
                    var4 = var8.method2478();
                    if (var11 == 1) {
                        var5 = var8.method2478();
                    }
                }
                var7.method3942();
            } catch (IOException var45) {
                var45.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                boolean var17;
                try {
                    RandomAccessFile var15 = new RandomAccessFile(var14, "rw");
                    int var16 = var15.read();
                    var15.seek(0L);
                    var15.write(var16);
                    var15.seek(0L);
                    var15.close();
                    var14.delete();
                    var17 = true;
                } catch (Exception var43) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label134: for (int var19 = 0; var19 < Statics.field983.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1399.length; var20++) {
                    File var21 = new File(Statics.field1399[var20] + Statics.field983[var19] + File.separatorChar + arg0 + File.separatorChar);
                    if (var21.exists()) {
                        File var22 = new File(var21, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var42) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label134;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2279 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var27 = new File(var5);
            File var28 = new File(var4);
            try {
                File[] var29 = var27.listFiles();
                File[] var30 = var29;
                for (int var31 = 0; var31 < var30.length; var31++) {
                    File var32 = var30[var31];
                    File var33 = new File(var28, var32.getName());
                    boolean var34 = var32.renameTo(var33);
                    if (!var34) {
                        throw new IOException();
                    }
                }
            } catch (Exception var44) {
                var44.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var36 = new File(var4);
            Object var37 = null;
            try {
                class231 var38 = new class231(Statics.field2283, "rw", 10000L);
                class123 var39 = new class123(500);
                var39.method2384(3);
                var39.method2384(var37 == null ? 0 : 1);
                var39.method2418(var36.getPath());
                if (var37 != null) {
                    var39.method2418(((File) var37).getPath());
                }
                var38.method3941(var39.field2053, 0, var39.field2052);
                var38.method3942();
            } catch (IOException var41) {
                var41.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ao.n(Ljava/lang/String;Ljava/lang/String;ZB)Lhl;")
    public static class231 method767(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2280, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class231(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1958 == 33) {
            var6 = "_rc";
        } else if (Statics.field1958 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2279, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class231(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class231(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ad.t(I)V")
    public static void method990() {
        try {
            File var0 = new File(Statics.field2279, "random.dat");
            if (var0.exists()) {
                field2276 = new class232(new class231(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field983.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1399.length; var2++) {
                        File var3 = new File(Statics.field1399[var2] + Statics.field983[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2276 = new class232(new class231(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2276 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2276 = new class232(new class231(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
