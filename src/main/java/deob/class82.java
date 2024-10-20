package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cr")
public class class82 {

    @ObfuscatedName("cr.i")
    public static class30 field1404 = null;

    @ObfuscatedName("cr.p")
    public static class30 field1405 = null;

    @ObfuscatedName("cr.e")
    public static class30 field1406 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.a(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method5(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1400 = new File(Statics.field1416, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1400.exists()) {
            try {
                class29 var7 = new class29(Statics.field1400, "rw", 10000L);
                class126 var8 = new class126((int) var7.method527());
                while (var8.field2016 < var8.field2015.length) {
                    int var9 = var7.method512(var8.field2015, var8.field2016, var8.field2015.length - var8.field2016);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2016 += var9;
                }
                var8.field2016 = 0;
                int var10 = var8.method2481();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2481();
                }
                if (var10 <= 2) {
                    var4 = var8.method2378();
                    if (var11 == 1) {
                        var5 = var8.method2378();
                    }
                } else {
                    var4 = var8.method2534();
                    if (var11 == 1) {
                        var5 = var8.method2534();
                    }
                }
                var7.method514();
            } catch (IOException var28) {
                var28.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method2525(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field79.length; var15++) {
                for (int var16 = 0; var16 < Statics.field381.length; var16++) {
                    File var17 = new File(Statics.field381[var16] + Statics.field79[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2525(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1416 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var27) {
                var27.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method1311(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("bf.r(Ljava/io/File;Ljava/io/File;B)V")
    public static void method1311(File arg0, File arg1) {
        try {
            class29 var2 = new class29(Statics.field1400, "rw", 10000L);
            class126 var3 = new class126(500);
            var3.method2364(3);
            var3.method2364(arg1 == null ? 0 : 1);
            var3.method2559(arg0.getPath());
            if (arg1 != null) {
                var3.method2559(arg1.getPath());
            }
            var2.method509(var3.field2015, 0, var3.field2016);
            var2.method514();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("df.u(Ljava/io/File;ZI)Z")
    public static boolean method2525(File arg0, boolean arg1) {
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

    @ObfuscatedName("g.t(Ljava/lang/String;Ljava/lang/String;ZI)Lau;")
    public static class29 method48(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1403, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1407 == 33) {
            var6 = "_rc";
        } else if (Statics.field1407 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1416, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class29(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class29(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("o.k(Ldf;I)V")
    public static void method115(class126 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1404.method548(0L);
            field1404.method534(var1);
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
        arg0.method2372(var1, 0, 24);
    }

    @ObfuscatedName("bz.x(B)V")
    public static void method1279() {
        try {
            field1405.method531();
            for (int var0 = 0; var0 < Statics.field1993; var0++) {
                Statics.field120[var0].method531();
            }
            field1406.method531();
            field1404.method531();
        } catch (Exception var2) {
        }
    }
}
