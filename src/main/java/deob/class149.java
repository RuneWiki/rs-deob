package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ex")
public class class149 {

    @ObfuscatedName("ex.g")
    public static class228 field2222 = null;

    @ObfuscatedName("ex.v")
    public static class228 field2223 = null;

    @ObfuscatedName("ex.l")
    public static class228 field2227 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.o(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method2233(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2226 = arg3;
        Statics.field1158 = arg2;
        try {
            Statics.field2739 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field2739 = "Unknown";
        }
        Statics.field1065 = Statics.field2739.toLowerCase();
        try {
            Statics.field597 = System.getProperty("user.home");
            if (Statics.field597 != null) {
                Statics.field597 = Statics.field597 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field1065.startsWith("win")) {
                if (Statics.field597 == null) {
                    Statics.field597 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field597 == null) {
                Statics.field597 = System.getenv("HOME");
            }
            if (Statics.field597 != null) {
                Statics.field597 = Statics.field597 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field597 == null) {
            Statics.field597 = "~/";
        }
        Statics.field2224 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field597, "/tmp/", "" };
        Statics.field873 = new String[] { ".jagex_cache_" + Statics.field1158, ".file_store_" + Statics.field1158 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field2019 = method174(arg0, arg1, var7);
            if (!Statics.field2019.exists()) {
                Statics.field2019.mkdirs();
            }
            File[] var8 = Statics.field2019.listFiles();
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
                if (!Statics.method2893(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class135.method2231(Statics.field2019);
        try {
            File var12 = new File(Statics.field597, "random.dat");
            if (var12.exists()) {
                field2222 = new class228(new class227(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field873.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field2224.length; var14++) {
                        File var15 = new File(Statics.field2224[var14] + Statics.field873[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field2222 = new class228(new class227(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field2222 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field2222 = new class228(new class227(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field2223 = new class228(new class227(class135.method3078("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2227 = new class228(new class227(class135.method3078("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field3160 = new class228[Statics.field2226];
        for (int var19 = 0; var19 < Statics.field2226; var19++) {
            Statics.field3160[var19] = new class228(new class227(class135.method3078("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("d.f(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method174(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1549 = new File(Statics.field597, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1549.exists()) {
            try {
                class227 var7 = new class227(Statics.field1549, "rw", 10000L);
                class119 var8 = new class119((int) var7.method3810());
                while (var8.field1984 < var8.field1989.length) {
                    int var9 = var7.method3811(var8.field1989, var8.field1984, var8.field1989.length - var8.field1984);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1984 += var9;
                }
                var8.field1984 = 0;
                int var10 = var8.method2290();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2290();
                }
                if (var10 <= 2) {
                    var4 = var8.method2361();
                    if (var11 == 1) {
                        var5 = var8.method2361();
                    }
                } else {
                    var4 = var8.method2411();
                    if (var11 == 1) {
                        var5 = var8.method2411();
                    }
                }
                var7.method3809();
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
                if (!Statics.method2893(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field873.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2224.length; var16++) {
                    File var17 = new File(Statics.field2224[var16] + Statics.field873[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && Statics.method2893(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field597 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method35(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("q.i(Ljava/io/File;Ljava/io/File;I)V")
    public static void method35(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field1549, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2347(3);
            var3.method2347(arg1 == null ? 0 : 1);
            var3.method2449(arg0.getPath());
            if (arg1 != null) {
                var3.method2449(arg1.getPath());
            }
            var2.method3808(var3.field1989, 0, var3.field1984);
            var2.method3809();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ao.q(Ljava/lang/String;Ljava/lang/String;ZI)Lhc;")
    public static class227 method903(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2019, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1158 == 33) {
            var6 = "_rc";
        } else if (Statics.field1158 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field597, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("w.u(Ldc;I)V")
    public static void method169(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2222.method3847(0L);
            field2222.method3831(var1);
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
        arg0.method2392(var1, 0, 24);
    }

    @ObfuscatedName("fn.m(Ldc;II)V")
    public static void method3150(class119 arg0, int arg1) {
        if (field2222 == null) {
            return;
        }
        try {
            field2222.method3847(0L);
            field2222.method3834(arg0.field1989, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("aj.y(I)V")
    public static void method940() {
        try {
            field2223.method3828();
            for (int var0 = 0; var0 < Statics.field2226; var0++) {
                Statics.field3160[var0].method3828();
            }
            field2227.method3828();
            field2222.method3828();
        } catch (Exception var2) {
        }
    }
}
