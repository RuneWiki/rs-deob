package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fm")
public class class163 {

    @ObfuscatedName("fm.e")
    public static class117 field2048 = null;

    @ObfuscatedName("fm.r")
    public static class117 field2049 = null;

    @ObfuscatedName("fm.t")
    public static class117 field2050 = null;

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.a(Ljava/io/File;Ljava/io/File;I)V")
    public static void method3204(File arg0, File arg1) {
        try {
            class118 var2 = new class118(Statics.field2044, "rw", 10000L);
            class190 var3 = new class190(500);
            var3.method3439(3);
            var3.method3439(arg1 == null ? 0 : 1);
            var3.method3629(arg0.getPath());
            if (arg1 != null) {
                var3.method3629(arg1.getPath());
            }
            var2.method2540(var3.field2420, 0, var3.field2419);
            var2.method2541();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("eh.s(Ljava/io/File;ZI)Z")
    public static boolean method3176(File arg0, boolean arg1) {
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

    @ObfuscatedName("ey.g(Ljava/lang/String;Ljava/lang/String;ZB)Lda;")
    public static class118 method3143(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2045, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class118(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1739 == 33) {
            var6 = "_rc";
        } else if (Statics.field1739 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field134, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class118(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class118(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("de.x(B)V")
    public static void method2673() {
        try {
            File var0 = new File(Statics.field134, "random.dat");
            if (var0.exists()) {
                field2048 = new class117(new class118(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1990.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field3697.length; var2++) {
                        File var3 = new File(Statics.field3697[var2] + Statics.field1990[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2048 = new class117(new class118(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2048 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2048 = new class117(new class118(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("bw.h(B)V")
    public static void method1159() {
        try {
            field2049.method2505();
            for (int var0 = 0; var0 < Statics.field646; var0++) {
                Statics.field593[var0].method2505();
            }
            field2050.method2505();
            field2048.method2505();
        } catch (Exception var2) {
        }
    }
}
