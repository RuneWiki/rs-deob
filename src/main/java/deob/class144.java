package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eg")
public class class144 {

    @ObfuscatedName("eg.w")
    public static class386 field1564 = null;

    @ObfuscatedName("eg.g")
    public static class386 field1557 = null;

    @ObfuscatedName("eg.v")
    public static class386 field1566 = null;

    public class144() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.l(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2374(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field4026 = arg3;
        Statics.field1344 = arg2;
        try {
            Statics.field1280 = System.getProperty("os.name");
        } catch (Exception var64) {
            Statics.field1280 = "Unknown";
        }
        Statics.field70 = Statics.field1280.toLowerCase();
        try {
            Statics.field3258 = System.getProperty("user.home");
            if (Statics.field3258 != null) {
                Statics.field3258 = Statics.field3258 + "/";
            }
        } catch (Exception var63) {
        }
        try {
            if (Statics.field70.startsWith("win")) {
                if (Statics.field3258 == null) {
                    Statics.field3258 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field3258 == null) {
                Statics.field3258 = System.getenv("HOME");
            }
            if (Statics.field3258 != null) {
                Statics.field3258 = Statics.field3258 + "/";
            }
        } catch (Exception var62) {
        }
        if (Statics.field3258 == null) {
            Statics.field3258 = "~/";
        }
        Statics.field4282 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3258, "/tmp/", "" };
        Statics.field1232 = new String[] { ".jagex_cache_" + Statics.field1344, ".file_store_" + Statics.field1344 };
        int var7 = 0;
        label269: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1559 = new File(Statics.field3258, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1559.exists()) {
                try {
                    class385 var12 = new class385(Statics.field1559, "rw", 10000L);
                    class401 var13 = new class401((int) var12.method6100());
                    while (var13.field4292 < var13.field4294.length) {
                        int var14 = var12.method6096(var13.field4294, var13.field4292, var13.field4294.length - var13.field4292);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field4292 += var14;
                    }
                    var13.field4292 = 0;
                    int var15 = var13.method6272();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method6272();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method6282();
                        if (var16 == 1) {
                            var10 = var13.method6282();
                        }
                    } else {
                        var9 = var13.method6283();
                        if (var16 == 1) {
                            var10 = var13.method6283();
                        }
                    }
                    var12.method6092();
                } catch (IOException var67) {
                    var67.printStackTrace();
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
                    } catch (Exception var61) {
                        var22 = false;
                    }
                    if (!var22) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label244: for (int var24 = 0; var24 < Statics.field1232.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field4282.length; var25++) {
                        File var26 = new File(Statics.field4282[var25] + Statics.field1232[var24] + File.separatorChar + arg0 + File.separatorChar);
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
                            } catch (Exception var60) {
                                var30 = false;
                            }
                            if (var30) {
                                var9 = var26.toString();
                                var11 = true;
                                break label244;
                            }
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field3258 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var66) {
                    var66.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method2760(new File(var9), (File) null);
            }
            File var41 = new File(var9);
            Statics.field1560 = var41;
            if (!Statics.field1560.exists()) {
                Statics.field1560.mkdirs();
            }
            File[] var42 = Statics.field1560.listFiles();
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
                    } catch (Exception var59) {
                        var48 = false;
                    }
                    if (!var48) {
                        var7++;
                        continue label269;
                    }
                }
            }
            break;
        }
        File var50 = Statics.field1560;
        Statics.field1569 = var50;
        if (!Statics.field1569.exists()) {
            throw new RuntimeException("");
        }
        class146.field1568 = true;
        try {
            File var51 = new File(Statics.field3258, "random.dat");
            if (var51.exists()) {
                field1564 = new class386(new class385(var51, "rw", 25L), 24, 0);
            } else {
                label193: for (int var52 = 0; var52 < Statics.field1232.length; var52++) {
                    for (int var53 = 0; var53 < Statics.field4282.length; var53++) {
                        File var54 = new File(Statics.field4282[var53] + Statics.field1232[var52] + File.separatorChar + "random.dat");
                        if (var54.exists()) {
                            field1564 = new class386(new class385(var54, "rw", 25L), 24, 0);
                            break label193;
                        }
                    }
                }
            }
            if (field1564 == null) {
                RandomAccessFile var55 = new RandomAccessFile(var51, "rw");
                int var56 = var55.read();
                var55.seek(0L);
                var55.write(var56);
                var55.seek(0L);
                var55.close();
                field1564 = new class386(new class385(var51, "rw", 25L), 24, 0);
            }
        } catch (IOException var65) {
        }
        field1557 = new class386(new class385(class146.method2508("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1566 = new class386(new class385(class146.method2508("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1565 = new class386[Statics.field4026];
        for (int var58 = 0; var58 < Statics.field4026; var58++) {
            Statics.field1565[var58] = new class386(new class385(class146.method2508("main_file_cache.idx" + var58), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("fb.q(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2760(File arg0, File arg1) {
        try {
            class385 var2 = new class385(Statics.field1559, "rw", 10000L);
            class401 var3 = new class401(500);
            var3.method6269(3);
            var3.method6269(arg1 == null ? 0 : 1);
            var3.method6264(arg0.getPath());
            if (arg1 != null) {
                var3.method6264(arg1.getPath());
            }
            var2.method6094(var3.field4294, 0, var3.field4292);
            var2.method6092();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("bc.f(Ljava/lang/String;Ljava/lang/String;ZB)Lnj;")
    public static class385 method1543(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1560, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class385(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1344 == 33) {
            var6 = "_rc";
        } else if (Statics.field1344 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3258, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class385(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class385(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ma.j(Lot;IB)V")
    public static void method5710(class401 arg0, int arg1) {
        if (field1564 == null) {
            return;
        }
        try {
            field1564.method6115(0L);
            field1564.method6124(arg0.field4294, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
