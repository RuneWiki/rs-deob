package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cw")
public class class82 {

    @ObfuscatedName("cw.j")
    public static class30 field1419 = null;

    @ObfuscatedName("cw.b")
    public static class30 field1414 = null;

    @ObfuscatedName("cw.t")
    public static class30 field1421 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.g(Ljava/io/File;ZI)Z")
    public static boolean method221(File arg0, boolean arg1) {
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

    @ObfuscatedName("aq.h(Ljava/lang/String;Ljava/lang/String;ZB)Lat;")
    public static class29 method545(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1411, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1991 == 33) {
            var6 = "_rc";
        } else if (Statics.field1991 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1647, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("bv.s(B)V")
    public static void method1564() {
        try {
            File var0 = new File(Statics.field1647, "random.dat");
            if (var0.exists()) {
                field1419 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1423.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field752.length; var2++) {
                        File var3 = new File(Statics.field752[var2] + Statics.field1423[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1419 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1419 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1419 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("bi.o(Ldw;II)V")
    public static void method1489(class127 arg0, int arg1) {
        if (field1419 == null) {
            return;
        }
        try {
            field1419.method579(0L);
            field1419.method583(arg0.field2030, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bp.p(B)V")
    public static void method1559() {
        try {
            field1414.method578();
            for (int var0 = 0; var0 < Statics.field1415; var0++) {
                Statics.field1422[var0].method578();
            }
            field1421.method578();
            field1419.method578();
        } catch (Exception var2) {
        }
    }
}
