package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("es")
public class class136 {

    @ObfuscatedName("es.x")
    public static class196 field2093 = null;

    @ObfuscatedName("es.n")
    public static class196 field2087 = null;

    @ObfuscatedName("es.d")
    public static class196 field2086 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.k(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2381(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2083 = new File(Statics.field636, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2083.exists()) {
            try {
                class195 var7 = new class195(Statics.field2083, "rw", 10000L);
                class107 var8 = new class107((int) var7.method3415());
                while (var8.field1863 < var8.field1865.length) {
                    int var9 = var7.method3412(var8.field1865, var8.field1863, var8.field1865.length - var8.field1863);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1863 += var9;
                }
                var8.field1863 = 0;
                int var10 = var8.method2111();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2111();
                }
                if (var10 <= 2) {
                    var4 = var8.method2120();
                    if (var11 == 1) {
                        var5 = var8.method2120();
                    }
                } else {
                    var4 = var8.method2121();
                    if (var11 == 1) {
                        var5 = var8.method2121();
                    }
                }
                var7.method3422();
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
                if (!method755(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field985.length; var15++) {
                for (int var16 = 0; var16 < Statics.field982.length; var16++) {
                    File var17 = new File(Statics.field982[var16] + Statics.field985[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method755(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field636 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class195 var29 = new class195(Statics.field2083, "rw", 10000L);
                class107 var30 = new class107(500);
                var30.method2097(3);
                var30.method2097(var28 == null ? 0 : 1);
                var30.method2104(var27.getPath());
                if (var28 != null) {
                    var30.method2104(((File) var28).getPath());
                }
                var29.method3409(var30.field1865, 0, var30.field1863);
                var29.method3422();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ar.r(Ljava/io/File;ZI)Z")
    public static boolean method755(File arg0, boolean arg1) {
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

    @ObfuscatedName("cm.w(I)V")
    public static void method1967() {
        try {
            File var0 = new File(Statics.field636, "random.dat");
            if (var0.exists()) {
                field2093 = new class196(new class195(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field985.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field982.length; var2++) {
                        File var3 = new File(Statics.field982[var2] + Statics.field985[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2093 = new class196(new class195(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2093 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2093 = new class196(new class195(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("m.m(Lde;II)V")
    public static void method31(class107 arg0, int arg1) {
        if (field2093 == null) {
            return;
        }
        try {
            field2093.method3430(0L);
            field2093.method3429(arg0.field1865, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("cs.j(I)V")
    public static void method1863() {
        try {
            field2087.method3433();
            for (int var0 = 0; var0 < Statics.field1916; var0++) {
                Statics.field1906[var0].method3433();
            }
            field2086.method3433();
            field2093.method3433();
        } catch (Exception var2) {
        }
    }
}
