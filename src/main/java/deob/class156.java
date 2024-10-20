package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eb")
public class class156 {

    @ObfuscatedName("eb.i")
    public static class124 field2235 = null;

    @ObfuscatedName("eb.s")
    public static class124 field2236 = null;

    @ObfuscatedName("eb.n")
    public static class124 field2237 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.e(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1012(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2599 = arg3;
        Statics.field409 = arg2;
        try {
            Statics.field812 = System.getProperty("os.name");
        } catch (Exception var54) {
            Statics.field812 = "Unknown";
        }
        Statics.field585 = Statics.field812.toLowerCase();
        try {
            Statics.field1392 = System.getProperty("user.home");
            if (Statics.field1392 != null) {
                Statics.field1392 = Statics.field1392 + "/";
            }
        } catch (Exception var53) {
        }
        try {
            if (Statics.field585.startsWith("win")) {
                if (Statics.field1392 == null) {
                    Statics.field1392 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1392 == null) {
                Statics.field1392 = System.getenv("HOME");
            }
            if (Statics.field1392 != null) {
                Statics.field1392 = Statics.field1392 + "/";
            }
        } catch (Exception var52) {
        }
        if (Statics.field1392 == null) {
            Statics.field1392 = "~/";
        }
        Statics.field602 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1392, "/tmp/", "" };
        Statics.field3253 = new String[] { ".jagex_cache_" + Statics.field409, ".file_store_" + Statics.field409 };
        int var7 = 0;
        label261: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2389 = new File(Statics.field1392, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2389.exists()) {
                try {
                    class125 var12 = new class125(Statics.field2389, "rw", 10000L);
                    class174 var13 = new class174((int) var12.method2139());
                    while (var13.field2370 < var13.field2373.length) {
                        int var14 = var12.method2140(var13.field2373, var13.field2370, var13.field2373.length - var13.field2370);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2370 += var14;
                    }
                    var13.field2370 = 0;
                    int var15 = var13.method2891();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2891();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method3033();
                        if (var16 == 1) {
                            var10 = var13.method3033();
                        }
                    } else {
                        var9 = var13.method3077();
                        if (var16 == 1) {
                            var10 = var13.method3077();
                        }
                    }
                    var12.method2145();
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
                    if (!method338(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label235: for (int var20 = 0; var20 < Statics.field3253.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field602.length; var21++) {
                        File var22 = new File(Statics.field602[var21] + Statics.field3253[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method338(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label235;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1392 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                    class125 var34 = new class125(Statics.field2389, "rw", 10000L);
                    class174 var35 = new class174(500);
                    var35.method2876(3);
                    var35.method2876(var33 == null ? 0 : 1);
                    var35.method2922(var32.getPath());
                    if (var33 != null) {
                        var35.method2922(((File) var33).getPath());
                    }
                    var34.method2135(var35.field2373, 0, var35.field2370);
                    var34.method2145();
                } catch (IOException var51) {
                    var51.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field509 = var37;
            if (!Statics.field509.exists()) {
                Statics.field509.mkdirs();
            }
            File[] var38 = Statics.field509.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method338(var41, false)) {
                        var7++;
                        continue label261;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field509;
        Statics.field2242 = var42;
        if (!Statics.field2242.exists()) {
            throw new RuntimeException("");
        }
        class158.field2241 = true;
        try {
            File var43 = new File(Statics.field1392, "random.dat");
            if (var43.exists()) {
                field2235 = new class124(new class125(var43, "rw", 25L), 24, 0);
            } else {
                label186: for (int var44 = 0; var44 < Statics.field3253.length; var44++) {
                    for (int var45 = 0; var45 < Statics.field602.length; var45++) {
                        File var46 = new File(Statics.field602[var45] + Statics.field3253[var44] + File.separatorChar + "random.dat");
                        if (var46.exists()) {
                            field2235 = new class124(new class125(var46, "rw", 25L), 24, 0);
                            break label186;
                        }
                    }
                }
            }
            if (field2235 == null) {
                RandomAccessFile var47 = new RandomAccessFile(var43, "rw");
                int var48 = var47.read();
                var47.seek(0L);
                var47.write(var48);
                var47.seek(0L);
                var47.close();
                field2235 = new class124(new class125(var43, "rw", 25L), 24, 0);
            }
        } catch (IOException var55) {
        }
        field2236 = new class124(new class125(class158.method140("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2237 = new class124(new class125(class158.method140("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2238 = new class124[Statics.field2599];
        for (int var50 = 0; var50 < Statics.field2599; var50++) {
            Statics.field2238[var50] = new class124(new class125(class158.method140("main_file_cache.idx" + var50), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("al.o(Ljava/io/File;ZI)Z")
    public static boolean method338(File arg0, boolean arg1) {
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

    @ObfuscatedName("dn.m(Ljava/lang/String;Ljava/lang/String;ZB)Ldi;")
    public static class125 method1853(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field509, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field409 == 33) {
            var6 = "_rc";
        } else if (Statics.field409 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1392, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class125(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class125(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fe.g(I)V")
    public static void method2783() {
        try {
            field2236.method2110();
            for (int var0 = 0; var0 < Statics.field2599; var0++) {
                Statics.field2238[var0].method2110();
            }
            field2237.method2110();
            field2235.method2110();
        } catch (Exception var2) {
        }
    }
}
