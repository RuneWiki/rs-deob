package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cj")
public class class82 {

    @ObfuscatedName("cj.u")
    public static class30 field1419 = null;

    @ObfuscatedName("cj.s")
    public static class30 field1428 = null;

    @ObfuscatedName("cj.e")
    public static class30 field1421 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.p(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method152(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1420 = arg3;
        Statics.field2356 = arg2;
        try {
            Statics.field1517 = System.getProperty("os.name");
        } catch (Exception var40) {
            Statics.field1517 = "Unknown";
        }
        Statics.field945 = Statics.field1517.toLowerCase();
        try {
            Statics.field1281 = System.getProperty("user.home");
            if (Statics.field1281 != null) {
                Statics.field1281 = Statics.field1281 + "/";
            }
        } catch (Exception var39) {
        }
        try {
            if (Statics.field945.startsWith("win")) {
                if (Statics.field1281 == null) {
                    Statics.field1281 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1281 == null) {
                Statics.field1281 = System.getenv("HOME");
            }
            if (Statics.field1281 != null) {
                Statics.field1281 = Statics.field1281 + "/";
            }
        } catch (Exception var38) {
        }
        if (Statics.field1281 == null) {
            Statics.field1281 = "~/";
        }
        Statics.field1273 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1281, "/tmp/", "" };
        Statics.field26 = new String[] { ".jagex_cache_" + Statics.field2356, ".file_store_" + Statics.field2356 };
        int var7 = 0;
        label206: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1415 = new File(Statics.field1281, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1415.exists()) {
                try {
                    class29 var12 = new class29(Statics.field1415, "rw", 10000L);
                    class127 var13 = new class127((int) var12.method553());
                    while (var13.field2030 < var13.field2036.length) {
                        int var14 = var12.method554(var13.field2036, var13.field2030, var13.field2036.length - var13.field2030);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2030 += var14;
                    }
                    var13.field2030 = 0;
                    int var15 = var13.method2498();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2498();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2653();
                        if (var16 == 1) {
                            var10 = var13.method2653();
                        }
                    } else {
                        var9 = var13.method2508();
                        if (var16 == 1) {
                            var10 = var13.method2508();
                        }
                    }
                    var12.method556();
                } catch (IOException var42) {
                    var42.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method1412(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label180: for (int var20 = 0; var20 < Statics.field26.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1273.length; var21++) {
                        File var22 = new File(Statics.field1273[var21] + Statics.field26[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method1412(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label180;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1281 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
                var11 = true;
            }
            if (var10 != null) {
                File var23 = new File(var10);
                File var24 = new File(var9);
                try {
                    File[] var25 = var23.listFiles();
                    File[] var26 = var25;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        File var28 = var26[var27];
                        File var29 = new File(var24, var28.getName());
                        boolean var30 = var28.renameTo(var29);
                        if (!var30) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var41) {
                    var41.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method158(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field1429 = var32;
            if (!Statics.field1429.exists()) {
                Statics.field1429.mkdirs();
            }
            File[] var33 = Statics.field1429.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method1412(var36, false)) {
                        var7++;
                        continue label206;
                    }
                }
            }
            break;
        }
        class72.method208(Statics.field1429);
        method1281();
        field1428 = new class30(new class29(class72.method3171("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1421 = new class30(new class29(class72.method3171("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2731 = new class30[Statics.field1420];
        for (int var37 = 0; var37 < Statics.field1420; var37++) {
            Statics.field2731[var37] = new class30(new class29(class72.method3171("main_file_cache.idx" + var37), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("k.l(Ljava/io/File;Ljava/io/File;B)V")
    public static void method158(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field1415, "rw", 10000L);
            class127 var3 = new class127(500);
            var3.method2484(3);
            var3.method2484(arg1 == null ? 0 : 1);
            var3.method2491(arg0.getPath());
            if (arg1 != null) {
                var3.method2491(arg1.getPath());
            }
            var2.method551(var3.field2036, 0, var3.field2030);
            var2.method556();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("by.d(Ljava/io/File;ZI)Z")
    public static boolean method1412(File arg0, boolean arg1) {
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

    @ObfuscatedName("as.x(Ljava/lang/String;Ljava/lang/String;ZI)Lah;")
    public static class29 method893(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1429, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2356 == 33) {
            var6 = "_rc";
        } else if (Statics.field2356 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1281, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class29(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class29(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bg.o(B)V")
    public static void method1281() {
        try {
            File var0 = new File(Statics.field1281, "random.dat");
            if (var0.exists()) {
                field1419 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field26.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1273.length; var2++) {
                        File var3 = new File(Statics.field1273[var2] + Statics.field26[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1419 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1419 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1419 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("bc.a(Lds;I)V")
    public static void method1563(class127 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1419.method580(0L);
            field1419.method576(var1);
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
        arg0.method2492(var1, 0, 24);
    }

    @ObfuscatedName("al.w(Lds;II)V")
    public static void method837(class127 arg0, int arg1) {
        if (field1419 == null) {
            return;
        }
        try {
            field1419.method580(0L);
            field1419.method579(arg0.field2036, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("be.i(I)V")
    public static void method1396() {
        try {
            field1428.method573();
            for (int var0 = 0; var0 < Statics.field1420; var0++) {
                Statics.field2731[var0].method573();
            }
            field1421.method573();
            field1419.method573();
        } catch (Exception var2) {
        }
    }
}
