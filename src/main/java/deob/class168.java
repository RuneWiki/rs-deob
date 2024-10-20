package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fi")
public class class168 {

    @ObfuscatedName("fi.a")
    public static class122 field2220 = null;

    @ObfuscatedName("fi.w")
    public static class122 field2225 = null;

    @ObfuscatedName("fi.n")
    public static class122 field2223 = null;

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.o(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2457(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field504 = arg3;
        Statics.field254 = arg2;
        try {
            Statics.field1345 = System.getProperty("os.name");
        } catch (Exception var48) {
            Statics.field1345 = "Unknown";
        }
        Statics.field374 = Statics.field1345.toLowerCase();
        try {
            Statics.field1318 = System.getProperty("user.home");
            if (Statics.field1318 != null) {
                Statics.field1318 = Statics.field1318 + "/";
            }
        } catch (Exception var47) {
        }
        try {
            if (Statics.field374.startsWith("win")) {
                if (Statics.field1318 == null) {
                    Statics.field1318 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1318 == null) {
                Statics.field1318 = System.getenv("HOME");
            }
            if (Statics.field1318 != null) {
                Statics.field1318 = Statics.field1318 + "/";
            }
        } catch (Exception var46) {
        }
        if (Statics.field1318 == null) {
            Statics.field1318 = "~/";
        }
        Statics.field453 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1318, "/tmp/", "" };
        Statics.field1628 = new String[] { ".jagex_cache_" + Statics.field254, ".file_store_" + Statics.field254 };
        int var7 = 0;
        label246: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2228 = new File(Statics.field1318, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2228.exists()) {
                try {
                    class123 var12 = new class123(Statics.field2228, "rw", 10000L);
                    class195 var13 = new class195((int) var12.method2324());
                    while (var13.field2575 < var13.field2574.length) {
                        int var14 = var12.method2325(var13.field2574, var13.field2575, var13.field2574.length - var13.field2575);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2575 += var14;
                    }
                    var13.field2575 = 0;
                    int var15 = var13.method3205();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method3205();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method3215();
                        if (var16 == 1) {
                            var10 = var13.method3215();
                        }
                    } else {
                        var9 = var13.method3370();
                        if (var16 == 1) {
                            var10 = var13.method3370();
                        }
                    }
                    var12.method2326();
                } catch (IOException var51) {
                    var51.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method59(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label220: for (int var20 = 0; var20 < Statics.field1628.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field453.length; var21++) {
                        File var22 = new File(Statics.field453[var21] + Statics.field1628[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method59(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label220;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1318 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var50) {
                    var50.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method2089(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field2808 = var32;
            if (!Statics.field2808.exists()) {
                Statics.field2808.mkdirs();
            }
            File[] var33 = Statics.field2808.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method59(var36, false)) {
                        var7++;
                        continue label246;
                    }
                }
            }
            break;
        }
        File var37 = Statics.field2808;
        Statics.field2234 = var37;
        if (!Statics.field2234.exists()) {
            throw new RuntimeException("");
        }
        class171.field2235 = true;
        try {
            File var38 = new File(Statics.field1318, "random.dat");
            if (var38.exists()) {
                field2220 = new class122(new class123(var38, "rw", 25L), 24, 0);
            } else {
                label171: for (int var39 = 0; var39 < Statics.field1628.length; var39++) {
                    for (int var40 = 0; var40 < Statics.field453.length; var40++) {
                        File var41 = new File(Statics.field453[var40] + Statics.field1628[var39] + File.separatorChar + "random.dat");
                        if (var41.exists()) {
                            field2220 = new class122(new class123(var41, "rw", 25L), 24, 0);
                            break label171;
                        }
                    }
                }
            }
            if (field2220 == null) {
                RandomAccessFile var42 = new RandomAccessFile(var38, "rw");
                int var43 = var42.read();
                var42.seek(0L);
                var42.write(var43);
                var42.seek(0L);
                var42.close();
                field2220 = new class122(new class123(var38, "rw", 25L), 24, 0);
            }
        } catch (IOException var49) {
        }
        field2225 = new class122(new class123(class171.method1063("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2223 = new class122(new class123(class171.method1063("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field371 = new class122[Statics.field504];
        for (int var45 = 0; var45 < Statics.field504; var45++) {
            Statics.field371[var45] = new class122(new class123(class171.method1063("main_file_cache.idx" + var45), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("de.k(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2089(File arg0, File arg1) {
        try {
            class123 var2 = new class123(Statics.field2228, "rw", 10000L);
            class195 var3 = new class195(500);
            var3.method3189(3);
            var3.method3189(arg1 == null ? 0 : 1);
            var3.method3198(arg0.getPath());
            if (arg1 != null) {
                var3.method3198(arg1.getPath());
            }
            var2.method2319(var3.field2574, 0, var3.field2575);
            var2.method2326();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("w.t(Ljava/io/File;ZI)Z")
    public static boolean method59(File arg0, boolean arg1) {
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

    @ObfuscatedName("cv.d(Ljava/lang/String;Ljava/lang/String;ZB)Ldi;")
    public static class123 method1723(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2808, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class123(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field254 == 33) {
            var6 = "_rc";
        } else if (Statics.field254 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1318, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class123(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class123(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fw.h(I)[B")
    public static byte[] method2938() {
        byte[] var0 = new byte[24];
        try {
            field2220.method2294(0L);
            field2220.method2299(var0);
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

    @ObfuscatedName("dm.m(Lgc;IB)V")
    public static void method2075(class195 arg0, int arg1) {
        if (field2220 == null) {
            return;
        }
        try {
            field2220.method2294(0L);
            field2220.method2296(arg0.field2574, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ao.z(B)V")
    public static void method524() {
        try {
            field2225.method2293();
            for (int var0 = 0; var0 < Statics.field504; var0++) {
                Statics.field371[var0].method2293();
            }
            field2223.method2293();
            field2220.method2293();
        } catch (Exception var2) {
        }
    }
}
