package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ep")
public class class138 {

    @ObfuscatedName("ep.i")
    public static class208 field2073 = null;

    @ObfuscatedName("ep.x")
    public static class208 field2074 = null;

    @ObfuscatedName("ep.h")
    public static class208 field2070 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.c(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1413(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1343 = arg3;
        Statics.field2072 = arg2;
        try {
            Statics.field2924 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field2924 = "Unknown";
        }
        Statics.field1650 = Statics.field2924.toLowerCase();
        try {
            Statics.field1344 = System.getProperty("user.home");
            if (Statics.field1344 != null) {
                Statics.field1344 = Statics.field1344 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field1650.startsWith("win")) {
                if (Statics.field1344 == null) {
                    Statics.field1344 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1344 == null) {
                Statics.field1344 = System.getenv("HOME");
            }
            if (Statics.field1344 != null) {
                Statics.field1344 = Statics.field1344 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field1344 == null) {
            Statics.field1344 = "~/";
        }
        Statics.field2499 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1344, "/tmp/", "" };
        Statics.field1009 = new String[] { ".jagex_cache_" + Statics.field2072, ".file_store_" + Statics.field2072 };
        int var7 = 0;
        label225: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field615 = new File(Statics.field1344, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field615.exists()) {
                try {
                    class207 var12 = new class207(Statics.field615, "rw", 10000L);
                    class108 var13 = new class108((int) var12.method3530());
                    while (var13.field1826 < var13.field1830.length) {
                        int var14 = var12.method3538(var13.field1830, var13.field1826, var13.field1830.length - var13.field1826);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1826 += var14;
                    }
                    var13.field1826 = 0;
                    int var15 = var13.method2134();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2134();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2143();
                        if (var16 == 1) {
                            var10 = var13.method2143();
                        }
                    } else {
                        var9 = var13.method2154();
                        if (var16 == 1) {
                            var10 = var13.method2154();
                        }
                    }
                    var12.method3529();
                } catch (IOException var49) {
                    var49.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method904(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label199: for (int var20 = 0; var20 < Statics.field1009.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2499.length; var21++) {
                        File var22 = new File(Statics.field2499[var21] + Statics.field1009[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method904(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label199;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1344 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var48) {
                    var48.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class207 var34 = new class207(Statics.field615, "rw", 10000L);
                    class108 var35 = new class108(500);
                    var35.method2120(3);
                    var35.method2120(var33 == null ? 0 : 1);
                    var35.method2127(var32.getPath());
                    if (var33 != null) {
                        var35.method2127(((File) var33).getPath());
                    }
                    var34.method3528(var35.field1830, 0, var35.field1826);
                    var34.method3529();
                } catch (IOException var44) {
                    var44.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2075 = var37;
            if (!Statics.field2075.exists()) {
                Statics.field2075.mkdirs();
            }
            File[] var38 = Statics.field2075.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method904(var41, false)) {
                        var7++;
                        continue label225;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field2075;
        Statics.field1931 = var42;
        if (!Statics.field1931.exists()) {
            throw new RuntimeException("");
        }
        class124.field1935 = true;
        method1611();
        field2074 = new class208(new class207(class124.method1610("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2070 = new class208(new class207(class124.method1610("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2076 = new class208[Statics.field1343];
        for (int var43 = 0; var43 < Statics.field1343; var43++) {
            Statics.field2076[var43] = new class208(new class207(class124.method1610("main_file_cache.idx" + var43), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("av.j(Ljava/io/File;ZI)Z")
    public static boolean method904(File arg0, boolean arg1) {
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

    @ObfuscatedName("ez.y(Ljava/lang/String;Ljava/lang/String;ZB)Lgq;")
    public static class207 method2724(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2075, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class207(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2072 == 33) {
            var6 = "_rc";
        } else if (Statics.field2072 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1344, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class207(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class207(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bd.r(I)V")
    public static void method1611() {
        try {
            File var0 = new File(Statics.field1344, "random.dat");
            if (var0.exists()) {
                field2073 = new class208(new class207(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1009.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2499.length; var2++) {
                        File var3 = new File(Statics.field2499[var2] + Statics.field1009[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2073 = new class208(new class207(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2073 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2073 = new class208(new class207(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("bt.f(Ldx;I)V")
    public static void method1383(class108 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2073.method3549(0L);
            field2073.method3551(var1);
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
        arg0.method2128(var1, 0, 24);
    }

    @ObfuscatedName("at.l(B)V")
    public static void method531() {
        try {
            field2074.method3572();
            for (int var0 = 0; var0 < Statics.field1343; var0++) {
                Statics.field2076[var0].method3572();
            }
            field2070.method3572();
            field2073.method3572();
        } catch (Exception var2) {
        }
    }
}
