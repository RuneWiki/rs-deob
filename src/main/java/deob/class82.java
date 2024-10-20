package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cl")
public class class82 {

    @ObfuscatedName("cl.r")
    public static class30 field1439 = null;

    @ObfuscatedName("cl.d")
    public static class30 field1440 = null;

    @ObfuscatedName("cl.a")
    public static class30 field1443 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.p(Ljava/io/File;ZI)Z")
    public static boolean method1428(File arg0, boolean arg1) {
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

    @ObfuscatedName("z.i(Ljava/lang/String;Ljava/lang/String;ZI)Lae;")
    public static class29 method228(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1313, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1442 == 33) {
            var6 = "_rc";
        } else if (Statics.field1442 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1516, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class29(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class29(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ei.o(Ldt;B)V")
    public static void method2969(class127 arg0) {
        byte[] var1 = new byte[24];
        try {
            field1439.method599(0L);
            field1439.method601(var1);
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
        arg0.method2482(var1, 0, 24);
    }

    @ObfuscatedName("k.n(Ldt;II)V")
    public static void method224(class127 arg0, int arg1) {
        if (field1439 == null) {
            return;
        }
        try {
            field1439.method599(0L);
            field1439.method604(arg0.field2037, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("f.l(I)V")
    public static void method119() {
        try {
            field1440.method598();
            for (int var0 = 0; var0 < Statics.field1435; var0++) {
                Statics.field113[var0].method598();
            }
            field1443.method598();
            field1439.method598();
        } catch (Exception var2) {
        }
    }
}
