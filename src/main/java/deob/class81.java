package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cu")
public class class81 {

    @ObfuscatedName("cu.o")
    public static class29 field1432 = null;

    @ObfuscatedName("cu.b")
    public static class29 field1434 = null;

    @ObfuscatedName("cu.d")
    public static class29 field1429 = null;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bg.z(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1381(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1424 = new File(Statics.field278, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1424.exists()) {
            try {
                class28 var7 = new class28(Statics.field1424, "rw", 10000L);
                class126 var8 = new class126((int) var7.method568());
                while (var8.field2003 < var8.field2007.length) {
                    int var9 = var7.method573(var8.field2007, var8.field2003, var8.field2007.length - var8.field2003);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2003 += var9;
                }
                var8.field2003 = 0;
                int var10 = var8.method2450();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2450();
                }
                if (var10 <= 2) {
                    var4 = var8.method2459();
                    if (var11 == 1) {
                        var5 = var8.method2459();
                    }
                } else {
                    var4 = var8.method2460();
                    if (var11 == 1) {
                        var5 = var8.method2460();
                    }
                }
                var7.method569();
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
                if (!method234(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field293.length; var15++) {
                for (int var16 = 0; var16 < Statics.field388.length; var16++) {
                    File var17 = new File(Statics.field388[var16] + Statics.field293[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method234(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field278 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class28 var29 = new class28(Statics.field1424, "rw", 10000L);
                class126 var30 = new class126(500);
                var30.method2462(3);
                var30.method2462(var28 == null ? 0 : 1);
                var30.method2443(var27.getPath());
                if (var28 != null) {
                    var30.method2443(((File) var28).getPath());
                }
                var29.method583(var30.field2007, 0, var30.field2003);
                var29.method569();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("j.h(Ljava/io/File;ZI)Z")
    public static boolean method234(File arg0, boolean arg1) {
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

    @ObfuscatedName("at.c(Ldq;B)V")
    public static void method704(class126 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1432.method586(0L);
            field1432.method598(var1);
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
        arg0.method2559(var1, 0, 24);
    }
}
