package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eg")
public class class138 {

    @ObfuscatedName("eg.p")
    public static class208 field2074 = null;

    @ObfuscatedName("eg.a")
    public static class208 field2075 = null;

    @ObfuscatedName("eg.o")
    public static class208 field2078 = null;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.l(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method525(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2072 = arg3;
        Statics.field561 = arg2;
        try {
            Statics.field14 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field14 = "Unknown";
        }
        Statics.field1565 = Statics.field14.toLowerCase();
        try {
            Statics.field1981 = System.getProperty("user.home");
            if (Statics.field1981 != null) {
                Statics.field1981 = Statics.field1981 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field1565.startsWith("win")) {
                if (Statics.field1981 == null) {
                    Statics.field1981 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1981 == null) {
                Statics.field1981 = System.getenv("HOME");
            }
            if (Statics.field1981 != null) {
                Statics.field1981 = Statics.field1981 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field1981 == null) {
            Statics.field1981 = "~/";
        }
        Statics.field2077 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1981, "/tmp/", "" };
        Statics.field2394 = new String[] { ".jagex_cache_" + Statics.field561, ".file_store_" + Statics.field561 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field1246 = method2429(arg0, arg1, var7);
            if (!Statics.field1246.exists()) {
                Statics.field1246.mkdirs();
            }
            File[] var8 = Statics.field1246.listFiles();
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
                if (!method2880(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field1246;
        Statics.field2934 = var12;
        if (!Statics.field2934.exists()) {
            throw new RuntimeException("");
        }
        class124.field1927 = true;
        try {
            File var13 = new File(Statics.field1981, "random.dat");
            if (var13.exists()) {
                field2074 = new class208(new class207(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field2394.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field2077.length; var15++) {
                        File var16 = new File(Statics.field2077[var15] + Statics.field2394[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2074 = new class208(new class207(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2074 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2074 = new class208(new class207(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2075 = new class208(new class207(class124.method2097("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2078 = new class208(new class207(class124.method2097("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1973 = new class208[Statics.field2072];
        for (int var20 = 0; var20 < Statics.field2072; var20++) {
            Statics.field1973[var20] = new class208(new class207(class124.method2097("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("df.y(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2429(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2071 = new File(Statics.field1981, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2071.exists()) {
            try {
                class207 var7 = new class207(Statics.field2071, "rw", 10000L);
                class108 var8 = new class108((int) var7.method3586());
                while (var8.field1823 < var8.field1828.length) {
                    int var9 = var7.method3605(var8.field1828, var8.field1823, var8.field1828.length - var8.field1823);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1823 += var9;
                }
                var8.field1823 = 0;
                int var10 = var8.method2291();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2291();
                }
                if (var10 <= 2) {
                    var4 = var8.method2283();
                    if (var11 == 1) {
                        var5 = var8.method2283();
                    }
                } else {
                    var4 = var8.method2196();
                    if (var11 == 1) {
                        var5 = var8.method2196();
                    }
                }
                var7.method3588();
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
                if (!method2880(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2394.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2077.length; var16++) {
                    File var17 = new File(Statics.field2077[var16] + Statics.field2394[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2880(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1981 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method1983(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("cq.g(Ljava/io/File;Ljava/io/File;B)V")
    public static void method1983(File arg0, File arg1) {
        try {
            class207 var2 = new class207(Statics.field2071, "rw", 10000L);
            class108 var3 = new class108(500);
            var3.method2226(3);
            var3.method2226(arg1 == null ? 0 : 1);
            var3.method2192(arg0.getPath());
            if (arg1 != null) {
                var3.method2192(arg1.getPath());
            }
            var2.method3606(var3.field1828, 0, var3.field1823);
            var2.method3588();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("el.j(Ljava/io/File;ZI)Z")
    public static boolean method2880(File arg0, boolean arg1) {
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

    @ObfuscatedName("cq.w(Ljava/lang/String;Ljava/lang/String;ZI)Lgh;")
    public static class207 method1984(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1246, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class207(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field561 == 33) {
            var6 = "_rc";
        } else if (Statics.field561 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1981, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("du.c(Ldk;I)V")
    public static void method2501(class108 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2074.method3610(0L);
            field2074.method3608(var1);
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
        arg0.method2155(var1, 0, 24);
    }

    @ObfuscatedName("j.x(I)V")
    public static void method32() {
        try {
            field2075.method3627();
            for (int var0 = 0; var0 < Statics.field2072; var0++) {
                Statics.field1973[var0].method3627();
            }
            field2078.method3627();
            field2074.method3627();
        } catch (Exception var2) {
        }
    }
}
