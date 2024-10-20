package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ev")
public class class150 {

    @ObfuscatedName("ev.z")
    public static class229 field2253 = null;

    @ObfuscatedName("ev.s")
    public static class229 field2261 = null;

    @ObfuscatedName("ev.j")
    public static class229 field2262 = null;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.w(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method655(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2260 = new File(Statics.field1099, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2260.exists()) {
            try {
                class228 var7 = new class228(Statics.field2260, "rw", 10000L);
                class120 var8 = new class120((int) var7.method3876());
                while (var8.field2012 < var8.field2013.length) {
                    int var9 = var7.method3875(var8.field2013, var8.field2012, var8.field2013.length - var8.field2012);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2012 += var9;
                }
                var8.field2012 = 0;
                int var10 = var8.method2363();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2363();
                }
                if (var10 <= 2) {
                    var4 = var8.method2372();
                    if (var11 == 1) {
                        var5 = var8.method2372();
                    }
                } else {
                    var4 = var8.method2373();
                    if (var11 == 1) {
                        var5 = var8.method2373();
                    }
                }
                var7.method3874();
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
                if (!method635(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1968.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1362.length; var16++) {
                    File var17 = new File(Statics.field1362[var16] + Statics.field1968[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method635(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1099 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class228 var29 = new class228(Statics.field2260, "rw", 10000L);
                class120 var30 = new class120(500);
                var30.method2430(3);
                var30.method2430(var28 == null ? 0 : 1);
                var30.method2429(var27.getPath());
                if (var28 != null) {
                    var30.method2429(((File) var28).getPath());
                }
                var29.method3887(var30.field2013, 0, var30.field2012);
                var29.method3874();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("b.x(Ljava/io/File;ZI)Z")
    public static boolean method635(File arg0, boolean arg1) {
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

    @ObfuscatedName("dy.t(Ljava/lang/String;Ljava/lang/String;ZB)Lhy;")
    public static class228 method2162(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2256, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class228(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2263 == 33) {
            var6 = "_rc";
        } else if (Statics.field2263 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1099, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class228(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class228(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ai.p(I)V")
    public static void method665() {
        try {
            File var0 = new File(Statics.field1099, "random.dat");
            if (var0.exists()) {
                field2253 = new class229(new class228(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1968.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1362.length; var2++) {
                        File var3 = new File(Statics.field1362[var2] + Statics.field1968[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2253 = new class229(new class228(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2253 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2253 = new class229(new class228(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("fp.e(Lde;IB)V")
    public static void method2988(class120 arg0, int arg1) {
        if (field2253 == null) {
            return;
        }
        try {
            field2253.method3913(0L);
            field2253.method3901(arg0.field2013, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ah.y(I)V")
    public static void method724() {
        try {
            field2261.method3895();
            for (int var0 = 0; var0 < Statics.field2264; var0++) {
                Statics.field2921[var0].method3895();
            }
            field2262.method3895();
            field2253.method3895();
        } catch (Exception var2) {
        }
    }
}
