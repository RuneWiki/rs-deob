package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ek")
public class class141 {

    @ObfuscatedName("ek.o")
    public static class218 field2096 = null;

    @ObfuscatedName("ek.h")
    public static class218 field2093 = null;

    @ObfuscatedName("ek.s")
    public static class218 field2094 = null;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.e(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method791(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2091 = new File(Statics.field1254, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2091.exists()) {
            try {
                class217 var7 = new class217(Statics.field2091, "rw", 10000L);
                class111 var8 = new class111((int) var7.method3653());
                while (var8.field1834 < var8.field1835.length) {
                    int var9 = var7.method3656(var8.field1835, var8.field1834, var8.field1835.length - var8.field1834);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1834 += var9;
                }
                var8.field1834 = 0;
                int var10 = var8.method2176();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2176();
                }
                if (var10 <= 2) {
                    var4 = var8.method2184();
                    if (var11 == 1) {
                        var5 = var8.method2184();
                    }
                } else {
                    var4 = var8.method2185();
                    if (var11 == 1) {
                        var5 = var8.method2185();
                    }
                }
                var7.method3643();
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
                if (!Statics.method566(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field2076.length; var15++) {
                for (int var16 = 0; var16 < Statics.field67.length; var16++) {
                    File var17 = new File(Statics.field67[var16] + Statics.field2076[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && Statics.method566(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1254 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class217 var29 = new class217(Statics.field2091, "rw", 10000L);
                class111 var30 = new class111(500);
                var30.method2366(3);
                var30.method2366(var28 == null ? 0 : 1);
                var30.method2271(var27.getPath());
                if (var28 != null) {
                    var30.method2271(((File) var28).getPath());
                }
                var29.method3642(var30.field1835, 0, var30.field1834);
                var29.method3643();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("bm.l(Ljava/lang/String;Ljava/lang/String;ZI)Lhq;")
    public static class217 method1114(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field197, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class217(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2089 == 33) {
            var6 = "_rc";
        } else if (Statics.field2089 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1254, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ad.c(I)V")
    public static void method901() {
        try {
            File var0 = new File(Statics.field1254, "random.dat");
            if (var0.exists()) {
                field2096 = new class218(new class217(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2076.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field67.length; var2++) {
                        File var3 = new File(Statics.field67[var2] + Statics.field2076[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2096 = new class218(new class217(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2096 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2096 = new class218(new class217(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("cm.u(I)V")
    public static void method1907() {
        try {
            field2093.method3662();
            for (int var0 = 0; var0 < Statics.field2504; var0++) {
                Statics.field2043[var0].method3662();
            }
            field2094.method3662();
            field2096.method3662();
        } catch (Exception var2) {
        }
    }
}
