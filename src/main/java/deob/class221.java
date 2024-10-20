package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("iq")
public class class221 {

    @ObfuscatedName("iq.an")
    public static class538 field2393 = null;

    @ObfuscatedName("iq.ao")
    public static class538 field2397 = null;

    @ObfuscatedName("iq.af")
    public static class538 field2398 = null;

    public class221() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.ap(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2618(String arg0, String arg1, String arg2, int arg3, int arg4) throws IOException {
        if (arg1 != null && !arg1.isEmpty()) {
            arg0 = arg0 + "-" + arg1;
        }
        Statics.field2392 = arg4;
        Statics.field2067 = arg3;
        try {
            Statics.field3635 = System.getProperty("os.name");
        } catch (Exception var59) {
            Statics.field3635 = "Unknown";
        }
        Statics.field2128 = Statics.field3635.toLowerCase();
        Statics.field1965 = null;
        try {
            Statics.field1965 = System.getProperty("jagex.userhome");
        } catch (Exception var58) {
        }
        if (Statics.field1965 == null) {
            try {
                Statics.field1965 = System.getProperty("user.home");
            } catch (Exception var57) {
            }
        }
        if (Statics.field1965 != null) {
            Statics.field1965 = Statics.field1965 + "/";
        }
        try {
            if (Statics.field2128.startsWith("win")) {
                if (Statics.field1965 == null) {
                    Statics.field1965 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1965 == null) {
                Statics.field1965 = System.getenv("HOME");
            }
            if (Statics.field1965 != null) {
                Statics.field1965 = Statics.field1965 + "/";
            }
        } catch (Exception var56) {
        }
        if (Statics.field1965 == null) {
            Statics.field1965 = "~/";
        }
        Statics.field1741 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1965, "/tmp/", "" };
        Statics.field2114 = new String[] { ".jagex_cache_" + Statics.field2067, ".file_store_" + Statics.field2067 };
        int var9 = 0;
        label246: while (var9 < 4) {
            String var10 = var9 == 0 ? "" : "" + var9;
            Statics.field1709 = new File(Statics.field1965, "jagex_cl_" + arg0 + "_" + arg2 + var10 + ".dat");
            String var11 = null;
            String var12 = null;
            boolean var13 = false;
            if (Statics.field1709.exists()) {
                try {
                    class537 var14 = new class537(Statics.field1709, "rw", 10000L);
                    class558 var15 = new class558((int) var14.method9031());
                    while (var15.field5462 < var15.field5463.length) {
                        int var16 = var14.method9032(var15.field5463, var15.field5462, var15.field5463.length - var15.field5462);
                        if (var16 == -1) {
                            throw new IOException();
                        }
                        var15.field5462 += var16;
                    }
                    var15.field5462 = 0;
                    int var17 = var15.method9258();
                    if (var17 < 1 || var17 > 3) {
                        throw new IOException("" + var17);
                    }
                    int var18 = 0;
                    if (var17 > 1) {
                        var18 = var15.method9258();
                    }
                    if (var17 <= 2) {
                        var11 = var15.method9270();
                        if (var18 == 1) {
                            var12 = var15.method9270();
                        }
                    } else {
                        var11 = var15.method9271();
                        if (var18 == 1) {
                            var12 = var15.method9271();
                        }
                    }
                    var14.method9027();
                } catch (IOException var61) {
                    var61.printStackTrace();
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
                    } catch (Exception var55) {
                        var24 = false;
                    }
                    if (!var24) {
                        var11 = null;
                    }
                }
            }
            if (var11 == null && var9 == 0) {
                label220: for (int var26 = 0; var26 < Statics.field2114.length; var26++) {
                    for (int var27 = 0; var27 < Statics.field1741.length; var27++) {
                        File var28 = new File(Statics.field1741[var27] + Statics.field2114[var26] + File.separatorChar + arg0 + File.separatorChar);
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
                            } catch (Exception var54) {
                                var32 = false;
                            }
                            if (var32) {
                                var11 = var28.toString();
                                var13 = true;
                                break label220;
                            }
                        }
                    }
                }
            }
            if (var11 == null) {
                var11 = Statics.field1965 + File.separatorChar + "jagexcache" + var10 + File.separatorChar + arg0 + File.separatorChar + arg2 + File.separatorChar;
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
                } catch (Exception var60) {
                    var60.printStackTrace();
                }
                var13 = true;
            }
            if (var13) {
                method2667(new File(var11), (File) null);
            }
            File var43 = new File(var11);
            Statics.field2391 = var43;
            if (!Statics.field2391.exists()) {
                Statics.field2391.mkdirs();
            }
            File[] var44 = Statics.field2391.listFiles();
            if (var44 != null) {
                File[] var45 = var44;
                for (int var46 = 0; var46 < var45.length; var46++) {
                    File var47 = var45[var46];
                    boolean var50;
                    try {
                        RandomAccessFile var48 = new RandomAccessFile(var47, "rw");
                        int var49 = var48.read();
                        var48.seek(0L);
                        var48.write(var49);
                        var48.seek(0L);
                        var48.close();
                        var50 = true;
                    } catch (Exception var53) {
                        var50 = false;
                    }
                    if (!var50) {
                        var9++;
                        continue label246;
                    }
                }
            }
            break;
        }
        class223.method5968(Statics.field2391);
        method48();
        field2397 = new class538(new class537(class223.method2567("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2398 = new class538(new class537(class223.method2567("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1525 = new class538[Statics.field2392];
        for (int var52 = 0; var52 < Statics.field2392; var52++) {
            Statics.field1525[var52] = new class538(new class537(class223.method2567("main_file_cache.idx" + var52), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("de.aw(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2667(File arg0, File arg1) {
        try {
            class537 var2 = new class537(Statics.field1709, "rw", 10000L);
            class558 var3 = new class558(500);
            var3.method9241(3);
            var3.method9241(arg1 == null ? 0 : 1);
            var3.method9250(arg0.getPath());
            if (arg1 != null) {
                var3.method9250(arg1.getPath());
            }
            var2.method9029(var3.field5463, 0, var3.field5462);
            var2.method9027();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("rr.ak(Ljava/lang/String;Ljava/lang/String;ZB)Lun;")
    public static class537 method8260(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2391, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class537(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2067 == 33) {
            var6 = "_rc";
        } else if (Statics.field2067 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1965, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class537(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class537(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ae.aj(I)V")
    public static void method48() {
        try {
            File var0 = new File(Statics.field1965, "random.dat");
            if (var0.exists()) {
                field2393 = new class538(new class537(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2114.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1741.length; var2++) {
                        File var3 = new File(Statics.field1741[var2] + Statics.field2114[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2393 = new class538(new class537(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2393 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2393 = new class538(new class537(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("aw.ai(B)[B")
    public static byte[] method5() {
        byte[] var0 = new byte[24];
        try {
            field2393.method9062(0L);
            field2393.method9051(var0);
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

    @ObfuscatedName("db.ay(Lvl;II)V")
    public static void method2502(class558 arg0, int arg1) {
        if (field2393 == null) {
            return;
        }
        try {
            field2393.method9062(0L);
            field2393.method9054(arg0.field5463, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ar.as(I)V")
    public static void method175() {
        try {
            field2397.method9074();
            for (int var0 = 0; var0 < Statics.field2392; var0++) {
                Statics.field1525[var0].method9074();
            }
            field2398.method9074();
            field2393.method9074();
        } catch (Exception var2) {
        }
    }
}
