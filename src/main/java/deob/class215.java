package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("in")
public class class215 {

    @ObfuscatedName("in.al")
    public static class529 field2355 = null;

    @ObfuscatedName("in.aj")
    public static class529 field2356 = null;

    @ObfuscatedName("in.as")
    public static class529 field2350 = null;

    public class215() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.ab(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2341(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field2353 = arg4;
        Statics.field5287 = arg3;
        try {
            Statics.field4787 = System.getProperty("os.name");
        } catch (Exception var72) {
            Statics.field4787 = "Unknown";
        }
        Statics.field1556 = Statics.field4787.toLowerCase();
        Statics.field3035 = null;
        try {
            Statics.field3035 = System.getProperty("jagex.userhome");
        } catch (Exception var71) {
        }
        if (Statics.field3035 == null) {
            try {
                Statics.field3035 = System.getProperty("user.home");
            } catch (Exception var70) {
            }
        }
        if (Statics.field3035 != null) {
            Statics.field3035 = Statics.field3035 + "/";
        }
        try {
            if (Statics.field1556.startsWith("win")) {
                if (Statics.field3035 == null) {
                    Statics.field3035 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field3035 == null) {
                Statics.field3035 = System.getenv("HOME");
            }
            if (Statics.field3035 != null) {
                Statics.field3035 = Statics.field3035 + "/";
            }
        } catch (Exception var69) {
        }
        if (Statics.field3035 == null) {
            Statics.field3035 = "~/";
        }
        Statics.field1626 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3035, "/tmp/", "" };
        Statics.field2360 = new String[] { ".jagex_cache_" + Statics.field5287, ".file_store_" + Statics.field5287 };
        int var9 = 0;
        label297: while (var9 < 4) {
            String var10 = var9 == 0 ? "" : "" + var9;
            Statics.field2358 = new File(Statics.field3035, "jagex_cl_" + arg0 + "_" + arg2 + var10 + ".dat");
            String var11 = null;
            String var12 = null;
            boolean var13 = false;
            if (Statics.field2358.exists()) {
                try {
                    class528 var14 = new class528(Statics.field2358, "rw", 10000L);
                    class549 var15 = new class549((int) var14.method8578());
                    while (var15.field5378 < var15.field5381.length) {
                        int var16 = var14.method8594(var15.field5381, var15.field5378, var15.field5381.length - var15.field5378);
                        if (var16 == -1) {
                            throw new IOException();
                        }
                        var15.field5378 += var16;
                    }
                    var15.field5378 = 0;
                    int var17 = var15.method9025();
                    if (var17 < 1 || var17 > 3) {
                        throw new IOException("" + var17);
                    }
                    int var18 = 0;
                    if (var17 > 1) {
                        var18 = var15.method9025();
                    }
                    if (var17 <= 2) {
                        var11 = var15.method8827();
                        if (var18 == 1) {
                            var12 = var15.method8827();
                        }
                    } else {
                        var11 = var15.method9036();
                        if (var18 == 1) {
                            var12 = var15.method9036();
                        }
                    }
                    var14.method8576();
                } catch (IOException var75) {
                    var75.printStackTrace();
                }
                if (var11 != null) {
                    File var20 = new File(var11);
                    if (!var20.exists()) {
                        var11 = null;
                    }
                }
                if (var11 != null) {
                    File var21 = new File(var11, "test.dat");
                    boolean var24;
                    try {
                        RandomAccessFile var22 = new RandomAccessFile(var21, "rw");
                        int var23 = var22.read();
                        var22.seek(0L);
                        var22.write(var23);
                        var22.seek(0L);
                        var22.close();
                        var21.delete();
                        var24 = true;
                    } catch (Exception var68) {
                        var24 = false;
                    }
                    if (!var24) {
                        var11 = null;
                    }
                }
            }
            if (var11 == null && var9 == 0) {
                label271: for (int var26 = 0; var26 < Statics.field2360.length; var26++) {
                    for (int var27 = 0; var27 < Statics.field1626.length; var27++) {
                        File var28 = new File(Statics.field1626[var27] + Statics.field2360[var26] + File.separatorChar + arg0 + File.separatorChar);
                        if (var28.exists()) {
                            File var29 = new File(var28, "test.dat");
                            boolean var32;
                            try {
                                RandomAccessFile var30 = new RandomAccessFile(var29, "rw");
                                int var31 = var30.read();
                                var30.seek(0L);
                                var30.write(var31);
                                var30.seek(0L);
                                var30.close();
                                var29.delete();
                                var32 = true;
                            } catch (Exception var67) {
                                var32 = false;
                            }
                            if (var32) {
                                var11 = var28.toString();
                                var13 = true;
                                break label271;
                            }
                        }
                    }
                }
            }
            if (var11 == null) {
                var11 = Statics.field3035 + File.separatorChar + "jagexcache" + var10 + File.separatorChar + arg0 + File.separatorChar + arg2 + File.separatorChar;
                var13 = true;
            }
            if (var12 != null) {
                File var34 = new File(var12);
                File var35 = new File(var11);
                try {
                    File[] var36 = var34.listFiles();
                    File[] var37 = var36;
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        File var39 = var37[var38];
                        File var40 = new File(var35, var39.getName());
                        boolean var41 = var39.renameTo(var40);
                        if (!var41) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var74) {
                    var74.printStackTrace();
                }
                var13 = true;
            }
            if (var13) {
                File var43 = new File(var11);
                Object var44 = null;
                try {
                    class528 var45 = new class528(Statics.field2358, "rw", 10000L);
                    class549 var46 = new class549(500);
                    var46.method8781(3);
                    var46.method8781(var44 == null ? 0 : 1);
                    var46.method8784(var43.getPath());
                    if (var44 != null) {
                        var46.method8784(((File) var44).getPath());
                    }
                    var45.method8588(var46.field5381, 0, var46.field5378);
                    var45.method8576();
                } catch (IOException var66) {
                    var66.printStackTrace();
                }
            }
            File var48 = new File(var11);
            Statics.field4675 = var48;
            if (!Statics.field4675.exists()) {
                Statics.field4675.mkdirs();
            }
            File[] var49 = Statics.field4675.listFiles();
            if (var49 != null) {
                File[] var50 = var49;
                for (int var51 = 0; var51 < var50.length; var51++) {
                    File var52 = var50[var51];
                    boolean var55;
                    try {
                        RandomAccessFile var53 = new RandomAccessFile(var52, "rw");
                        int var54 = var53.read();
                        var53.seek(0L);
                        var53.write(var54);
                        var53.seek(0L);
                        var53.close();
                        var55 = true;
                    } catch (Exception var65) {
                        var55 = false;
                    }
                    if (!var55) {
                        var9++;
                        continue label297;
                    }
                }
            }
            break;
        }
        class217.method3288(Statics.field4675);
        try {
            File var57 = new File(Statics.field3035, "random.dat");
            if (var57.exists()) {
                field2355 = new class529(new class528(var57, "rw", 25L), 24, 0);
            } else {
                label222: for (int var58 = 0; var58 < Statics.field2360.length; var58++) {
                    for (int var59 = 0; var59 < Statics.field1626.length; var59++) {
                        File var60 = new File(Statics.field1626[var59] + Statics.field2360[var58] + File.separatorChar + "random.dat");
                        if (var60.exists()) {
                            field2355 = new class529(new class528(var60, "rw", 25L), 24, 0);
                            break label222;
                        }
                    }
                }
            }
            if (field2355 == null) {
                RandomAccessFile var61 = new RandomAccessFile(var57, "rw");
                int var62 = var61.read();
                var61.seek(0L);
                var61.write(var62);
                var61.seek(0L);
                var61.close();
                field2355 = new class529(new class528(var57, "rw", 25L), 24, 0);
            }
        } catch (IOException var73) {
        }
        field2356 = new class529(new class528(class217.method3282("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2350 = new class529(new class528(class217.method3282("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1044 = new class529[Statics.field2353];
        for (int var64 = 0; var64 < Statics.field2353; var64++) {
            Statics.field1044[var64] = new class529(new class528(class217.method3282("main_file_cache.idx" + var64), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("eq.ay(Ljava/lang/String;Ljava/lang/String;ZB)Lum;")
    public static class528 method2850(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field4675, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class528(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field5287 == 33) {
            var6 = "_rc";
        } else if (Statics.field5287 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3035, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class528(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class528(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("kq.an(B)[B")
    public static byte[] method5077() {
        byte[] var0 = new byte[24];
        try {
            field2355.method8597(0L);
            field2355.method8599(var0);
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

    @ObfuscatedName("ht.au(I)V")
    public static void method4055() {
        try {
            field2356.method8596();
            for (int var0 = 0; var0 < Statics.field2353; var0++) {
                Statics.field1044[var0].method8596();
            }
            field2350.method8596();
            field2355.method8596();
        } catch (Exception var2) {
        }
    }
}
