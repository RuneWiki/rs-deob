package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fb")
public class class167 {

    @ObfuscatedName("fb.r")
    public static class121 field2178 = null;

    @ObfuscatedName("fb.d")
    public static class121 field2167 = null;

    @ObfuscatedName("fb.v")
    public static class121 field2175 = null;

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.b(Ljava/io/File;ZB)Z")
    public static boolean method653(File arg0, boolean arg1) {
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

    @ObfuscatedName("d.q(Ljava/lang/String;Ljava/lang/String;ZI)Ldx;")
    public static class122 method57(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field388, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class122(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field298 == 33) {
            var6 = "_rc";
        } else if (Statics.field298 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2033, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class122(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class122(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fd.o(I)V")
    public static void method3134() {
        try {
            File var0 = new File(Statics.field2033, "random.dat");
            if (var0.exists()) {
                field2178 = new class121(new class122(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field2109.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field267.length; var2++) {
                        File var3 = new File(Statics.field267[var2] + Statics.field2109[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2178 = new class121(new class122(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2178 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2178 = new class121(new class122(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ey.p(I)[B")
    public static byte[] method2923() {
        byte[] var0 = new byte[24];
        try {
            field2178.method2332(0L);
            field2178.method2307(var0);
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
