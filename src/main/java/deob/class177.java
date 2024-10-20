package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fp")
public class class177 {

    @ObfuscatedName("fp.b")
    public static class353 field2062 = null;

    @ObfuscatedName("fp.a")
    public static class353 field2068 = null;

    @ObfuscatedName("fp.w")
    public static class353 field2063 = null;

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.n(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method2080(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2058 = arg3;
        Statics.field2064 = arg2;
        try {
            Statics.field2066 = System.getProperty("os.name");
        } catch (Exception var46) {
            Statics.field2066 = "Unknown";
        }
        Statics.field4047 = Statics.field2066.toLowerCase();
        try {
            Statics.field2067 = System.getProperty("user.home");
            if (Statics.field2067 != null) {
                Statics.field2067 = Statics.field2067 + "/";
            }
        } catch (Exception var45) {
        }
        try {
            if (Statics.field4047.startsWith("win")) {
                if (Statics.field2067 == null) {
                    Statics.field2067 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2067 == null) {
                Statics.field2067 = System.getenv("HOME");
            }
            if (Statics.field2067 != null) {
                Statics.field2067 = Statics.field2067 + "/";
            }
        } catch (Exception var44) {
        }
        if (Statics.field2067 == null) {
            Statics.field2067 = "~/";
        }
        Statics.field2577 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2067, "/tmp/", "" };
        Statics.field3622 = new String[] { ".jagex_cache_" + Statics.field2064, ".file_store_" + Statics.field2064 };
        int var7 = 0;
        label221: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2056 = new File(Statics.field2067, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2056.exists()) {
                try {
                    class354 var12 = new class354(Statics.field2056, "rw", 10000L);
                    class311 var13 = new class311((int) var12.method6272());
                    while (var13.field3747 < var13.field3746.length) {
                        int var14 = var12.method6269(var13.field3746, var13.field3747, var13.field3746.length - var13.field3747);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field3747 += var14;
                    }
                    var13.field3747 = 0;
                    int var15 = var13.method5310();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method5310();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method5453();
                        if (var16 == 1) {
                            var10 = var13.method5453();
                        }
                    } else {
                        var9 = var13.method5256();
                        if (var16 == 1) {
                            var10 = var13.method5256();
                        }
                    }
                    var12.method6267();
                } catch (IOException var48) {
                    var48.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method212(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label195: for (int var20 = 0; var20 < Statics.field3622.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2577.length; var21++) {
                        File var22 = new File(Statics.field2577[var21] + Statics.field3622[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method212(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label195;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field2067 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var47) {
                    var47.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class354 var34 = new class354(Statics.field2056, "rw", 10000L);
                    class311 var35 = new class311(500);
                    var35.method5279(3);
                    var35.method5279(var33 == null ? 0 : 1);
                    var35.method5317(var32.getPath());
                    if (var33 != null) {
                        var35.method5317(((File) var33).getPath());
                    }
                    var34.method6266(var35.field3746, 0, var35.field3747);
                    var34.method6267();
                } catch (IOException var43) {
                    var43.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2054 = var37;
            if (!Statics.field2054.exists()) {
                Statics.field2054.mkdirs();
            }
            File[] var38 = Statics.field2054.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method212(var41, false)) {
                        var7++;
                        continue label221;
                    }
                }
            }
            break;
        }
        class179.method27(Statics.field2054);
        method2168();
        field2068 = new class353(new class354(class179.method1986("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2063 = new class353(new class354(class179.method1986("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field382 = new class353[Statics.field2058];
        for (int var42 = 0; var42 < Statics.field2058; var42++) {
            Statics.field382[var42] = new class353(new class354(class179.method1986("main_file_cache.idx" + var42), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("r.v(Ljava/io/File;ZI)Z")
    public static boolean method212(File arg0, boolean arg1) {
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

    @ObfuscatedName("aq.d(Ljava/lang/String;Ljava/lang/String;ZI)Lmc;")
    public static class354 method327(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2054, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class354(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2064 == 33) {
            var6 = "_rc";
        } else if (Statics.field2064 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2067, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("cg.c(B)V")
    public static void method2168() {
        try {
            File var0 = new File(Statics.field2067, "random.dat");
            if (var0.exists()) {
                field2062 = new class353(new class354(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field3622.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2577.length; var2++) {
                        File var3 = new File(Statics.field2577[var2] + Statics.field3622[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2062 = new class353(new class354(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2062 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2062 = new class353(new class354(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("cm.y(B)[B")
    public static byte[] method2084() {
        byte[] var0 = new byte[24];
        try {
            field2062.method6242(0L);
            field2062.method6243(var0);
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

    @ObfuscatedName("ak.h(I)V")
    public static void method337() {
        try {
            field2068.method6241();
            for (int var0 = 0; var0 < Statics.field2058; var0++) {
                Statics.field382[var0].method6241();
            }
            field2063.method6241();
            field2062.method6241();
        } catch (Exception var2) {
        }
    }
}
