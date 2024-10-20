package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ef")
public class class156 {

    @ObfuscatedName("ef.o")
    public static class122 field2259 = null;

    @ObfuscatedName("ef.i")
    public static class122 field2262 = null;

    @ObfuscatedName("ef.u")
    public static class122 field2261 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.d(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1949(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2256 = new File(Statics.field1408, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2256.exists()) {
            try {
                class123 var7 = new class123(Statics.field2256, "rw", 10000L);
                class174 var8 = new class174((int) var7.method2216());
                while (var8.field2405 < var8.field2409.length) {
                    int var9 = var7.method2224(var8.field2409, var8.field2405, var8.field2409.length - var8.field2405);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2405 += var9;
                }
                var8.field2405 = 0;
                int var10 = var8.method2955();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2955();
                }
                if (var10 <= 2) {
                    var4 = var8.method3125();
                    if (var11 == 1) {
                        var5 = var8.method3125();
                    }
                } else {
                    var4 = var8.method2966();
                    if (var11 == 1) {
                        var5 = var8.method2966();
                    }
                }
                var7.method2234();
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
                if (!method1054(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field880.length; var15++) {
                for (int var16 = 0; var16 < Statics.field322.length; var16++) {
                    File var17 = new File(Statics.field322[var16] + Statics.field880[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1054(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1408 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method141(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("a.k(Ljava/io/File;Ljava/io/File;I)V")
    public static void method141(File arg0, File arg1) {
        try {
            class123 var2 = new class123(Statics.field2256, "rw", 10000L);
            class174 var3 = new class174(500);
            var3.method2970(3);
            var3.method2970(arg1 == null ? 0 : 1);
            var3.method3163(arg0.getPath());
            if (arg1 != null) {
                var3.method3163(arg1.getPath());
            }
            var2.method2213(var3.field2409, 0, var3.field2405);
            var2.method2234();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("bm.e(Ljava/io/File;ZI)Z")
    public static boolean method1054(File arg0, boolean arg1) {
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

    @ObfuscatedName("cy.p(Ljava/lang/String;Ljava/lang/String;ZI)Ldw;")
    public static class123 method1580(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2257, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class123(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field859 == 33) {
            var6 = "_rc";
        } else if (Statics.field859 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1408, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class123(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class123(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ea.q(I)[B")
    public static byte[] method2711() {
        byte[] var0 = new byte[24];
        try {
            field2259.method2181(0L);
            field2259.method2183(var0);
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
}
