package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ey")
public class class149 {

    @ObfuscatedName("ey.e")
    public static class228 field2219 = null;

    @ObfuscatedName("ey.g")
    public static class228 field2211 = null;

    @ObfuscatedName("ey.b")
    public static class228 field2221 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.n(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method711(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2216 = arg3;
        Statics.field2625 = arg2;
        try {
            Statics.field1937 = System.getProperty("os.name");
        } catch (Exception var41) {
            Statics.field1937 = "Unknown";
        }
        Statics.field1954 = Statics.field1937.toLowerCase();
        try {
            Statics.field1591 = System.getProperty("user.home");
            if (Statics.field1591 != null) {
                Statics.field1591 = Statics.field1591 + "/";
            }
        } catch (Exception var40) {
        }
        try {
            if (Statics.field1954.startsWith("win")) {
                if (Statics.field1591 == null) {
                    Statics.field1591 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1591 == null) {
                Statics.field1591 = System.getenv("HOME");
            }
            if (Statics.field1591 != null) {
                Statics.field1591 = Statics.field1591 + "/";
            }
        } catch (Exception var39) {
        }
        if (Statics.field1591 == null) {
            Statics.field1591 = "~/";
        }
        Statics.field2157 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1591, "/tmp/", "" };
        Statics.field1147 = new String[] { ".jagex_cache_" + Statics.field2625, ".file_store_" + Statics.field2625 };
        int var7 = 0;
        label210: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2213 = new File(Statics.field1591, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2213.exists()) {
                try {
                    class227 var12 = new class227(Statics.field2213, "rw", 10000L);
                    class119 var13 = new class119((int) var12.method3833());
                    while (var13.field1977 < var13.field1981.length) {
                        int var14 = var12.method3835(var13.field1981, var13.field1977, var13.field1981.length - var13.field1977);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1977 += var14;
                    }
                    var13.field1977 = 0;
                    int var15 = var13.method2338();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2338();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2335();
                        if (var16 == 1) {
                            var10 = var13.method2335();
                        }
                    } else {
                        var9 = var13.method2434();
                        if (var16 == 1) {
                            var10 = var13.method2434();
                        }
                    }
                    var12.method3832();
                } catch (IOException var43) {
                    var43.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method2909(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label184: for (int var20 = 0; var20 < Statics.field1147.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2157.length; var21++) {
                        File var22 = new File(Statics.field2157[var21] + Statics.field1147[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2909(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label184;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field1591 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var42) {
                    var42.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method212(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field2215 = var32;
            if (!Statics.field2215.exists()) {
                Statics.field2215.mkdirs();
            }
            File[] var33 = Statics.field2215.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method2909(var36, false)) {
                        var7++;
                        continue label210;
                    }
                }
            }
            break;
        }
        File var37 = Statics.field2215;
        Statics.field2066 = var37;
        if (!Statics.field2066.exists()) {
            throw new RuntimeException("");
        }
        class135.field2067 = true;
        method77();
        field2211 = new class228(new class227(class135.method3282("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2221 = new class228(new class227(class135.method3282("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1433 = new class228[Statics.field2216];
        for (int var38 = 0; var38 < Statics.field2216; var38++) {
            Statics.field1433[var38] = new class228(new class227(class135.method3282("main_file_cache.idx" + var38), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("u.d(Ljava/io/File;Ljava/io/File;I)V")
    public static void method212(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2213, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2323(3);
            var3.method2323(arg1 == null ? 0 : 1);
            var3.method2340(arg0.getPath());
            if (arg1 != null) {
                var3.method2340(arg1.getPath());
            }
            var2.method3831(var3.field1981, 0, var3.field1977);
            var2.method3832();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ej.s(Ljava/io/File;ZI)Z")
    public static boolean method2909(File arg0, boolean arg1) {
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

    @ObfuscatedName("cm.q(Ljava/lang/String;Ljava/lang/String;ZB)Lhz;")
    public static class227 method1921(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2215, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2625 == 33) {
            var6 = "_rc";
        } else if (Statics.field2625 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1591, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("k.j(I)V")
    public static void method77() {
        try {
            File var0 = new File(Statics.field1591, "random.dat");
            if (var0.exists()) {
                field2219 = new class228(new class227(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1147.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2157.length; var2++) {
                        File var3 = new File(Statics.field2157[var2] + Statics.field1147[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2219 = new class228(new class227(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2219 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2219 = new class228(new class227(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("eh.k(Ldq;B)V")
    public static void method2689(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2219.method3854(0L);
            field2219.method3850(var1);
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
        arg0.method2425(var1, 0, 24);
    }
}
