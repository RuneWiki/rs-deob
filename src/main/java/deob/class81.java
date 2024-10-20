package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cd")
public class class81 {

    @ObfuscatedName("cd.w")
    public static class29 field1409 = null;

    @ObfuscatedName("cd.z")
    public static class29 field1410 = null;

    @ObfuscatedName("cd.e")
    public static class29 field1411 = null;

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.u(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method1172(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1405 = new File(Statics.field390, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1405.exists()) {
            try {
                class28 var7 = new class28(Statics.field1405, "rw", 10000L);
                class126 var8 = new class126((int) var7.method531());
                while (var8.field2024 < var8.field2022.length) {
                    int var9 = var7.method532(var8.field2022, var8.field2024, var8.field2022.length - var8.field2024);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2024 += var9;
                }
                var8.field2024 = 0;
                int var10 = var8.method2559();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2559();
                }
                if (var10 <= 2) {
                    var4 = var8.method2623();
                    if (var11 == 1) {
                        var5 = var8.method2623();
                    }
                } else {
                    var4 = var8.method2538();
                    if (var11 == 1) {
                        var5 = var8.method2538();
                    }
                }
                var7.method549();
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
                if (!method1361(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1412.length; var15++) {
                for (int var16 = 0; var16 < Statics.field401.length; var16++) {
                    File var17 = new File(Statics.field401[var16] + Statics.field1412[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method1361(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field390 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method548(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("aa.k(Ljava/io/File;Ljava/io/File;I)V")
    public static void method548(File arg0, File arg1) {
        try {
            class28 var2 = new class28(Statics.field1405, "rw", 10000L);
            class126 var3 = new class126(500);
            var3.method2554(3);
            var3.method2554(arg1 == null ? 0 : 1);
            var3.method2488(arg0.getPath());
            if (arg1 != null) {
                var3.method2488(arg1.getPath());
            }
            var2.method529(var3.field2022, 0, var3.field2024);
            var2.method549();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("br.x(Ljava/io/File;ZB)Z")
    public static boolean method1361(File arg0, boolean arg1) {
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

    @ObfuscatedName("k.m(B)V")
    public static void method15() {
        try {
            File var0 = new File(Statics.field390, "random.dat");
            if (var0.exists()) {
                field1409 = new class29(new class28(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1412.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field401.length; var2++) {
                        File var3 = new File(Statics.field401[var2] + Statics.field1412[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1409 = new class29(new class28(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1409 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1409 = new class29(new class28(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("af.n(Ldl;I)V")
    public static void method574(class126 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1409.method575(0L);
            field1409.method554(var1);
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
        arg0.method2442(var1, 0, 24);
    }

    @ObfuscatedName("bz.q(I)V")
    public static void method1488() {
        try {
            field1410.method562();
            for (int var0 = 0; var0 < Statics.field1416; var0++) {
                Statics.field2770[var0].method562();
            }
            field1411.method562();
            field1409.method562();
        } catch (Exception var2) {
        }
    }
}
