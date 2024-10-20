package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ed")
public class class141 {

    @ObfuscatedName("ed.l")
    public static class219 field2144 = null;

    @ObfuscatedName("ed.u")
    public static class219 field2137 = null;

    @ObfuscatedName("ed.q")
    public static class219 field2138 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.n(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method154(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2536 = arg3;
        Statics.field1870 = arg2;
        try {
            Statics.field1801 = System.getProperty("os.name");
        } catch (Exception var40) {
            Statics.field1801 = "Unknown";
        }
        Statics.field2142 = Statics.field1801.toLowerCase();
        try {
            Statics.field2143 = System.getProperty("user.home");
            if (Statics.field2143 != null) {
                Statics.field2143 = Statics.field2143 + "/";
            }
        } catch (Exception var39) {
        }
        try {
            if (Statics.field2142.startsWith("win")) {
                if (Statics.field2143 == null) {
                    Statics.field2143 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2143 == null) {
                Statics.field2143 = System.getenv("HOME");
            }
            if (Statics.field2143 != null) {
                Statics.field2143 = Statics.field2143 + "/";
            }
        } catch (Exception var38) {
        }
        if (Statics.field2143 == null) {
            Statics.field2143 = "~/";
        }
        Statics.field1973 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2143, "/tmp/", "" };
        Statics.field2140 = new String[] { ".jagex_cache_" + Statics.field1870, ".file_store_" + Statics.field1870 };
        int var7 = 0;
        label206: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field3041 = new File(Statics.field2143, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field3041.exists()) {
                try {
                    class218 var12 = new class218(Statics.field3041, "rw", 10000L);
                    class111 var13 = new class111((int) var12.method3741());
                    while (var13.field1889 < var13.field1888.length) {
                        int var14 = var12.method3755(var13.field1888, var13.field1889, var13.field1888.length - var13.field1889);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1889 += var14;
                    }
                    var13.field1889 = 0;
                    int var15 = var13.method2228();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2228();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2237();
                        if (var16 == 1) {
                            var10 = var13.method2237();
                        }
                    } else {
                        var9 = var13.method2238();
                        if (var16 == 1) {
                            var10 = var13.method2238();
                        }
                    }
                    var12.method3740();
                } catch (IOException var42) {
                    var42.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method848(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label180: for (int var20 = 0; var20 < Statics.field2140.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1973.length; var21++) {
                        File var22 = new File(Statics.field1973[var21] + Statics.field2140[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method848(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label180;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field2143 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var41) {
                    var41.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method607(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field1037 = var32;
            if (!Statics.field1037.exists()) {
                Statics.field1037.mkdirs();
            }
            File[] var33 = Statics.field1037.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method848(var36, false)) {
                        var7++;
                        continue label206;
                    }
                }
            }
            break;
        }
        class127.method1861(Statics.field1037);
        method2054();
        field2137 = new class219(new class218(class127.method2555("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2138 = new class219(new class218(class127.method2555("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2139 = new class219[Statics.field2536];
        for (int var37 = 0; var37 < Statics.field2536; var37++) {
            Statics.field2139[var37] = new class219(new class218(class127.method2555("main_file_cache.idx" + var37), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ak.d(Ljava/io/File;Ljava/io/File;I)V")
    public static void method607(File arg0, File arg1) {
        try {
            class218 var2 = new class218(Statics.field3041, "rw", 10000L);
            class111 var3 = new class111(500);
            var3.method2213(3);
            var3.method2213(arg1 == null ? 0 : 1);
            var3.method2368(arg0.getPath());
            if (arg1 != null) {
                var3.method2368(arg1.getPath());
            }
            var2.method3739(var3.field1888, 0, var3.field1889);
            var2.method3740();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ah.z(Ljava/io/File;ZI)Z")
    public static boolean method848(File arg0, boolean arg1) {
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

    @ObfuscatedName("ab.y(Ljava/lang/String;Ljava/lang/String;ZB)Lhh;")
    public static class218 method654(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1037, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class218(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1870 == 33) {
            var6 = "_rc";
        } else if (Statics.field1870 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2143, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class218(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class218(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cm.e(I)V")
    public static void method2054() {
        try {
            File var0 = new File(Statics.field2143, "random.dat");
            if (var0.exists()) {
                field2144 = new class219(new class218(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2140.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1973.length; var2++) {
                        File var3 = new File(Statics.field1973[var2] + Statics.field2140[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2144 = new class219(new class218(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2144 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2144 = new class219(new class218(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("c.f(Ldl;IB)V")
    public static void method523(class111 arg0, int arg1) {
        if (field2144 == null) {
            return;
        }
        try {
            field2144.method3758(0L);
            field2144.method3769(arg0.field1888, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
