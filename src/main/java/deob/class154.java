package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ey")
public class class154 {

    @ObfuscatedName("ey.v")
    public static class403 field1693 = null;

    @ObfuscatedName("ey.d")
    public static class403 field1687 = null;

    @ObfuscatedName("ey.h")
    public static class403 field1688 = null;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jw.c(Ljava/io/File;Ljava/io/File;I)V")
    public static void method4767(File arg0, File arg1) {
        try {
            class402 var2 = new class402(Statics.field3155, "rw", 10000L);
            class419 var3 = new class419(500);
            var3.method6841(3);
            var3.method6841(arg1 == null ? 0 : 1);
            var3.method6731(arg0.getPath());
            if (arg1 != null) {
                var3.method6731(arg1.getPath());
            }
            var2.method6486(var3.field4477, 0, var3.field4475);
            var2.method6487();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("hg.b(Ljava/io/File;ZB)Z")
    public static boolean method3996(File arg0, boolean arg1) {
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

    @ObfuscatedName("hi.p(Ljava/lang/String;Ljava/lang/String;ZB)Loa;")
    public static class402 method4394(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field75, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class402(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1331 == 33) {
            var6 = "_rc";
        } else if (Statics.field1331 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field4452, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class402(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class402(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nr.m(I)V")
    public static void method6101() {
        try {
            File var0 = new File(Statics.field4452, "random.dat");
            if (var0.exists()) {
                field1693 = new class403(new class402(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field4142.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1332.length; var2++) {
                        File var3 = new File(Statics.field1332[var2] + Statics.field4142[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1693 = new class403(new class402(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1693 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1693 = new class403(new class402(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("dc.t(B)[B")
    public static byte[] method2546() {
        byte[] var0 = new byte[24];
        try {
            field1693.method6516(0L);
            field1693.method6514(var0);
            int var1;
            for (var1 = 0; var1 < 24 && var0[var1] == 0; var1++) {
            }
            if (var1 >= 24) {
                throw new IOException();
            }
        } catch (Exception var4) {
            for (int var3 = 0; var3 < 24; var3++) {
                var0[var3] = -1;
            }
        }
        return var0;
    }
}
