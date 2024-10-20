package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ec")
public class class156 {

    @ObfuscatedName("ec.o")
    public static class124 field2269 = null;

    @ObfuscatedName("ec.z")
    public static class124 field2270 = null;

    @ObfuscatedName("ec.q")
    public static class124 field2271 = null;

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.i(Ljava/io/File;ZI)Z")
    public static boolean method305(File arg0, boolean arg1) {
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

    @ObfuscatedName("ev.c(Ljava/lang/String;Ljava/lang/String;ZI)Ldz;")
    public static class125 method2666(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2265, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class125(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2272 == 33) {
            var6 = "_rc";
        } else if (Statics.field2272 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1219, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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

    @ObfuscatedName("cl.e(B)V")
    public static void method1566() {
        try {
            File var0 = new File(Statics.field1219, "random.dat");
            if (var0.exists()) {
                field2269 = new class124(new class125(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field1539.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1409.length; var2++) {
                        File var3 = new File(Statics.field1409[var2] + Statics.field1539[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field2269 = new class124(new class125(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field2269 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field2269 = new class124(new class125(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
