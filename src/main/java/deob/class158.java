package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fz")
public class class158 {

    @ObfuscatedName("fz.t")
    public static class426 field1758 = null;

    @ObfuscatedName("fz.z")
    public static class426 field1759 = null;

    @ObfuscatedName("fz.r")
    public static class426 field1755 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.c(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2599(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field1666 = arg3;
        Statics.field1283 = arg2;
        try {
            Statics.field1437 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field1437 = "Unknown";
        }
        Statics.field3992 = Statics.field1437.toLowerCase();
        try {
            Statics.field1540 = System.getProperty("user.home");
            if (Statics.field1540 != null) {
                Statics.field1540 = Statics.field1540 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field3992.startsWith("win")) {
                if (Statics.field1540 == null) {
                    Statics.field1540 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1540 == null) {
                Statics.field1540 = System.getenv("HOME");
            }
            if (Statics.field1540 != null) {
                Statics.field1540 = Statics.field1540 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field1540 == null) {
            Statics.field1540 = "~/";
        }
        Statics.field4573 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1540, "/tmp/", "" };
        Statics.field1761 = new String[] { ".jagex_cache_" + Statics.field1283, ".file_store_" + Statics.field1283 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field1756 = method6042(arg0, arg1, var7);
            if (!Statics.field1756.exists()) {
                Statics.field1756.mkdirs();
            }
            File[] var8 = Statics.field1756.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label115;
                }
                File var11 = var9[var10];
                if (!method2353(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class160.method3010(Statics.field1756);
        try {
            File var12 = new File(Statics.field1540, "random.dat");
            if (var12.exists()) {
                field1758 = new class426(new class425(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field1761.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field4573.length; var14++) {
                        File var15 = new File(Statics.field4573[var14] + Statics.field1761[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field1758 = new class426(new class425(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field1758 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field1758 = new class426(new class425(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field1759 = new class426(new class425(class160.method519("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1755 = new class426(new class425(class160.method519("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field4266 = new class426[Statics.field1666];
        for (int var19 = 0; var19 < Statics.field1666; var19++) {
            Statics.field4266[var19] = new class426(new class425(class160.method519("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("nr.v(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method6042(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field3166 = new File(Statics.field1540, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field3166.exists()) {
            try {
                class425 var7 = new class425(Statics.field3166, "rw", 10000L);
                class443 var8 = new class443((int) var7.method6808());
                while (var8.field4700 < var8.field4701.length) {
                    int var9 = var7.method6809(var8.field4701, var8.field4700, var8.field4701.length - var8.field4700);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field4700 += var9;
                }
                var8.field4700 = 0;
                int var10 = var8.method7047();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method7047();
                }
                if (var10 <= 2) {
                    var4 = var8.method7211();
                    if (var11 == 1) {
                        var5 = var8.method7211();
                    }
                } else {
                    var4 = var8.method7059();
                    if (var11 == 1) {
                        var5 = var8.method7059();
                    }
                }
                var7.method6806();
            } catch (IOException var34) {
                var34.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method2353(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1761.length; var15++) {
                for (int var16 = 0; var16 < Statics.field4573.length; var16++) {
                    File var17 = new File(Statics.field4573[var16] + Statics.field1761[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2353(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1540 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var18 = new File(var5);
            File var19 = new File(var4);
            try {
                File[] var20 = var18.listFiles();
                File[] var21 = var20;
                for (int var22 = 0; var22 < var21.length; var22++) {
                    File var23 = var21[var22];
                    File var24 = new File(var19, var23.getName());
                    boolean var25 = var23.renameTo(var24);
                    if (!var25) {
                        throw new IOException();
                    }
                }
            } catch (Exception var33) {
                var33.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var27 = new File(var4);
            Object var28 = null;
            try {
                class425 var29 = new class425(Statics.field3166, "rw", 10000L);
                class443 var30 = new class443(500);
                var30.method7031(3);
                var30.method7031(var28 == null ? 0 : 1);
                var30.method7045(var27.getPath());
                if (var28 != null) {
                    var30.method7045(((File) var28).getPath());
                }
                var29.method6812(var30.field4701, 0, var30.field4700);
                var29.method6806();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ck.q(Ljava/io/File;ZI)Z")
    public static boolean method2353(File arg0, boolean arg1) {
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

    @ObfuscatedName("bb.f(Ljava/lang/String;Ljava/lang/String;ZI)Lpn;")
    public static class425 method1799(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1756, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class425(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1283 == 33) {
            var6 = "_rc";
        } else if (Statics.field1283 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1540, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class425(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class425(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lz.j(I)[B")
    public static byte[] method5517() {
        byte[] var0 = new byte[24];
        try {
            field1758.method6825(0L);
            field1758.method6827(var0);
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

    @ObfuscatedName("iz.e(I)V")
    public static void method4586() {
        try {
            field1759.method6824();
            for (int var0 = 0; var0 < Statics.field1666; var0++) {
                Statics.field4266[var0].method6824();
            }
            field1755.method6824();
            field1758.method6824();
        } catch (Exception var2) {
        }
    }
}
