package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cf")
public class class83 {

    @ObfuscatedName("cf.u")
    public static class31 field1431 = null;

    @ObfuscatedName("cf.p")
    public static class31 field1432 = null;

    @ObfuscatedName("cf.t")
    public static class31 field1433 = null;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.e(Ljava/io/File;Ljava/io/File;B)V")
    public static void method125(File arg0, File arg1) {
        try {
            class30 var2 = new class30(Statics.field262, "rw", 10000L);
            class128 var3 = new class128(500);
            var3.method2634(3);
            var3.method2634(arg1 == null ? 0 : 1);
            var3.method2447(arg0.getPath());
            if (arg1 != null) {
                var3.method2447(arg1.getPath());
            }
            var2.method597(var3.field2043, 0, var3.field2045);
            var2.method598();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("dv.i(Ljava/io/File;ZI)Z")
    public static boolean method2325(File arg0, boolean arg1) {
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

    @ObfuscatedName("cd.k(Ljava/lang/String;Ljava/lang/String;ZB)Lap;")
    public static class30 method1635(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1428, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class30(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field325 == 33) {
            var6 = "_rc";
        } else if (Statics.field325 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field791, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class30(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class30(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("cb.q(I)V")
    public static void method2127() {
        try {
            File var0 = new File(Statics.field791, "random.dat");
            if (var0.exists()) {
                field1431 = new class31(new class30(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1923.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field266.length; var2++) {
                        File var3 = new File(Statics.field266[var2] + Statics.field1923[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1431 = new class31(new class30(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1431 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1431 = new class31(new class30(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
