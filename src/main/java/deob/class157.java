package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fa")
public class class157 {

    @ObfuscatedName("fa.q")
    public static class124 field2259 = null;

    @ObfuscatedName("fa.u")
    public static class124 field2258 = null;

    @ObfuscatedName("fa.k")
    public static class124 field2251 = null;

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.s(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method47(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2257 = new File(Statics.field2261, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2257.exists()) {
            try {
                class125 var7 = new class125(Statics.field2257, "rw", 10000L);
                class177 var8 = new class177((int) var7.method2188());
                while (var8.field2402 < var8.field2403.length) {
                    int var9 = var7.method2198(var8.field2403, var8.field2402, var8.field2403.length - var8.field2402);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2402 += var9;
                }
                var8.field2402 = 0;
                int var10 = var8.method2965();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2965();
                }
                if (var10 <= 2) {
                    var4 = var8.method3021();
                    if (var11 == 1) {
                        var5 = var8.method3021();
                    }
                } else {
                    var4 = var8.method2975();
                    if (var11 == 1) {
                        var5 = var8.method2975();
                    }
                }
                var7.method2184();
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
                if (!method716(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field589.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2198.length; var16++) {
                    File var17 = new File(Statics.field2198[var16] + Statics.field589[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method716(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2261 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class125 var29 = new class125(Statics.field2257, "rw", 10000L);
                class177 var30 = new class177(500);
                var30.method3129(3);
                var30.method3129(var28 == null ? 0 : 1);
                var30.method2958(var27.getPath());
                if (var28 != null) {
                    var30.method2958(((File) var28).getPath());
                }
                var29.method2208(var30.field2403, 0, var30.field2402);
                var29.method2184();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("bl.c(Ljava/io/File;ZI)Z")
    public static boolean method716(File arg0, boolean arg1) {
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

    @ObfuscatedName("z.f(Ljava/lang/String;Ljava/lang/String;ZI)Ldv;")
    public static class125 method46(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2253, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field653 == 33) {
            var6 = "_rc";
        } else if (Statics.field653 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2261, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("dz.m(B)V")
    public static void method1954() {
        try {
            File var0 = new File(Statics.field2261, "random.dat");
            if (var0.exists()) {
                field2259 = new class124(new class125(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field589.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2198.length; var2++) {
                        File var3 = new File(Statics.field2198[var2] + Statics.field589[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2259 = new class124(new class125(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2259 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2259 = new class124(new class125(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("as.h(B)[B")
    public static byte[] method456() {
        byte[] var0 = new byte[24];
        try {
            field2259.method2157(0L);
            field2259.method2159(var0);
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

    @ObfuscatedName("r.t(Lfs;II)V")
    public static void method91(class177 arg0, int arg1) {
        if (field2259 == null) {
            return;
        }
        try {
            field2259.method2157(0L);
            field2259.method2171(arg0.field2403, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ho.p(I)V")
    public static void method3817() {
        try {
            field2258.method2180();
            for (int var0 = 0; var0 < Statics.field2254; var0++) {
                Statics.field310[var0].method2180();
            }
            field2251.method2180();
            field2259.method2180();
        } catch (Exception var2) {
        }
    }
}
