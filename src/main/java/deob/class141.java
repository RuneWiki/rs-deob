package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("er")
public class class141 {

    @ObfuscatedName("er.p")
    public static class218 field2090 = null;

    @ObfuscatedName("er.u")
    public static class218 field2086 = null;

    @ObfuscatedName("er.g")
    public static class218 field2078 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.q(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2421(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2080 = new File(Statics.field983, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2080.exists()) {
            try {
                class217 var7 = new class217(Statics.field2080, "rw", 10000L);
                class111 var8 = new class111((int) var7.method3585());
                while (var8.field1852 < var8.field1859.length) {
                    int var9 = var7.method3597(var8.field1859, var8.field1852, var8.field1859.length - var8.field1852);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1852 += var9;
                }
                var8.field1852 = 0;
                int var10 = var8.method2231();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2231();
                }
                if (var10 <= 2) {
                    var4 = var8.method2157();
                    if (var11 == 1) {
                        var5 = var8.method2157();
                    }
                } else {
                    var4 = var8.method2158();
                    if (var11 == 1) {
                        var5 = var8.method2158();
                    }
                }
                var7.method3584();
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
                if (!method833(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1653.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2089.length; var16++) {
                    File var17 = new File(Statics.field2089[var16] + Statics.field1653[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method833(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field983 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method2555(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("eb.s(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2555(File arg0, File arg1) {
        try {
            class217 var2 = new class217(Statics.field2080, "rw", 10000L);
            class111 var3 = new class111(500);
            var3.method2133(3);
            var3.method2133(arg1 == null ? 0 : 1);
            var3.method2141(arg0.getPath());
            if (arg1 != null) {
                var3.method2141(arg1.getPath());
            }
            var2.method3596(var3.field1859, 0, var3.field1852);
            var2.method3584();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("au.h(Ljava/io/File;ZB)Z")
    public static boolean method833(File arg0, boolean arg1) {
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

    @ObfuscatedName("ae.e(Ljava/lang/String;Ljava/lang/String;ZI)Lhu;")
    public static class217 method546(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1917, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class217(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field539 == 33) {
            var6 = "_rc";
        } else if (Statics.field539 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field983, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class217(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class217(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cb.n(B)V")
    public static void method2071() {
        try {
            File var0 = new File(Statics.field983, "random.dat");
            if (var0.exists()) {
                field2090 = new class218(new class217(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1653.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2089.length; var2++) {
                        File var3 = new File(Statics.field2089[var2] + Statics.field1653[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2090 = new class218(new class217(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2090 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2090 = new class218(new class217(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("dq.t(Ldx;B)V")
    public static void method2093(class111 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2090.method3602(0L);
            field2090.method3604(var1);
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
        arg0.method2142(var1, 0, 24);
    }

    @ObfuscatedName("f.l(Ldx;II)V")
    public static void method480(class111 arg0, int arg1) {
        if (field2090 == null) {
            return;
        }
        try {
            field2090.method3602(0L);
            field2090.method3608(arg0.field1859, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
