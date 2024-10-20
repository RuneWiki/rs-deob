package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eb")
public class class136 {

    @ObfuscatedName("eb.d")
    public static class197 field2098 = null;

    @ObfuscatedName("eb.v")
    public static class197 field2089 = null;

    @ObfuscatedName("eb.n")
    public static class197 field2100 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.k(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method1021(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2108 = arg3;
        Statics.field216 = arg2;
        try {
            Statics.field117 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field117 = "Unknown";
        }
        Statics.field2973 = Statics.field117.toLowerCase();
        try {
            Statics.field2503 = System.getProperty("user.home");
            if (Statics.field2503 != null) {
                Statics.field2503 = Statics.field2503 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field2973.startsWith("win")) {
                if (Statics.field2503 == null) {
                    Statics.field2503 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2503 == null) {
                Statics.field2503 = System.getenv("HOME");
            }
            if (Statics.field2503 != null) {
                Statics.field2503 = Statics.field2503 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field2503 == null) {
            Statics.field2503 = "~/";
        }
        Statics.field2101 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2503, "/tmp/", "" };
        Statics.field2102 = new String[] { ".jagex_cache_" + Statics.field216, ".file_store_" + Statics.field216 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field2103 = method2593(arg0, arg1, var7);
            if (!Statics.field2103.exists()) {
                Statics.field2103.mkdirs();
            }
            File[] var8 = Statics.field2103.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label79;
                }
                File var11 = var9[var10];
                if (!method903(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class122.method886(Statics.field2103);
        method1792();
        field2089 = new class197(new class196(class122.method1970("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2100 = new class197(new class196(class122.method1970("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field933 = new class197[Statics.field2108];
        for (int var12 = 0; var12 < Statics.field2108; var12++) {
            Statics.field933[var12] = new class197(new class196(class122.method1970("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("dk.y(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2593(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2091 = new File(Statics.field2503, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2091.exists()) {
            try {
                class196 var7 = new class196(Statics.field2091, "rw", 10000L);
                class107 var8 = new class107((int) var7.method3500());
                while (var8.field1838 < var8.field1844.length) {
                    int var9 = var7.method3494(var8.field1844, var8.field1838, var8.field1844.length - var8.field1838);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1838 += var9;
                }
                var8.field1838 = 0;
                int var10 = var8.method2138();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2138();
                }
                if (var10 <= 2) {
                    var4 = var8.method2147();
                    if (var11 == 1) {
                        var5 = var8.method2147();
                    }
                } else {
                    var4 = var8.method2148();
                    if (var11 == 1) {
                        var5 = var8.method2148();
                    }
                }
                var7.method3497();
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
                if (!method903(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2102.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2101.length; var16++) {
                    File var17 = new File(Statics.field2101[var16] + Statics.field2102[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method903(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2503 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method831(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("az.s(Ljava/io/File;Ljava/io/File;I)V")
    public static void method831(File arg0, File arg1) {
        try {
            class196 var2 = new class196(Statics.field2091, "rw", 10000L);
            class107 var3 = new class107(500);
            var3.method2124(3);
            var3.method2124(arg1 == null ? 0 : 1);
            var3.method2131(arg0.getPath());
            if (arg1 != null) {
                var3.method2131(arg1.getPath());
            }
            var2.method3496(var3.field1844, 0, var3.field1838);
            var2.method3497();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("af.g(Ljava/io/File;ZI)Z")
    public static boolean method903(File arg0, boolean arg1) {
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

    @ObfuscatedName("q.h(Ljava/lang/String;Ljava/lang/String;ZB)Lgh;")
    public static class196 method463(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2103, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class196(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field216 == 33) {
            var6 = "_rc";
        } else if (Statics.field216 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2503, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class196(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class196(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cv.l(I)V")
    public static void method1792() {
        try {
            File var0 = new File(Statics.field2503, "random.dat");
            if (var0.exists()) {
                field2098 = new class197(new class196(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2102.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2101.length; var2++) {
                        File var3 = new File(Statics.field2101[var2] + Statics.field2102[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2098 = new class197(new class196(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2098 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2098 = new class197(new class196(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("as.e(Ldy;I)V")
    public static void method655(class107 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2098.method3522(0L);
            field2098.method3518(var1);
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
        arg0.method2209(var1, 0, 24);
    }

    @ObfuscatedName("ci.u(Ldy;IB)V")
    public static void method1889(class107 arg0, int arg1) {
        if (field2098 == null) {
            return;
        }
        try {
            field2098.method3522(0L);
            field2098.method3521(arg0.field1844, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
