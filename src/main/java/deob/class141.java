package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eg")
public class class141 {

    @ObfuscatedName("eg.c")
    public static class219 field2142 = null;

    @ObfuscatedName("eg.k")
    public static class219 field2137 = null;

    @ObfuscatedName("eg.x")
    public static class219 field2144 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hf.n(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3622(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2483 = arg3;
        Statics.field2853 = arg2;
        try {
            Statics.field1956 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field1956 = "Unknown";
        }
        Statics.field18 = Statics.field1956.toLowerCase();
        try {
            Statics.field1962 = System.getProperty("user.home");
            if (Statics.field1962 != null) {
                Statics.field1962 = Statics.field1962 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field18.startsWith("win")) {
                if (Statics.field1962 == null) {
                    Statics.field1962 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1962 == null) {
                Statics.field1962 = System.getenv("HOME");
            }
            if (Statics.field1962 != null) {
                Statics.field1962 = Statics.field1962 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field1962 == null) {
            Statics.field1962 = "~/";
        }
        Statics.field158 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1962, "/tmp/", "" };
        Statics.field204 = new String[] { ".jagex_cache_" + Statics.field2853, ".file_store_" + Statics.field2853 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field1973 = method631(arg0, arg1, var7);
            if (!Statics.field1973.exists()) {
                Statics.field1973.mkdirs();
            }
            File[] var8 = Statics.field1973.listFiles();
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
                if (!method1860(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class127.method2832(Statics.field1973);
        try {
            File var12 = new File(Statics.field1962, "random.dat");
            if (var12.exists()) {
                field2142 = new class219(new class218(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field204.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field158.length; var14++) {
                        File var15 = new File(Statics.field158[var14] + Statics.field204[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field2142 = new class219(new class218(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field2142 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field2142 = new class219(new class218(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field2137 = new class219(new class218(class127.method1121("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2144 = new class219(new class218(class127.method1121("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1508 = new class219[Statics.field2483];
        for (int var19 = 0; var19 < Statics.field2483; var19++) {
            Statics.field1508[var19] = new class219(new class218(class127.method1121("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ao.g(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method631(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field3045 = new File(Statics.field1962, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field3045.exists()) {
            try {
                class218 var7 = new class218(Statics.field3045, "rw", 10000L);
                class111 var8 = new class111((int) var7.method3755());
                while (var8.field1896 < var8.field1904.length) {
                    int var9 = var7.method3751(var8.field1904, var8.field1896, var8.field1904.length - var8.field1896);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1896 += var9;
                }
                var8.field1896 = 0;
                int var10 = var8.method2211();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2211();
                }
                if (var10 <= 2) {
                    var4 = var8.method2224();
                    if (var11 == 1) {
                        var5 = var8.method2224();
                    }
                } else {
                    var4 = var8.method2206();
                    if (var11 == 1) {
                        var5 = var8.method2206();
                    }
                }
                var7.method3754();
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
                if (!method1860(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field204.length; var15++) {
                for (int var16 = 0; var16 < Statics.field158.length; var16++) {
                    File var17 = new File(Statics.field158[var16] + Statics.field204[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1860(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1962 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method2515(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("dg.a(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2515(File arg0, File arg1) {
        try {
            class218 var2 = new class218(Statics.field3045, "rw", 10000L);
            class111 var3 = new class111(500);
            var3.method2326(3);
            var3.method2326(arg1 == null ? 0 : 1);
            var3.method2337(arg0.getPath());
            if (arg1 != null) {
                var3.method2337(arg1.getPath());
            }
            var2.method3768(var3.field1904, 0, var3.field1896);
            var2.method3754();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ch.m(Ljava/io/File;ZB)Z")
    public static boolean method1860(File arg0, boolean arg1) {
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

    @ObfuscatedName("as.s(Ljava/lang/String;Ljava/lang/String;ZS)Lhl;")
    public static class218 method1076(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1973, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class218(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2853 == 33) {
            var6 = "_rc";
        } else if (Statics.field2853 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1962, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("dn.j(Ldp;IB)V")
    public static void method2157(class111 arg0, int arg1) {
        if (field2142 == null) {
            return;
        }
        try {
            field2142.method3771(0L);
            field2142.method3776(arg0.field1904, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
