package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cj")
public class class153 {

    @ObfuscatedName("cj.a")
    public static class175 field2318 = null;

    @ObfuscatedName("cj.u")
    public static class175 field2319 = null;

    @ObfuscatedName("cj.y")
    public static class175 field2317 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.v(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1220(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2314 = arg3;
        Statics.field2059 = arg2;
        try {
            Statics.field2034 = System.getProperty("os.name");
        } catch (Exception var63) {
            Statics.field2034 = "Unknown";
        }
        Statics.field2669 = Statics.field2034.toLowerCase();
        try {
            Statics.field1396 = System.getProperty("user.home");
            if (Statics.field1396 != null) {
                Statics.field1396 = Statics.field1396 + "/";
            }
        } catch (Exception var62) {
        }
        try {
            if (Statics.field2669.startsWith("win")) {
                if (Statics.field1396 == null) {
                    Statics.field1396 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1396 == null) {
                Statics.field1396 = System.getenv("HOME");
            }
            if (Statics.field1396 != null) {
                Statics.field1396 = Statics.field1396 + "/";
            }
        } catch (Exception var61) {
        }
        if (Statics.field1396 == null) {
            Statics.field1396 = "~/";
        }
        Statics.field877 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1396, "/tmp/", "" };
        Statics.field1209 = new String[] { ".jagex_cache_" + Statics.field2059, ".file_store_" + Statics.field2059 };
        int var7 = 0;
        label248: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field965 = new File(Statics.field1396, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field965.exists()) {
                try {
                    class167 var12 = new class167(Statics.field965, "rw", 10000L);
                    class28 var13 = new class28((int) var12.method3015());
                    while (var13.field303 < var13.field306.length) {
                        int var14 = var12.method3016(var13.field306, var13.field303, var13.field306.length - var13.field303);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field303 += var14;
                    }
                    var13.field303 = 0;
                    int var15 = var13.method450();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method450();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method321();
                        if (var16 == 1) {
                            var10 = var13.method321();
                        }
                    } else {
                        var9 = var13.method492();
                        if (var16 == 1) {
                            var10 = var13.method492();
                        }
                    }
                    var12.method3014();
                } catch (IOException var65) {
                    var65.printStackTrace();
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
                label223: for (int var24 = 0; var24 < Statics.field1209.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field877.length; var25++) {
                        File var26 = new File(Statics.field877[var25] + Statics.field1209[var24] + File.separatorChar + arg0 + File.separatorChar);
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
                                break label223;
                            }
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1396 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var64) {
                    var64.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var41 = new File(var9);
                Object var42 = null;
                try {
                    class167 var43 = new class167(Statics.field965, "rw", 10000L);
                    class28 var44 = new class28(500);
                    var44.method443(3);
                    var44.method443(var42 == null ? 0 : 1);
                    var44.method469(var41.getPath());
                    if (var42 != null) {
                        var44.method469(((File) var42).getPath());
                    }
                    var43.method3011(var44.field306, 0, var44.field303);
                    var43.method3014();
                } catch (IOException var58) {
                    var58.printStackTrace();
                }
            }
            File var46 = new File(var9);
            Statics.field2312 = var46;
            if (!Statics.field2312.exists()) {
                Statics.field2312.mkdirs();
            }
            File[] var47 = Statics.field2312.listFiles();
            if (var47 != null) {
                File[] var48 = var47;
                for (int var49 = 0; var49 < var48.length; var49++) {
                    File var50 = var48[var49];
                    boolean var53;
                    try {
                        RandomAccessFile var51 = new RandomAccessFile(var50, "rw");
                        int var52 = var51.read();
                        var51.seek(0L);
                        var51.write(var52);
                        var51.seek(0L);
                        var51.close();
                        var53 = true;
                    } catch (Exception var57) {
                        var53 = false;
                    }
                    if (!var53) {
                        var7++;
                        continue label248;
                    }
                }
            }
            break;
        }
        File var55 = Statics.field2312;
        Statics.field1862 = var55;
        if (!Statics.field1862.exists()) {
            throw new RuntimeException("");
        }
        class122.field1863 = true;
        method2270();
        field2318 = new class175(new class167(class122.method1215("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2319 = new class175(new class167(class122.method1215("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1057 = new class175[Statics.field2314];
        for (int var56 = 0; var56 < Statics.field2314; var56++) {
            Statics.field1057[var56] = new class175(new class167(class122.method1215("main_file_cache.idx" + var56), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("be.b(B)V")
    public static void method2270() {
        try {
            File var0 = new File(Statics.field1396, "random.dat");
            if (var0.exists()) {
                field2317 = new class175(new class167(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1209.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field877.length; var2++) {
                        File var3 = new File(Statics.field877[var2] + Statics.field1209[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2317 = new class175(new class167(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2317 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2317 = new class175(new class167(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ar.i(Ldv;I)V")
    public static void method3008(class28 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2317.method3187(0L);
            field2317.method3174(var1);
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
        arg0.method306(var1, 0, 24);
    }

    @ObfuscatedName("aj.m(B)V")
    public static void method3163() {
        try {
            field2318.method3193();
            for (int var0 = 0; var0 < Statics.field2314; var0++) {
                Statics.field1057[var0].method3193();
            }
            field2319.method3193();
            field2317.method3193();
        } catch (Exception var2) {
        }
    }

    @ObfuscatedName("ac.c(Ljava/lang/String;Ljava/lang/String;ZI)Lax;")
    public static class167 method3260(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2312, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class167(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2059 == 33) {
            var6 = "_rc";
        } else if (Statics.field2059 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1396, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class167(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class167(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
