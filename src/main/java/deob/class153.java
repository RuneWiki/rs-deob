package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ee")
public class class153 {

    @ObfuscatedName("ee.r")
    public static class232 field2277 = null;

    @ObfuscatedName("ee.w")
    public static class232 field2280 = null;

    @ObfuscatedName("ee.u")
    public static class232 field2279 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.s(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method527(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2278 = arg3;
        Statics.field2233 = arg2;
        try {
            Statics.field2222 = System.getProperty("os.name");
        } catch (Exception var53) {
            Statics.field2222 = "Unknown";
        }
        Statics.field607 = Statics.field2222.toLowerCase();
        try {
            Statics.field1599 = System.getProperty("user.home");
            if (Statics.field1599 != null) {
                Statics.field1599 = Statics.field1599 + "/";
            }
        } catch (Exception var52) {
        }
        try {
            if (Statics.field607.startsWith("win")) {
                if (Statics.field1599 == null) {
                    Statics.field1599 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1599 == null) {
                Statics.field1599 = System.getenv("HOME");
            }
            if (Statics.field1599 != null) {
                Statics.field1599 = Statics.field1599 + "/";
            }
        } catch (Exception var51) {
        }
        if (Statics.field1599 == null) {
            Statics.field1599 = "~/";
        }
        Statics.field2275 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1599, "/tmp/", "" };
        Statics.field1117 = new String[] { ".jagex_cache_" + Statics.field2233, ".file_store_" + Statics.field2233 };
        int var7 = 0;
        label257: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2273 = new File(Statics.field1599, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2273.exists()) {
                try {
                    class231 var12 = new class231(Statics.field2273, "rw", 10000L);
                    class123 var13 = new class123((int) var12.method3900());
                    while (var13.field2028 < var13.field2033.length) {
                        int var14 = var12.method3897(var13.field2033, var13.field2028, var13.field2033.length - var13.field2028);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2028 += var14;
                    }
                    var13.field2028 = 0;
                    int var15 = var13.method2363();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2363();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2372();
                        if (var16 == 1) {
                            var10 = var13.method2372();
                        }
                    } else {
                        var9 = var13.method2373();
                        if (var16 == 1) {
                            var10 = var13.method2373();
                        }
                    }
                    var12.method3898();
                } catch (IOException var56) {
                    var56.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method1028(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label231: for (int var20 = 0; var20 < Statics.field1117.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2275.length; var21++) {
                        File var22 = new File(Statics.field2275[var21] + Statics.field1117[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method1028(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label231;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1599 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
                var11 = true;
            }
            if (var10 != null) {
                File var23 = new File(var10);
                File var24 = new File(var9);
                try {
                    File[] var25 = var23.listFiles();
                    File[] var26 = var25;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        File var28 = var26[var27];
                        File var29 = new File(var24, var28.getName());
                        boolean var30 = var28.renameTo(var29);
                        if (!var30) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var55) {
                    var55.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class231 var34 = new class231(Statics.field2273, "rw", 10000L);
                    class123 var35 = new class123(500);
                    var35.method2349(3);
                    var35.method2349(var33 == null ? 0 : 1);
                    var35.method2475(var32.getPath());
                    if (var33 != null) {
                        var35.method2475(((File) var33).getPath());
                    }
                    var34.method3894(var35.field2033, 0, var35.field2028);
                    var34.method3898();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2274 = var37;
            if (!Statics.field2274.exists()) {
                Statics.field2274.mkdirs();
            }
            File[] var38 = Statics.field2274.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method1028(var41, false)) {
                        var7++;
                        continue label257;
                    }
                }
            }
            break;
        }
        class139.method720(Statics.field2274);
        try {
            File var42 = new File(Statics.field1599, "random.dat");
            if (var42.exists()) {
                field2277 = new class232(new class231(var42, "rw", 25L), 24, 0);
            } else {
                label184: for (int var43 = 0; var43 < Statics.field1117.length; var43++) {
                    for (int var44 = 0; var44 < Statics.field2275.length; var44++) {
                        File var45 = new File(Statics.field2275[var44] + Statics.field1117[var43] + File.separatorChar + "random.dat");
                        if (var45.exists()) {
                            field2277 = new class232(new class231(var45, "rw", 25L), 24, 0);
                            break label184;
                        }
                    }
                }
            }
            if (field2277 == null) {
                RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                int var47 = var46.read();
                var46.seek(0L);
                var46.write(var47);
                var46.seek(0L);
                var46.close();
                field2277 = new class232(new class231(var42, "rw", 25L), 24, 0);
            }
        } catch (IOException var54) {
        }
        field2280 = new class232(new class231(class139.method3255("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2279 = new class232(new class231(class139.method3255("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2272 = new class232[Statics.field2278];
        for (int var49 = 0; var49 < Statics.field2278; var49++) {
            Statics.field2272[var49] = new class232(new class231(class139.method3255("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bp.z(Ljava/io/File;ZI)Z")
    public static boolean method1028(File arg0, boolean arg1) {
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

    @ObfuscatedName("aw.t(Ljava/lang/String;Ljava/lang/String;ZB)Lhh;")
    public static class231 method930(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2274, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class231(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2233 == 33) {
            var6 = "_rc";
        } else if (Statics.field2233 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1599, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("eq.y(Ldy;II)V")
    public static void method2749(class123 arg0, int arg1) {
        if (field2277 == null) {
            return;
        }
        try {
            field2277.method3912(0L);
            field2277.method3917(arg0.field2033, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dc.p(S)V")
    public static void method2623() {
        try {
            field2280.method3911();
            for (int var0 = 0; var0 < Statics.field2278; var0++) {
                Statics.field2272[var0].method3911();
            }
            field2279.method3911();
            field2277.method3911();
        } catch (Exception var2) {
        }
    }
}
