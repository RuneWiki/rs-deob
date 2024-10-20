package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eo")
public class class153 {

    @ObfuscatedName("eo.l")
    public static class232 field2284 = null;

    @ObfuscatedName("eo.b")
    public static class232 field2280 = null;

    @ObfuscatedName("eo.g")
    public static class232 field2285 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.k(Ljava/lang/String;Ljava/lang/String;IIS)V")
    public static void method2220(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field579 = arg3;
        Statics.field636 = arg2;
        try {
            Statics.field3211 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field3211 = "Unknown";
        }
        Statics.field1432 = Statics.field3211.toLowerCase();
        try {
            Statics.field150 = System.getProperty("user.home");
            if (Statics.field150 != null) {
                Statics.field150 = Statics.field150 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field1432.startsWith("win")) {
                if (Statics.field150 == null) {
                    Statics.field150 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field150 == null) {
                Statics.field150 = System.getenv("HOME");
            }
            if (Statics.field150 != null) {
                Statics.field150 = Statics.field150 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field150 == null) {
            Statics.field150 = "~/";
        }
        Statics.field588 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field150, "/tmp/", "" };
        Statics.field2077 = new String[] { ".jagex_cache_" + Statics.field636, ".file_store_" + Statics.field636 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field62 = method3011(arg0, arg1, var7);
            if (!Statics.field62.exists()) {
                Statics.field62.mkdirs();
            }
            File[] var8 = Statics.field62.listFiles();
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
                if (!method169(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class139.method1622(Statics.field62);
        try {
            File var12 = new File(Statics.field150, "random.dat");
            if (var12.exists()) {
                field2284 = new class232(new class231(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field2077.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field588.length; var14++) {
                        File var15 = new File(Statics.field588[var14] + Statics.field2077[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field2284 = new class232(new class231(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field2284 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field2284 = new class232(new class231(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field2280 = new class232(new class231(class139.method131("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2285 = new class232(new class231(class139.method131("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field219 = new class232[Statics.field579];
        for (int var19 = 0; var19 < Statics.field579; var19++) {
            Statics.field219[var19] = new class232(new class231(class139.method131("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("fy.q(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3011(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field3215 = new File(Statics.field150, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field3215.exists()) {
            try {
                class231 var7 = new class231(Statics.field3215, "rw", 10000L);
                class123 var8 = new class123((int) var7.method3892());
                while (var8.field2060 < var8.field2054.length) {
                    int var9 = var7.method3888(var8.field2054, var8.field2060, var8.field2054.length - var8.field2060);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2060 += var9;
                }
                var8.field2060 = 0;
                int var10 = var8.method2427();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2427();
                }
                if (var10 <= 2) {
                    var4 = var8.method2436();
                    if (var11 == 1) {
                        var5 = var8.method2436();
                    }
                } else {
                    var4 = var8.method2422();
                    if (var11 == 1) {
                        var5 = var8.method2422();
                    }
                }
                var7.method3891();
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
                if (!method169(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2077.length; var15++) {
                for (int var16 = 0; var16 < Statics.field588.length; var16++) {
                    File var17 = new File(Statics.field588[var16] + Statics.field2077[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method169(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field150 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class231 var29 = new class231(Statics.field3215, "rw", 10000L);
                class123 var30 = new class123(500);
                var30.method2412(3);
                var30.method2412(var28 == null ? 0 : 1);
                var30.method2420(var27.getPath());
                if (var28 != null) {
                    var30.method2420(((File) var28).getPath());
                }
                var29.method3890(var30.field2054, 0, var30.field2060);
                var29.method3891();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("r.f(Ljava/io/File;ZS)Z")
    public static boolean method169(File arg0, boolean arg1) {
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

    @ObfuscatedName("ds.c(Ljava/lang/String;Ljava/lang/String;ZI)Lhf;")
    public static class231 method2363(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field62, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class231(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field636 == 33) {
            var6 = "_rc";
        } else if (Statics.field636 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field150, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ct.j(Lde;II)V")
    public static void method2137(class123 arg0, int arg1) {
        if (field2284 == null) {
            return;
        }
        try {
            field2284.method3910(0L);
            field2284.method3921(arg0.field2054, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("cz.m(B)V")
    public static void method2132() {
        try {
            field2280.method3922();
            for (int var0 = 0; var0 < Statics.field579; var0++) {
                Statics.field219[var0].method3922();
            }
            field2285.method3922();
            field2284.method3922();
        } catch (Exception var2) {
        }
    }
}
