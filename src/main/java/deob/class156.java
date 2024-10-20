package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ee")
public class class156 {

    @ObfuscatedName("ee.n")
    public static class122 field2241 = null;

    @ObfuscatedName("ee.u")
    public static class122 field2240 = null;

    @ObfuscatedName("ee.t")
    public static class122 field2242 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.w(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method61(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field513 = new File(Statics.field481, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field513.exists()) {
            try {
                class123 var7 = new class123(Statics.field513, "rw", 10000L);
                class174 var8 = new class174((int) var7.method2207());
                while (var8.field2390 < var8.field2389.length) {
                    int var9 = var7.method2208(var8.field2389, var8.field2390, var8.field2389.length - var8.field2390);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2390 += var9;
                }
                var8.field2390 = 0;
                int var10 = var8.method2971();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2971();
                }
                if (var10 <= 2) {
                    var4 = var8.method3115();
                    if (var11 == 1) {
                        var5 = var8.method3115();
                    }
                } else {
                    var4 = var8.method2982();
                    if (var11 == 1) {
                        var5 = var8.method2982();
                    }
                }
                var7.method2222();
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
                if (!method538(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field3672.length; var15++) {
                for (int var16 = 0; var16 < Statics.field3747.length; var16++) {
                    File var17 = new File(Statics.field3747[var16] + Statics.field3672[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method538(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field481 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class123 var29 = new class123(Statics.field513, "rw", 10000L);
                class174 var30 = new class174(500);
                var30.method2955(3);
                var30.method2955(var28 == null ? 0 : 1);
                var30.method2964(var27.getPath());
                if (var28 != null) {
                    var30.method2964(((File) var28).getPath());
                }
                var29.method2204(var30.field2389, 0, var30.field2390);
                var29.method2222();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("am.s(Ljava/io/File;ZS)Z")
    public static boolean method538(File arg0, boolean arg1) {
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

    @ObfuscatedName("ev.q(Ljava/lang/String;Ljava/lang/String;ZI)Ldw;")
    public static class123 method2350(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2238, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class123(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1534 == 33) {
            var6 = "_rc";
        } else if (Statics.field1534 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field481, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("cp.o(I)V")
    public static void method1480() {
        try {
            File var0 = new File(Statics.field481, "random.dat");
            if (var0.exists()) {
                field2241 = new class122(new class123(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field3672.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field3747.length; var2++) {
                        File var3 = new File(Statics.field3747[var2] + Statics.field3672[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2241 = new class122(new class123(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2241 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2241 = new class122(new class123(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ik.g(I)[B")
    public static byte[] method4200() {
        byte[] var0 = new byte[24];
        try {
            field2241.method2177(0L);
            field2241.method2179(var0);
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

    @ObfuscatedName("cr.v(Lfz;II)V")
    public static void method1584(class174 arg0, int arg1) {
        if (field2241 == null) {
            return;
        }
        try {
            field2241.method2177(0L);
            field2241.method2182(arg0.field2389, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bk.p(I)V")
    public static void method1050() {
        try {
            field2240.method2198();
            for (int var0 = 0; var0 < Statics.field2837; var0++) {
                Statics.field2418[var0].method2198();
            }
            field2242.method2198();
            field2241.method2198();
        } catch (Exception var2) {
        }
    }
}
