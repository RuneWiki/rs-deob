package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fn")
public class class158 {

    @ObfuscatedName("fn.c")
    public static class123 field2141 = null;

    @ObfuscatedName("fn.s")
    public static class123 field2146 = null;

    @ObfuscatedName("fn.n")
    public static class123 field2143 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.a(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2681(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2136 = arg3;
        Statics.field2535 = arg2;
        try {
            Statics.field297 = System.getProperty("os.name");
        } catch (Exception var16) {
            Statics.field297 = "Unknown";
        }
        Statics.field2145 = Statics.field297.toLowerCase();
        try {
            Statics.field1 = System.getProperty("user.home");
            if (Statics.field1 != null) {
                Statics.field1 = Statics.field1 + "/";
            }
        } catch (Exception var15) {
        }
        try {
            if (Statics.field2145.startsWith("win")) {
                if (Statics.field1 == null) {
                    Statics.field1 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1 == null) {
                Statics.field1 = System.getenv("HOME");
            }
            if (Statics.field1 != null) {
                Statics.field1 = Statics.field1 + "/";
            }
        } catch (Exception var14) {
        }
        if (Statics.field1 == null) {
            Statics.field1 = "~/";
        }
        Statics.field1579 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1, "/tmp/", "" };
        Statics.field299 = new String[] { ".jagex_cache_" + Statics.field2535, ".file_store_" + Statics.field2535 };
        int var7 = 0;
        label83: while (var7 < 4) {
            Statics.field2139 = method2724(arg0, arg1, var7);
            if (!Statics.field2139.exists()) {
                Statics.field2139.mkdirs();
            }
            File[] var8 = Statics.field2139.listFiles();
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
                if (!method1878(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        File var12 = Statics.field2139;
        Statics.field2149 = var12;
        if (!Statics.field2149.exists()) {
            throw new RuntimeException("");
        }
        class161.field2151 = true;
        method2294();
        field2146 = new class123(new class124(class161.method972("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2143 = new class123(new class124(class161.method972("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2144 = new class123[Statics.field2136];
        for (int var13 = 0; var13 < Statics.field2136; var13++) {
            Statics.field2144[var13] = new class123(new class124(class161.method972("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("eo.w(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2724(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2138 = new File(Statics.field1, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2138.exists()) {
            try {
                class124 var7 = new class124(Statics.field2138, "rw", 10000L);
                class185 var8 = new class185((int) var7.method2149());
                while (var8.field2509 < var8.field2512.length) {
                    int var9 = var7.method2169(var8.field2512, var8.field2509, var8.field2512.length - var8.field2509);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2509 += var9;
                }
                var8.field2509 = 0;
                int var10 = var8.method2962();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2962();
                }
                if (var10 <= 2) {
                    var4 = var8.method2971();
                    if (var11 == 1) {
                        var5 = var8.method2971();
                    }
                } else {
                    var4 = var8.method2972();
                    if (var11 == 1) {
                        var5 = var8.method2972();
                    }
                }
                var7.method2147();
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
                if (!method1878(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field299.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1579.length; var16++) {
                    File var17 = new File(Statics.field1579[var16] + Statics.field299[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1878(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method2667(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ec.e(Ljava/io/File;Ljava/io/File;B)V")
    public static void method2667(File arg0, File arg1) {
        try {
            class124 var2 = new class124(Statics.field2138, "rw", 10000L);
            class185 var3 = new class185(500);
            var3.method2946(3);
            var3.method2946(arg1 == null ? 0 : 1);
            var3.method2955(arg0.getPath());
            if (arg1 != null) {
                var3.method2955(arg1.getPath());
            }
            var2.method2146(var3.field2512, 0, var3.field2509);
            var2.method2147();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("dn.k(Ljava/io/File;ZI)Z")
    public static boolean method1878(File arg0, boolean arg1) {
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

    @ObfuscatedName("cn.u(Ljava/lang/String;Ljava/lang/String;ZI)Lda;")
    public static class124 method1693(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2139, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class124(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2535 == 33) {
            var6 = "_rc";
        } else if (Statics.field2535 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class124(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class124(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ez.z(I)V")
    public static void method2294() {
        try {
            File var0 = new File(Statics.field1, "random.dat");
            if (var0.exists()) {
                field2141 = new class123(new class124(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field299.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1579.length; var2++) {
                        File var3 = new File(Statics.field1579[var2] + Statics.field299[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2141 = new class123(new class124(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2141 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2141 = new class123(new class124(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("fn.t(Lgh;II)V")
    public static void method2770(class185 arg0, int arg1) {
        if (field2141 == null) {
            return;
        }
        try {
            field2141.method2114(0L);
            field2141.method2116(arg0.field2512, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ap.f(I)V")
    public static void method400() {
        try {
            field2146.method2128();
            for (int var0 = 0; var0 < Statics.field2136; var0++) {
                Statics.field2144[var0].method2128();
            }
            field2143.method2128();
            field2141.method2128();
        } catch (Exception var2) {
        }
    }
}
