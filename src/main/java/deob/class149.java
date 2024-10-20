package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ei")
public class class149 {

    @ObfuscatedName("ei.m")
    public static class228 field2213 = null;

    @ObfuscatedName("ei.e")
    public static class228 field2225 = null;

    @ObfuscatedName("ei.z")
    public static class228 field2223 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.i(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2622(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field2220 = new File(Statics.field70, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field2220.exists()) {
            try {
                class227 var7 = new class227(Statics.field2220, "rw", 10000L);
                class119 var8 = new class119((int) var7.method3815());
                while (var8.field1980 < var8.field1982.length) {
                    int var9 = var7.method3816(var8.field1982, var8.field1980, var8.field1982.length - var8.field1980);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1980 += var9;
                }
                var8.field1980 = 0;
                int var10 = var8.method2380();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2380();
                }
                if (var10 <= 2) {
                    var4 = var8.method2354();
                    if (var11 == 1) {
                        var5 = var8.method2354();
                    }
                } else {
                    var4 = var8.method2389();
                    if (var11 == 1) {
                        var5 = var8.method2389();
                    }
                }
                var7.method3819();
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
                if (!method2624(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field252.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1888.length; var16++) {
                    File var17 = new File(Statics.field1888[var16] + Statics.field252[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method2624(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field70 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method2277(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("dt.v(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2277(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2220, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2436(3);
            var3.method2436(arg1 == null ? 0 : 1);
            var3.method2494(arg0.getPath());
            if (arg1 != null) {
                var3.method2494(arg1.getPath());
            }
            var2.method3813(var3.field1982, 0, var3.field1980);
            var2.method3819();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("du.r(Ljava/io/File;ZI)Z")
    public static boolean method2624(File arg0, boolean arg1) {
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

    @ObfuscatedName("az.n(Ljava/lang/String;Ljava/lang/String;ZI)Lhk;")
    public static class227 method681(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2211, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class227(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2222 == 33) {
            var6 = "_rc";
        } else if (Statics.field2222 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field70, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("ar.x(I)V")
    public static void method668() {
        try {
            File var0 = new File(Statics.field70, "random.dat");
            if (var0.exists()) {
                field2213 = new class228(new class227(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field252.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1888.length; var2++) {
                        File var3 = new File(Statics.field1888[var2] + Statics.field252[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2213 = new class228(new class227(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2213 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2213 = new class228(new class227(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("be.q(Ldx;IB)V")
    public static void method1524(class119 arg0, int arg1) {
        if (field2213 == null) {
            return;
        }
        try {
            field2213.method3841(0L);
            field2213.method3847(arg0.field1982, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
