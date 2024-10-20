package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fy")
public class class168 {

    @ObfuscatedName("fy.h")
    public static class342 field2018 = null;

    @ObfuscatedName("fy.f")
    public static class342 field2019 = null;

    @ObfuscatedName("fy.s")
    public static class342 field2020 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gh.c(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3384(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2016 = arg3;
        Statics.field1719 = arg2;
        try {
            Statics.field3102 = System.getProperty("os.name");
        } catch (Exception var21) {
            Statics.field3102 = "Unknown";
        }
        Statics.field1941 = Statics.field3102.toLowerCase();
        try {
            Statics.field577 = System.getProperty("user.home");
            if (Statics.field577 != null) {
                Statics.field577 = Statics.field577 + "/";
            }
        } catch (Exception var20) {
        }
        try {
            if (Statics.field1941.startsWith("win")) {
                if (Statics.field577 == null) {
                    Statics.field577 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field577 == null) {
                Statics.field577 = System.getenv("HOME");
            }
            if (Statics.field577 != null) {
                Statics.field577 = Statics.field577 + "/";
            }
        } catch (Exception var19) {
        }
        if (Statics.field577 == null) {
            Statics.field577 = "~/";
        }
        Statics.field31 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field577, "/tmp/", "" };
        Statics.field3097 = new String[] { ".jagex_cache_" + Statics.field1719, ".file_store_" + Statics.field1719 };
        int var7 = 0;
        label91: while (var7 < 4) {
            Statics.field3179 = method3017(arg0, arg1, var7);
            if (!Statics.field3179.exists()) {
                Statics.field3179.mkdirs();
            }
            File[] var8 = Statics.field3179.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label91;
                }
                File var11 = var9[var10];
                boolean var14;
                try {
                    RandomAccessFile var12 = new RandomAccessFile(var11, "rw");
                    int var13 = var12.read();
                    var12.seek(0L);
                    var12.write(var13);
                    var12.seek(0L);
                    var12.close();
                    var14 = true;
                } catch (Exception var18) {
                    var14 = false;
                }
                if (!var14) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var16 = Statics.field3179;
        Statics.field108 = var16;
        if (!Statics.field108.exists()) {
            throw new RuntimeException("");
        }
        class170.field2021 = true;
        method1893();
        field2019 = new class342(new class343(class170.method3800("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2020 = new class342(new class343(class170.method3800("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field389 = new class342[Statics.field2016];
        for (int var17 = 0; var17 < Statics.field2016; var17++) {
            Statics.field389[var17] = new class342(new class343(class170.method3800("main_file_cache.idx" + var17), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("el.x(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3017(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2015 = new File(Statics.field577, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2015.exists()) {
            try {
                class343 var7 = new class343(Statics.field2015, "rw", 10000L);
                class300 var8 = new class300((int) var7.method6096());
                while (var8.field3696 < var8.field3694.length) {
                    int var9 = var7.method6097(var8.field3694, var8.field3696, var8.field3694.length - var8.field3696);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field3696 += var9;
                }
                var8.field3696 = 0;
                int var10 = var8.method5103();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method5103();
                }
                if (var10 <= 2) {
                    var4 = var8.method5113();
                    if (var11 == 1) {
                        var5 = var8.method5113();
                    }
                } else {
                    var4 = var8.method5264();
                    if (var11 == 1) {
                        var5 = var8.method5264();
                    }
                }
                var7.method6094();
            } catch (IOException var39) {
                var39.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                boolean var17;
                try {
                    RandomAccessFile var15 = new RandomAccessFile(var14, "rw");
                    int var16 = var15.read();
                    var15.seek(0L);
                    var15.write(var16);
                    var15.seek(0L);
                    var15.close();
                    var14.delete();
                    var17 = true;
                } catch (Exception var37) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label119: for (int var19 = 0; var19 < Statics.field3097.length; var19++) {
                for (int var20 = 0; var20 < Statics.field31.length; var20++) {
                    File var21 = new File(Statics.field31[var20] + Statics.field3097[var19] + File.separatorChar + arg0 + File.separatorChar);
                    if (var21.exists()) {
                        File var22 = new File(var21, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var36) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label119;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field577 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var27 = new File(var5);
            File var28 = new File(var4);
            try {
                File[] var29 = var27.listFiles();
                File[] var30 = var29;
                for (int var31 = 0; var31 < var30.length; var31++) {
                    File var32 = var30[var31];
                    File var33 = new File(var28, var32.getName());
                    boolean var34 = var32.renameTo(var33);
                    if (!var34) {
                        throw new IOException();
                    }
                }
            } catch (Exception var38) {
                var38.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method522(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("aj.t(Ljava/io/File;Ljava/io/File;I)V")
    public static void method522(File arg0, File arg1) {
        try {
            class343 var2 = new class343(Statics.field2015, "rw", 10000L);
            class300 var3 = new class300(500);
            var3.method5087(3);
            var3.method5087(arg1 == null ? 0 : 1);
            var3.method5096(arg0.getPath());
            if (arg1 != null) {
                var3.method5096(arg1.getPath());
            }
            var2.method6102(var3.field3694, 0, var3.field3696);
            var2.method6094();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("n.g(Ljava/lang/String;Ljava/lang/String;ZB)Lmr;")
    public static class343 method96(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3179, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class343(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1719 == 33) {
            var6 = "_rc";
        } else if (Statics.field1719 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field577, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class343(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class343(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cv.l(I)V")
    public static void method1893() {
        try {
            File var0 = new File(Statics.field577, "random.dat");
            if (var0.exists()) {
                field2018 = new class342(new class343(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field3097.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field31.length; var2++) {
                        File var3 = new File(Statics.field31[var2] + Statics.field3097[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2018 = new class342(new class343(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2018 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2018 = new class342(new class343(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("am.u(Lkz;IB)V")
    public static void method702(class300 arg0, int arg1) {
        if (field2018 == null) {
            return;
        }
        try {
            field2018.method6071(0L);
            field2018.method6069(arg0.field3694, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("db.j(B)V")
    public static void method2605() {
        try {
            field2019.method6078();
            for (int var0 = 0; var0 < Statics.field2016; var0++) {
                Statics.field389[var0].method6078();
            }
            field2020.method6078();
            field2018.method6078();
        } catch (Exception var2) {
        }
    }
}
