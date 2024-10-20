package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cx")
public class class81 {

    @ObfuscatedName("cx.r")
    public static class29 field1415 = null;

    @ObfuscatedName("cx.a")
    public static class29 field1420 = null;

    @ObfuscatedName("cx.q")
    public static class29 field1421 = null;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.g(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1340(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1417 = arg3;
        Statics.field346 = arg2;
        try {
            Statics.field915 = System.getProperty("os.name");
        } catch (Exception var53) {
            Statics.field915 = "Unknown";
        }
        Statics.field1278 = Statics.field915.toLowerCase();
        try {
            Statics.field1423 = System.getProperty("user.home");
            if (Statics.field1423 != null) {
                Statics.field1423 = Statics.field1423 + "/";
            }
        } catch (Exception var52) {
        }
        try {
            if (Statics.field1278.startsWith("win")) {
                if (Statics.field1423 == null) {
                    Statics.field1423 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1423 == null) {
                Statics.field1423 = System.getenv("HOME");
            }
            if (Statics.field1423 != null) {
                Statics.field1423 = Statics.field1423 + "/";
            }
        } catch (Exception var51) {
        }
        if (Statics.field1423 == null) {
            Statics.field1423 = "~/";
        }
        Statics.field935 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1423, "/tmp/", "" };
        Statics.field1422 = new String[] { ".jagex_cache_" + Statics.field346, ".file_store_" + Statics.field346 };
        int var7 = 0;
        label257: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1416 = new File(Statics.field1423, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1416.exists()) {
                try {
                    class28 var12 = new class28(Statics.field1416, "rw", 10000L);
                    class126 var13 = new class126((int) var12.method558());
                    while (var13.field2016 < var13.field2013.length) {
                        int var14 = var12.method556(var13.field2013, var13.field2016, var13.field2013.length - var13.field2016);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2016 += var14;
                    }
                    var13.field2016 = 0;
                    int var15 = var13.method2485();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2485();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2583();
                        if (var16 == 1) {
                            var10 = var13.method2583();
                        }
                    } else {
                        var9 = var13.method2495();
                        if (var16 == 1) {
                            var10 = var13.method2495();
                        }
                    }
                    var12.method555();
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
                    if (!method672(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label231: for (int var20 = 0; var20 < Statics.field1422.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field935.length; var21++) {
                        File var22 = new File(Statics.field935[var21] + Statics.field1422[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method672(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label231;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1423 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                    class28 var34 = new class28(Statics.field1416, "rw", 10000L);
                    class126 var35 = new class126(500);
                    var35.method2472(3);
                    var35.method2472(var33 == null ? 0 : 1);
                    var35.method2478(var32.getPath());
                    if (var33 != null) {
                        var35.method2478(((File) var33).getPath());
                    }
                    var34.method560(var35.field2013, 0, var35.field2016);
                    var34.method555();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field1367 = var37;
            if (!Statics.field1367.exists()) {
                Statics.field1367.mkdirs();
            }
            File[] var38 = Statics.field1367.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method672(var41, false)) {
                        var7++;
                        continue label257;
                    }
                }
            }
            break;
        }
        class71.method820(Statics.field1367);
        try {
            File var42 = new File(Statics.field1423, "random.dat");
            if (var42.exists()) {
                field1415 = new class29(new class28(var42, "rw", 25L), 24, 0);
            } else {
                label184: for (int var43 = 0; var43 < Statics.field1422.length; var43++) {
                    for (int var44 = 0; var44 < Statics.field935.length; var44++) {
                        File var45 = new File(Statics.field935[var44] + Statics.field1422[var43] + File.separatorChar + "random.dat");
                        if (var45.exists()) {
                            field1415 = new class29(new class28(var45, "rw", 25L), 24, 0);
                            break label184;
                        }
                    }
                }
            }
            if (field1415 == null) {
                RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                int var47 = var46.read();
                var46.seek(0L);
                var46.write(var47);
                var46.seek(0L);
                var46.close();
                field1415 = new class29(new class28(var42, "rw", 25L), 24, 0);
            }
        } catch (IOException var54) {
        }
        field1420 = new class29(new class28(class71.method225("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1421 = new class29(new class28(class71.method225("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1247 = new class29[Statics.field1417];
        for (int var49 = 0; var49 < Statics.field1417; var49++) {
            Statics.field1247[var49] = new class29(new class28(class71.method225("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("af.e(Ljava/io/File;ZI)Z")
    public static boolean method672(File arg0, boolean arg1) {
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

    @ObfuscatedName("by.n(Ldu;I)V")
    public static void method1403(class126 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1415.method576(0L);
            field1415.method578(var1);
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
        arg0.method2606(var1, 0, 24);
    }

    @ObfuscatedName("cr.j(B)V")
    public static void method2064() {
        try {
            field1420.method588();
            for (int var0 = 0; var0 < Statics.field1417; var0++) {
                Statics.field1247[var0].method588();
            }
            field1421.method588();
            field1415.method588();
        } catch (Exception var2) {
        }
    }
}
