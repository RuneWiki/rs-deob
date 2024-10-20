package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ey")
public class class156 {

    @ObfuscatedName("ey.w")
    public static class124 field2208 = null;

    @ObfuscatedName("ey.v")
    public static class124 field2212 = null;

    @ObfuscatedName("ey.h")
    public static class124 field2204 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.c(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1380(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field224 = arg3;
        Statics.field2210 = arg2;
        try {
            Statics.field358 = System.getProperty("os.name");
        } catch (Exception var53) {
            Statics.field358 = "Unknown";
        }
        Statics.field2209 = Statics.field358.toLowerCase();
        try {
            Statics.field795 = System.getProperty("user.home");
            if (Statics.field795 != null) {
                Statics.field795 = Statics.field795 + "/";
            }
        } catch (Exception var52) {
        }
        try {
            if (Statics.field2209.startsWith("win")) {
                if (Statics.field795 == null) {
                    Statics.field795 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field795 == null) {
                Statics.field795 = System.getenv("HOME");
            }
            if (Statics.field795 != null) {
                Statics.field795 = Statics.field795 + "/";
            }
        } catch (Exception var51) {
        }
        if (Statics.field795 == null) {
            Statics.field795 = "~/";
        }
        Statics.field1392 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field795, "/tmp/", "" };
        Statics.field2211 = new String[] { ".jagex_cache_" + Statics.field2210, ".file_store_" + Statics.field2210 };
        int var7 = 0;
        label257: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2205 = new File(Statics.field795, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2205.exists()) {
                try {
                    class125 var12 = new class125(Statics.field2205, "rw", 10000L);
                    class174 var13 = new class174((int) var12.method2105());
                    while (var13.field2357 < var13.field2355.length) {
                        int var14 = var12.method2095(var13.field2355, var13.field2357, var13.field2355.length - var13.field2357);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2357 += var14;
                    }
                    var13.field2357 = 0;
                    int var15 = var13.method2843();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2843();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2974();
                        if (var16 == 1) {
                            var10 = var13.method2974();
                        }
                    } else {
                        var9 = var13.method2869();
                        if (var16 == 1) {
                            var10 = var13.method2869();
                        }
                    }
                    var12.method2094();
                } catch (IOException var56) {
                    var56.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method1354(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label231: for (int var20 = 0; var20 < Statics.field2211.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1392.length; var21++) {
                        File var22 = new File(Statics.field1392[var21] + Statics.field2211[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method1354(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label231;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field795 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var55) {
                    var55.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class125 var34 = new class125(Statics.field2205, "rw", 10000L);
                    class174 var35 = new class174(500);
                    var35.method2922(3);
                    var35.method2922(var33 == null ? 0 : 1);
                    var35.method2853(var32.getPath());
                    if (var33 != null) {
                        var35.method2853(((File) var33).getPath());
                    }
                    var34.method2093(var35.field2355, 0, var35.field2357);
                    var34.method2094();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field3657 = var37;
            if (!Statics.field3657.exists()) {
                Statics.field3657.mkdirs();
            }
            File[] var38 = Statics.field3657.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method1354(var41, false)) {
                        var7++;
                        continue label257;
                    }
                }
            }
            break;
        }
        class158.method1656(Statics.field3657);
        try {
            File var42 = new File(Statics.field795, "random.dat");
            if (var42.exists()) {
                field2208 = new class124(new class125(var42, "rw", 25L), 24, 0);
            } else {
                label184: for (int var43 = 0; var43 < Statics.field2211.length; var43++) {
                    for (int var44 = 0; var44 < Statics.field1392.length; var44++) {
                        File var45 = new File(Statics.field1392[var44] + Statics.field2211[var43] + File.separatorChar + "random.dat");
                        if (var45.exists()) {
                            field2208 = new class124(new class125(var45, "rw", 25L), 24, 0);
                            break label184;
                        }
                    }
                }
            }
            if (field2208 == null) {
                RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                int var47 = var46.read();
                var46.seek(0L);
                var46.write(var47);
                var46.seek(0L);
                var46.close();
                field2208 = new class124(new class125(var42, "rw", 25L), 24, 0);
            }
        } catch (IOException var54) {
        }
        field2212 = new class124(new class125(class158.method451("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2204 = new class124(new class125(class158.method451("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2200 = new class124[Statics.field224];
        for (int var49 = 0; var49 < Statics.field224; var49++) {
            Statics.field2200[var49] = new class124(new class125(class158.method451("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bx.o(Ljava/io/File;ZI)Z")
    public static boolean method1354(File arg0, boolean arg1) {
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

    @ObfuscatedName("et.i(Ljava/lang/String;Ljava/lang/String;ZI)Ldx;")
    public static class125 method2605(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3657, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2210 == 33) {
            var6 = "_rc";
        } else if (Statics.field2210 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field795, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class125(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class125(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("q.u(Lfp;II)V")
    public static void method132(class174 arg0, int arg1) {
        if (field2208 == null) {
            return;
        }
        try {
            field2208.method2063(0L);
            field2208.method2068(arg0.field2355, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
