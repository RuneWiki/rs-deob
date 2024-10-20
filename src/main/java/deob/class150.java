package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ez")
public class class150 {

    @ObfuscatedName("ez.u")
    public static class229 field2216 = null;

    @ObfuscatedName("ez.r")
    public static class229 field2218 = null;

    @ObfuscatedName("ez.a")
    public static class229 field2219 = null;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ge.j(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method3455(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2213 = new File(Statics.field1530, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2213.exists()) {
            try {
                class228 var7 = new class228(Statics.field2213, "rw", 10000L);
                class120 var8 = new class120((int) var7.method3840());
                while (var8.field1972 < var8.field1974.length) {
                    int var9 = var7.method3841(var8.field1974, var8.field1972, var8.field1974.length - var8.field1972);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1972 += var9;
                }
                var8.field1972 = 0;
                int var10 = var8.method2361();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2361();
                }
                if (var10 <= 2) {
                    var4 = var8.method2370();
                    if (var11 == 1) {
                        var5 = var8.method2370();
                    }
                } else {
                    var4 = var8.method2371();
                    if (var11 == 1) {
                        var5 = var8.method2371();
                    }
                }
                var7.method3836();
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
                if (!method2695(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2008.length; var15++) {
                for (int var16 = 0; var16 < Statics.field269.length; var16++) {
                    File var17 = new File(Statics.field269[var16] + Statics.field2008[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2695(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1530 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class228 var29 = new class228(Statics.field2213, "rw", 10000L);
                class120 var30 = new class120(500);
                var30.method2364(3);
                var30.method2364(var28 == null ? 0 : 1);
                var30.method2430(var27.getPath());
                if (var28 != null) {
                    var30.method2430(((File) var28).getPath());
                }
                var29.method3845(var30.field1974, 0, var30.field1972);
                var29.method3836();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("et.h(Ljava/io/File;ZI)Z")
    public static boolean method2695(File arg0, boolean arg1) {
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

    @ObfuscatedName("an.z(I)V")
    public static void method653() {
        try {
            File var0 = new File(Statics.field1530, "random.dat");
            if (var0.exists()) {
                field2216 = new class229(new class228(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2008.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field269.length; var2++) {
                        File var3 = new File(Statics.field269[var2] + Statics.field2008[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2216 = new class229(new class228(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2216 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2216 = new class229(new class228(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("fp.x(B)V")
    public static void method2934() {
        try {
            field2218.method3866();
            for (int var0 = 0; var0 < Statics.field167; var0++) {
                Statics.field222[var0].method3866();
            }
            field2219.method3866();
            field2216.method3866();
        } catch (Exception var2) {
        }
    }
}
