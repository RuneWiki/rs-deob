package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cd")
public class class82 {

    @ObfuscatedName("cd.l")
    public static class30 field1427 = null;

    @ObfuscatedName("cd.i")
    public static class30 field1420 = null;

    @ObfuscatedName("cd.r")
    public static class30 field1429 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.y(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method122(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field723 = arg3;
        Statics.field1990 = arg2;
        try {
            Statics.field1441 = System.getProperty("os.name");
        } catch (Exception var62) {
            Statics.field1441 = "Unknown";
        }
        Statics.field1381 = Statics.field1441.toLowerCase();
        try {
            Statics.field1430 = System.getProperty("user.home");
            if (Statics.field1430 != null) {
                Statics.field1430 = Statics.field1430 + "/";
            }
        } catch (Exception var61) {
        }
        try {
            if (Statics.field1381.startsWith("win")) {
                if (Statics.field1430 == null) {
                    Statics.field1430 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1430 == null) {
                Statics.field1430 = System.getenv("HOME");
            }
            if (Statics.field1430 != null) {
                Statics.field1430 = Statics.field1430 + "/";
            }
        } catch (Exception var60) {
        }
        if (Statics.field1430 == null) {
            Statics.field1430 = "~/";
        }
        Statics.field1376 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1430, "/tmp/", "" };
        Statics.field1290 = new String[] { ".jagex_cache_" + Statics.field1990, ".file_store_" + Statics.field1990 };
        int var7 = 0;
        label244: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1423 = new File(Statics.field1430, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1423.exists()) {
                try {
                    class29 var12 = new class29(Statics.field1423, "rw", 10000L);
                    class127 var13 = new class127((int) var12.method545());
                    while (var13.field2036 < var13.field2037.length) {
                        int var14 = var12.method546(var13.field2037, var13.field2036, var13.field2037.length - var13.field2036);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2036 += var14;
                    }
                    var13.field2036 = 0;
                    int var15 = var13.method2534();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2534();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2467();
                        if (var16 == 1) {
                            var10 = var13.method2467();
                        }
                    } else {
                        var9 = var13.method2468();
                        if (var16 == 1) {
                            var10 = var13.method2468();
                        }
                    }
                    var12.method548();
                } catch (IOException var64) {
                    var64.printStackTrace();
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
                    } catch (Exception var59) {
                        var22 = false;
                    }
                    if (!var22) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label219: for (int var24 = 0; var24 < Statics.field1290.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field1376.length; var25++) {
                        File var26 = new File(Statics.field1376[var25] + Statics.field1290[var24] + File.separatorChar + arg0 + File.separatorChar);
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
                            } catch (Exception var58) {
                                var30 = false;
                            }
                            if (var30) {
                                var9 = var26.toString();
                                var11 = true;
                                break label219;
                            }
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1430 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var63) {
                    var63.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var41 = new File(var9);
                Object var42 = null;
                try {
                    class29 var43 = new class29(Statics.field1423, "rw", 10000L);
                    class127 var44 = new class127(500);
                    var44.method2444(3);
                    var44.method2444(var42 == null ? 0 : 1);
                    var44.method2463(var41.getPath());
                    if (var42 != null) {
                        var44.method2463(((File) var42).getPath());
                    }
                    var43.method556(var44.field2037, 0, var44.field2036);
                    var43.method548();
                } catch (IOException var57) {
                    var57.printStackTrace();
                }
            }
            File var46 = new File(var9);
            Statics.field1424 = var46;
            if (!Statics.field1424.exists()) {
                Statics.field1424.mkdirs();
            }
            File[] var47 = Statics.field1424.listFiles();
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
                    } catch (Exception var56) {
                        var53 = false;
                    }
                    if (!var53) {
                        var7++;
                        continue label244;
                    }
                }
            }
            break;
        }
        Statics.method625(Statics.field1424);
        method206();
        field1420 = new class30(new class29(class72.method42("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1429 = new class30(new class29(class72.method42("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1812 = new class30[Statics.field723];
        for (int var55 = 0; var55 < Statics.field723; var55++) {
            Statics.field1812[var55] = new class30(new class29(class72.method42("main_file_cache.idx" + var55), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("u.m(Ljava/lang/String;Ljava/lang/String;ZI)Laj;")
    public static class29 method160(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1424, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1990 == 33) {
            var6 = "_rc";
        } else if (Statics.field1990 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1430, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("q.d(I)V")
    public static void method206() {
        try {
            File var0 = new File(Statics.field1430, "random.dat");
            if (var0.exists()) {
                field1427 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1290.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1376.length; var2++) {
                        File var3 = new File(Statics.field1376[var2] + Statics.field1290[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1427 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1427 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1427 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ao.k(B)V")
    public static void method894() {
        try {
            field1420.method594();
            for (int var0 = 0; var0 < Statics.field723; var0++) {
                Statics.field1812[var0].method594();
            }
            field1429.method594();
            field1427.method594();
        } catch (Exception var2) {
        }
    }
}
