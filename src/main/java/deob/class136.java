package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("eh")
public class class136 {

    @ObfuscatedName("eh.b")
    public static class197 field2093 = null;

    @ObfuscatedName("eh.r")
    public static class197 field2094 = null;

    @ObfuscatedName("eh.l")
    public static class197 field2087 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.g(Ljava/io/File;ZI)Z")
    public static boolean method449(File arg0, boolean arg1) {
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

    @ObfuscatedName("bh.i(Ljava/lang/String;Ljava/lang/String;ZI)Lgg;")
    public static class196 method1337(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field60, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class196(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field2780 == 33) {
            var6 = "_rc";
        } else if (Statics.field2780 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1583, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class196(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class196(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("v.k(Ldk;II)V")
    public static void method474(class107 arg0, int arg1) {
        if (field2093 == null) {
            return;
        }
        try {
            field2093.method3453(0L);
            field2093.method3440(arg0.field1843, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
