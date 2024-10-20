package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fg")
public class class166 {

    @ObfuscatedName("fg.g")
    public static class450 field1859 = null;

    @ObfuscatedName("fg.i")
    public static class450 field1854 = null;

    @ObfuscatedName("fg.o")
    public static class450 field1856 = null;

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.h(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3231(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        Statics.field1857 = new File(Statics.field1475, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (Statics.field1857.exists()) {
            try {
                class449 var7 = new class449(Statics.field1857, "rw", 10000L);
                class467 var8 = new class467((int) var7.method7572());
                while (var8.field4915 < var8.field4917.length) {
                    int var9 = var7.method7566(var8.field4917, var8.field4915, var8.field4917.length - var8.field4915);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field4915 += var9;
                }
                var8.field4915 = 0;
                int var10 = var8.method7792();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method7792();
                }
                if (var10 <= 2) {
                    var4 = var8.method7802();
                    if (var11 == 1) {
                        var5 = var8.method7802();
                    }
                } else {
                    var4 = var8.method7953();
                    if (var11 == 1) {
                        var5 = var8.method7953();
                    }
                }
                var7.method7563();
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
                if (!method4450(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label103: for (int var15 = 0; var15 < Statics.field1158.length; var15++) {
                for (int var16 = 0; var16 < Statics.field1504.length; var16++) {
                    File var17 = new File(Statics.field1504[var16] + Statics.field1158[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && method4450(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label103;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = Statics.field1475 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
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
            method2685(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("dc.e(Ljava/io/File;Ljava/io/File;I)V")
    public static void method2685(File arg0, File arg1) {
        try {
            class449 var2 = new class449(Statics.field1857, "rw", 10000L);
            class467 var3 = new class467(500);
            var3.method7789(3);
            var3.method7789(arg1 == null ? 0 : 1);
            var3.method7784(arg0.getPath());
            if (arg1 != null) {
                var3.method7784(arg1.getPath());
            }
            var2.method7562(var3.field4917, 0, var3.field4915);
            var2.method7563();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("iq.v(Ljava/io/File;ZI)Z")
    public static boolean method4450(File arg0, boolean arg1) {
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

    @ObfuscatedName("cp.x(Ljava/lang/String;Ljava/lang/String;ZI)Lqq;")
    public static class449 method2159(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3325, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class449(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field3310 == 33) {
            var6 = "_rc";
        } else if (Statics.field3310 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1475, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class449(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class449(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("im.m(I)V")
    public static void method4764() {
        try {
            File var0 = new File(Statics.field1475, "random.dat");
            if (var0.exists()) {
                field1859 = new class450(new class449(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1158.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1504.length; var2++) {
                        File var3 = new File(Statics.field1504[var2] + Statics.field1158[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1859 = new class450(new class449(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1859 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1859 = new class450(new class449(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("du.q(Lqy;II)V")
    public static void method2793(class467 arg0, int arg1) {
        if (field1859 == null) {
            return;
        }
        try {
            field1859.method7598(0L);
            field1859.method7596(arg0.field4917, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
