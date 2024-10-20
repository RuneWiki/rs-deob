package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fn")
public class class158 {

    @ObfuscatedName("fn.o")
    public static class100 field2143 = null;

    @ObfuscatedName("fn.l")
    public static class100 field2151 = null;

    @ObfuscatedName("fn.f")
    public static class100 field2152 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.s(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3209(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field3300 = arg3;
        Statics.field566 = arg2;
        try {
            Statics.field501 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field501 = "Unknown";
        }
        Statics.field476 = Statics.field501.toLowerCase();
        try {
            Statics.field285 = System.getProperty("user.home");
            if (Statics.field285 != null) {
                Statics.field285 = Statics.field285 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field476.startsWith("win")) {
                if (Statics.field285 == null) {
                    Statics.field285 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field285 == null) {
                Statics.field285 = System.getenv("HOME");
            }
            if (Statics.field285 != null) {
                Statics.field285 = Statics.field285 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field285 == null) {
            Statics.field285 = "~/";
        }
        Statics.field3725 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field285, "/tmp/", "" };
        Statics.field1282 = new String[] { ".jagex_cache_" + Statics.field566, ".file_store_" + Statics.field566 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field2092 = method944(arg0, arg1, var7);
            if (!Statics.field2092.exists()) {
                Statics.field2092.mkdirs();
            }
            File[] var8 = Statics.field2092.listFiles();
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
                if (!method178(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2092;
        Statics.field2158 = var12;
        if (!Statics.field2158.exists()) {
            throw new RuntimeException("");
        }
        class161.field2160 = true;
        try {
            File var13 = new File(Statics.field285, "random.dat");
            if (var13.exists()) {
                field2143 = new class100(new class101(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field1282.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field3725.length; var15++) {
                        File var16 = new File(Statics.field3725[var15] + Statics.field1282[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2143 = new class100(new class101(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2143 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2143 = new class100(new class101(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2151 = new class100(new class101(class161.method2931("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2152 = new class100(new class101(class161.method2931("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1 = new class100[Statics.field3300];
        for (int var20 = 0; var20 < Statics.field3300; var20++) {
            Statics.field1[var20] = new class100(new class101(class161.method2931("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bp.g(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method944(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2150 = new File(Statics.field285, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2150.exists()) {
            try {
                class101 var7 = new class101(Statics.field2150, "rw", 10000L);
                class185 var8 = new class185((int) var7.method1959());
                while (var8.field2514 < var8.field2512.length) {
                    int var9 = var7.method1966(var8.field2512, var8.field2514, var8.field2512.length - var8.field2514);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2514 += var9;
                }
                var8.field2514 = 0;
                int var10 = var8.method3239();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3239();
                }
                if (var10 <= 2) {
                    var4 = var8.method3443();
                    if (var11 == 1) {
                        var5 = var8.method3443();
                    }
                } else {
                    var4 = var8.method3250();
                    if (var11 == 1) {
                        var5 = var8.method3250();
                    }
                }
                var7.method1958();
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
                if (!method178(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1282.length; var15++) {
                for (int var16 = 0; var16 < Statics.field3725.length; var16++) {
                    File var17 = new File(Statics.field3725[var16] + Statics.field1282[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method178(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field285 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method1749(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("cj.m(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1749(File arg0, File arg1) {
        try {
            class101 var2 = new class101(Statics.field2150, "rw", 10000L);
            class185 var3 = new class185(500);
            var3.method3223(3);
            var3.method3223(arg1 == null ? 0 : 1);
            var3.method3334(arg0.getPath());
            if (arg1 != null) {
                var3.method3334(arg1.getPath());
            }
            var2.method1957(var3.field2512, 0, var3.field2514);
            var2.method1958();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("v.h(Ljava/io/File;ZI)Z")
    public static boolean method178(File arg0, boolean arg1) {
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

    @ObfuscatedName("el.i(Ljava/lang/String;Ljava/lang/String;ZI)Lcs;")
    public static class101 method2623(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2092, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class101(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field566 == 33) {
            var6 = "_rc";
        } else if (Statics.field566 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field285, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class101(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class101(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hn.w(I)V")
    public static void method4004() {
        try {
            field2151.method1934();
            for (int var0 = 0; var0 < Statics.field3300; var0++) {
                Statics.field1[var0].method1934();
            }
            field2152.method1934();
            field2143.method1934();
        } catch (Exception var2) {
        }
    }
}
