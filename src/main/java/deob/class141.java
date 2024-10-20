package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ec")
public class class141 {

    @ObfuscatedName("ec.m")
    public static class219 field2145 = null;

    @ObfuscatedName("ec.h")
    public static class219 field2146 = null;

    @ObfuscatedName("ec.n")
    public static class219 field2147 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.p(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2596(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2140 = arg3;
        Statics.field2149 = arg2;
        try {
            Statics.field639 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field639 = "Unknown";
        }
        Statics.field2138 = Statics.field639.toLowerCase();
        try {
            Statics.field2839 = System.getProperty("user.home");
            if (Statics.field2839 != null) {
                Statics.field2839 = Statics.field2839 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field2138.startsWith("win")) {
                if (Statics.field2839 == null) {
                    Statics.field2839 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2839 == null) {
                Statics.field2839 = System.getenv("HOME");
            }
            if (Statics.field2839 != null) {
                Statics.field2839 = Statics.field2839 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field2839 == null) {
            Statics.field2839 = "~/";
        }
        Statics.field2568 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2839, "/tmp/", "" };
        Statics.field3083 = new String[] { ".jagex_cache_" + Statics.field2149, ".file_store_" + Statics.field2149 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field2074 = method1801(arg0, arg1, var7);
            if (!Statics.field2074.exists()) {
                Statics.field2074.mkdirs();
            }
            File[] var8 = Statics.field2074.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label79;
                }
                File var11 = var9[var10];
                if (!method522(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class127.method1621(Statics.field2074);
        Statics.method1914();
        field2146 = new class219(new class218(class127.method580("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2147 = new class219(new class218(class127.method580("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2148 = new class219[Statics.field2140];
        for (int var12 = 0; var12 < Statics.field2140; var12++) {
            Statics.field2148[var12] = new class219(new class218(class127.method580("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("cn.k(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1801(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2141 = new File(Statics.field2839, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2141.exists()) {
            try {
                class218 var7 = new class218(Statics.field2141, "rw", 10000L);
                class111 var8 = new class111((int) var7.method3721());
                while (var8.field1885 < var8.field1889.length) {
                    int var9 = var7.method3731(var8.field1889, var8.field1885, var8.field1889.length - var8.field1885);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1885 += var9;
                }
                var8.field1885 = 0;
                int var10 = var8.method2314();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2314();
                }
                if (var10 <= 2) {
                    var4 = var8.method2184();
                    if (var11 == 1) {
                        var5 = var8.method2184();
                    }
                } else {
                    var4 = var8.method2185();
                    if (var11 == 1) {
                        var5 = var8.method2185();
                    }
                }
                var7.method3720();
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
                if (!method522(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field3083.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2568.length; var16++) {
                    File var17 = new File(Statics.field2568[var16] + Statics.field3083[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method522(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2839 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class218 var29 = new class218(Statics.field2141, "rw", 10000L);
                class111 var30 = new class111(500);
                var30.method2160(3);
                var30.method2160(var28 == null ? 0 : 1);
                var30.method2352(var27.getPath());
                if (var28 != null) {
                    var30.method2352(((File) var28).getPath());
                }
                var29.method3719(var30.field1889, 0, var30.field1885);
                var29.method3720();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("j.e(Ljava/io/File;ZB)Z")
    public static boolean method522(File arg0, boolean arg1) {
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

    @ObfuscatedName("ch.f(Ljava/lang/String;Ljava/lang/String;ZB)Lhq;")
    public static class218 method2006(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2074, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class218(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2149 == 33) {
            var6 = "_rc";
        } else if (Statics.field2149 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2839, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("gt.t(Lde;B)V")
    public static void method3544(class111 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2145.method3745(0L);
            field2145.method3736(var1);
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
        arg0.method2227(var1, 0, 24);
    }
}
