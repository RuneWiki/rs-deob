package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eh")
public class class149 {

    @ObfuscatedName("eh.s")
    public static class228 field2221 = null;

    @ObfuscatedName("eh.w")
    public static class228 field2222 = null;

    @ObfuscatedName("eh.e")
    public static class228 field2223 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.j(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2833(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field573 = new File(Statics.field15, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field573.exists()) {
            try {
                class227 var7 = new class227(Statics.field573, "rw", 10000L);
                class119 var8 = new class119((int) var7.method3903());
                while (var8.field1982 < var8.field1981.length) {
                    int var9 = var7.method3904(var8.field1981, var8.field1982, var8.field1981.length - var8.field1982);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1982 += var9;
                }
                var8.field1982 = 0;
                int var10 = var8.method2372();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2372();
                }
                if (var10 <= 2) {
                    var4 = var8.method2398();
                    if (var11 == 1) {
                        var5 = var8.method2398();
                    }
                } else {
                    var4 = var8.method2551();
                    if (var11 == 1) {
                        var5 = var8.method2551();
                    }
                }
                var7.method3910();
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
                if (!method4(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field210.length; var15++) {
                for (int var16 = 0; var16 < Statics.field3037.length; var16++) {
                    File var17 = new File(Statics.field3037[var16] + Statics.field210[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method4(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field15 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class227 var29 = new class227(Statics.field573, "rw", 10000L);
                class119 var30 = new class119(500);
                var30.method2357(3);
                var30.method2357(var28 == null ? 0 : 1);
                var30.method2365(var27.getPath());
                if (var28 != null) {
                    var30.method2365(((File) var28).getPath());
                }
                var29.method3912(var30.field1981, 0, var30.field1982);
                var29.method3910();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("j.m(Ljava/io/File;ZB)Z")
    public static boolean method4(File arg0, boolean arg1) {
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

    @ObfuscatedName("bb.f(Ljava/lang/String;Ljava/lang/String;ZI)Lhm;")
    public static class227 method1554(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2227, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field563 == 33) {
            var6 = "_rc";
        } else if (Statics.field563 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field15, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("dh.l(I)V")
    public static void method2288() {
        try {
            File var0 = new File(Statics.field15, "random.dat");
            if (var0.exists()) {
                field2221 = new class228(new class227(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field210.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field3037.length; var2++) {
                        File var3 = new File(Statics.field3037[var2] + Statics.field210[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2221 = new class228(new class227(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2221 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2221 = new class228(new class227(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ej.u(Ldc;II)V")
    public static void method2836(class119 arg0, int arg1) {
        if (field2221 == null) {
            return;
        }
        try {
            field2221.method3915(0L);
            field2221.method3922(arg0.field1981, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
