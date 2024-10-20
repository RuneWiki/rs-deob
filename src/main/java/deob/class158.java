package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fk")
public class class158 {

    @ObfuscatedName("fk.a")
    public static class427 field1732 = null;

    @ObfuscatedName("fk.m")
    public static class427 field1728 = null;

    @ObfuscatedName("fk.u")
    public static class427 field1734 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.s(Ljava/lang/String;Ljava/lang/String;IIS)V")
    public static void method1962(String arg0, String arg1, int arg2, int arg3) throws IOException {
        Statics.field4689 = arg3;
        Statics.field4139 = arg2;
        try {
            Statics.field1658 = System.getProperty("os.name");
        } catch (Exception var41) {
            Statics.field1658 = "Unknown";
        }
        Statics.field1802 = Statics.field1658.toLowerCase();
        try {
            Statics.field4335 = System.getProperty("user.home");
            if (Statics.field4335 != null) {
                Statics.field4335 = Statics.field4335 + "/";
            }
        } catch (Exception var40) {
        }
        try {
            if (Statics.field1802.startsWith("win")) {
                if (Statics.field4335 == null) {
                    Statics.field4335 = System.getenv("USERPROFILE");
                }
            } else if (Statics.field4335 == null) {
                Statics.field4335 = System.getenv("HOME");
            }
            if (Statics.field4335 != null) {
                Statics.field4335 = Statics.field4335 + "/";
            }
        } catch (Exception var39) {
        }
        if (Statics.field4335 == null) {
            Statics.field4335 = "~/";
        }
        Statics.field4312 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field4335, "/tmp/", "" };
        Statics.field102 = new String[] { ".jagex_cache_" + Statics.field4139, ".file_store_" + Statics.field4139 };
        int var7 = 0;
        label210: while (var7 < 4) {
            String var8 = var7 == 0 ? "" : "" + var7;
            Statics.field3991 = new File(Statics.field4335, "jagex_cl_" + arg0 + "_" + arg1 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (Statics.field3991.exists()) {
                try {
                    class426 var12 = new class426(Statics.field3991, "rw", 10000L);
                    class444 var13 = new class444((int) var12.method6713());
                    while (var13.field4708 < var13.field4707.length) {
                        int var14 = var12.method6719(var13.field4707, var13.field4708, var13.field4707.length - var13.field4708);
                        if (var14 == -1) {
                            throw new IOException();
                        }
                        var13.field4708 += var14;
                    }
                    var13.field4708 = 0;
                    int var15 = var13.method6929();
                    if (var15 < 1 || var15 > 3) {
                        throw new IOException("" + var15);
                    }
                    int var16 = 0;
                    if (var15 > 1) {
                        var16 = var13.method6929();
                    }
                    if (var15 <= 2) {
                        var9 = var13.method7022();
                        if (var16 == 1) {
                            var10 = var13.method7022();
                        }
                    } else {
                        var9 = var13.method6941();
                        if (var16 == 1) {
                            var10 = var13.method6941();
                        }
                    }
                    var12.method6716();
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
                    if (!method3881(var19, true)) {
                        var9 = null;
                    }
                }
            }
            if (var9 == null && var7 == 0) {
                label184: for (int var20 = 0; var20 < Statics.field102.length; var20++) {
                    for (int var21 = 0; var21 < Statics.field4312.length; var21++) {
                        File var22 = new File(Statics.field4312[var21] + Statics.field102[var20] + File.separatorChar + arg0 + File.separatorChar);
                        if (var22.exists() && method3881(new File(var22, "test.dat"), true)) {
                            var9 = var22.toString();
                            var11 = true;
                            break label184;
                        }
                    }
                }
            }
            if (var9 == null) {
                var9 = Statics.field4335 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                method2287(new File(var9), (File) null);
            }
            File var32 = new File(var9);
            Statics.field1532 = var32;
            if (!Statics.field1532.exists()) {
                Statics.field1532.mkdirs();
            }
            File[] var33 = Statics.field1532.listFiles();
            if (var33 != null) {
                File[] var34 = var33;
                for (int var35 = 0; var35 < var34.length; var35++) {
                    File var36 = var34[var35];
                    if (!method3881(var36, false)) {
                        var7++;
                        continue label210;
                    }
                }
            }
            break;
        }
        File var37 = Statics.field1532;
        Statics.field1737 = var37;
        if (!Statics.field1737.exists()) {
            throw new RuntimeException("");
        }
        class160.field1743 = true;
        method1963();
        field1728 = new class427(new class426(class160.method12("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        field1734 = new class427(new class426(class160.method12("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        Statics.field1428 = new class427[Statics.field4689];
        for (int var38 = 0; var38 < Statics.field4689; var38++) {
            Statics.field1428[var38] = new class427(new class426(class160.method12("main_file_cache.idx" + var38), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("cg.h(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2287(File arg0, File arg1) {
        try {
            class426 var2 = new class426(Statics.field3991, "rw", 10000L);
            class444 var3 = new class444(500);
            var3.method6912(3);
            var3.method6912(arg1 == null ? 0 : 1);
            var3.method6921(arg0.getPath());
            if (arg1 != null) {
                var3.method6921(arg1.getPath());
            }
            var2.method6715(var3.field4707, 0, var3.field4708);
            var2.method6716();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("gq.w(Ljava/io/File;ZI)Z")
    public static boolean method3881(File arg0, boolean arg1) {
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

    @ObfuscatedName("pk.v(Ljava/lang/String;Ljava/lang/String;ZB)Lpn;")
    public static class426 method6804(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1532, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class426(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field4139 == 33) {
            var6 = "_rc";
        } else if (Statics.field4139 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field4335, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class426(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class426(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cl.c(I)V")
    public static void method1963() {
        try {
            File var0 = new File(Statics.field4335, "random.dat");
            if (var0.exists()) {
                field1732 = new class427(new class426(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field102.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field4312.length; var2++) {
                        File var3 = new File(Statics.field4312[var2] + Statics.field102[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1732 = new class427(new class426(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1732 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1732 = new class427(new class426(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
