package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ey")
public class class156 {

    @ObfuscatedName("ey.u")
    public static class124 field2240 = null;

    @ObfuscatedName("ey.g")
    public static class124 field2238 = null;

    @ObfuscatedName("ey.k")
    public static class124 field2247 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.a(Ljava/io/File;ZI)Z")
    public static boolean method27(File arg0, boolean arg1) {
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

    @ObfuscatedName("es.j(Ljava/lang/String;Ljava/lang/String;ZI)Ldk;")
    public static class125 method2660(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2244, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field513 == 33) {
            var6 = "_rc";
        } else if (Statics.field513 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field813, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class125(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class125(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ab.n(I)V")
    public static void method538() {
        try {
            File var0 = new File(Statics.field813, "random.dat");
            if (var0.exists()) {
                field2240 = new class124(new class125(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1213.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field15.length; var2++) {
                        File var3 = new File(Statics.field15[var2] + Statics.field1213[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2240 = new class124(new class125(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2240 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2240 = new class124(new class125(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("eb.r(B)V")
    public static void method2441() {
        try {
            field2238.method2106();
            for (int var0 = 0; var0 < Statics.field2242; var0++) {
                Statics.field2248[var0].method2106();
            }
            field2247.method2106();
            field2240.method2106();
        } catch (Exception var2) {
        }
    }
}
