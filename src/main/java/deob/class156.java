package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eb")
public class class156 {

    @ObfuscatedName("eb.q")
    public static class124 field2257 = null;

    @ObfuscatedName("eb.n")
    public static class124 field2263 = null;

    @ObfuscatedName("eb.a")
    public static class124 field2264 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.p(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method891(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field772 = arg3;
        Statics.field2124 = arg2;
        try {
            Statics.field2258 = System.getProperty("os.name");
        } catch (Exception var54) {
            Statics.field2258 = "Unknown";
        }
        Statics.field813 = Statics.field2258.toLowerCase();
        try {
            Statics.field556 = System.getProperty("user.home");
            if (Statics.field556 != null) {
                Statics.field556 = Statics.field556 + "/";
            }
        } catch (Exception var53) {
        }
        try {
            if (Statics.field813.startsWith("win")) {
                if (Statics.field556 == null) {
                    Statics.field556 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field556 == null) {
                Statics.field556 = System.getenv("HOME");
            }
            if (Statics.field556 != null) {
                Statics.field556 = Statics.field556 + "/";
            }
        } catch (Exception var52) {
        }
        if (Statics.field556 == null) {
            Statics.field556 = "~/";
        }
        Statics.field1665 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field556, "/tmp/", "" };
        Statics.field1305 = new String[] { ".jagex_cache_" + Statics.field2124, ".file_store_" + Statics.field2124 };
        int var7 = 0;
        label261: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2260 = new File(Statics.field556, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2260.exists()) {
                try {
                    class125 var12 = new class125(Statics.field2260, "rw", 10000L);
                    class174 var13 = new class174((int) var12.method2093());
                    while (var13.field2408 < var13.field2415.length) {
                        int var14 = var12.method2094(var13.field2415, var13.field2408, var13.field2415.length - var13.field2408);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2408 += var14;
                    }
                    var13.field2408 = 0;
                    int var15 = var13.method2810();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2810();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2819();
                        if (var16 == 1) {
                            var10 = var13.method2819();
                        }
                    } else {
                        var9 = var13.method2881();
                        if (var16 == 1) {
                            var10 = var13.method2881();
                        }
                    }
                    var12.method2101();
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
                    if (!method1024(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label235: for (int var20 = 0; var20 < Statics.field1305.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1665.length; var21++) {
                        File var22 = new File(Statics.field1665[var21] + Statics.field1305[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method1024(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label235;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field556 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                    class125 var34 = new class125(Statics.field2260, "rw", 10000L);
                    class174 var35 = new class174(500);
                    var35.method2961(3);
                    var35.method2961(var33 == null ? 0 : 1);
                    var35.method2930(var32.getPath());
                    if (var33 != null) {
                        var35.method2930(((File) var33).getPath());
                    }
                    var34.method2091(var35.field2415, 0, var35.field2408);
                    var34.method2101();
                } catch (IOException var51) {
                    var51.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field1358 = var37;
            if (!Statics.field1358.exists()) {
                Statics.field1358.mkdirs();
            }
            File[] var38 = Statics.field1358.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method1024(var41, false)) {
                        var7++;
                        continue label261;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field1358;
        Statics.field41 = var42;
        if (!Statics.field41.exists()) {
            throw new RuntimeException("");
        }
        class158.field2271 = true;
        try {
            File var43 = new File(Statics.field556, "random.dat");
            if (var43.exists()) {
                field2257 = new class124(new class125(var43, "rw", 25L), 24, 0);
            } else {
                label186: for (int var44 = 0; var44 < Statics.field1305.length; var44++) {
                    for (int var45 = 0; var45 < Statics.field1665.length; var45++) {
                        File var46 = new File(Statics.field1665[var45] + Statics.field1305[var44] + File.separatorChar + "random.dat");
                        if (var46.exists()) {
                            field2257 = new class124(new class125(var46, "rw", 25L), 24, 0);
                            break label186;
                        }
                    }
                }
            }
            if (field2257 == null) {
                RandomAccessFile var47 = new RandomAccessFile(var43, "rw");
                int var48 = var47.read();
                var47.seek(0L);
                var47.write(var48);
                var47.seek(0L);
                var47.close();
                field2257 = new class124(new class125(var43, "rw", 25L), 24, 0);
            }
        } catch (IOException var55) {
        }
        field2263 = new class124(new class125(class158.method980("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2264 = new class124(new class125(class158.method980("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field405 = new class124[Statics.field772];
        for (int var50 = 0; var50 < Statics.field772; var50++) {
            Statics.field405[var50] = new class124(new class125(class158.method980("main_file_cache.idx" + var50), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("bh.m(Ljava/io/File;ZI)Z")
    public static boolean method1024(File arg0, boolean arg1) {
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

    @ObfuscatedName("dh.e(Ljava/lang/String;Ljava/lang/String;ZI)Ldd;")
    public static class125 method2132(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1358, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2124 == 33) {
            var6 = "_rc";
        } else if (Statics.field2124 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field556, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("u.t(I)[B")
    public static byte[] method192() {
        byte[] var0 = new byte[24];
        try {
            field2257.method2083(0L);
            field2257.method2065(var0);
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

    @ObfuscatedName("cn.w(I)V")
    public static void method1502() {
        try {
            field2263.method2073();
            for (int var0 = 0; var0 < Statics.field772; var0++) {
                Statics.field405[var0].method2073();
            }
            field2264.method2073();
            field2257.method2073();
        } catch (Exception var2) {
        }
    }
}
