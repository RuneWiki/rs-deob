package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ch")
public class class82 {

    @ObfuscatedName("ch.h")
    public static class30 field1432 = null;

    @ObfuscatedName("ch.b")
    public static class30 field1431 = null;

    @ObfuscatedName("ch.r")
    public static class30 field1434 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.q(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2912(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1429 = arg3;
        Statics.field2379 = arg2;
        try {
            Statics.field954 = System.getProperty("os.name");
        } catch (Exception var57) {
            Statics.field954 = "Unknown";
        }
        Statics.field1435 = Statics.field954.toLowerCase();
        try {
            Statics.field62 = System.getProperty("user.home");
            if (Statics.field62 != null) {
                Statics.field62 = Statics.field62 + "/";
            }
        } catch (Exception var56) {
        }
        try {
            if (Statics.field1435.startsWith("win")) {
                if (Statics.field62 == null) {
                    Statics.field62 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field62 == null) {
                Statics.field62 = System.getenv("HOME");
            }
            if (Statics.field62 != null) {
                Statics.field62 = Statics.field62 + "/";
            }
        } catch (Exception var55) {
        }
        if (Statics.field62 == null) {
            Statics.field62 = "~/";
        }
        Statics.field2743 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field62, "/tmp/", "" };
        Statics.field324 = new String[] { ".jagex_cache_" + Statics.field2379, ".file_store_" + Statics.field2379 };
        int var7 = 0;
        label233: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1428 = new File(Statics.field62, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1428.exists()) {
                try {
                    class29 var12 = new class29(Statics.field1428, "rw", 10000L);
                    class127 var13 = new class127((int) var12.method540());
                    while (var13.field2039 < var13.field2042.length) {
                        int var14 = var12.method538(var13.field2042, var13.field2039, var13.field2042.length - var13.field2039);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2039 += var14;
                    }
                    var13.field2039 = 0;
                    int var15 = var13.method2534();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2534();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2434();
                        if (var16 == 1) {
                            var10 = var13.method2434();
                        }
                    } else {
                        var9 = var13.method2509();
                        if (var16 == 1) {
                            var10 = var13.method2509();
                        }
                    }
                    var12.method539();
                } catch (IOException var59) {
                    var59.printStackTrace();
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
                    } catch (Exception var54) {
                        var22 = false;
                    }
                    if (!var22) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label208: for (int var24 = 0; var24 < Statics.field324.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field2743.length; var25++) {
                        File var26 = new File(Statics.field2743[var25] + Statics.field324[var24] + File.separatorChar + arg0 + File.separatorChar);
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
                            } catch (Exception var53) {
                                var30 = false;
                            }
                            if (var30) {
                                var9 = var26.toString();
                                var11 = true;
                                break label208;
                            }
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field62 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var58) {
                    var58.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method2323(new File(var9), (File) null);
            }
            File var41 = new File(var9);
            Statics.field2840 = var41;
            if (!Statics.field2840.exists()) {
                Statics.field2840.mkdirs();
            }
            File[] var42 = Statics.field2840.listFiles();
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
                    } catch (Exception var52) {
                        var48 = false;
                    }
                    if (!var48) {
                        var7++;
                        continue label233;
                    }
                }
            }
            break;
        }
        File var50 = Statics.field2840;
        Statics.field1304 = var50;
        if (!Statics.field1304.exists()) {
            throw new RuntimeException("");
        }
        class72.field1307 = true;
        method2670();
        field1431 = new class30(new class29(class72.method530("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1434 = new class30(new class29(class72.method530("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2428 = new class30[Statics.field1429];
        for (int var51 = 0; var51 < Statics.field1429; var51++) {
            Statics.field2428[var51] = new class30(new class29(class72.method530("main_file_cache.idx" + var51), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("du.c(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2323(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field1428, "rw", 10000L);
            class127 var3 = new class127(500);
            var3.method2411(3);
            var3.method2411(arg1 == null ? 0 : 1);
            var3.method2421(arg0.getPath());
            if (arg1 != null) {
                var3.method2421(arg1.getPath());
            }
            var2.method550(var3.field2042, 0, var3.field2039);
            var2.method539();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("br.p(Ljava/lang/String;Ljava/lang/String;ZI)Lao;")
    public static class29 method1339(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2840, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2379 == 33) {
            var6 = "_rc";
        } else if (Statics.field2379 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field62, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ea.z(I)V")
    public static void method2670() {
        try {
            File var0 = new File(Statics.field62, "random.dat");
            if (var0.exists()) {
                field1432 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field324.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2743.length; var2++) {
                        File var3 = new File(Statics.field2743[var2] + Statics.field324[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1432 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1432 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1432 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("b.m(Ldo;II)V")
    public static void method112(class127 arg0, int arg1) {
        if (field1432 == null) {
            return;
        }
        try {
            field1432.method600(0L);
            field1432.method588(arg0.field2042, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("aa.k(I)V")
    public static void method805() {
        try {
            field1431.method593();
            for (int var0 = 0; var0 < Statics.field1429; var0++) {
                Statics.field2428[var0].method593();
            }
            field1434.method593();
            field1432.method593();
        } catch (Exception var2) {
        }
    }
}
