package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ei")
public class class136 {

    @ObfuscatedName("ei.o")
    public static class197 field2072 = null;

    @ObfuscatedName("ei.v")
    public static class197 field2071 = null;

    @ObfuscatedName("ei.z")
    public static class197 field2073 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.n(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method146(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2067 = arg3;
        Statics.field2669 = arg2;
        try {
            Statics.field178 = System.getProperty("os.name");
        } catch (Exception var53) {
            Statics.field178 = "Unknown";
        }
        Statics.field701 = Statics.field178.toLowerCase();
        try {
            Statics.field693 = System.getProperty("user.home");
            if (Statics.field693 != null) {
                Statics.field693 = Statics.field693 + "/";
            }
        } catch (Exception var52) {
        }
        try {
            if (Statics.field701.startsWith("win")) {
                if (Statics.field693 == null) {
                    Statics.field693 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field693 == null) {
                Statics.field693 = System.getenv("HOME");
            }
            if (Statics.field693 != null) {
                Statics.field693 = Statics.field693 + "/";
            }
        } catch (Exception var51) {
        }
        if (Statics.field693 == null) {
            Statics.field693 = "~/";
        }
        Statics.field2074 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field693, "/tmp/", "" };
        Statics.field2114 = new String[] { ".jagex_cache_" + Statics.field2669, ".file_store_" + Statics.field2669 };
        int var7 = 0;
        label257: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2076 = new File(Statics.field693, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2076.exists()) {
                try {
                    class196 var12 = new class196(Statics.field2076, "rw", 10000L);
                    class107 var13 = new class107((int) var12.method3384());
                    while (var13.field1826 < var13.field1829.length) {
                        int var14 = var12.method3398(var13.field1829, var13.field1826, var13.field1829.length - var13.field1826);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field1826 += var14;
                    }
                    var13.field1826 = 0;
                    int var15 = var13.method2148();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2148();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2303();
                        if (var16 == 1) {
                            var10 = var13.method2303();
                        }
                    } else {
                        var9 = var13.method2207();
                        if (var16 == 1) {
                            var10 = var13.method2207();
                        }
                    }
                    var12.method3385();
                } catch (IOException var56) {
                    var56.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method2066(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label231: for (int var20 = 0; var20 < Statics.field2114.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field2074.length; var21++) {
                        File var22 = new File(Statics.field2074[var21] + Statics.field2114[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2066(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label231;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field693 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var55) {
                    var55.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class196 var34 = new class196(Statics.field2076, "rw", 10000L);
                    class107 var35 = new class107(500);
                    var35.method2124(3);
                    var35.method2124(var33 == null ? 0 : 1);
                    var35.method2278(var32.getPath());
                    if (var33 != null) {
                        var35.method2278(((File) var33).getPath());
                    }
                    var34.method3382(var35.field1829, 0, var35.field1826);
                    var34.method3385();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field2066 = var37;
            if (!Statics.field2066.exists()) {
                Statics.field2066.mkdirs();
            }
            File[] var38 = Statics.field2066.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method2066(var41, false)) {
                        var7++;
                        continue label257;
                    }
                }
            }
            break;
        }
        class122.method100(Statics.field2066);
        try {
            File var42 = new File(Statics.field693, "random.dat");
            if (var42.exists()) {
                field2072 = new class197(new class196(var42, "rw", 25L), 24, 0);
            } else {
                label184: for (int var43 = 0; var43 < Statics.field2114.length; var43++) {
                    for (int var44 = 0; var44 < Statics.field2074.length; var44++) {
                        File var45 = new File(Statics.field2074[var44] + Statics.field2114[var43] + File.separatorChar + "random.dat");
                        if (var45.exists()) {
                            field2072 = new class197(new class196(var45, "rw", 25L), 24, 0);
                            break label184;
                        }
                    }
                }
            }
            if (field2072 == null) {
                RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                int var47 = var46.read();
                var46.seek(0L);
                var46.write(var47);
                var46.seek(0L);
                var46.close();
                field2072 = new class197(new class196(var42, "rw", 25L), 24, 0);
            }
        } catch (IOException var54) {
        }
        field2071 = new class197(new class196(class122.method802("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2073 = new class197(new class196(class122.method802("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1853 = new class197[Statics.field2067];
        for (int var49 = 0; var49 < Statics.field2067; var49++) {
            Statics.field1853[var49] = new class197(new class196(class122.method802("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("cp.x(Ljava/io/File;ZI)Z")
    public static boolean method2066(File arg0, boolean arg1) {
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

    @ObfuscatedName("al.k(Ljava/lang/String;Ljava/lang/String;ZB)Lgv;")
    public static class196 method549(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2066, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class196(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2669 == 33) {
            var6 = "_rc";
        } else if (Statics.field2669 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field693, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class196(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class196(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("bw.i(Ldw;I)V")
    public static void method1419(class107 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2072.method3403(0L);
            field2072.method3405(var1);
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
        arg0.method2132(var1, 0, 24);
    }

    @ObfuscatedName("aq.d(I)V")
    public static void method834() {
        try {
            field2071.method3402();
            for (int var0 = 0; var0 < Statics.field2067; var0++) {
                Statics.field1853[var0].method3402();
            }
            field2073.method3402();
            field2072.method3402();
        } catch (Exception var2) {
        }
    }
}
