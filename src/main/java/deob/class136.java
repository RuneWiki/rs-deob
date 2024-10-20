package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ex")
public class class136 {

    @ObfuscatedName("ex.e")
    public static class196 field2085 = null;

    @ObfuscatedName("ex.l")
    public static class196 field2084 = null;

    @ObfuscatedName("ex.o")
    public static class196 field2087 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.i(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1059(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field528 = arg3;
        Statics.field1928 = arg2;
        try {
            Statics.field177 = System.getProperty("os.name");
        } catch (Exception var16) {
            Statics.field177 = "Unknown";
        }
        Statics.field2086 = Statics.field177.toLowerCase();
        try {
            Statics.field732 = System.getProperty("user.home");
            if (Statics.field732 != null) {
                Statics.field732 = Statics.field732 + "/";
            }
        } catch (Exception var15) {
        }
        try {
            if (Statics.field2086.startsWith("win")) {
                if (Statics.field732 == null) {
                    Statics.field732 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field732 == null) {
                Statics.field732 = System.getenv("HOME");
            }
            if (Statics.field732 != null) {
                Statics.field732 = Statics.field732 + "/";
            }
        } catch (Exception var14) {
        }
        if (Statics.field732 == null) {
            Statics.field732 = "~/";
        }
        Statics.field1122 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field732, "/tmp/", "" };
        Statics.field2088 = new String[] { ".jagex_cache_" + Statics.field1928, ".file_store_" + Statics.field1928 };
        int var7 = 0;
        label83: while (var7 < 4) {
            Statics.field1927 = method460(arg0, arg1, var7);
            if (!Statics.field1927.exists()) {
                Statics.field1927.mkdirs();
            }
            File[] var8 = Statics.field1927.listFiles();
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
                if (!method576(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field1927;
        Statics.field1930 = var12;
        if (!Statics.field1930.exists()) {
            throw new RuntimeException("");
        }
        class122.field1931 = true;
        Statics.method1894();
        field2084 = new class196(new class195(class122.method744("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2087 = new class196(new class195(class122.method744("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1892 = new class196[Statics.field528];
        for (int var13 = 0; var13 < Statics.field528; var13++) {
            Statics.field1892[var13] = new class196(new class195(class122.method744("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("client.c(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method460(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2080 = new File(Statics.field732, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2080.exists()) {
            try {
                class195 var7 = new class195(Statics.field2080, "rw", 10000L);
                class107 var8 = new class107((int) var7.method3459());
                while (var8.field1837 < var8.field1841.length) {
                    int var9 = var7.method3450(var8.field1841, var8.field1837, var8.field1841.length - var8.field1837);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1837 += var9;
                }
                var8.field1837 = 0;
                int var10 = var8.method2151();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2151();
                }
                if (var10 <= 2) {
                    var4 = var8.method2297();
                    if (var11 == 1) {
                        var5 = var8.method2297();
                    }
                } else {
                    var4 = var8.method2161();
                    if (var11 == 1) {
                        var5 = var8.method2161();
                    }
                }
                var7.method3448();
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
                if (!method576(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2088.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1122.length; var16++) {
                    File var17 = new File(Statics.field1122[var16] + Statics.field2088[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method576(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field732 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class195 var29 = new class195(Statics.field2080, "rw", 10000L);
                class107 var30 = new class107(500);
                var30.method2137(3);
                var30.method2137(var28 == null ? 0 : 1);
                var30.method2144(var27.getPath());
                if (var28 != null) {
                    var30.method2144(((File) var28).getPath());
                }
                var29.method3447(var30.field1841, 0, var30.field1837);
                var29.method3448();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ag.h(Ljava/io/File;ZB)Z")
    public static boolean method576(File arg0, boolean arg1) {
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

    @ObfuscatedName("cf.v(Ljava/lang/String;Ljava/lang/String;ZB)Lgl;")
    public static class195 method1895(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1927, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class195(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1928 == 33) {
            var6 = "_rc";
        } else if (Statics.field1928 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field732, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class195(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class195(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("dh.s(Ldm;II)V")
    public static void method2476(class107 arg0, int arg1) {
        if (field2085 == null) {
            return;
        }
        try {
            field2085.method3472(0L);
            field2085.method3477(arg0.field1841, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
