package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fk")
public class class157 {

    @ObfuscatedName("fk.o")
    public static class123 field2152 = null;

    @ObfuscatedName("fk.a")
    public static class123 field2149 = null;

    @ObfuscatedName("fk.q")
    public static class123 field2154 = null;

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.b(Ljava/lang/String;Ljava/lang/String;IIB)V")
    public static void method2674(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field2213 = arg3;
        Statics.field1778 = arg2;
        try {
            Statics.field3265 = System.getProperty("os.name");
        } catch (Exception var47) {
            Statics.field3265 = "Unknown";
        }
        Statics.field296 = Statics.field3265.toLowerCase();
        try {
            Statics.field2403 = System.getProperty("user.home");
            if (Statics.field2403 != null) {
                Statics.field2403 = Statics.field2403 + "/";
            }
        } catch (Exception var46) {
        }
        try {
            if (Statics.field296.startsWith("win")) {
                if (Statics.field2403 == null) {
                    Statics.field2403 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field2403 == null) {
                Statics.field2403 = System.getenv("HOME");
            }
            if (Statics.field2403 != null) {
                Statics.field2403 = Statics.field2403 + "/";
            }
        } catch (Exception var45) {
        }
        if (Statics.field2403 == null) {
            Statics.field2403 = "~/";
        }
        Statics.field223 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2403, "/tmp/", "" };
        Statics.field328 = new String[] { ".jagex_cache_" + Statics.field1778, ".file_store_" + Statics.field1778 };
        int var7 = 0;
        label242: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field2155 = new File(Statics.field2403, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field2155.exists()) {
                try {
                    class124 var12 = new class124(Statics.field2155, "rw", 10000L);
                    class181 var13 = new class181((int) var12.method2174());
                    while (var13.field2488 < var13.field2495.length) {
                        int var14 = var12.method2171(var13.field2495, var13.field2488, var13.field2495.length - var13.field2488);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field2488 += var14;
                    }
                    var13.field2488 = 0;
                    int var15 = var13.method2945();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method2945();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method2970();
                        if (var16 == 1) {
                            var10 = var13.method2970();
                        }
                    } else {
                        var9 = var13.method3028();
                        if (var16 == 1) {
                            var10 = var13.method3028();
                        }
                    }
                    var12.method2180();
                } catch (IOException var50) {
                    var50.printStackTrace();
                }
                if (var9 != null) {
                    File var18 = new File(var9);
                    if (!var18.exists()) {
                        var9 = null;
                    }
                }
                if (var9 != null) {
                    File var19 = new File(var9, "test.dat");
                    if (!method125(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label216: for (int var20 = 0; var20 < Statics.field328.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field223.length; var21++) {
                        File var22 = new File(Statics.field223[var21] + Statics.field328[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method125(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label216;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field2403 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                } catch (Exception var49) {
                    var49.printStackTrace();
                }
                var11 = true;
            }
            if (var11) {
                method121(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field2148 = var32;
            if (!Statics.field2148.exists()) {
                Statics.field2148.mkdirs();
            }
            File[] var33 = Statics.field2148.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method125(var36, false)) {
                        var7++;
                        continue label242;
                    }
                }
            }
            break;
        }
        class159.method35(Statics.field2148);
        try {
            File var37 = new File(Statics.field2403, "random.dat");
            if (var37.exists()) {
                field2152 = new class123(new class124(var37, "rw", 25L), 24, 0);
            } else {
                label169: for (int var38 = 0; var38 < Statics.field328.length; var38++) {
                    for (int var39 = 0; var39 < Statics.field223.length; var39++) {
                        File var40 = new File(Statics.field223[var39] + Statics.field328[var38] + File.separatorChar + "random.dat");
                        if (var40.exists()) {
                            field2152 = new class123(new class124(var40, "rw", 25L), 24, 0);
                            break label169;
                        }
                    }
                }
            }
            if (field2152 == null) {
                RandomAccessFile var41 = new RandomAccessFile(var37, "rw");
                int var42 = var41.read();
                var41.seek(0L);
                var41.write(var42);
                var41.seek(0L);
                var41.close();
                field2152 = new class123(new class124(var37, "rw", 25L), 24, 0);
            }
        } catch (IOException var48) {
        }
        field2149 = new class123(new class124(class159.method4572("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field2154 = new class123(new class124(class159.method4572("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field2701 = new class123[Statics.field2213];
        for (int var44 = 0; var44 < Statics.field2213; var44++) {
            Statics.field2701[var44] = new class123(new class124(class159.method4572("main_file_cache.idx" + var44), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("y.s(Ljava/io/File;Ljava/io/File;I)V")
    public static void method121(File arg0, File arg1) {
        try {
            class124 var2 = new class124(Statics.field2155, "rw", 10000L);
            class181 var3 = new class181(500);
            var3.method2929(3);
            var3.method2929(arg1 == null ? 0 : 1);
            var3.method2938(arg0.getPath());
            if (arg1 != null) {
                var3.method2938(arg1.getPath());
            }
            var2.method2167(var3.field2495, 0, var3.field2488);
            var2.method2180();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("y.r(Ljava/io/File;ZI)Z")
    public static boolean method125(File arg0, boolean arg1) {
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

    @ObfuscatedName("df.g(Ljava/lang/String;Ljava/lang/String;ZB)Ldx;")
    public static class124 method2296(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2148, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class124(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1778 == 33) {
            var6 = "_rc";
        } else if (Statics.field1778 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2403, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ef.x(Lfs;II)V")
    public static void method2691(class181 arg0, int arg1) {
        if (field2152 == null) {
            return;
        }
        try {
            field2152.method2149(0L);
            field2152.method2138(arg0.field2495, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("iu.f(I)V")
    public static void method3932() {
        try {
            field2149.method2156();
            for (int var0 = 0; var0 < Statics.field2213; var0++) {
                Statics.field2701[var0].method2156();
            }
            field2154.method2156();
            field2152.method2156();
        } catch (Exception var2) {
        }
    }
}
