package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ej")
public class class136 {

    @ObfuscatedName("ej.g")
    public static class196 field2080 = null;

    @ObfuscatedName("ej.a")
    public static class196 field2086 = null;

    @ObfuscatedName("ej.c")
    public static class196 field2082 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.t(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2828(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2078 = arg3;
        Statics.field1557 = arg2;
        try {
            Statics.field1518 = System.getProperty("os.name");
        } catch (Exception var53) {
            Statics.field1518 = "Unknown";
        }
        Statics.field1442 = Statics.field1518.toLowerCase();
        try {
            Statics.field2084 = System.getProperty("user.home");
            if (Statics.field2084 != null) {
                Statics.field2084 = Statics.field2084 + "/";
            }
        } catch (Exception var52) {
        }
        try {
            if (Statics.field1442.startsWith("win")) {
                if (Statics.field2084 == null) {
                    Statics.field2084 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2084 == null) {
                Statics.field2084 = System.getenv("HOME");
            }
            if (Statics.field2084 != null) {
                Statics.field2084 = Statics.field2084 + "/";
            }
        } catch (Exception var51) {
        }
        if (Statics.field2084 == null) {
            Statics.field2084 = "~/";
        }
        Statics.field886 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2084, "/tmp/", "" };
        Statics.field2866 = new String[] { ".jagex_cache_" + Statics.field1557, ".file_store_" + Statics.field1557 };
        int var7 = 0;
        label257: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2076 = new File(Statics.field2084, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2076.exists()) {
                try {
                    class195 var12 = new class195(Statics.field2076, "rw", 10000L);
                    class107 var13 = new class107((int) var12.method3436());
                    while (var13.field1830 < var13.field1831.length) {
                        int var14 = var12.method3451(var13.field1831, var13.field1830, var13.field1831.length - var13.field1830);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1830 += var14;
                    }
                    var13.field1830 = 0;
                    int var15 = var13.method2101();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2101();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2110();
                        if (var16 == 1) {
                            var10 = var13.method2110();
                        }
                    } else {
                        var9 = var13.method2130();
                        if (var16 == 1) {
                            var10 = var13.method2130();
                        }
                    }
                    var12.method3435();
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
                    if (!method2844(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label231: for (int var20 = 0; var20 < Statics.field2866.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field886.length; var21++) {
                        File var22 = new File(Statics.field886[var21] + Statics.field2866[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2844(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label231;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field2084 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                    class195 var34 = new class195(Statics.field2076, "rw", 10000L);
                    class107 var35 = new class107(500);
                    var35.method2214(3);
                    var35.method2214(var33 == null ? 0 : 1);
                    var35.method2094(var32.getPath());
                    if (var33 != null) {
                        var35.method2094(((File) var33).getPath());
                    }
                    var34.method3456(var35.field1831, 0, var35.field1830);
                    var34.method3435();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2077 = var37;
            if (!Statics.field2077.exists()) {
                Statics.field2077.mkdirs();
            }
            File[] var38 = Statics.field2077.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method2844(var41, false)) {
                        var7++;
                        continue label257;
                    }
                }
            }
            break;
        }
        class122.method2424(Statics.field2077);
        try {
            File var42 = new File(Statics.field2084, "random.dat");
            if (var42.exists()) {
                field2080 = new class196(new class195(var42, "rw", 25L), 24, 0);
            } else {
                label184: for (int var43 = 0; var43 < Statics.field2866.length; var43++) {
                    for (int var44 = 0; var44 < Statics.field886.length; var44++) {
                        File var45 = new File(Statics.field886[var44] + Statics.field2866[var43] + File.separatorChar + "random.dat");
                        if (var45.exists()) {
                            field2080 = new class196(new class195(var45, "rw", 25L), 24, 0);
                            break label184;
                        }
                    }
                }
            }
            if (field2080 == null) {
                RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                int var47 = var46.read();
                var46.seek(0L);
                var46.write(var47);
                var46.seek(0L);
                var46.close();
                field2080 = new class196(new class195(var42, "rw", 25L), 24, 0);
            }
        } catch (IOException var54) {
        }
        field2086 = new class196(new class195(class122.method2372("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2082 = new class196(new class195(class122.method2372("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field185 = new class196[Statics.field2078];
        for (int var49 = 0; var49 < Statics.field2078; var49++) {
            Statics.field185[var49] = new class196(new class195(class122.method2372("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ey.s(Ljava/io/File;ZI)Z")
    public static boolean method2844(File arg0, boolean arg1) {
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

    @ObfuscatedName("b.f(Ljava/lang/String;Ljava/lang/String;ZB)Lgw;")
    public static class195 method484(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2077, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class195(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1557 == 33) {
            var6 = "_rc";
        } else if (Statics.field1557 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2084, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class195(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class195(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("a.e(Ldb;S)V")
    public static void method133(class107 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2080.method3459(0L);
            field2080.method3461(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var5) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method2095(var1, 0, 24);
    }

    @ObfuscatedName("dh.d(I)V")
    public static void method2382() {
        try {
            field2086.method3468();
            for (int var0 = 0; var0 < Statics.field2078; var0++) {
                Statics.field185[var0].method3468();
            }
            field2082.method3468();
            field2080.method3468();
        } catch (Exception var2) {
        }
    }
}
