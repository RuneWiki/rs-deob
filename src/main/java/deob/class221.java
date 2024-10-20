package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("il")
public class class221 {

    @ObfuscatedName("il.ad")
    public static class531 field2386 = null;

    @ObfuscatedName("il.ah")
    public static class531 field2387 = null;

    @ObfuscatedName("il.ap")
    public static class531 field2388 = null;

    public class221() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ls.ac(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method5611(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field1884 = arg4;
        Statics.field5081 = arg3;
        try {
            Statics.field2367 = System.getProperty("os.name");
        } catch (Exception var72) {
            Statics.field2367 = "Unknown";
        }
        Statics.field1926 = Statics.field2367.toLowerCase();
        Statics.field2390 = null;
        try {
            Statics.field2390 = System.getProperty("jagex.userhome");
        } catch (Exception var71) {
        }
        if (Statics.field2390 == null) {
            try {
                Statics.field2390 = System.getProperty("user.home");
            } catch (Exception var70) {
            }
        }
        if (Statics.field2390 != null) {
            Statics.field2390 = Statics.field2390 + "/";
        }
        try {
            if (Statics.field1926.startsWith("win")) {
                if (Statics.field2390 == null) {
                    Statics.field2390 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2390 == null) {
                Statics.field2390 = System.getenv("HOME");
            }
            if (Statics.field2390 != null) {
                Statics.field2390 = Statics.field2390 + "/";
            }
        } catch (Exception var69) {
        }
        if (Statics.field2390 == null) {
            Statics.field2390 = "~/";
        }
        Statics.field2166 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2390, "/tmp/", "" };
        Statics.field5500 = new String[] { ".jagex_cache_" + Statics.field5081, ".file_store_" + Statics.field5081 };
        int var9 = 0;
        label297: while (var9 < 4) {
            String var10 = var9 == 0 ? "" : "" + var9;
            Statics.field2392 = new File(Statics.field2390, "jagex_cl_" + arg0 + "_" + arg2 + var10 + ".dat");
            String var11 = null;
            String var12 = null;
            boolean var13 = false;
            if (Statics.field2392.exists()) {
                try {
                    class530 var14 = new class530(Statics.field2392, "rw", 10000L);
                    class551 var15 = new class551((int) var14.method8727());
                    while (var15.field5415 < var15.field5413.length) {
                        int var16 = var14.method8728(var15.field5413, var15.field5415, var15.field5413.length - var15.field5415);
                        if (var16 == -1) {
                            throw new IOException();
                        }
                        var15.field5415 += var16;
                    }
                    var15.field5415 = 0;
                    int var17 = var15.method8955();
                    if (var17 < 1 || var17 > 3) {
                        throw new IOException("" + var17);
                    }
                    int var18 = 0;
                    if (var17 > 1) {
                        var18 = var15.method8955();
                    }
                    if (var17 <= 2) {
                        var11 = var15.method8985();
                        if (var18 == 1) {
                            var12 = var15.method8985();
                        }
                    } else {
                        var11 = var15.method8986();
                        if (var18 == 1) {
                            var12 = var15.method8986();
                        }
                    }
                    var14.method8725();
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
                label271: for (int var26 = 0; var26 < Statics.field5500.length; var26++) {
                    for (int var27 = 0; var27 < Statics.field2166.length; var27++) {
                        File var28 = new File(Statics.field2166[var27] + Statics.field5500[var26] + File.separatorChar + arg0 + File.separatorChar);
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
                var11 = Statics.field2390 + File.separatorChar + "jagexcache" + var10 + File.separatorChar + arg0 + File.separatorChar + arg2 + File.separatorChar;
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
                    class530 var45 = new class530(Statics.field2392, "rw", 10000L);
                    class551 var46 = new class551(500);
                    var46.method9022(3);
                    var46.method9022(var44 == null ? 0 : 1);
                    var46.method8984(var43.getPath());
                    if (var44 != null) {
                        var46.method8984(((File) var44).getPath());
                    }
                    var45.method8732(var46.field5413, 0, var46.field5415);
                    var45.method8725();
                } catch (IOException var66) {
                    var66.printStackTrace();
                }
            }
            File var48 = new File(var11);
            Statics.field1875 = var48;
            if (!Statics.field1875.exists()) {
                Statics.field1875.mkdirs();
            }
            File[] var49 = Statics.field1875.listFiles();
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
        class223.method196(Statics.field1875);
        try {
            File var57 = new File(Statics.field2390, "random.dat");
            if (var57.exists()) {
                field2386 = new class531(new class530(var57, "rw", 25L), 24, 0);
            } else {
                label222: for (int var58 = 0; var58 < Statics.field5500.length; var58++) {
                    for (int var59 = 0; var59 < Statics.field2166.length; var59++) {
                        File var60 = new File(Statics.field2166[var59] + Statics.field5500[var58] + File.separatorChar + "random.dat");
                        if (var60.exists()) {
                            field2386 = new class531(new class530(var60, "rw", 25L), 24, 0);
                            break label222;
                        }
                    }
                }
            }
            if (field2386 == null) {
                RandomAccessFile var61 = new RandomAccessFile(var57, "rw");
                int var62 = var61.read();
                var61.seek(0L);
                var61.write(var62);
                var61.seek(0L);
                var61.close();
                field2386 = new class531(new class530(var57, "rw", 25L), 24, 0);
            }
        } catch (IOException var73) {
        }
        field2387 = new class531(new class530(class223.method5150("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2388 = new class531(new class530(class223.method5150("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2351 = new class531[Statics.field1884];
        for (int var64 = 0; var64 < Statics.field1884; var64++) {
            Statics.field2351[var64] = new class531(new class530(class223.method5150("main_file_cache.idx" + var64), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("oh.ae(Ljava/lang/String;Ljava/lang/String;ZB)Lud;")
    public static class530 method6707(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1875, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class530(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field5081 == 33) {
            var6 = "_rc";
        } else if (Statics.field5081 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2390, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class530(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class530(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hs.ag(Lvf;IS)V")
    public static void method3786(class551 arg0, int arg1) {
        if (field2386 == null) {
            return;
        }
        try {
            field2386.method8749(0L);
            field2386.method8766(arg0.field5413, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ec.am(B)V")
    public static void method3067() {
        try {
            field2387.method8770();
            for (int var0 = 0; var0 < Statics.field1884; var0++) {
                Statics.field2351[var0].method8770();
            }
            field2388.method8770();
            field2386.method8770();
        } catch (Exception var2) {
        }
    }
}
