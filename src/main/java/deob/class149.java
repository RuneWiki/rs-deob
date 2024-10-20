package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ei")
public class class149 {

    @ObfuscatedName("ei.d")
    public static class228 field2237 = null;

    @ObfuscatedName("ei.l")
    public static class228 field2236 = null;

    @ObfuscatedName("ei.n")
    public static class228 field2227 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.o(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1752(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2231 = arg3;
        Statics.field213 = arg2;
        try {
            Statics.field2051 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field2051 = "Unknown";
        }
        Statics.field2239 = Statics.field2051.toLowerCase();
        try {
            Statics.field649 = System.getProperty("user.home");
            if (Statics.field649 != null) {
                Statics.field649 = Statics.field649 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field2239.startsWith("win")) {
                if (Statics.field649 == null) {
                    Statics.field649 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field649 == null) {
                Statics.field649 = System.getenv("HOME");
            }
            if (Statics.field649 != null) {
                Statics.field649 = Statics.field649 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field649 == null) {
            Statics.field649 = "~/";
        }
        Statics.field571 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field649, "/tmp/", "" };
        Statics.field2233 = new String[] { ".jagex_cache_" + Statics.field213, ".file_store_" + Statics.field213 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field2230 = method130(arg0, arg1, var7);
            if (!Statics.field2230.exists()) {
                Statics.field2230.mkdirs();
            }
            File[] var8 = Statics.field2230.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label119;
                }
                File var11 = var9[var10];
                if (!method585(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2230;
        Statics.field2069 = var12;
        if (!Statics.field2069.exists()) {
            throw new RuntimeException("");
        }
        class135.field2073 = true;
        try {
            File var13 = new File(Statics.field649, "random.dat");
            if (var13.exists()) {
                field2237 = new class228(new class227(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field2233.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field571.length; var15++) {
                        File var16 = new File(Statics.field571[var15] + Statics.field2233[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2237 = new class228(new class227(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2237 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2237 = new class228(new class227(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2236 = new class228(new class227(class135.method2258("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2227 = new class228(new class227(class135.method2258("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field3148 = new class228[Statics.field2231];
        for (int var20 = 0; var20 < Statics.field2231; var20++) {
            Statics.field3148[var20] = new class228(new class227(class135.method2258("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("d.e(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method130(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2907 = new File(Statics.field649, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2907.exists()) {
            try {
                class227 var7 = new class227(Statics.field2907, "rw", 10000L);
                class119 var8 = new class119((int) var7.method3867());
                while (var8.field1974 < var8.field1977.length) {
                    int var9 = var7.method3864(var8.field1977, var8.field1974, var8.field1977.length - var8.field1974);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1974 += var9;
                }
                var8.field1974 = 0;
                int var10 = var8.method2427();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2427();
                }
                if (var10 <= 2) {
                    var4 = var8.method2525();
                    if (var11 == 1) {
                        var5 = var8.method2525();
                    }
                } else {
                    var4 = var8.method2347();
                    if (var11 == 1) {
                        var5 = var8.method2347();
                    }
                }
                var7.method3866();
            } catch (IOException var34) {
                var34.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method585(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2233.length; var15++) {
                for (int var16 = 0; var16 < Statics.field571.length; var16++) {
                    File var17 = new File(Statics.field571[var16] + Statics.field2233[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method585(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field649 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var33) {
                var33.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var27 = new File(var4);
            Object var28 = null;
            try {
                class227 var29 = new class227(Statics.field2907, "rw", 10000L);
                class119 var30 = new class119(500);
                var30.method2322(3);
                var30.method2322(var28 == null ? 0 : 1);
                var30.method2330(var27.getPath());
                if (var28 != null) {
                    var30.method2330(((File) var28).getPath());
                }
                var29.method3865(var30.field1977, 0, var30.field1974);
                var29.method3866();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("m.u(Ljava/io/File;ZI)Z")
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

    @ObfuscatedName("cr.b(Ljava/lang/String;Ljava/lang/String;ZB)Lhb;")
    public static class227 method2120(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2230, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field213 == 33) {
            var6 = "_rc";
        } else if (Statics.field213 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field649, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class227(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class227(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("l.p(Ldi;IB)V")
    public static void method158(class119 arg0, int arg1) {
        if (field2237 == null) {
            return;
        }
        try {
            field2237.method3887(0L);
            field2237.method3891(arg0.field1977, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("az.s(B)V")
    public static void method913() {
        try {
            field2236.method3886();
            for (int var0 = 0; var0 < Statics.field2231; var0++) {
                Statics.field3148[var0].method3886();
            }
            field2227.method3886();
            field2237.method3886();
        } catch (Exception var2) {
        }
    }
}
