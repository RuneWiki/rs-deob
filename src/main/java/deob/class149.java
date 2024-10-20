package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ek")
public class class149 {

    @ObfuscatedName("ek.r")
    public static class228 field2242 = null;

    @ObfuscatedName("ek.b")
    public static class228 field2244 = null;

    @ObfuscatedName("ek.q")
    public static class228 field2241 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.j(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method2604(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2240 = arg3;
        Statics.field201 = arg2;
        try {
            Statics.field2247 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field2247 = "Unknown";
        }
        Statics.field791 = Statics.field2247.toLowerCase();
        try {
            Statics.field664 = System.getProperty("user.home");
            if (Statics.field664 != null) {
                Statics.field664 = Statics.field664 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field791.startsWith("win")) {
                if (Statics.field664 == null) {
                    Statics.field664 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field664 == null) {
                Statics.field664 = System.getenv("HOME");
            }
            if (Statics.field664 != null) {
                Statics.field664 = Statics.field664 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field664 == null) {
            Statics.field664 = "~/";
        }
        Statics.field1643 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field664, "/tmp/", "" };
        Statics.field1039 = new String[] { ".jagex_cache_" + Statics.field201, ".file_store_" + Statics.field201 };
        int var7 = 0;
        label242: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2238 = new File(Statics.field664, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2238.exists()) {
                try {
                    class227 var12 = new class227(Statics.field2238, "rw", 10000L);
                    class119 var13 = new class119((int) var12.method3816());
                    while (var13.field1999 < var13.field1996.length) {
                        int var14 = var12.method3817(var13.field1996, var13.field1999, var13.field1996.length - var13.field1999);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1999 += var14;
                    }
                    var13.field1999 = 0;
                    int var15 = var13.method2316();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2316();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2306();
                        if (var16 == 1) {
                            var10 = var13.method2306();
                        }
                    } else {
                        var9 = var13.method2326();
                        if (var16 == 1) {
                            var10 = var13.method2326();
                        }
                    }
                    var12.method3818();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method2611(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label216: for (int var20 = 0; var20 < Statics.field1039.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1643.length; var21++) {
                        File var22 = new File(Statics.field1643[var21] + Statics.field1039[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2611(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label216;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field664 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var49) {
                    var49.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method2821(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field2237 = var32;
            if (!Statics.field2237.exists()) {
                Statics.field2237.mkdirs();
            }
            File[] var33 = Statics.field2237.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method2611(var36, false)) {
                        var7++;
                        continue label242;
                    }
                }
            }
            break;
        }
        Statics.method2772(Statics.field2237);
        try {
            File var37 = new File(Statics.field664, "random.dat");
            if (var37.exists()) {
                field2242 = new class228(new class227(var37, "rw", 25L), 24, 0);
            } else {
                label169: for (int var38 = 0; var38 < Statics.field1039.length; var38++) {
                    for (int var39 = 0; var39 < Statics.field1643.length; var39++) {
                        File var40 = new File(Statics.field1643[var39] + Statics.field1039[var38] + File.separatorChar + "random.dat");
                        if (var40.exists()) {
                            field2242 = new class228(new class227(var40, "rw", 25L), 24, 0);
                            break label169;
                        }
                    }
                }
            }
            if (field2242 == null) {
                RandomAccessFile var41 = new RandomAccessFile(var37, "rw");
                int var42 = var41.read();
                var41.seek(0L);
                var41.write(var42);
                var41.seek(0L);
                var41.close();
                field2242 = new class228(new class227(var37, "rw", 25L), 24, 0);
            }
        } catch (IOException var48) {
        }
        field2244 = new class228(new class227(class135.method925("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2241 = new class228(new class227(class135.method925("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2056 = new class228[Statics.field2240];
        for (int var44 = 0; var44 < Statics.field2240; var44++) {
            Statics.field2056[var44] = new class228(new class227(class135.method925("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("er.l(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2821(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2238, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2301(3);
            var3.method2301(arg1 == null ? 0 : 1);
            var3.method2309(arg0.getPath());
            if (arg1 != null) {
                var3.method2309(arg1.getPath());
            }
            var2.method3810(var3.field1996, 0, var3.field1999);
            var2.method3818();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ds.a(Ljava/io/File;ZB)Z")
    public static boolean method2611(File arg0, boolean arg1) {
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

    @ObfuscatedName("j.i(Ljava/lang/String;Ljava/lang/String;ZI)Lhk;")
    public static class227 method2(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2237, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field201 == 33) {
            var6 = "_rc";
        } else if (Statics.field201 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field664, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class227(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class227(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("df.f(Ldc;II)V")
    public static void method2546(class119 arg0, int arg1) {
        if (field2242 == null) {
            return;
        }
        try {
            field2242.method3833(0L);
            field2242.method3836(arg0.field1996, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
