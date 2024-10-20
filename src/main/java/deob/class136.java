package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ej")
public class class136 {

    @ObfuscatedName("ej.h")
    public static class197 field2080 = null;

    @ObfuscatedName("ej.a")
    public static class197 field2081 = null;

    @ObfuscatedName("ej.y")
    public static class197 field2079 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.p(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1651(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2076 = new File(Statics.field971, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2076.exists()) {
            try {
                class196 var7 = new class196(Statics.field2076, "rw", 10000L);
                class107 var8 = new class107((int) var7.method3493());
                while (var8.field1837 < var8.field1838.length) {
                    int var9 = var7.method3507(var8.field1838, var8.field1837, var8.field1838.length - var8.field1837);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1837 += var9;
                }
                var8.field1837 = 0;
                int var10 = var8.method2173();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2173();
                }
                if (var10 <= 2) {
                    var4 = var8.method2328();
                    if (var11 == 1) {
                        var5 = var8.method2328();
                    }
                } else {
                    var4 = var8.method2183();
                    if (var11 == 1) {
                        var5 = var8.method2183();
                    }
                }
                var7.method3492();
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
                if (!method2114(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field793.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2085.length; var16++) {
                    File var17 = new File(Statics.field2085[var16] + Statics.field793[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2114(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field971 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class196 var29 = new class196(Statics.field2076, "rw", 10000L);
                class107 var30 = new class107(500);
                var30.method2159(3);
                var30.method2159(var28 == null ? 0 : 1);
                var30.method2166(var27.getPath());
                if (var28 != null) {
                    var30.method2166(((File) var28).getPath());
                }
                var29.method3491(var30.field1838, 0, var30.field1837);
                var29.method3492();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("cr.g(Ljava/io/File;ZI)Z")
    public static boolean method2114(File arg0, boolean arg1) {
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

    @ObfuscatedName("k.x(Ljava/lang/String;Ljava/lang/String;ZI)Lgm;")
    public static class196 method551(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2074, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class196(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field602 == 33) {
            var6 = "_rc";
        } else if (Statics.field602 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field971, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class196(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class196(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("y.c(I)V")
    public static void method136() {
        try {
            File var0 = new File(Statics.field971, "random.dat");
            if (var0.exists()) {
                field2080 = new class197(new class196(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field793.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2085.length; var2++) {
                        File var3 = new File(Statics.field2085[var2] + Statics.field793[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2080 = new class197(new class196(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2080 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2080 = new class197(new class196(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("df.n(Ldp;I)V")
    public static void method2581(class107 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2080.method3513(0L);
            field2080.method3515(var1);
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
        arg0.method2160(var1, 0, 24);
    }

    @ObfuscatedName("cd.s(Ldp;II)V")
    public static void method1918(class107 arg0, int arg1) {
        if (field2080 == null) {
            return;
        }
        try {
            field2080.method3513(0L);
            field2080.method3532(arg0.field1838, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("cy.r(I)V")
    public static void method2098() {
        try {
            field2081.method3512();
            for (int var0 = 0; var0 < Statics.field2078; var0++) {
                Statics.field1496[var0].method3512();
            }
            field2079.method3512();
            field2080.method3512();
        } catch (Exception var2) {
        }
    }
}
