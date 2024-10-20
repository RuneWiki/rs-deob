package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eq")
public class class149 {

    @ObfuscatedName("eq.w")
    public static class228 field2220 = null;

    @ObfuscatedName("eq.v")
    public static class228 field2226 = null;

    @ObfuscatedName("eq.o")
    public static class228 field2228 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.f(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method2150(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2223 = new File(Statics.field185, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2223.exists()) {
            try {
                class227 var7 = new class227(Statics.field2223, "rw", 10000L);
                class119 var8 = new class119((int) var7.method3858());
                while (var8.field1994 < var8.field2000.length) {
                    int var9 = var7.method3857(var8.field2000, var8.field1994, var8.field2000.length - var8.field1994);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1994 += var9;
                }
                var8.field1994 = 0;
                int var10 = var8.method2363();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2363();
                }
                if (var10 <= 2) {
                    var4 = var8.method2372();
                    if (var11 == 1) {
                        var5 = var8.method2372();
                    }
                } else {
                    var4 = var8.method2428();
                    if (var11 == 1) {
                        var5 = var8.method2428();
                    }
                }
                var7.method3859();
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
                if (!method574(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field212.length; var15++) {
                for (int var16 = 0; var16 < Statics.field224.length; var16++) {
                    File var17 = new File(Statics.field224[var16] + Statics.field212[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method574(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field185 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method174(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("z.s(Ljava/io/File;Ljava/io/File;S)V")
    public static void method174(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2223, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2426(3);
            var3.method2426(arg1 == null ? 0 : 1);
            var3.method2360(arg0.getPath());
            if (arg1 != null) {
                var3.method2360(arg1.getPath());
            }
            var2.method3846(var3.field2000, 0, var3.field1994);
            var2.method3859();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("y.q(Ljava/io/File;ZB)Z")
    public static boolean method574(File arg0, boolean arg1) {
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

    @ObfuscatedName("az.g(Ljava/lang/String;Ljava/lang/String;ZI)Lhn;")
    public static class227 method697(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2893, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field668 == 33) {
            var6 = "_rc";
        } else if (Statics.field668 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field185, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ew.m(B)V")
    public static void method2683() {
        try {
            field2226.method3881();
            for (int var0 = 0; var0 < Statics.field2222; var0++) {
                Statics.field2229[var0].method3881();
            }
            field2228.method3881();
            field2220.method3881();
        } catch (Exception var2) {
        }
    }
}
