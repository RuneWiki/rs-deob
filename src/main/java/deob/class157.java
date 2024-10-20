package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fi")
public class class157 {

    @ObfuscatedName("fi.o")
    public static class125 field2231 = null;

    @ObfuscatedName("fi.l")
    public static class125 field2232 = null;

    @ObfuscatedName("fi.h")
    public static class125 field2233 = null;

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.e(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2726(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2230 = arg3;
        Statics.field2112 = arg2;
        try {
            Statics.field2236 = System.getProperty("os.name");
        } catch (Exception var15) {
            Statics.field2236 = "Unknown";
        }
        Statics.field297 = Statics.field2236.toLowerCase();
        try {
            Statics.field477 = System.getProperty("user.home");
            if (Statics.field477 != null) {
                Statics.field477 = Statics.field477 + "/";
            }
        } catch (Exception var14) {
        }
        try {
            if (Statics.field297.startsWith("win")) {
                if (Statics.field477 == null) {
                    Statics.field477 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field477 == null) {
                Statics.field477 = System.getenv("HOME");
            }
            if (Statics.field477 != null) {
                Statics.field477 = Statics.field477 + "/";
            }
        } catch (Exception var13) {
        }
        if (Statics.field477 == null) {
            Statics.field477 = "~/";
        }
        Statics.field2235 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field477, "/tmp/", "" };
        Statics.field3618 = new String[] { ".jagex_cache_" + Statics.field2112, ".file_store_" + Statics.field2112 };
        int var7 = 0;
        label79: while (var7 < 4) {
            Statics.field3886 = method674(arg0, arg1, var7);
            if (!Statics.field3886.exists()) {
                Statics.field3886.mkdirs();
            }
            File[] var8 = Statics.field3886.listFiles();
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
                if (!method1048(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class159.method1668(Statics.field3886);
        method1757();
        field2232 = new class125(new class126(class159.method1040("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2233 = new class125(new class126(class159.method1040("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2228 = new class125[Statics.field2230];
        for (int var12 = 0; var12 < Statics.field2230; var12++) {
            Statics.field2228[var12] = new class125(new class126(class159.method1040("main_file_cache.idx" + var12), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("aj.n(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method674(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2229 = new File(Statics.field477, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2229.exists()) {
            try {
                class126 var7 = new class126(Statics.field2229, "rw", 10000L);
                class175 var8 = new class175((int) var7.method2178());
                while (var8.field2381 < var8.field2376.length) {
                    int var9 = var7.method2177(var8.field2376, var8.field2381, var8.field2376.length - var8.field2381);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2381 += var9;
                }
                var8.field2381 = 0;
                int var10 = var8.method2928();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2928();
                }
                if (var10 <= 2) {
                    var4 = var8.method3010();
                    if (var11 == 1) {
                        var5 = var8.method3010();
                    }
                } else {
                    var4 = var8.method2938();
                    if (var11 == 1) {
                        var5 = var8.method2938();
                    }
                }
                var7.method2187();
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
                if (!method1048(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field3618.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2235.length; var16++) {
                    File var17 = new File(Statics.field2235[var16] + Statics.field3618[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1048(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field477 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method1473(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("cq.g(Ljava/io/File;Ljava/io/File;B)V")
    public static void method1473(File arg0, File arg1) {
        try {
            class126 var2 = new class126(Statics.field2229, "rw", 10000L);
            class175 var3 = new class175(500);
            var3.method2913(3);
            var3.method2913(arg1 == null ? 0 : 1);
            var3.method2921(arg0.getPath());
            if (arg1 != null) {
                var3.method2921(arg1.getPath());
            }
            var2.method2175(var3.field2376, 0, var3.field2381);
            var2.method2187();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("bh.y(Ljava/io/File;ZI)Z")
    public static boolean method1048(File arg0, boolean arg1) {
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

    @ObfuscatedName("cw.k(I)V")
    public static void method1757() {
        try {
            File var0 = new File(Statics.field477, "random.dat");
            if (var0.exists()) {
                field2231 = new class125(new class126(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field3618.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2235.length; var2++) {
                        File var3 = new File(Statics.field2235[var2] + Statics.field3618[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2231 = new class125(new class126(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2231 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2231 = new class125(new class126(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("hv.v(B)[B")
    public static byte[] method3789() {
        byte[] var0 = new byte[24];
        try {
            field2231.method2149(0L);
            field2231.method2150(var0);
            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
                var0[var3] = -1;
            }
        }
        return var0;
    }

    @ObfuscatedName("client.z(Lfh;II)V")
    public static void method1385(class175 arg0, int arg1) {
        if (field2231 == null) {
            return;
        }
        try {
            field2231.method2149(0L);
            field2231.method2153(arg0.field2376, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("hw.r(I)V")
    public static void method3799() {
        try {
            field2232.method2158();
            for (int var0 = 0; var0 < Statics.field2230; var0++) {
                Statics.field2228[var0].method2158();
            }
            field2233.method2158();
            field2231.method2158();
        } catch (Exception var2) {
        }
    }
}
