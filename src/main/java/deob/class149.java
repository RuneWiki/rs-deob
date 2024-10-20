package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ee")
public class class149 {

    @ObfuscatedName("ee.l")
    public static class228 field2224 = null;

    @ObfuscatedName("ee.h")
    public static class228 field2226 = null;

    @ObfuscatedName("ee.i")
    public static class228 field2222 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.a(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method779(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2219 = new File(Statics.field2162, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2219.exists()) {
            try {
                class227 var7 = new class227(Statics.field2219, "rw", 10000L);
                class119 var8 = new class119((int) var7.method3864());
                while (var8.field1980 < var8.field1981.length) {
                    int var9 = var7.method3865(var8.field1981, var8.field1980, var8.field1981.length - var8.field1980);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1980 += var9;
                }
                var8.field1980 = 0;
                int var10 = var8.method2412();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2412();
                }
                if (var10 <= 2) {
                    var4 = var8.method2442();
                    if (var11 == 1) {
                        var5 = var8.method2442();
                    }
                } else {
                    var4 = var8.method2355();
                    if (var11 == 1) {
                        var5 = var8.method2355();
                    }
                }
                var7.method3876();
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
                if (!method2814(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field2014.length; var15++) {
                for (int var16 = 0; var16 < Statics.field13.length; var16++) {
                    File var17 = new File(Statics.field13[var16] + Statics.field2014[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2814(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2162 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method678(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ac.r(Ljava/io/File;Ljava/io/File;I)V")
    public static void method678(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2219, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2330(3);
            var3.method2330(arg1 == null ? 0 : 1);
            var3.method2338(arg0.getPath());
            if (arg1 != null) {
                var3.method2338(arg1.getPath());
            }
            var2.method3862(var3.field1981, 0, var3.field1980);
            var2.method3876();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ex.f(Ljava/io/File;ZI)Z")
    public static boolean method2814(File arg0, boolean arg1) {
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

    @ObfuscatedName("ef.s(Ljava/lang/String;Ljava/lang/String;ZI)Lhn;")
    public static class227 method2708(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2220, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2079 == 33) {
            var6 = "_rc";
        } else if (Statics.field2079 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2162, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("fg.y(I)V")
    public static void method2943() {
        try {
            field2226.method3880();
            for (int var0 = 0; var0 < Statics.field1620; var0++) {
                Statics.field3222[var0].method3880();
            }
            field2222.method3880();
            field2224.method3880();
        } catch (Exception var2) {
        }
    }
}
