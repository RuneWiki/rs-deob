package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ev")
public class class149 {

    @ObfuscatedName("ev.o")
    public static class228 field2209 = null;

    @ObfuscatedName("ev.m")
    public static class228 field2210 = null;

    @ObfuscatedName("ev.x")
    public static class228 field2214 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.d(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method577(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2218 = arg3;
        Statics.field2212 = arg2;
        try {
            Statics.field3137 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field3137 = "Unknown";
        }
        Statics.field195 = Statics.field3137.toLowerCase();
        try {
            Statics.field1988 = System.getProperty("user.home");
            if (Statics.field1988 != null) {
                Statics.field1988 = Statics.field1988 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field195.startsWith("win")) {
                if (Statics.field1988 == null) {
                    Statics.field1988 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field1988 == null) {
                Statics.field1988 = System.getenv("HOME");
            }
            if (Statics.field1988 != null) {
                Statics.field1988 = Statics.field1988 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field1988 == null) {
            Statics.field1988 = "~/";
        }
        Statics.field1602 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1988, "/tmp/", "" };
        Statics.field2153 = new String[] { ".jagex_cache_" + Statics.field2212, ".file_store_" + Statics.field2212 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field2205 = method625(arg0, arg1, var7);
            if (!Statics.field2205.exists()) {
                Statics.field2205.mkdirs();
            }
            File[] var8 = Statics.field2205.listFiles();
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
                if (!method3141(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class135.method2720(Statics.field2205);
        try {
            File var12 = new File(Statics.field1988, "random.dat");
            if (var12.exists()) {
                field2209 = new class228(new class227(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field2153.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field1602.length; var14++) {
                        File var15 = new File(Statics.field1602[var14] + Statics.field2153[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field2209 = new class228(new class227(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field2209 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field2209 = new class228(new class227(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field2210 = new class228(new class227(class135.method999("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2214 = new class228(new class227(class135.method999("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field82 = new class228[Statics.field2218];
        for (int var19 = 0; var19 < Statics.field2218; var19++) {
            Statics.field82[var19] = new class228(new class227(class135.method999("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("ah.p(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method625(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2207 = new File(Statics.field1988, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2207.exists()) {
            try {
                class227 var7 = new class227(Statics.field2207, "rw", 10000L);
                class119 var8 = new class119((int) var7.method3912());
                while (var8.field1966 < var8.field1973.length) {
                    int var9 = var7.method3910(var8.field1973, var8.field1966, var8.field1973.length - var8.field1966);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1966 += var9;
                }
                var8.field1966 = 0;
                int var10 = var8.method2357();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2357();
                }
                if (var10 <= 2) {
                    var4 = var8.method2567();
                    if (var11 == 1) {
                        var5 = var8.method2567();
                    }
                } else {
                    var4 = var8.method2367();
                    if (var11 == 1) {
                        var5 = var8.method2367();
                    }
                }
                var7.method3927();
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
                if (!method3141(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2153.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1602.length; var16++) {
                    File var17 = new File(Statics.field1602[var16] + Statics.field2153[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method3141(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1988 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class227 var29 = new class227(Statics.field2207, "rw", 10000L);
                class119 var30 = new class119(500);
                var30.method2388(3);
                var30.method2388(var28 == null ? 0 : 1);
                var30.method2537(var27.getPath());
                if (var28 != null) {
                    var30.method2537(((File) var28).getPath());
                }
                var29.method3931(var30.field1973, 0, var30.field1966);
                var29.method3927();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("fn.v(Ljava/io/File;ZI)Z")
    public static boolean method3141(File arg0, boolean arg1) {
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

    @ObfuscatedName("cq.l(Ljava/lang/String;Ljava/lang/String;ZI)Lhv;")
    public static class227 method1954(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2205, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2212 == 33) {
            var6 = "_rc";
        } else if (Statics.field2212 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1988, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("m.y(I)V")
    public static void method139() {
        try {
            field2210.method3934();
            for (int var0 = 0; var0 < Statics.field2218; var0++) {
                Statics.field82[var0].method3934();
            }
            field2214.method3934();
            field2209.method3934();
        } catch (Exception var2) {
        }
    }
}
