package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ek")
public class class140 {

    @ObfuscatedName("ek.h")
    public static class210 field2090 = null;

    @ObfuscatedName("ek.m")
    public static class210 field2097 = null;

    @ObfuscatedName("ek.w")
    public static class210 field2098 = null;

    public class140() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.p(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method1978(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2091 = arg3;
        Statics.field1111 = arg2;
        try {
            Statics.field899 = System.getProperty("os.name");
        } catch (Exception var54) {
            Statics.field899 = "Unknown";
        }
        Statics.field935 = Statics.field899.toLowerCase();
        try {
            Statics.field526 = System.getProperty("user.home");
            if (Statics.field526 != null) {
                Statics.field526 = Statics.field526 + "/";
            }
        } catch (Exception var53) {
        }
        try {
            if (Statics.field935.startsWith("win")) {
                if (Statics.field526 == null) {
                    Statics.field526 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field526 == null) {
                Statics.field526 = System.getenv("HOME");
            }
            if (Statics.field526 != null) {
                Statics.field526 = Statics.field526 + "/";
            }
        } catch (Exception var52) {
        }
        if (Statics.field526 == null) {
            Statics.field526 = "~/";
        }
        Statics.field227 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field526, "/tmp/", "" };
        Statics.field1242 = new String[] { ".jagex_cache_" + Statics.field1111, ".file_store_" + Statics.field1111 };
        int var7 = 0;
        label261: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2093 = new File(Statics.field526, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2093.exists()) {
                try {
                    class209 var12 = new class209(Statics.field2093, "rw", 10000L);
                    class110 var13 = new class110((int) var12.method3565());
                    while (var13.field1842 < var13.field1844.length) {
                        int var14 = var12.method3570(var13.field1844, var13.field1842, var13.field1844.length - var13.field1842);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1842 += var14;
                    }
                    var13.field1842 = 0;
                    int var15 = var13.method2309();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2309();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2133();
                        if (var16 == 1) {
                            var10 = var13.method2133();
                        }
                    } else {
                        var9 = var13.method2156();
                        if (var16 == 1) {
                            var10 = var13.method2156();
                        }
                    }
                    var12.method3564();
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
                    if (!method1046(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label235: for (int var20 = 0; var20 < Statics.field1242.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field227.length; var21++) {
                        File var22 = new File(Statics.field227[var21] + Statics.field1242[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method1046(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label235;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field526 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                    class209 var34 = new class209(Statics.field2093, "rw", 10000L);
                    class110 var35 = new class110(500);
                    var35.method2110(3);
                    var35.method2110(var33 == null ? 0 : 1);
                    var35.method2117(var32.getPath());
                    if (var33 != null) {
                        var35.method2117(((File) var33).getPath());
                    }
                    var34.method3563(var35.field1844, 0, var35.field1842);
                    var34.method3564();
                } catch (IOException var51) {
                    var51.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2096 = var37;
            if (!Statics.field2096.exists()) {
                Statics.field2096.mkdirs();
            }
            File[] var38 = Statics.field2096.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method1046(var41, false)) {
                        var7++;
                        continue label261;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field2096;
        Statics.field1945 = var42;
        if (!Statics.field1945.exists()) {
            throw new RuntimeException("");
        }
        class126.field1944 = true;
        try {
            File var43 = new File(Statics.field526, "random.dat");
            if (var43.exists()) {
                field2090 = new class210(new class209(var43, "rw", 25L), 24, 0);
            } else {
                label186: for (int var44 = 0; var44 < Statics.field1242.length; var44++) {
                    for (int var45 = 0; var45 < Statics.field227.length; var45++) {
                        File var46 = new File(Statics.field227[var45] + Statics.field1242[var44] + File.separatorChar + "random.dat");
                        if (var46.exists()) {
                            field2090 = new class210(new class209(var46, "rw", 25L), 24, 0);
                            break label186;
                        }
                    }
                }
            }
            if (field2090 == null) {
                RandomAccessFile var47 = new RandomAccessFile(var43, "rw");
                int var48 = var47.read();
                var47.seek(0L);
                var47.write(var48);
                var47.seek(0L);
                var47.close();
                field2090 = new class210(new class209(var43, "rw", 25L), 24, 0);
            }
        } catch (IOException var55) {
        }
        field2097 = new class210(new class209(class126.method1898("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2098 = new class210(new class209(class126.method1898("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field62 = new class210[Statics.field2091];
        for (int var50 = 0; var50 < Statics.field2091; var50++) {
            Statics.field62[var50] = new class210(new class209(class126.method1898("main_file_cache.idx" + var50), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("aa.y(Ljava/io/File;ZI)Z")
    public static boolean method1046(File arg0, boolean arg1) {
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

    @ObfuscatedName("ar.d(Ljava/lang/String;Ljava/lang/String;ZB)Lhz;")
    public static class209 method561(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2096, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class209(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1111 == 33) {
            var6 = "_rc";
        } else if (Statics.field1111 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field526, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class209(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class209(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("h.c(Ldg;B)V")
    public static void method129(class110 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2090.method3581(0L);
            field2090.method3583(var1);
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
        arg0.method2118(var1, 0, 24);
    }

    @ObfuscatedName("cj.r(I)V")
    public static void method1899() {
        try {
            field2097.method3580();
            for (int var0 = 0; var0 < Statics.field2091; var0++) {
                Statics.field62[var0].method3580();
            }
            field2098.method3580();
            field2090.method3580();
        } catch (Exception var2) {
        }
    }
}
