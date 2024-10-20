package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ec")
public class class153 {

    @ObfuscatedName("ec.d")
    public static class232 field2287 = null;

    @ObfuscatedName("ec.v")
    public static class232 field2289 = null;

    @ObfuscatedName("ec.q")
    public static class232 field2288 = null;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.x(Ljava/io/File;ZI)Z")
    public static boolean method2339(File arg0, boolean arg1) {
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

    @ObfuscatedName("cz.r(Ljava/lang/String;Ljava/lang/String;ZB)Lhz;")
    public static class231 method2099(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field3108, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class231(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1827 == 33) {
            var6 = "_rc";
        } else if (Statics.field1827 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field621, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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
}
