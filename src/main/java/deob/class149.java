package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ee")
public class class149 {

    @ObfuscatedName("ee.c")
    public static class228 field2224 = null;

    @ObfuscatedName("ee.l")
    public static class228 field2225 = null;

    @ObfuscatedName("ee.p")
    public static class228 field2232 = null;

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.h(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1532(File arg0, File arg1) {
        try {
            class227 var2 = new class227(Statics.field2220, "rw", 10000L);
            class119 var3 = new class119(500);
            var3.method2499(3);
            var3.method2499(arg1 == null ? 0 : 1);
            var3.method2463(arg0.getPath());
            if (arg1 != null) {
                var3.method2463(arg1.getPath());
            }
            var2.method3917(var3.field1978, 0, var3.field1973);
            var2.method3909();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("at.q(Ljava/io/File;ZI)Z")
    public static boolean method621(File arg0, boolean arg1) {
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

    @ObfuscatedName("g.n(S)V")
    public static void method79() {
        try {
            File var0 = new File(Statics.field2128, "random.dat");
            if (var0.exists()) {
                field2224 = new class228(new class227(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2931.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2226.length; var2++) {
                        File var3 = new File(Statics.field2226[var2] + Statics.field2931[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2224 = new class228(new class227(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2224 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2224 = new class228(new class227(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("aw.f(Ldm;I)V")
    public static void method889(class119 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2224.method3954(0L);
            field2224.method3932(var1);
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
        arg0.method2377(var1, 0, 24);
    }

    @ObfuscatedName("de.g(I)V")
    public static void method2261() {
        try {
            field2225.method3930();
            for (int var0 = 0; var0 < Statics.field2222; var0++) {
                Statics.field68[var0].method3930();
            }
            field2232.method3930();
            field2224.method3930();
        } catch (Exception var2) {
        }
    }
}
