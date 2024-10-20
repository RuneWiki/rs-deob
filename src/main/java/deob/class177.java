package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fn")
public class class177 {

    @ObfuscatedName("fn.d")
    public static class352 field2093 = null;

    @ObfuscatedName("fn.h")
    public static class352 field2091 = null;

    @ObfuscatedName("fn.a")
    public static class352 field2083 = null;

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cc.z(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method1962(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field4041 = arg3;
        Statics.field1464 = arg2;
        try {
            Statics.field278 = System.getProperty("os.name");
        } catch (Exception var62) {
            Statics.field278 = "Unknown";
        }
        Statics.field2095 = Statics.field278.toLowerCase();
        try {
            Statics.field3852 = System.getProperty("user.home");
            if (Statics.field3852 != null) {
                Statics.field3852 = Statics.field3852 + "/";
            }
        } catch (Exception var61) {
        }
        try {
            if (Statics.field2095.startsWith("win")) {
                if (Statics.field3852 == null) {
                    Statics.field3852 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field3852 == null) {
                Statics.field3852 = System.getenv("HOME");
            }
            if (Statics.field3852 != null) {
                Statics.field3852 = Statics.field3852 + "/";
            }
        } catch (Exception var60) {
        }
        if (Statics.field3852 == null) {
            Statics.field3852 = "~/";
        }
        Statics.field2006 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3852, "/tmp/", "" };
        Statics.field571 = new String[] { ".jagex_cache_" + Statics.field1464, ".file_store_" + Statics.field1464 };
        int var7 = 0;
        label244: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2086 = new File(Statics.field3852, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2086.exists()) {
                try {
                    class353 var12 = new class353(Statics.field2086, "rw", 10000L);
                    class310 var13 = new class310((int) var12.method6206());
                    while (var13.field3734 < var13.field3731.length) {
                        int var14 = var12.method6194(var13.field3731, var13.field3734, var13.field3731.length - var13.field3734);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field3734 += var14;
                    }
                    var13.field3734 = 0;
                    int var15 = var13.method5193();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method5193();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method5366();
                        if (var16 == 1) {
                            var10 = var13.method5366();
                        }
                    } else {
                        var9 = var13.method5204();
                        if (var16 == 1) {
                            var10 = var13.method5204();
                        }
                    }
                    var12.method6189();
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
                label219: for (int var24 = 0; var24 < Statics.field571.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field2006.length; var25++) {
                        File var26 = new File(Statics.field2006[var25] + Statics.field571[var24] + File.separatorChar + arg0 + File.separatorChar);
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
                var9 = Statics.field3852 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                    class353 var43 = new class353(Statics.field2086, "rw", 10000L);
                    class310 var44 = new class310(500);
                    var44.method5177(3);
                    var44.method5177(var42 == null ? 0 : 1);
                    var44.method5185(var41.getPath());
                    if (var42 != null) {
                        var44.method5185(((File) var42).getPath());
                    }
                    var43.method6191(var44.field3731, 0, var44.field3734);
                    var43.method6189();
                } catch (IOException var57) {
                    var57.printStackTrace();
                }
            }
            File var46 = new File(var9);
            Statics.field2087 = var46;
            if (!Statics.field2087.exists()) {
                Statics.field2087.mkdirs();
            }
            File[] var47 = Statics.field2087.listFiles();
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
        class179.method332(Statics.field2087);
        method1920();
        field2091 = new class352(new class353(class179.method566("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2083 = new class352(new class353(class179.method566("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2094 = new class352[Statics.field4041];
        for (int var55 = 0; var55 < Statics.field4041; var55++) {
            Statics.field2094[var55] = new class352(new class353(class179.method566("main_file_cache.idx" + var55), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("s.k(Ljava/lang/String;Ljava/lang/String;ZI)Lmy;")
    public static class353 method21(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2087, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class353(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1464 == 33) {
            var6 = "_rc";
        } else if (Statics.field1464 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3852, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class353(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class353(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cm.s(B)V")
    public static void method1920() {
        try {
            File var0 = new File(Statics.field3852, "random.dat");
            if (var0.exists()) {
                field2093 = new class352(new class353(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field571.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2006.length; var2++) {
                        File var3 = new File(Statics.field2006[var2] + Statics.field571[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2093 = new class352(new class353(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2093 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2093 = new class352(new class353(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
