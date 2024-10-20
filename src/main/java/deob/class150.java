package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("em")
public class class150 {

    @ObfuscatedName("em.m")
    public static class229 field2233 = null;

    @ObfuscatedName("em.n")
    public static class229 field2228 = null;

    @ObfuscatedName("em.y")
    public static class229 field2235 = null;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.e(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method2609(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2229 = arg3;
        Statics.field3048 = arg2;
        try {
            Statics.field2078 = System.getProperty("os.name");
        } catch (Exception var22) {
            Statics.field2078 = "Unknown";
        }
        Statics.field2084 = Statics.field2078.toLowerCase();
        try {
            Statics.field766 = System.getProperty("user.home");
            if (Statics.field766 != null) {
                Statics.field766 = Statics.field766 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (Statics.field2084.startsWith("win")) {
                if (Statics.field766 == null) {
                    Statics.field766 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field766 == null) {
                Statics.field766 = System.getenv("HOME");
            }
            if (Statics.field766 != null) {
                Statics.field766 = Statics.field766 + "/";
            }
        } catch (Exception var20) {
        }
        if (Statics.field766 == null) {
            Statics.field766 = "~/";
        }
        Statics.field1892 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field766, "/tmp/", "" };
        Statics.field1369 = new String[] { ".jagex_cache_" + Statics.field3048, ".file_store_" + Statics.field3048 };
        int var7 = 0;
        label115: while (var7 < 4) {
            Statics.field2238 = method2306(arg0, arg1, var7);
            if (!Statics.field2238.exists()) {
                Statics.field2238.mkdirs();
            }
            File[] var8 = Statics.field2238.listFiles();
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
                if (!method177(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class136.method1950(Statics.field2238);
        try {
            File var12 = new File(Statics.field766, "random.dat");
            if (var12.exists()) {
                field2233 = new class229(new class228(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < Statics.field1369.length; var13++) {
                    for (int var14 = 0; var14 < Statics.field1892.length; var14++) {
                        File var15 = new File(Statics.field1892[var14] + Statics.field1369[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            field2233 = new class229(new class228(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (field2233 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                field2233 = new class229(new class228(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        field2228 = new class229(new class228(class136.method813("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2235 = new class229(new class228(class136.method813("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2231 = new class229[Statics.field2229];
        for (int var19 = 0; var19 < Statics.field2229; var19++) {
            Statics.field2231[var19] = new class229(new class228(class136.method813("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("da.w(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;")
    public static File method2306(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2227 = new File(Statics.field766, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2227.exists()) {
            try {
                class228 var7 = new class228(Statics.field2227, "rw", 10000L);
                class120 var8 = new class120((int) var7.method3828());
                while (var8.field1977 < var8.field1981.length) {
                    int var9 = var7.method3834(var8.field1981, var8.field1977, var8.field1981.length - var8.field1977);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1977 += var9;
                }
                var8.field1977 = 0;
                int var10 = var8.method2355();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2355();
                }
                if (var10 <= 2) {
                    var4 = var8.method2364();
                    if (var11 == 1) {
                        var5 = var8.method2364();
                    }
                } else {
                    var4 = var8.method2456();
                    if (var11 == 1) {
                        var5 = var8.method2456();
                    }
                }
                var7.method3827();
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
                if (!method177(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1369.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1892.length; var16++) {
                    File var17 = new File(Statics.field1892[var16] + Statics.field1369[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method177(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field766 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class228 var29 = new class228(Statics.field2227, "rw", 10000L);
                class120 var30 = new class120(500);
                var30.method2397(3);
                var30.method2397(var28 == null ? 0 : 1);
                var30.method2348(var27.getPath());
                if (var28 != null) {
                    var30.method2348(((File) var28).getPath());
                }
                var29.method3826(var30.field1981, 0, var30.field1977);
                var29.method3827();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("x.f(Ljava/io/File;ZB)Z")
    public static boolean method177(File arg0, boolean arg1) {
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

    @ObfuscatedName("eg.s(Ljava/lang/String;Ljava/lang/String;ZB)Lhy;")
    public static class228 method2822(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2238, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class228(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3048 == 33) {
            var6 = "_rc";
        } else if (Statics.field3048 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field766, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class228(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class228(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("w.p(Ldq;I)V")
    public static void method18(class120 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2233.method3848(0L);
            field2233.method3854(var1);
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
        arg0.method2349(var1, 0, 24);
    }

    @ObfuscatedName("bw.h(Ldq;IB)V")
    public static void method1206(class120 arg0, int arg1) {
        if (field2233 == null) {
            return;
        }
        try {
            field2233.method3848(0L);
            field2233.method3850(arg0.field1981, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("av.g(B)V")
    public static void method728() {
        try {
            field2228.method3870();
            for (int var0 = 0; var0 < Statics.field2229; var0++) {
                Statics.field2231[var0].method3870();
            }
            field2235.method3870();
            field2233.method3870();
        } catch (Exception var2) {
        }
    }
}
