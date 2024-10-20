package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cs")
public class class82 {

    @ObfuscatedName("cs.f")
    public static class30 field1433 = null;

    @ObfuscatedName("cs.a")
    public static class30 field1434 = null;

    @ObfuscatedName("cs.d")
    public static class30 field1435 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.i(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method128(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2439 = arg3;
        Statics.field1437 = arg2;
        try {
            Statics.field757 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field757 = "Unknown";
        }
        Statics.field1046 = Statics.field757.toLowerCase();
        try {
            Statics.field255 = System.getProperty("user.home");
            if (Statics.field255 != null) {
                Statics.field255 = Statics.field255 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field1046.startsWith("win")) {
                if (Statics.field255 == null) {
                    Statics.field255 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field255 == null) {
                Statics.field255 = System.getenv("HOME");
            }
            if (Statics.field255 != null) {
                Statics.field255 = Statics.field255 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field255 == null) {
            Statics.field255 = "~/";
        }
        Statics.field216 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field255, "/tmp/", "" };
        Statics.field66 = new String[] { ".jagex_cache_" + Statics.field1437, ".file_store_" + Statics.field1437 };
        int var7 = 0;
        label242: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1426 = new File(Statics.field255, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1426.exists()) {
                try {
                    class29 var12 = new class29(Statics.field1426, "rw", 10000L);
                    class127 var13 = new class127((int) var12.method573());
                    while (var13.field2039 < var13.field2041.length) {
                        int var14 = var12.method571(var13.field2041, var13.field2039, var13.field2041.length - var13.field2039);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2039 += var14;
                    }
                    var13.field2039 = 0;
                    int var15 = var13.method2491();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2491();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2499();
                        if (var16 == 1) {
                            var10 = var13.method2499();
                        }
                    } else {
                        var9 = var13.method2646();
                        if (var16 == 1) {
                            var10 = var13.method2646();
                        }
                    }
                    var12.method572();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method839(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label216: for (int var20 = 0; var20 < Statics.field66.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field216.length; var21++) {
                        File var22 = new File(Statics.field216[var21] + Statics.field66[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method839(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label216;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field255 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var49) {
                    var49.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method233(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field1430 = var32;
            if (!Statics.field1430.exists()) {
                Statics.field1430.mkdirs();
            }
            File[] var33 = Statics.field1430.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method839(var36, false)) {
                        var7++;
                        continue label242;
                    }
                }
            }
            break;
        }
        class72.method1657(Statics.field1430);
        try {
            File var37 = new File(Statics.field255, "random.dat");
            if (var37.exists()) {
                field1433 = new class30(new class29(var37, "rw", 25L), 24, 0);
            } else {
                label169: for (int var38 = 0; var38 < Statics.field66.length; var38++) {
                    for (int var39 = 0; var39 < Statics.field216.length; var39++) {
                        File var40 = new File(Statics.field216[var39] + Statics.field66[var38] + File.separatorChar + "random.dat");
                        if (var40.exists()) {
                            field1433 = new class30(new class29(var40, "rw", 25L), 24, 0);
                            break label169;
                        }
                    }
                }
            }
            if (field1433 == null) {
                RandomAccessFile var41 = new RandomAccessFile(var37, "rw");
                int var42 = var41.read();
                var41.seek(0L);
                var41.write(var42);
                var41.seek(0L);
                var41.close();
                field1433 = new class30(new class29(var37, "rw", 25L), 24, 0);
            }
        } catch (IOException var48) {
        }
        field1434 = new class30(new class29(class72.method1343("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1435 = new class30(new class29(class72.method1343("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1436 = new class30[Statics.field2439];
        for (int var44 = 0; var44 < Statics.field2439; var44++) {
            Statics.field1436[var44] = new class30(new class29(class72.method1343("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("p.v(Ljava/io/File;Ljava/io/File;B)V")
    public static void method233(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field1426, "rw", 10000L);
            class127 var3 = new class127(500);
            var3.method2477(3);
            var3.method2477(arg1 == null ? 0 : 1);
            var3.method2484(arg0.getPath());
            if (arg1 != null) {
                var3.method2484(arg1.getPath());
            }
            var2.method579(var3.field2041, 0, var3.field2039);
            var2.method572();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("aw.m(Ljava/io/File;ZB)Z")
    public static boolean method839(File arg0, boolean arg1) {
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

    @ObfuscatedName("br.j(Ljava/lang/String;Ljava/lang/String;ZI)Lac;")
    public static class29 method1261(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1430, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1437 == 33) {
            var6 = "_rc";
        } else if (Statics.field1437 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field255, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("dr.o(Lda;I)V")
    public static void method2341(class127 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1433.method594(0L);
            field1433.method595(var1);
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
        arg0.method2485(var1, 0, 24);
    }

    @ObfuscatedName("ci.g(I)V")
    public static void method1882() {
        try {
            field1434.method592();
            for (int var0 = 0; var0 < Statics.field2439; var0++) {
                Statics.field1436[var0].method592();
            }
            field1435.method592();
            field1433.method592();
        } catch (Exception var2) {
        }
    }
}
