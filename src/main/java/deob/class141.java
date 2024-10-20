package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ex")
public class class141 {

    @ObfuscatedName("ex.f")
    public static class219 field2159 = null;

    @ObfuscatedName("ex.i")
    public static class219 field2160 = null;

    @ObfuscatedName("ex.w")
    public static class219 field2161 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.y(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method2563(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field171 = arg3;
        Statics.field2162 = arg2;
        try {
            Statics.field1884 = System.getProperty("os.name");
        } catch (Exception var23) {
            Statics.field1884 = "Unknown";
        }
        Statics.field1953 = Statics.field1884.toLowerCase();
        try {
            Statics.field1302 = System.getProperty("user.home");
            if (Statics.field1302 != null) {
                Statics.field1302 = Statics.field1302 + "/";
            }
        } catch (Exception var22) {
        }
        try {
            if (Statics.field1953.startsWith("win")) {
                if (Statics.field1302 == null) {
                    Statics.field1302 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1302 == null) {
                Statics.field1302 = System.getenv("HOME");
            }
            if (Statics.field1302 != null) {
                Statics.field1302 = Statics.field1302 + "/";
            }
        } catch (Exception var21) {
        }
        if (Statics.field1302 == null) {
            Statics.field1302 = "~/";
        }
        Statics.field1903 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1302, "/tmp/", "" };
        Statics.field172 = new String[] { ".jagex_cache_" + Statics.field2162, ".file_store_" + Statics.field2162 };
        int var7 = 0;
        label119: while (var7 < 4) {
            Statics.field2166 = method2440(arg0, arg1, var7);
            if (!Statics.field2166.exists()) {
                Statics.field2166.mkdirs();
            }
            File[] var8 = Statics.field2166.listFiles();
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
                if (!method122(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2166;
        Statics.field1998 = var12;
        if (!Statics.field1998.exists()) {
            throw new RuntimeException("");
        }
        class127.field2001 = true;
        try {
            File var13 = new File(Statics.field1302, "random.dat");
            if (var13.exists()) {
                field2159 = new class219(new class218(var13, "rw", 25L), 24, 0);
            } else {
                label99: for (int var14 = 0; var14 < Statics.field172.length; var14++) {
                    for (int var15 = 0; var15 < Statics.field1903.length; var15++) {
                        File var16 = new File(Statics.field1903[var15] + Statics.field172[var14] + File.separatorChar + "random.dat");
                        if (var16.exists()) {
                            field2159 = new class219(new class218(var16, "rw", 25L), 24, 0);
                            break label99;
                        }
                    }
                }
            }
            if (field2159 == null) {
                RandomAccessFile var17 = new RandomAccessFile(var13, "rw");
                int var18 = var17.read();
                var17.seek(0L);
                var17.write(var18);
                var17.seek(0L);
                var17.close();
                field2159 = new class219(new class218(var13, "rw", 25L), 24, 0);
            }
        } catch (IOException var24) {
        }
        field2160 = new class219(new class218(class127.method2102("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2161 = new class219(new class218(class127.method2102("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field673 = new class219[Statics.field171];
        for (int var20 = 0; var20 < Statics.field171; var20++) {
            Statics.field673[var20] = new class219(new class218(class127.method2102("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("db.k(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2440(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2156 = new File(Statics.field1302, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2156.exists()) {
            try {
                class218 var7 = new class218(Statics.field2156, "rw", 10000L);
                class111 var8 = new class111((int) var7.method3703());
                while (var8.field1902 < var8.field1897.length) {
                    int var9 = var7.method3704(var8.field1897, var8.field1902, var8.field1897.length - var8.field1902);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1902 += var9;
                }
                var8.field1902 = 0;
                int var10 = var8.method2205();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2205();
                }
                if (var10 <= 2) {
                    var4 = var8.method2169();
                    if (var11 == 1) {
                        var5 = var8.method2169();
                    }
                } else {
                    var4 = var8.method2144();
                    if (var11 == 1) {
                        var5 = var8.method2144();
                    }
                }
                var7.method3705();
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
                if (!method122(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field172.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1903.length; var16++) {
                    File var17 = new File(Statics.field1903[var16] + Statics.field172[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method122(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1302 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method575(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("d.g(Ljava/io/File;Ljava/io/File;B)V")
    public static void method575(File arg0, File arg1) {
        try {
            class218 var2 = new class218(Statics.field2156, "rw", 10000L);
            class111 var3 = new class111(500);
            var3.method2145(3);
            var3.method2145(arg1 == null ? 0 : 1);
            var3.method2153(arg0.getPath());
            if (arg1 != null) {
                var3.method2153(arg1.getPath());
            }
            var2.method3701(var3.field1897, 0, var3.field1902);
            var2.method3705();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("f.n(Ljava/io/File;ZI)Z")
    public static boolean method122(File arg0, boolean arg1) {
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

    @ObfuscatedName("v.t(Ljava/lang/String;Ljava/lang/String;ZB)Lhg;")
    public static class218 method94(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2166, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class218(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2162 == 33) {
            var6 = "_rc";
        } else if (Statics.field2162 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1302, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("j.e(Ldw;B)V")
    public static void method135(class111 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2159.method3721(0L);
            field2159.method3722(var1);
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
        arg0.method2154(var1, 0, 24);
    }

    @ObfuscatedName("fq.q(Ldw;IB)V")
    public static void method3077(class111 arg0, int arg1) {
        if (field2159 == null) {
            return;
        }
        try {
            field2159.method3721(0L);
            field2159.method3725(arg0.field1897, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("v.z(B)V")
    public static void method81() {
        try {
            field2160.method3723();
            for (int var0 = 0; var0 < Statics.field171; var0++) {
                Statics.field673[var0].method3723();
            }
            field2161.method3723();
            field2159.method3723();
        } catch (Exception var2) {
        }
    }
}
