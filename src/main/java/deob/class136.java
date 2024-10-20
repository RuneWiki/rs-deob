package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ep")
public class class136 {

    @ObfuscatedName("ep.c")
    public static class193 field2093 = null;

    @ObfuscatedName("ep.i")
    public static class193 field2095 = null;

    @ObfuscatedName("ep.o")
    public static class193 field2084 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.e(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method618(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2089 = arg3;
        Statics.field2133 = arg2;
        try {
            Statics.field1930 = System.getProperty("os.name");
        } catch (Exception var16) {
            Statics.field1930 = "Unknown";
        }
        Statics.field1421 = Statics.field1930.toLowerCase();
        try {
            Statics.field1936 = System.getProperty("user.home");
            if (Statics.field1936 != null) {
                Statics.field1936 = Statics.field1936 + "/";
            }
        } catch (Exception var15) {
        }
        try {
            if (Statics.field1421.startsWith("win")) {
                if (Statics.field1936 == null) {
                    Statics.field1936 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1936 == null) {
                Statics.field1936 = System.getenv("HOME");
            }
            if (Statics.field1936 != null) {
                Statics.field1936 = Statics.field1936 + "/";
            }
        } catch (Exception var14) {
        }
        if (Statics.field1936 == null) {
            Statics.field1936 = "~/";
        }
        Statics.field2097 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1936, "/tmp/", "" };
        Statics.field2696 = new String[] { ".jagex_cache_" + Statics.field2133, ".file_store_" + Statics.field2133 };
        int var7 = 0;
        label83: while (var7 < 4) {
            Statics.field2091 = Statics.method496(arg0, arg1, var7);
            if (!Statics.field2091.exists()) {
                Statics.field2091.mkdirs();
            }
            File[] var8 = Statics.field2091.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label83;
                }
                File var11 = var9[var10];
                if (!method141(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2091;
        Statics.field1885 = var12;
        if (!Statics.field1885.exists()) {
            throw new RuntimeException("");
        }
        class122.field1935 = true;
        method806();
        field2095 = new class193(new class192(class122.method2421("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2084 = new class193(new class192(class122.method2421("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2096 = new class193[Statics.field2089];
        for (int var13 = 0; var13 < Statics.field2089; var13++) {
            Statics.field2096[var13] = new class193(new class192(class122.method2421("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("dv.a(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2535(File arg0, File arg1) {
        try {
            class192 var2 = new class192(Statics.field2087, "rw", 10000L);
            class107 var3 = new class107(500);
            var3.method2249(3);
            var3.method2249(arg1 == null ? 0 : 1);
            var3.method2171(arg0.getPath());
            if (arg1 != null) {
                var3.method2171(arg1.getPath());
            }
            var2.method3412(var3.field1845, 0, var3.field1841);
            var2.method3413();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("v.g(Ljava/io/File;ZI)Z")
    public static boolean method141(File arg0, boolean arg1) {
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

    @ObfuscatedName("ab.u(Ljava/lang/String;Ljava/lang/String;ZB)Lgd;")
    public static class192 method575(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2091, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class192(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2133 == 33) {
            var6 = "_rc";
        } else if (Statics.field2133 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1936, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class192(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class192(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ah.k(B)V")
    public static void method806() {
        try {
            File var0 = new File(Statics.field1936, "random.dat");
            if (var0.exists()) {
                field2093 = new class193(new class192(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2696.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2097.length; var2++) {
                        File var3 = new File(Statics.field2097[var2] + Statics.field2696[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2093 = new class193(new class192(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2093 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2093 = new class193(new class192(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("j.m(Ldp;B)V")
    public static void method509(class107 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2093.method3434(0L);
            field2093.method3436(var1);
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
        arg0.method2135(var1, 0, 24);
    }
}
