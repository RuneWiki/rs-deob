package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ez")
public class class153 {

    @ObfuscatedName("ez.i")
    public static class232 field2284 = null;

    @ObfuscatedName("ez.q")
    public static class232 field2285 = null;

    @ObfuscatedName("ez.g")
    public static class232 field2288 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.e(Ljava/io/File;Ljava/io/File;I)V")
    public static void method75(File arg0, File arg1) {
        try {
            class231 var2 = new class231(Statics.field2281, "rw", 10000L);
            class123 var3 = new class123(500);
            var3.method2649(3);
            var3.method2649(arg1 == null ? 0 : 1);
            var3.method2537(arg0.getPath());
            if (arg1 != null) {
                var3.method2537(arg1.getPath());
            }
            var2.method3961(var3.field2055, 0, var3.field2062);
            var2.method3962();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ap.l(Ljava/io/File;ZB)Z")
    public static boolean method661(File arg0, boolean arg1) {
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

    @ObfuscatedName("dj.c(Ljava/lang/String;Ljava/lang/String;ZI)Lhq;")
    public static class231 method2327(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2282, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class231(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field727 == 33) {
            var6 = "_rc";
        } else if (Statics.field727 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field198, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class231(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class231(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("em.h(I)V")
    public static void method2894() {
        try {
            File var0 = new File(Statics.field198, "random.dat");
            if (var0.exists()) {
                field2284 = new class232(new class231(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1753.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1743.length; var2++) {
                        File var3 = new File(Statics.field1743[var2] + Statics.field1753[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2284 = new class232(new class231(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2284 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2284 = new class232(new class231(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
