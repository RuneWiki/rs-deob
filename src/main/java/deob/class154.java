package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("el")
public class class154 {

    @ObfuscatedName("el.u")
    public static class408 field1697 = null;

    @ObfuscatedName("el.h")
    public static class408 field1693 = null;

    @ObfuscatedName("el.q")
    public static class408 field1699 = null;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.c(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method1783(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1692 = arg3;
        Statics.field2723 = arg2;
        try {
            Statics.field1313 = System.getProperty("os.name");
        } catch (Exception var63) {
            Statics.field1313 = "Unknown";
        }
        Statics.field1017 = Statics.field1313.toLowerCase();
        try {
            Statics.field1274 = System.getProperty("user.home");
            if (Statics.field1274 != null) {
                Statics.field1274 = Statics.field1274 + "/";
            }
        } catch (Exception var62) {
        }
        try {
            if (Statics.field1017.startsWith("win")) {
                if (Statics.field1274 == null) {
                    Statics.field1274 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1274 == null) {
                Statics.field1274 = System.getenv("HOME");
            }
            if (Statics.field1274 != null) {
                Statics.field1274 = Statics.field1274 + "/";
            }
        } catch (Exception var61) {
        }
        if (Statics.field1274 == null) {
            Statics.field1274 = "~/";
        }
        Statics.field3978 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1274, "/tmp/", "" };
        Statics.field1491 = new String[] { ".jagex_cache_" + Statics.field2723, ".file_store_" + Statics.field2723 };
        int var7 = 0;
        label265: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1695 = new File(Statics.field1274, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1695.exists()) {
                try {
                    class407 var12 = new class407(Statics.field1695, "rw", 10000L);
                    class421 var13 = new class421((int) var12.method6485());
                    while (var13.field4512 < var13.field4511.length) {
                        int var14 = var12.method6486(var13.field4511, var13.field4512, var13.field4511.length - var13.field4512);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field4512 += var14;
                    }
                    var13.field4512 = 0;
                    int var15 = var13.method6686();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method6686();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method6675();
                        if (var16 == 1) {
                            var10 = var13.method6675();
                        }
                    } else {
                        var9 = var13.method6815();
                        if (var16 == 1) {
                            var10 = var13.method6815();
                        }
                    }
                    var12.method6483();
                } catch (IOException var66) {
                    var66.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    boolean var22;
                    try {
                        RandomAccessFile var20 = new RandomAccessFile(var19, "rw");
                        int var21 = var20.read();
                        var20.seek(0L);
                        var20.write(var21);
                        var20.seek(0L);
                        var20.close();
                        var19.delete();
                        var22 = true;
                    } catch (Exception var60) {
                        var22 = false;
                    }
                    if (!var22) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label240: for (int var24 = 0; var24 < Statics.field1491.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field3978.length; var25++) {
                        File var26 = new File(Statics.field3978[var25] + Statics.field1491[var24] + File.separatorChar + arg0 + File.separatorChar);
                        if (var26.exists()) {
                            File var27 = new File(var26, "test.dat");
                            boolean var30;
                            try {
                                RandomAccessFile var28 = new RandomAccessFile(var27, "rw");
                                int var29 = var28.read();
                                var28.seek(0L);
                                var28.write(var29);
                                var28.seek(0L);
                                var28.close();
                                var27.delete();
                                var30 = true;
                            } catch (Exception var59) {
                                var30 = false;
                            }
                            if (var30) {
                                var9 = var26.toString();
                                var11 = true;
                                break label240;
                            }
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1274 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
                var11 = true;
            }
            if (var10 != null) {
                File var32 = new File(var10);
                File var33 = new File(var9);
                try {
                    File[] var34 = var32.listFiles();
                    File[] var35 = var34;
                    for (int var36 = 0; var36 < var35.length; var36++) {
                        File var37 = var35[var36];
                        File var38 = new File(var33, var37.getName());
                        boolean var39 = var37.renameTo(var38);
                        if (!var39) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var65) {
                    var65.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method3946(new File(var9), (File) null);
            }
            File var41 = new File(var9);
            Statics.field1339 = var41;
            if (!Statics.field1339.exists()) {
                Statics.field1339.mkdirs();
            }
            File[] var42 = Statics.field1339.listFiles();
            if (var42 != null) {
                File[] var43 = var42;
                for (int var44 = 0; var44 < var43.length; var44++) {
                    File var45 = var43[var44];
                    boolean var48;
                    try {
                        RandomAccessFile var46 = new RandomAccessFile(var45, "rw");
                        int var47 = var46.read();
                        var46.seek(0L);
                        var46.write(var47);
                        var46.seek(0L);
                        var46.close();
                        var48 = true;
                    } catch (Exception var58) {
                        var48 = false;
                    }
                    if (!var48) {
                        var7++;
                        continue label265;
                    }
                }
            }
            break;
        }
        class156.method5696(Statics.field1339);
        try {
            File var50 = new File(Statics.field1274, "random.dat");
            if (var50.exists()) {
                field1697 = new class408(new class407(var50, "rw", 25L), 24, 0);
            } else {
                label191: for (int var51 = 0; var51 < Statics.field1491.length; var51++) {
                    for (int var52 = 0; var52 < Statics.field3978.length; var52++) {
                        File var53 = new File(Statics.field3978[var52] + Statics.field1491[var51] + File.separatorChar + "random.dat");
                        if (var53.exists()) {
                            field1697 = new class408(new class407(var53, "rw", 25L), 24, 0);
                            break label191;
                        }
                    }
                }
            }
            if (field1697 == null) {
                RandomAccessFile var54 = new RandomAccessFile(var50, "rw");
                int var55 = var54.read();
                var54.seek(0L);
                var54.write(var55);
                var54.seek(0L);
                var54.close();
                field1697 = new class408(new class407(var50, "rw", 25L), 24, 0);
            }
        } catch (IOException var64) {
        }
        field1693 = new class408(new class407(Statics.method6107("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1699 = new class408(new class407(Statics.method6107("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1891 = new class408[Statics.field1692];
        for (int var57 = 0; var57 < Statics.field1692; var57++) {
            Statics.field1891[var57] = new class408(new class407(Statics.method6107("main_file_cache.idx" + var57), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("hg.l(Ljava/io/File;Ljava/io/File;B)V")
    public static void method3946(File arg0, File arg1) {
        try {
            class407 var2 = new class407(Statics.field1695, "rw", 10000L);
            class421 var3 = new class421(500);
            var3.method6644(3);
            var3.method6644(arg1 == null ? 0 : 1);
            var3.method6656(arg0.getPath());
            if (arg1 != null) {
                var3.method6656(arg1.getPath());
            }
            var2.method6480(var3.field4511, 0, var3.field4512);
            var2.method6483();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("fv.s(Ljava/lang/String;Ljava/lang/String;ZI)Loo;")
    public static class407 method3040(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1339, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class407(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2723 == 33) {
            var6 = "_rc";
        } else if (Statics.field2723 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1274, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class407(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class407(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("k.e(I)[B")
    public static byte[] method328() {
        byte[] var0 = new byte[24];
        try {
            field1697.method6501(0L);
            field1697.method6505(var0);
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
}
