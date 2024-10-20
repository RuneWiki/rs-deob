package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fp")
public class class177 {

    @ObfuscatedName("fp.o")
    public static class353 field2077 = null;

    @ObfuscatedName("fp.n")
    public static class353 field2080 = null;

    @ObfuscatedName("fp.x")
    public static class353 field2079 = null;

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hz.f(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3686(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field3675 = arg3;
        Statics.field3626 = arg2;
        try {
            Statics.field643 = System.getProperty("os.name");
        } catch (Exception var56) {
            Statics.field643 = "Unknown";
        }
        Statics.field618 = Statics.field643.toLowerCase();
        try {
            Statics.field408 = System.getProperty("user.home");
            if (Statics.field408 != null) {
                Statics.field408 = Statics.field408 + "/";
            }
        } catch (Exception var55) {
        }
        try {
            if (Statics.field618.startsWith("win")) {
                if (Statics.field408 == null) {
                    Statics.field408 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field408 == null) {
                Statics.field408 = System.getenv("HOME");
            }
            if (Statics.field408 != null) {
                Statics.field408 = Statics.field408 + "/";
            }
        } catch (Exception var54) {
        }
        if (Statics.field408 == null) {
            Statics.field408 = "~/";
        }
        Statics.field69 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field408, "/tmp/", "" };
        Statics.field958 = new String[] { ".jagex_cache_" + Statics.field3626, ".file_store_" + Statics.field3626 };
        int var7 = 0;
        label229: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field3569 = new File(Statics.field408, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field3569.exists()) {
                try {
                    class354 var12 = new class354(Statics.field3569, "rw", 10000L);
                    class311 var13 = new class311((int) var12.method6195());
                    while (var13.field3741 < var13.field3742.length) {
                        int var14 = var12.method6190(var13.field3742, var13.field3741, var13.field3742.length - var13.field3741);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field3741 += var14;
                    }
                    var13.field3741 = 0;
                    int var15 = var13.method5276();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method5276();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method5190();
                        if (var16 == 1) {
                            var10 = var13.method5190();
                        }
                    } else {
                        var9 = var13.method5191();
                        if (var16 == 1) {
                            var10 = var13.method5191();
                        }
                    }
                    var12.method6181();
                } catch (IOException var58) {
                    var58.printStackTrace();
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
                    } catch (Exception var53) {
                        var22 = false;
                    }
                    if (!var22) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label204: for (int var24 = 0; var24 < Statics.field958.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field69.length; var25++) {
                        File var26 = new File(Statics.field69[var25] + Statics.field958[var24] + File.separatorChar + arg0 + File.separatorChar);
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
                            } catch (Exception var52) {
                                var30 = false;
                            }
                            if (var30) {
                                var9 = var26.toString();
                                var11 = true;
                                break label204;
                            }
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field408 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var57) {
                    var57.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method1078(new File(var9), (File) null);
            }
            File var41 = new File(var9);
            Statics.field2074 = var41;
            if (!Statics.field2074.exists()) {
                Statics.field2074.mkdirs();
            }
            File[] var42 = Statics.field2074.listFiles();
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
                    } catch (Exception var51) {
                        var48 = false;
                    }
                    if (!var48) {
                        var7++;
                        continue label229;
                    }
                }
            }
            break;
        }
        class179.method1018(Statics.field2074);
        method3422();
        field2080 = new class353(new class354(class179.method3253("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2079 = new class353(new class354(class179.method3253("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2081 = new class353[Statics.field3675];
        for (int var50 = 0; var50 < Statics.field3675; var50++) {
            Statics.field2081[var50] = new class353(new class354(class179.method3253("main_file_cache.idx" + var50), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("by.b(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1078(File arg0, File arg1) {
        try {
            class354 var2 = new class354(Statics.field3569, "rw", 10000L);
            class311 var3 = new class311(500);
            var3.method5203(3);
            var3.method5203(arg1 == null ? 0 : 1);
            var3.method5172(arg0.getPath());
            if (arg1 != null) {
                var3.method5172(arg1.getPath());
            }
            var2.method6199(var3.field3742, 0, var3.field3741);
            var2.method6181();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("aq.l(Ljava/lang/String;Ljava/lang/String;ZB)Lmr;")
    public static class354 method592(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2074, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class354(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3626 == 33) {
            var6 = "_rc";
        } else if (Statics.field3626 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field408, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class354(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class354(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gz.m(I)V")
    public static void method3422() {
        try {
            File var0 = new File(Statics.field408, "random.dat");
            if (var0.exists()) {
                field2077 = new class353(new class354(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field958.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field69.length; var2++) {
                        File var3 = new File(Statics.field69[var2] + Statics.field958[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2077 = new class353(new class354(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2077 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2077 = new class353(new class354(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("cq.z(B)[B")
    public static byte[] method1979() {
        byte[] var0 = new byte[24];
        try {
            field2077.method6155(0L);
            field2077.method6157(var0);
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

    @ObfuscatedName("fo.q(Lkb;IB)V")
    public static void method3217(class311 arg0, int arg1) {
        if (field2077 == null) {
            return;
        }
        try {
            field2077.method6155(0L);
            field2077.method6160(arg0.field3742, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bs.k(I)V")
    public static void method1111() {
        try {
            field2080.method6154();
            for (int var0 = 0; var0 < Statics.field3675; var0++) {
                Statics.field2081[var0].method6154();
            }
            field2079.method6154();
            field2077.method6154();
        } catch (Exception var2) {
        }
    }
}
