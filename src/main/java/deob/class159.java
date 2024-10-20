package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fg")
public class class159 {

    @ObfuscatedName("fg.v")
    public static class428 field1764 = null;

    @ObfuscatedName("fg.h")
    public static class428 field1767 = null;

    @ObfuscatedName("fg.t")
    public static class428 field1768 = null;

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.c(Ljava/lang/String;Ljava/lang/String;IIS)V")
    public static void method635(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1763 = arg3;
        Statics.field1720 = arg2;
        try {
            Statics.field1535 = System.getProperty("os.name");
        } catch (Exception var69) {
            Statics.field1535 = "Unknown";
        }
        Statics.field1023 = Statics.field1535.toLowerCase();
        try {
            Statics.field1772 = System.getProperty("user.home");
            if (Statics.field1772 != null) {
                Statics.field1772 = Statics.field1772 + "/";
            }
        } catch (Exception var68) {
        }
        try {
            if (Statics.field1023.startsWith("win")) {
                if (Statics.field1772 == null) {
                    Statics.field1772 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1772 == null) {
                Statics.field1772 = System.getenv("HOME");
            }
            if (Statics.field1772 != null) {
                Statics.field1772 = Statics.field1772 + "/";
            }
        } catch (Exception var67) {
        }
        if (Statics.field1772 == null) {
            Statics.field1772 = "~/";
        }
        Statics.field1769 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1772, "/tmp/", "" };
        Statics.field1771 = new String[] { ".jagex_cache_" + Statics.field1720, ".file_store_" + Statics.field1720 };
        int var7 = 0;
        label280: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field1762 = new File(Statics.field1772, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field1762.exists()) {
                try {
                    class427 var12 = new class427(Statics.field1762, "rw", 10000L);
                    class445 var13 = new class445((int) var12.method6976());
                    while (var13.field4735 < var13.field4733.length) {
                        int var14 = var12.method6977(var13.field4733, var13.field4735, var13.field4733.length - var13.field4735);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field4735 += var14;
                    }
                    var13.field4735 = 0;
                    int var15 = var13.method7196();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method7196();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method7207();
                        if (var16 == 1) {
                            var10 = var13.method7207();
                        }
                    } else {
                        var9 = var13.method7419();
                        if (var16 == 1) {
                            var10 = var13.method7419();
                        }
                    }
                    var12.method6991();
                } catch (IOException var72) {
                    var72.printStackTrace();
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
                    } catch (Exception var66) {
                        var22 = false;
                    }
                    if (!var22) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label255: for (int var24 = 0; var24 < Statics.field1771.length; var24++) {
                    for (int var25 = 0; var25 < Statics.field1769.length; var25++) {
                        File var26 = new File(Statics.field1769[var25] + Statics.field1771[var24] + File.separatorChar + arg0 + File.separatorChar);
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
                            } catch (Exception var65) {
                                var30 = false;
                            }
                            if (var30) {
                                var9 = var26.toString();
                                var11 = true;
                                break label255;
                            }
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1772 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var71) {
                    var71.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var41 = new File(var9);
                Object var42 = null;
                try {
                    class427 var43 = new class427(Statics.field1762, "rw", 10000L);
                    class445 var44 = new class445(500);
                    var44.method7179(3);
                    var44.method7179(var42 == null ? 0 : 1);
                    var44.method7188(var41.getPath());
                    if (var42 != null) {
                        var44.method7188(((File) var42).getPath());
                    }
                    var43.method6973(var44.field4733, 0, var44.field4735);
                    var43.method6991();
                } catch (IOException var64) {
                    var64.printStackTrace();
                }
            }
            File var46 = new File(var9);
            Statics.field1766 = var46;
            if (!Statics.field1766.exists()) {
                Statics.field1766.mkdirs();
            }
            File[] var47 = Statics.field1766.listFiles();
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
                    } catch (Exception var63) {
                        var53 = false;
                    }
                    if (!var53) {
                        var7++;
                        continue label280;
                    }
                }
            }
            break;
        }
        class161.method2220(Statics.field1766);
        try {
            File var55 = new File(Statics.field1772, "random.dat");
            if (var55.exists()) {
                field1764 = new class428(new class427(var55, "rw", 25L), 24, 0);
            } else {
                label206: for (int var56 = 0; var56 < Statics.field1771.length; var56++) {
                    for (int var57 = 0; var57 < Statics.field1769.length; var57++) {
                        File var58 = new File(Statics.field1769[var57] + Statics.field1771[var56] + File.separatorChar + "random.dat");
                        if (var58.exists()) {
                            field1764 = new class428(new class427(var58, "rw", 25L), 24, 0);
                            break label206;
                        }
                    }
                }
            }
            if (field1764 == null) {
                RandomAccessFile var59 = new RandomAccessFile(var55, "rw");
                int var60 = var59.read();
                var59.seek(0L);
                var59.write(var60);
                var59.seek(0L);
                var59.close();
                field1764 = new class428(new class427(var55, "rw", 25L), 24, 0);
            }
        } catch (IOException var70) {
        }
        field1767 = new class428(new class427(class161.method311("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1768 = new class428(new class427(class161.method311("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1761 = new class428[Statics.field1763];
        for (int var62 = 0; var62 < Statics.field1763; var62++) {
            Statics.field1761[var62] = new class428(new class427(class161.method311("main_file_cache.idx" + var62), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("hj.p(Ljava/lang/String;Ljava/lang/String;ZI)Lpk;")
    public static class427 method4267(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1766, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class427(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1720 == 33) {
            var6 = "_rc";
        } else if (Statics.field1720 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1772, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class427(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class427(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("by.f(Lqq;II)V")
    public static void method1103(class445 arg0, int arg1) {
        if (field1764 == null) {
            return;
        }
        try {
            field1764.method6996(0L);
            field1764.method7001(arg0.field4733, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
