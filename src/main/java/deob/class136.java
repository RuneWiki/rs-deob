package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ex")
public class class136 {

    @ObfuscatedName("ex.w")
    public static class196 field2099 = null;

    @ObfuscatedName("ex.y")
    public static class196 field2101 = null;

    @ObfuscatedName("ex.p")
    public static class196 field2100 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.k(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method90(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2090 = new File(Statics.field975, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2090.exists()) {
            try {
                class195 var7 = new class195(Statics.field2090, "rw", 10000L);
                class107 var8 = new class107((int) var7.method3452());
                while (var8.field1862 < var8.field1857.length) {
                    int var9 = var7.method3448(var8.field1857, var8.field1862, var8.field1857.length - var8.field1862);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1862 += var9;
                }
                var8.field1862 = 0;
                int var10 = var8.method2115();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2115();
                }
                if (var10 <= 2) {
                    var4 = var8.method2228();
                    if (var11 == 1) {
                        var5 = var8.method2228();
                    }
                } else {
                    var4 = var8.method2134();
                    if (var11 == 1) {
                        var5 = var8.method2134();
                    }
                }
                var7.method3451();
            } catch (IOException var39) {
                var39.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                boolean var17;
                try {
                    RandomAccessFile var15 = new RandomAccessFile(var14, "rw");
                    int var16 = var15.read();
                    var15.seek(0L);
                    var15.write(var16);
                    var15.seek(0L);
                    var15.close();
                    var14.delete();
                    var17 = true;
                } catch (Exception var37) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label119: for (int var19 = 0; var19 < Statics.field2887.length; var19++) {
                for (int var20 = 0; var20 < Statics.field1301.length; var20++) {
                    File var21 = new File(Statics.field1301[var20] + Statics.field2887[var19] + File.separatorChar + arg0 + File.separatorChar);
                    if (var21.exists()) {
                        File var22 = new File(var21, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var36) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label119;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field975 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var27 = new File(var5);
            File var28 = new File(var4);
            try {
                File[] var29 = var27.listFiles();
                File[] var30 = var29;
                for (int var31 = 0; var31 < var30.length; var31++) {
                    File var32 = var30[var31];
                    File var33 = new File(var28, var32.getName());
                    boolean var34 = var32.renameTo(var33);
                    if (!var34) {
                        throw new IOException();
                    }
                }
            } catch (Exception var38) {
                var38.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            method1019(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("aq.b(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1019(File arg0, File arg1) {
        try {
            class195 var2 = new class195(Statics.field2090, "rw", 10000L);
            class107 var3 = new class107(500);
            var3.method2102(3);
            var3.method2102(arg1 == null ? 0 : 1);
            var3.method2109(arg0.getPath());
            if (arg1 != null) {
                var3.method2109(arg1.getPath());
            }
            var2.method3466(var3.field1857, 0, var3.field1862);
            var2.method3451();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("t.e(Ljava/lang/String;Ljava/lang/String;ZI)Lgb;")
    public static class195 method32(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2094, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class195(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1879 == 33) {
            var6 = "_rc";
        } else if (Statics.field1879 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field975, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class195(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class195(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("b.i(I)V")
    public static void method8() {
        try {
            File var0 = new File(Statics.field975, "random.dat");
            if (var0.exists()) {
                field2099 = new class196(new class195(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2887.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1301.length; var2++) {
                        File var3 = new File(Statics.field1301[var2] + Statics.field2887[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2099 = new class196(new class195(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2099 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2099 = new class196(new class195(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("dw.t(I)V")
    public static void method2497() {
        try {
            field2101.method3471();
            for (int var0 = 0; var0 < Statics.field1686; var0++) {
                Statics.field1945[var0].method3471();
            }
            field2100.method3471();
            field2099.method3471();
        } catch (Exception var2) {
        }
    }
}
