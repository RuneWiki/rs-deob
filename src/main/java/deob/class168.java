package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ff")
public class class168 {

    @ObfuscatedName("ff.u")
    public static class343 field2041 = null;

    @ObfuscatedName("ff.x")
    public static class343 field2043 = null;

    @ObfuscatedName("ff.r")
    public static class343 field2040 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.q(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3151(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field351 = arg3;
        Statics.field1540 = arg2;
        try {
            Statics.field587 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field587 = "Unknown";
        }
        Statics.field648 = Statics.field587.toLowerCase();
        try {
            Statics.field3096 = System.getProperty("user.home");
            if (Statics.field3096 != null) {
                Statics.field3096 = Statics.field3096 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field648.startsWith("win")) {
                if (Statics.field3096 == null) {
                    Statics.field3096 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field3096 == null) {
                Statics.field3096 = System.getenv("HOME");
            }
            if (Statics.field3096 != null) {
                Statics.field3096 = Statics.field3096 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field3096 == null) {
            Statics.field3096 = "~/";
        }
        Statics.field2044 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3096, "/tmp/", "" };
        Statics.field2310 = new String[] { ".jagex_cache_" + Statics.field1540, ".file_store_" + Statics.field1540 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field3 = method2503(arg0, arg1, var7);
            if (!Statics.field3.exists()) {
                Statics.field3.mkdirs();
            }
            File[] var8 = Statics.field3.listFiles();
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
                if (!method3297(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field3;
        Statics.field2051 = var12;
        if (!Statics.field2051.exists()) {
            throw new RuntimeException("");
        }
        class170.field2056 = true;
        try {
            File var13 = new File(Statics.field3096, "random.dat");
            if (var13.exists()) {
                field2041 = new class343(new class344(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field2310.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field2044.length; var15++) {
                        File var16 = new File(Statics.field2044[var15] + Statics.field2310[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2041 = new class343(new class344(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2041 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2041 = new class343(new class344(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2043 = new class343(new class344(class170.method1039("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2040 = new class343(new class344(class170.method1039("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2042 = new class343[Statics.field351];
        for (int var20 = 0; var20 < Statics.field351; var20++) {
            Statics.field2042[var20] = new class343(new class344(class170.method1039("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("do.w(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2503(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2039 = new File(Statics.field3096, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2039.exists()) {
            try {
                class344 var7 = new class344(Statics.field2039, "rw", 10000L);
                class301 var8 = new class301((int) var7.method6068());
                while (var8.field3733 < var8.field3731.length) {
                    int var9 = var7.method6070(var8.field3731, var8.field3733, var8.field3731.length - var8.field3733);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field3733 += var9;
                }
                var8.field3733 = 0;
                int var10 = var8.method5077();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method5077();
                }
                if (var10 <= 2) {
                    var4 = var8.method5085();
                    if (var11 == 1) {
                        var5 = var8.method5085();
                    }
                } else {
                    var4 = var8.method5078();
                    if (var11 == 1) {
                        var5 = var8.method5078();
                    }
                }
                var7.method6066();
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
                if (!method3297(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2310.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2044.length; var16++) {
                    File var17 = new File(Statics.field2044[var16] + Statics.field2310[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method3297(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field3096 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class344 var29 = new class344(Statics.field2039, "rw", 10000L);
                class301 var30 = new class301(500);
                var30.method5228(3);
                var30.method5228(var28 == null ? 0 : 1);
                var30.method5060(var27.getPath());
                if (var28 != null) {
                    var30.method5060(((File) var28).getPath());
                }
                var29.method6077(var30.field3731, 0, var30.field3733);
                var29.method6066();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("gs.e(Ljava/io/File;ZS)Z")
    public static boolean method3297(File arg0, boolean arg1) {
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

    @ObfuscatedName("j.p(Ljava/lang/String;Ljava/lang/String;ZI)Lma;")
    public static class344 method193(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class344(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1540 == 33) {
            var6 = "_rc";
        } else if (Statics.field1540 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3096, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class344(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class344(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
