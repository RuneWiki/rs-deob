package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("es")
public class class150 {

    @ObfuscatedName("es.e")
    public static class229 field2235 = null;

    @ObfuscatedName("es.x")
    public static class229 field2236 = null;

    @ObfuscatedName("es.z")
    public static class229 field2237 = null;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.a(Ljava/io/File;ZS)Z")
    public static boolean method2032(File arg0, boolean arg1) {
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

    @ObfuscatedName("x.w(Ljava/lang/String;Ljava/lang/String;ZB)Lhs;")
    public static class228 method186(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2234, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class228(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1362 == 33) {
            var6 = "_rc";
        } else if (Statics.field1362 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field627, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class228(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class228(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("n.d(Ldx;IB)V")
    public static void method206(class120 arg0, int arg1) {
        if (field2235 == null) {
            return;
        }
        try {
            field2235.method3954(0L);
            field2235.method3959(arg0.field1994, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("di.c(I)V")
    public static void method2243() {
        try {
            field2236.method3957();
            for (int var0 = 0; var0 < Statics.field2233; var0++) {
                Statics.field1559[var0].method3957();
            }
            field2237.method3957();
            field2235.method3957();
        } catch (Exception var2) {
        }
    }
}
