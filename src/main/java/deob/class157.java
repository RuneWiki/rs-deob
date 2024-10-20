package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fj")
public class class157 {

    @ObfuscatedName("fj.u")
    public static class123 field2156 = null;

    @ObfuscatedName("fj.n")
    public static class123 field2158 = null;

    @ObfuscatedName("fj.c")
    public static class123 field2155 = null;

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.d(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method80(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2154 = arg3;
        Statics.field1460 = arg2;
        try {
            Statics.field1406 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field1406 = "Unknown";
        }
        Statics.field558 = Statics.field1406.toLowerCase();
        try {
            Statics.field3466 = System.getProperty("user.home");
            if (Statics.field3466 != null) {
                Statics.field3466 = Statics.field3466 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field558.startsWith("win")) {
                if (Statics.field3466 == null) {
                    Statics.field3466 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field3466 == null) {
                Statics.field3466 = System.getenv("HOME");
            }
            if (Statics.field3466 != null) {
                Statics.field3466 = Statics.field3466 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field3466 == null) {
            Statics.field3466 = "~/";
        }
        Statics.field1324 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3466, "/tmp/", "" };
        Statics.field310 = new String[] { ".jagex_cache_" + Statics.field1460, ".file_store_" + Statics.field1460 };
        int var7 = 0;
        label225: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field568 = new File(Statics.field3466, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field568.exists()) {
                try {
                    class124 var12 = new class124(Statics.field568, "rw", 10000L);
                    class181 var13 = new class181((int) var12.method2242());
                    while (var13.field2498 < var13.field2496.length) {
                        int var14 = var12.method2243(var13.field2496, var13.field2498, var13.field2496.length - var13.field2498);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2498 += var14;
                    }
                    var13.field2498 = 0;
                    int var15 = var13.method3204();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method3204();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method3046();
                        if (var16 == 1) {
                            var10 = var13.method3046();
                        }
                    } else {
                        var9 = var13.method3145();
                        if (var16 == 1) {
                            var10 = var13.method3145();
                        }
                    }
                    var12.method2240();
                } catch (IOException var49) {
                    var49.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method2044(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label199: for (int var20 = 0; var20 < Statics.field310.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field1324.length; var21++) {
                        File var22 = new File(Statics.field1324[var21] + Statics.field310[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method2044(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label199;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field3466 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var48) {
                    var48.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                File var32 = new File(var9);
                Object var33 = null;
                try {
                    class124 var34 = new class124(Statics.field568, "rw", 10000L);
                    class181 var35 = new class181(500);
                    var35.method3020(3);
                    var35.method3020(var33 == null ? 0 : 1);
                    var35.method3029(var32.getPath());
                    if (var33 != null) {
                        var35.method3029(((File) var33).getPath());
                    }
                    var34.method2241(var35.field2496, 0, var35.field2498);
                    var34.method2240();
                } catch (IOException var44) {
                    var44.printStackTrace();
                }
            }
            File var37 = new File(var9);
            Statics.field794 = var37;
            if (!Statics.field794.exists()) {
                Statics.field794.mkdirs();
            }
            File[] var38 = Statics.field794.listFiles();
            if (var38 != null) {
                File[] var39 = var38;
                for (int var40 = 0; var40 < var39.length; var40++) {
                    File var41 = var39[var40];
                    if (!method2044(var41, false)) {
                        var7++;
                        continue label225;
                    }
                }
            }
            break;
        }
        File var42 = Statics.field794;
        Statics.field2164 = var42;
        if (!Statics.field2164.exists()) {
            throw new RuntimeException("");
        }
        class159.field2163 = true;
        method37();
        field2158 = new class123(new class124(class159.method3("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2155 = new class123(new class124(class159.method3("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field752 = new class123[Statics.field2154];
        for (int var43 = 0; var43 < Statics.field2154; var43++) {
            Statics.field752[var43] = new class123(new class124(class159.method3("main_file_cache.idx" + var43), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("dh.x(Ljava/io/File;ZB)Z")
    public static boolean method2044(File arg0, boolean arg1) {
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

    @ObfuscatedName("af.k(Ljava/lang/String;Ljava/lang/String;ZI)Ldt;")
    public static class124 method609(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field794, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class124(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1460 == 33) {
            var6 = "_rc";
        } else if (Statics.field1460 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field3466, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class124(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class124(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("p.z(I)V")
    public static void method37() {
        try {
            File var0 = new File(Statics.field3466, "random.dat");
            if (var0.exists()) {
                field2156 = new class123(new class124(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field310.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1324.length; var2++) {
                        File var3 = new File(Statics.field1324[var2] + Statics.field310[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2156 = new class123(new class124(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2156 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2156 = new class123(new class124(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("bu.v(B)[B")
    public static byte[] method1096() {
        byte[] var0 = new byte[24];
        try {
            field2156.method2236(0L);
            field2156.method2214(var0);
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

    @ObfuscatedName("ee.m(I)V")
    public static void method2767() {
        try {
            field2158.method2211();
            for (int var0 = 0; var0 < Statics.field2154; var0++) {
                Statics.field752[var0].method2211();
            }
            field2155.method2211();
            field2156.method2211();
        } catch (Exception var2) {
        }
    }
}
