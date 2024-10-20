package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ed")
public class class138 {

    @ObfuscatedName("ed.p")
    public static class208 field2112 = null;

    @ObfuscatedName("ed.v")
    public static class208 field2113 = null;

    @ObfuscatedName("ed.w")
    public static class208 field2114 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.f(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method2006(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1906 = arg3;
        Statics.field2000 = arg2;
        try {
            Statics.field2087 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field2087 = "Unknown";
        }
        Statics.field805 = Statics.field2087.toLowerCase();
        try {
            Statics.field2738 = System.getProperty("user.home");
            if (Statics.field2738 != null) {
                Statics.field2738 = Statics.field2738 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field805.startsWith("win")) {
                if (Statics.field2738 == null) {
                    Statics.field2738 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2738 == null) {
                Statics.field2738 = System.getenv("HOME");
            }
            if (Statics.field2738 != null) {
                Statics.field2738 = Statics.field2738 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field2738 == null) {
            Statics.field2738 = "~/";
        }
        Statics.field2109 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2738, "/tmp/", "" };
        Statics.field986 = new String[] { ".jagex_cache_" + Statics.field2000, ".file_store_" + Statics.field2000 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field71 = method2105(arg0, arg1, var7);
            if (!Statics.field71.exists()) {
                Statics.field71.mkdirs();
            }
            File[] var8 = Statics.field71.listFiles();
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
                if (!method2519(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field71;
        Statics.field1956 = var12;
        if (!Statics.field1956.exists()) {
            throw new RuntimeException("");
        }
        class124.field1958 = true;
        try {
            File var13 = new File(Statics.field2738, "random.dat");
            if (var13.exists()) {
                field2112 = new class208(new class207(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field986.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field2109.length; var15++) {
                        File var16 = new File(Statics.field2109[var15] + Statics.field986[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2112 = new class208(new class207(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2112 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2112 = new class208(new class207(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2113 = new class208(new class207(Statics.method2888("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2114 = new class208(new class207(Statics.method2888("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field574 = new class208[Statics.field1906];
        for (int var20 = 0; var20 < Statics.field1906; var20++) {
            Statics.field574[var20] = new class208(new class207(Statics.method2888("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("cj.k(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2105(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2116 = new File(Statics.field2738, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2116.exists()) {
            try {
                class207 var7 = new class207(Statics.field2116, "rw", 10000L);
                class108 var8 = new class108((int) var7.method3556());
                while (var8.field1859 < var8.field1854.length) {
                    int var9 = var7.method3553(var8.field1854, var8.field1859, var8.field1854.length - var8.field1859);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1859 += var9;
                }
                var8.field1859 = 0;
                int var10 = var8.method2158();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2158();
                }
                if (var10 <= 2) {
                    var4 = var8.method2167();
                    if (var11 == 1) {
                        var5 = var8.method2167();
                    }
                } else {
                    var4 = var8.method2168();
                    if (var11 == 1) {
                        var5 = var8.method2168();
                    }
                }
                var7.method3562();
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
                if (!method2519(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field986.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2109.length; var16++) {
                    File var17 = new File(Statics.field2109[var16] + Statics.field986[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2519(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2738 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method2010(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("cc.y(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2010(File arg0, File arg1) {
        try {
            class207 var2 = new class207(Statics.field2116, "rw", 10000L);
            class108 var3 = new class108(500);
            var3.method2144(3);
            var3.method2144(arg1 == null ? 0 : 1);
            var3.method2151(arg0.getPath());
            if (arg1 != null) {
                var3.method2151(arg1.getPath());
            }
            var2.method3555(var3.field1854, 0, var3.field1859);
            var2.method3562();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("dl.e(Ljava/io/File;ZB)Z")
    public static boolean method2519(File arg0, boolean arg1) {
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

    @ObfuscatedName("av.r(Ljava/lang/String;Ljava/lang/String;ZI)Lgh;")
    public static class207 method645(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field71, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class207(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2000 == 33) {
            var6 = "_rc";
        } else if (Statics.field2000 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2738, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class207(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class207(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dw.n(Ldu;IB)V")
    public static void method2517(class108 arg0, int arg1) {
        if (field2112 == null) {
            return;
        }
        try {
            field2112.method3576(0L);
            field2112.method3581(arg0.field1854, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
