package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ep")
public class class140 {

    @ObfuscatedName("ep.t")
    public static class210 field2105 = null;

    @ObfuscatedName("ep.y")
    public static class210 field2110 = null;

    @ObfuscatedName("ep.w")
    public static class210 field2107 = null;

    public class140() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.b(Ljava/lang/String;Ljava/lang/String;ZB)Lhg;")
    public static class209 method2063(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field62, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class209(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2136 == 33) {
            var6 = "_rc";
        } else if (Statics.field2136 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2109, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class209(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class209(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("v.e(I)V")
    public static void method147() {
        try {
            File var0 = new File(Statics.field2109, "random.dat");
            if (var0.exists()) {
                field2105 = new class210(new class209(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field686.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field2106.length; var2++) {
                        File var3 = new File(Statics.field2106[var2] + Statics.field686[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2105 = new class210(new class209(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2105 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2105 = new class210(new class209(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("b.i(Ldc;S)V")
    public static void method6(class110 arg0) {
        byte[] var1 = new byte[24];
        try {
            field2105.method3595(0L);
            field2105.method3597(var1);
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
        arg0.method2136(var1, 0, 24);
    }

    @ObfuscatedName("dy.k(Ldc;II)V")
    public static void method2564(class110 arg0, int arg1) {
        if (field2105 == null) {
            return;
        }
        try {
            field2105.method3595(0L);
            field2105.method3600(arg0.field1862, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("dp.h(B)V")
    public static void method2513() {
        try {
            field2110.method3593();
            for (int var0 = 0; var0 < Statics.field2103; var0++) {
                Statics.field2013[var0].method3593();
            }
            field2107.method3593();
            field2105.method3593();
        } catch (Exception var2) {
        }
    }
}
