package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fm")
public class class157 {

    @ObfuscatedName("fm.h")
    public static class124 field2263 = null;

    @ObfuscatedName("fm.a")
    public static class124 field2264 = null;

    @ObfuscatedName("fm.p")
    public static class124 field2265 = null;

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cy.w(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1600(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2437 = new File(Statics.field829, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2437.exists()) {
            try {
                class125 var7 = new class125(Statics.field2437, "rw", 10000L);
                class177 var8 = new class177((int) var7.method2114());
                while (var8.field2412 < var8.field2419.length) {
                    int var9 = var7.method2115(var8.field2419, var8.field2412, var8.field2419.length - var8.field2412);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2412 += var9;
                }
                var8.field2412 = 0;
                int var10 = var8.method2931();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2931();
                }
                if (var10 <= 2) {
                    var4 = var8.method2893();
                    if (var11 == 1) {
                        var5 = var8.method2893();
                    }
                } else {
                    var4 = var8.method2894();
                    if (var11 == 1) {
                        var5 = var8.method2894();
                    }
                }
                var7.method2113();
            } catch (IOException var34) {
                var34.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!method1012(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field3806.length; var15++) {
                for (int var16 = 0; var16 < Statics.field675.length; var16++) {
                    File var17 = new File(Statics.field675[var16] + Statics.field3806[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1012(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field829 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            } catch (Exception var33) {
                var33.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var27 = new File(var4);
            Object var28 = null;
            try {
                class125 var29 = new class125(Statics.field2437, "rw", 10000L);
                class177 var30 = new class177(500);
                var30.method3075(3);
                var30.method3075(var28 == null ? 0 : 1);
                var30.method2877(var27.getPath());
                if (var28 != null) {
                    var30.method2877(((File) var28).getPath());
                }
                var29.method2112(var30.field2419, 0, var30.field2412);
                var29.method2113();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("bc.o(Ljava/io/File;ZI)Z")
    public static boolean method1012(File arg0, boolean arg1) {
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

    @ObfuscatedName("bt.x(Ljava/lang/String;Ljava/lang/String;ZI)Ldw;")
    public static class125 method909(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2266, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3366 == 33) {
            var6 = "_rc";
        } else if (Statics.field3366 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field829, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class125(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class125(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ch.k(I)[B")
    public static byte[] method1620() {
        byte[] var0 = new byte[24];
        try {
            field2263.method2087(0L);
            field2263.method2089(var0);
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

    @ObfuscatedName("z.f(B)V")
    public static void method129() {
        try {
            field2264.method2092();
            for (int var0 = 0; var0 < Statics.field2259; var0++) {
                Statics.field385[var0].method2092();
            }
            field2265.method2092();
            field2263.method2092();
        } catch (Exception var2) {
        }
    }
}
