package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("er")
public class class153 {

    @ObfuscatedName("er.y")
    public static class232 field2284 = null;

    @ObfuscatedName("er.s")
    public static class232 field2287 = null;

    @ObfuscatedName("er.p")
    public static class232 field2286 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.i(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method2718(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field3220 = new File(Statics.field2281, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field3220.exists()) {
            try {
                class231 var7 = new class231(Statics.field3220, "rw", 10000L);
                class123 var8 = new class123((int) var7.method3908());
                while (var8.field2046 < var8.field2049.length) {
                    int var9 = var7.method3905(var8.field2049, var8.field2046, var8.field2049.length - var8.field2046);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2046 += var9;
                }
                var8.field2046 = 0;
                int var10 = var8.method2404();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2404();
                }
                if (var10 <= 2) {
                    var4 = var8.method2413();
                    if (var11 == 1) {
                        var5 = var8.method2413();
                    }
                } else {
                    var4 = var8.method2414();
                    if (var11 == 1) {
                        var5 = var8.method2414();
                    }
                }
                var7.method3904();
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
                if (!method1812(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1818.length; var15++) {
                for (int var16 = 0; var16 < Statics.field2051.length; var16++) {
                    File var17 = new File(Statics.field2051[var16] + Statics.field1818[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1812(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field2281 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method177(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("c.h(Ljava/io/File;Ljava/io/File;I)V")
    public static void method177(File arg0, File arg1) {
        try {
            class231 var2 = new class231(Statics.field3220, "rw", 10000L);
            class123 var3 = new class123(500);
            var3.method2389(3);
            var3.method2389(arg1 == null ? 0 : 1);
            var3.method2397(arg0.getPath());
            if (arg1 != null) {
                var3.method2397(arg1.getPath());
            }
            var2.method3901(var3.field2049, 0, var3.field2046);
            var2.method3904();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("cu.e(Ljava/io/File;ZB)Z")
    public static boolean method1812(File arg0, boolean arg1) {
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

    @ObfuscatedName("em.g(Ljava/lang/String;Ljava/lang/String;ZI)Lhi;")
    public static class231 method2958(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2282, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class231(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1427 == 33) {
            var6 = "_rc";
        } else if (Statics.field1427 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2281, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class231(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class231(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ba.u(Ldn;II)V")
    public static void method1223(class123 arg0, int arg1) {
        if (field2284 == null) {
            return;
        }
        try {
            field2284.method3922(0L);
            field2284.method3927(arg0.field2049, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("cd.d(I)V")
    public static void method2110() {
        try {
            field2287.method3921();
            for (int var0 = 0; var0 < Statics.field2283; var0++) {
                Statics.field2026[var0].method3921();
            }
            field2286.method3921();
            field2284.method3921();
        } catch (Exception var2) {
        }
    }
}
