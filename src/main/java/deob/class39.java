package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ad")
public class class39 {

    @ObfuscatedName("ad.v")
    public static class14 field518 = null;

    @ObfuscatedName("ad.f")
    public static class14 field530 = null;

    @ObfuscatedName("ad.s")
    public static class14 field529 = null;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.q(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method916(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field527 = arg3;
        Statics.field556 = arg2;
        try {
            Statics.field562 = System.getProperty("os.name");
        } catch (Exception var54) {
            Statics.field562 = "Unknown";
        }
        Statics.field2494 = Statics.field562.toLowerCase();
        try {
            Statics.field821 = System.getProperty("user.home");
            if (Statics.field821 != null) {
                Statics.field821 = Statics.field821 + "/";
            }
        } catch (Exception var53) {
        }
        try {
            if (Statics.field2494.startsWith("win")) {
                if (Statics.field821 == null) {
                    Statics.field821 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field821 == null) {
                Statics.field821 = System.getenv("HOME");
            }
            if (Statics.field821 != null) {
                Statics.field821 = Statics.field821 + "/";
            }
        } catch (Exception var52) {
        }
        if (Statics.field821 == null) {
            Statics.field821 = "~/";
        }
        Statics.field712 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field821, "/tmp/", "" };
        Statics.field1234 = new String[] { ".jagex_cache_" + Statics.field556, ".file_store_" + Statics.field556 };
        int var7 = 0;
        label261: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field520 = new File(Statics.field821, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field520.exists()) {
                try {
                    class13 var12 = new class13(Statics.field520, "rw", 10000L);
                    class136 var13 = new class136((int) var12.method106());
                    while (var13.field1722 < var13.field1725.length) {
                        int var14 = var12.method107(var13.field1725, var13.field1722, var13.field1725.length - var13.field1722);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1722 += var14;
                    }
                    var13.field1722 = 0;
                    int var15 = var13.method1602();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method1602();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method1753();
                        if (var16 == 1) {
                            var10 = var13.method1753();
                        }
                    } else {
                        var9 = var13.method1670();
                        if (var16 == 1) {
                            var10 = var13.method1670();
                        }
                    }
                    var12.method105();
                } catch (IOException var57) {
                    var57.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method794(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label235: for (int var20 = 0; var20 < Statics.field1234.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field712.length; var21++) {
                        File var22 = new File(Statics.field712[var21] + Statics.field1234[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method794(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label235;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field821 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
                var11 = true;
            }
            if (var10 != null) {
                File var23 = new File(var10);
                File var24 = new File(var9);
                try {
                    File[] var25 = var23.listFiles();
                    File[] var26 = var25;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        File var28 = var26[var27];
                        File var29 = new File(var24, var28.getName());
                        boolean var30 = var28.renameTo(var29);
                        if (!var30) {
                            throw new IOException();
                        }
                    }
                } catch (Exception var56) {
                    var56.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class13 var34 = new class13(Statics.field520, "rw", 10000L);
                    class136 var35 = new class136(500);
                    var35.method1612(3);
                    var35.method1612(var33 == null ? 0 : 1);
                    var35.method1629(var32.getPath());
                    if (var33 != null) {
                        var35.method1629(((File) var33).getPath());
                    }
                    var34.method102(var35.field1725, 0, var35.field1722);
                    var34.method105();
                } catch (IOException var51) {
                    var51.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field521 = var37;
            if (!Statics.field521.exists()) {
                Statics.field521.mkdirs();
            }
            File[] var38 = Statics.field521.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method794(var41, false)) {
                        var7++;
                        continue label261;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field521;
        Statics.field376 = var42;
        if (!Statics.field376.exists()) {
            throw new RuntimeException("");
        }
        class34.field377 = true;
        try {
            File var43 = new File(Statics.field821, "random.dat");
            if (var43.exists()) {
                field518 = new class14(new class13(var43, "rw", 25L), 24, 0);
            } else {
                label186: for (int var44 = 0; var44 < Statics.field1234.length; var44++) {
                    for (int var45 = 0; var45 < Statics.field712.length; var45++) {
                        File var46 = new File(Statics.field712[var45] + Statics.field1234[var44] + File.separatorChar + "random.dat");
                        if (var46.exists()) {
                            field518 = new class14(new class13(var46, "rw", 25L), 24, 0);
                            break label186;
                        }
                    }
                }
            }
            if (field518 == null) {
                RandomAccessFile var47 = new RandomAccessFile(var43, "rw");
                int var48 = var47.read();
                var47.seek(0L);
                var47.write(var48);
                var47.seek(0L);
                var47.close();
                field518 = new class14(new class13(var43, "rw", 25L), 24, 0);
            }
        } catch (IOException var55) {
        }
        field530 = new class14(new class13(Statics.method90("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field529 = new class14(new class13(Statics.method90("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field528 = new class14[Statics.field527];
        for (int var50 = 0; var50 < Statics.field527; var50++) {
            Statics.field528[var50] = new class14(new class13(Statics.method90("main_file_cache.idx" + var50), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bz.l(Ljava/io/File;ZI)Z")
    public static boolean method794(File arg0, boolean arg1) {
        try {
            RandomAccessFile var2 = new RandomAccessFile(arg0, "rw");
            int var3 = var2.read();
            var2.seek(0L);
            var2.write(var3);
            var2.seek(0L);
            var2.close();
            if (arg1) {
                arg0.delete();
            }
            return true;
        } catch (Exception var5) {
            return false;
        }
    }

    @ObfuscatedName("au.a(Let;B)V")
    public static void method399(class136 arg0) {
        byte[] var1 = new byte[24];
        try {
            field518.method127(0L);
            field518.method129(var1);
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
        arg0.method1596(var1, 0, 24);
    }
}
