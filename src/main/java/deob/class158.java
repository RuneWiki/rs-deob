package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fk")
public class class158 {

    @ObfuscatedName("fk.z")
    public static class112 field2035 = null;

    @ObfuscatedName("fk.x")
    public static class112 field2033 = null;

    @ObfuscatedName("fk.v")
    public static class112 field2037 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.f(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method531(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2031 = arg3;
        Statics.field387 = arg2;
        try {
            Statics.field473 = System.getProperty("os.name");
        } catch (Exception var48) {
            Statics.field473 = "Unknown";
        }
        Statics.field2336 = Statics.field473.toLowerCase();
        try {
            Statics.field374 = System.getProperty("user.home");
            if (Statics.field374 != null) {
                Statics.field374 = Statics.field374 + "/";
            }
        } catch (Exception var47) {
        }
        try {
            if (Statics.field2336.startsWith("win")) {
                if (Statics.field374 == null) {
                    Statics.field374 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field374 == null) {
                Statics.field374 = System.getenv("HOME");
            }
            if (Statics.field374 != null) {
                Statics.field374 = Statics.field374 + "/";
            }
        } catch (Exception var46) {
        }
        if (Statics.field374 == null) {
            Statics.field374 = "~/";
        }
        Statics.field2038 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field374, "/tmp/", "" };
        Statics.field1030 = new String[] { ".jagex_cache_" + Statics.field387, ".file_store_" + Statics.field387 };
        int var7 = 0;
        label246: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2028 = new File(Statics.field374, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2028.exists()) {
                try {
                    class113 var12 = new class113(Statics.field2028, "rw", 10000L);
                    class185 var13 = new class185((int) var12.method2384());
                    while (var13.field2414 < var13.field2415.length) {
                        int var14 = var12.method2385(var13.field2415, var13.field2414, var13.field2415.length - var13.field2414);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2414 += var14;
                    }
                    var13.field2414 = 0;
                    int var15 = var13.method3344();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method3344();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method3354();
                        if (var16 == 1) {
                            var10 = var13.method3354();
                        }
                    } else {
                        var9 = var13.method3355();
                        if (var16 == 1) {
                            var10 = var13.method3355();
                        }
                    }
                    var12.method2393();
                } catch (IOException var51) {
                    var51.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method585(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label220: for (int var20 = 0; var20 < Statics.field1030.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2038.length; var21++) {
                        File var22 = new File(Statics.field2038[var21] + Statics.field1030[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method585(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label220;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field374 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var50) {
                    var50.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method4445(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field2032 = var32;
            if (!Statics.field2032.exists()) {
                Statics.field2032.mkdirs();
            }
            File[] var33 = Statics.field2032.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method585(var36, false)) {
                        var7++;
                        continue label246;
                    }
                }
            }
            break;
        }
        File var37 = Statics.field2032;
        Statics.field2046 = var37;
        if (!Statics.field2046.exists()) {
            throw new RuntimeException("");
        }
        class161.field2048 = true;
        try {
            File var38 = new File(Statics.field374, "random.dat");
            if (var38.exists()) {
                field2035 = new class112(new class113(var38, "rw", 25L), 24, 0);
            } else {
                label171: for (int var39 = 0; var39 < Statics.field1030.length; var39++) {
                    for (int var40 = 0; var40 < Statics.field2038.length; var40++) {
                        File var41 = new File(Statics.field2038[var40] + Statics.field1030[var39] + File.separatorChar + "random.dat");
                        if (var41.exists()) {
                            field2035 = new class112(new class113(var41, "rw", 25L), 24, 0);
                            break label171;
                        }
                    }
                }
            }
            if (field2035 == null) {
                RandomAccessFile var42 = new RandomAccessFile(var38, "rw");
                int var43 = var42.read();
                var42.seek(0L);
                var42.write(var43);
                var42.seek(0L);
                var42.close();
                field2035 = new class112(new class113(var38, "rw", 25L), 24, 0);
            }
        } catch (IOException var49) {
        }
        field2033 = new class112(new class113(class161.method24("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2037 = new class112(new class113(class161.method24("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field55 = new class112[Statics.field2031];
        for (int var45 = 0; var45 < Statics.field2031; var45++) {
            Statics.field55[var45] = new class112(new class113(class161.method24("main_file_cache.idx" + var45), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ip.l(Ljava/io/File;Ljava/io/File;I)V")
    public static void method4445(File arg0, File arg1) {
        try {
            class113 var2 = new class113(Statics.field2028, "rw", 10000L);
            class185 var3 = new class185(500);
            var3.method3376(3);
            var3.method3376(arg1 == null ? 0 : 1);
            var3.method3338(arg0.getPath());
            if (arg1 != null) {
                var3.method3338(arg1.getPath());
            }
            var2.method2381(var3.field2415, 0, var3.field2414);
            var2.method2393();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("as.w(Ljava/io/File;ZI)Z")
    public static boolean method585(File arg0, boolean arg1) {
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

    @ObfuscatedName("ak.s(Ljava/lang/String;Ljava/lang/String;ZI)Lda;")
    public static class113 method942(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2032, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class113(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field387 == 33) {
            var6 = "_rc";
        } else if (Statics.field387 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field374, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class113(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class113(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("w.e(Lgm;IB)V")
    public static void method22(class185 arg0, int arg1) {
        if (field2035 == null) {
            return;
        }
        try {
            field2035.method2368(0L);
            field2035.method2357(arg0.field2415, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
