package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fh")
public class class158 {

    @ObfuscatedName("fh.k")
    public static class112 field2012 = null;

    @ObfuscatedName("fh.o")
    public static class112 field2009 = null;

    @ObfuscatedName("fh.q")
    public static class112 field2014 = null;

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.y(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1043(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2007 = new File(Statics.field1901, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2007.exists()) {
            try {
                class113 var7 = new class113(Statics.field2007, "rw", 10000L);
                class185 var8 = new class185((int) var7.method2327());
                while (var8.field2374 < var8.field2373.length) {
                    int var9 = var7.method2328(var8.field2373, var8.field2374, var8.field2373.length - var8.field2374);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2374 += var9;
                }
                var8.field2374 = 0;
                int var10 = var8.method3299();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3299();
                }
                if (var10 <= 2) {
                    var4 = var8.method3364();
                    if (var11 == 1) {
                        var5 = var8.method3364();
                    }
                } else {
                    var4 = var8.method3469();
                    if (var11 == 1) {
                        var5 = var8.method3469();
                    }
                }
                var7.method2331();
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
                if (!method4214(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1100.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2015.length; var16++) {
                    File var17 = new File(Statics.field2015[var16] + Statics.field1100[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method4214(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1901 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method1767(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("cg.c(Ljava/io/File;Ljava/io/File;B)V")
    public static void method1767(File arg0, File arg1) {
        try {
            class113 var2 = new class113(Statics.field2007, "rw", 10000L);
            class185 var3 = new class185(500);
            var3.method3253(3);
            var3.method3253(arg1 == null ? 0 : 1);
            var3.method3262(arg0.getPath());
            if (arg1 != null) {
                var3.method3262(arg1.getPath());
            }
            var2.method2324(var3.field2373, 0, var3.field2374);
            var2.method2331();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("if.n(Ljava/io/File;ZI)Z")
    public static boolean method4214(File arg0, boolean arg1) {
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

    @ObfuscatedName("fx.u(Ljava/lang/String;Ljava/lang/String;ZI)Ldd;")
    public static class113 method3166(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2006, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class113(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3201 == 33) {
            var6 = "_rc";
        } else if (Statics.field3201 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1901, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class113(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class113(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fo.i(I)[B")
    public static byte[] method3161() {
        byte[] var0 = new byte[24];
        try {
            field2012.method2286(0L);
            field2012.method2289(var0);
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

    @ObfuscatedName("aw.p(I)V")
    public static void method636() {
        try {
            field2009.method2310();
            for (int var0 = 0; var0 < Statics.field2011; var0++) {
                Statics.field2437[var0].method2310();
            }
            field2014.method2310();
            field2012.method2310();
        } catch (Exception var2) {
        }
    }
}
