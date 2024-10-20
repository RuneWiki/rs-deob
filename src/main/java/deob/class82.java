package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cr")
public class class82 {

    @ObfuscatedName("cr.t")
    public static class30 field1440 = null;

    @ObfuscatedName("cr.m")
    public static class30 field1448 = null;

    @ObfuscatedName("cr.s")
    public static class30 field1449 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.c(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1305(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1454 = new File(Statics.field1451, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1454.exists()) {
            try {
                class29 var7 = new class29(Statics.field1454, "rw", 10000L);
                class127 var8 = new class127((int) var7.method529());
                while (var8.field2052 < var8.field2057.length) {
                    int var9 = var7.method551(var8.field2057, var8.field2052, var8.field2057.length - var8.field2052);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2052 += var9;
                }
                var8.field2052 = 0;
                int var10 = var8.method2383();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2383();
                }
                if (var10 <= 2) {
                    var4 = var8.method2349();
                    if (var11 == 1) {
                        var5 = var8.method2349();
                    }
                } else {
                    var4 = var8.method2328();
                    if (var11 == 1) {
                        var5 = var8.method2328();
                    }
                }
                var7.method528();
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
                if (!method194(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field1058.length; var15++) {
                for (int var16 = 0; var16 < Statics.field367.length; var16++) {
                    File var17 = new File(Statics.field367[var16] + Statics.field1058[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method194(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1451 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class29 var29 = new class29(Statics.field1454, "rw", 10000L);
                class127 var30 = new class127(500);
                var30.method2333(3);
                var30.method2333(var28 == null ? 0 : 1);
                var30.method2452(var27.getPath());
                if (var28 != null) {
                    var30.method2452(((File) var28).getPath());
                }
                var29.method527(var30.field2057, 0, var30.field2052);
                var29.method528();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("r.q(Ljava/io/File;ZI)Z")
    public static boolean method194(File arg0, boolean arg1) {
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

    @ObfuscatedName("bt.y(Ljava/lang/String;Ljava/lang/String;ZI)Lak;")
    public static class29 method1326(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1452, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1450 == 33) {
            var6 = "_rc";
        } else if (Statics.field1450 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1451, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class29(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class29(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cb.g(Ldg;II)V")
    public static void method1957(class127 arg0, int arg1) {
        if (field1440 == null) {
            return;
        }
        try {
            field1440.method554(0L);
            field1440.method559(arg0.field2057, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("au.x(I)V")
    public static void method778() {
        try {
            field1448.method572();
            for (int var0 = 0; var0 < Statics.field1444; var0++) {
                Statics.field259[var0].method572();
            }
            field1449.method572();
            field1440.method572();
        } catch (Exception var2) {
        }
    }
}
