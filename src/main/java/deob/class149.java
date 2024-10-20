package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("es")
public class class149 {

    @ObfuscatedName("es.y")
    public static class228 field2203 = null;

    @ObfuscatedName("es.q")
    public static class228 field2204 = null;

    @ObfuscatedName("es.f")
    public static class228 field2205 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.c(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method177(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field3192 = arg3;
        Statics.field779 = arg2;
        try {
            Statics.field1766 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field1766 = "Unknown";
        }
        Statics.field2202 = Statics.field1766.toLowerCase();
        try {
            Statics.field878 = System.getProperty("user.home");
            if (Statics.field878 != null) {
                Statics.field878 = Statics.field878 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field2202.startsWith("win")) {
                if (Statics.field878 == null) {
                    Statics.field878 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field878 == null) {
                Statics.field878 = System.getenv("HOME");
            }
            if (Statics.field878 != null) {
                Statics.field878 = Statics.field878 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field878 == null) {
            Statics.field878 = "~/";
        }
        Statics.field2643 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field878, "/tmp/", "" };
        Statics.field2005 = new String[] { ".jagex_cache_" + Statics.field779, ".file_store_" + Statics.field779 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field2198 = method5(arg0, arg1, var7);
            if (!Statics.field2198.exists()) {
                Statics.field2198.mkdirs();
            }
            File[] var8 = Statics.field2198.listFiles();
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
                if (!method660(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class135.method3(Statics.field2198);
        try {
            File var12 = new File(Statics.field878, "random.dat");
            if (var12.exists()) {
                field2203 = new class228(new class227(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field2005.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field2643.length; var14++) {
                        File var15 = new File(Statics.field2643[var14] + Statics.field2005[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field2203 = new class228(new class227(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field2203 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field2203 = new class228(new class227(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field2204 = new class228(new class227(class135.method2224("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2205 = new class228(new class227(class135.method2224("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2206 = new class228[Statics.field3192];
        for (int var19 = 0; var19 < Statics.field3192; var19++) {
            Statics.field2206[var19] = new class228(new class227(class135.method2224("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("h.h(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;")
    public static File method5(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2207 = new File(Statics.field878, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2207.exists()) {
            try {
                class227 var7 = new class227(Statics.field2207, "rw", 10000L);
                class119 var8 = new class119((int) var7.method3824());
                while (var8.field1955 < var8.field1956.length) {
                    int var9 = var7.method3827(var8.field1956, var8.field1955, var8.field1956.length - var8.field1955);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1955 += var9;
                }
                var8.field1955 = 0;
                int var10 = var8.method2291();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2291();
                }
                if (var10 <= 2) {
                    var4 = var8.method2300();
                    if (var11 == 1) {
                        var5 = var8.method2300();
                    }
                } else {
                    var4 = var8.method2410();
                    if (var11 == 1) {
                        var5 = var8.method2410();
                    }
                }
                var7.method3826();
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
                if (!method660(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2005.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2643.length; var16++) {
                    File var17 = new File(Statics.field2643[var16] + Statics.field2005[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method660(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field878 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method616(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("aj.k(Ljava/io/File;Ljava/io/File;I)V")
    public static void method616(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2207, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2276(3);
            var3.method2276(arg1 == null ? 0 : 1);
            var3.method2288(arg0.getPath());
            if (arg1 != null) {
                var3.method2288(arg1.getPath());
            }
            var2.method3832(var3.field1956, 0, var3.field1955);
            var2.method3826();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("af.t(Ljava/io/File;ZI)Z")
    public static boolean method660(File arg0, boolean arg1) {
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

    @ObfuscatedName("cv.g(Ljava/lang/String;Ljava/lang/String;ZI)Lhv;")
    public static class227 method1999(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2198, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field779 == 33) {
            var6 = "_rc";
        } else if (Statics.field779 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field878, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("eg.o(Ldf;I)V")
    public static void method2643(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2203.method3842(0L);
            field2203.method3840(var1);
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
        arg0.method2285(var1, 0, 24);
    }

    @ObfuscatedName("ad.i(Ldf;IS)V")
    public static void method707(class119 arg0, int arg1) {
        if (field2203 == null) {
            return;
        }
        try {
            field2203.method3842(0L);
            field2203.method3847(arg0.field1956, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
