package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cb")
public class class82 {

    @ObfuscatedName("cb.g")
    public static class30 field1456 = null;

    @ObfuscatedName("cb.s")
    public static class30 field1445 = null;

    @ObfuscatedName("cb.n")
    public static class30 field1452 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.b(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method147(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1447 = new File(Statics.field1458, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1447.exists()) {
            try {
                class29 var7 = new class29(Statics.field1447, "rw", 10000L);
                class127 var8 = new class127((int) var7.method543());
                while (var8.field2051 < var8.field2056.length) {
                    int var9 = var7.method544(var8.field2056, var8.field2051, var8.field2056.length - var8.field2051);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2051 += var9;
                }
                var8.field2051 = 0;
                int var10 = var8.method2416();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2416();
                }
                if (var10 <= 2) {
                    var4 = var8.method2405();
                    if (var11 == 1) {
                        var5 = var8.method2405();
                    }
                } else {
                    var4 = var8.method2406();
                    if (var11 == 1) {
                        var5 = var8.method2406();
                    }
                }
                var7.method541();
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
                if (!method1645(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < Statics.field67.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1453.length; var16++) {
                    File var17 = new File(Statics.field1453[var16] + Statics.field67[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1645(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1458 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
                class29 var29 = new class29(Statics.field1447, "rw", 10000L);
                class127 var30 = new class127(500);
                var30.method2590(3);
                var30.method2590(var28 == null ? 0 : 1);
                var30.method2498(var27.getPath());
                if (var28 != null) {
                    var30.method2498(((File) var28).getPath());
                }
                var29.method559(var30.field2056, 0, var30.field2051);
                var29.method541();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ce.c(Ljava/io/File;ZB)Z")
    public static boolean method1645(File arg0, boolean arg1) {
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

    @ObfuscatedName("dw.j(Ljava/lang/String;Ljava/lang/String;ZB)Lae;")
    public static class29 method2167(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1939, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field267 == 33) {
            var6 = "_rc";
        } else if (Statics.field267 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1458, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("p.i(B)V")
    public static void method227() {
        try {
            File var0 = new File(Statics.field1458, "random.dat");
            if (var0.exists()) {
                field1456 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field67.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1453.length; var2++) {
                        File var3 = new File(Statics.field1453[var2] + Statics.field67[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1456 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1456 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1456 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("bm.k(Ldv;I)V")
    public static void method1219(class127 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1456.method564(0L);
            field1456.method568(var1);
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
        arg0.method2579(var1, 0, 24);
    }
}
