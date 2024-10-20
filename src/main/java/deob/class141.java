package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ex")
public class class141 {

    @ObfuscatedName("ex.j")
    public static class219 field2131 = null;

    @ObfuscatedName("ex.m")
    public static class219 field2126 = null;

    @ObfuscatedName("ex.a")
    public static class219 field2136 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.o(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method815(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2065 = arg3;
        Statics.field919 = arg2;
        try {
            Statics.field2111 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field2111 = "Unknown";
        }
        Statics.field1278 = Statics.field2111.toLowerCase();
        try {
            Statics.field1476 = System.getProperty("user.home");
            if (Statics.field1476 != null) {
                Statics.field1476 = Statics.field1476 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field1278.startsWith("win")) {
                if (Statics.field1476 == null) {
                    Statics.field1476 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1476 == null) {
                Statics.field1476 = System.getenv("HOME");
            }
            if (Statics.field1476 != null) {
                Statics.field1476 = Statics.field1476 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field1476 == null) {
            Statics.field1476 = "~/";
        }
        Statics.field1918 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1476, "/tmp/", "" };
        Statics.field2128 = new String[] { ".jagex_cache_" + Statics.field919, ".file_store_" + Statics.field919 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field2123 = method1954(arg0, arg1, var7);
            if (!Statics.field2123.exists()) {
                Statics.field2123.mkdirs();
            }
            File[] var8 = Statics.field2123.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label115;
                }
                File var11 = var9[var10];
                if (!method3137(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class127.method1434(Statics.field2123);
        try {
            File var12 = new File(Statics.field1476, "random.dat");
            if (var12.exists()) {
                field2131 = new class219(new class218(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field2128.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field1918.length; var14++) {
                        File var15 = new File(Statics.field1918[var14] + Statics.field2128[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field2131 = new class219(new class218(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field2131 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field2131 = new class219(new class218(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field2126 = new class219(new class218(class127.method2563("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2136 = new class219(new class218(class127.method2563("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1027 = new class219[Statics.field2065];
        for (int var19 = 0; var19 < Statics.field2065; var19++) {
            Statics.field1027[var19] = new class219(new class218(class127.method2563("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("cz.l(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method1954(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2127 = new File(Statics.field1476, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2127.exists()) {
            try {
                class218 var7 = new class218(Statics.field2127, "rw", 10000L);
                class111 var8 = new class111((int) var7.method3742());
                while (var8.field1861 < var8.field1860.length) {
                    int var9 = var7.method3758(var8.field1860, var8.field1861, var8.field1860.length - var8.field1861);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1861 += var9;
                }
                var8.field1861 = 0;
                int var10 = var8.method2219();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2219();
                }
                if (var10 <= 2) {
                    var4 = var8.method2371();
                    if (var11 == 1) {
                        var5 = var8.method2371();
                    }
                } else {
                    var4 = var8.method2224();
                    if (var11 == 1) {
                        var5 = var8.method2224();
                    }
                }
                var7.method3741();
            } catch (IOException var28) {
                var28.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method3137(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2128.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1918.length; var16++) {
                    File var17 = new File(Statics.field1918[var16] + Statics.field2128[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method3137(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1476 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var18 = new File(var5);
            File var19 = new File(var4);
            try {
                File[] var20 = var18.listFiles();
                File[] var21 = var20;
                for (int var22 = 0; var22 < var21.length; var22++) {
                    File var23 = var21[var22];
                    File var24 = new File(var19, var23.getName());
                    boolean var25 = var23.renameTo(var24);
                    if (!var25) {
                        throw new IOException();
                    }
                }
            } catch (Exception var27) {
                var27.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method659(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("at.g(Ljava/io/File;Ljava/io/File;I)V")
    public static void method659(File arg0, File arg1) {
        try {
            class218 var2 = new class218(Statics.field2127, "rw", 10000L);
            class111 var3 = new class111(500);
            var3.method2204(3);
            var3.method2204(arg1 == null ? 0 : 1);
            var3.method2399(arg0.getPath());
            if (arg1 != null) {
                var3.method2399(arg1.getPath());
            }
            var2.method3740(var3.field1860, 0, var3.field1861);
            var2.method3741();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("fx.u(Ljava/io/File;ZB)Z")
    public static boolean method3137(File arg0, boolean arg1) {
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

    @ObfuscatedName("cx.q(Ljava/lang/String;Ljava/lang/String;ZI)Lhk;")
    public static class218 method2031(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2123, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class218(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field919 == 33) {
            var6 = "_rc";
        } else if (Statics.field919 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1476, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class218(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class218(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("k.r(Ldk;II)V")
    public static void method107(class111 arg0, int arg1) {
        if (field2131 == null) {
            return;
        }
        try {
            field2131.method3764(0L);
            field2131.method3769(arg0.field1860, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("aa.v(I)V")
    public static void method675() {
        try {
            field2126.method3777();
            for (int var0 = 0; var0 < Statics.field2065; var0++) {
                Statics.field1027[var0].method3777();
            }
            field2136.method3777();
            field2131.method3777();
        } catch (Exception var2) {
        }
    }
}
