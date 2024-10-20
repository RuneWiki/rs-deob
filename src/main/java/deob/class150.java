package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ec")
public class class150 {

    @ObfuscatedName("ec.r")
    public static class229 field2242 = null;

    @ObfuscatedName("ec.k")
    public static class229 field2238 = null;

    @ObfuscatedName("ec.o")
    public static class229 field2233 = null;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.f(Ljava/io/File;ZB)Z")
    public static boolean method610(File arg0, boolean arg1) {
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

    @ObfuscatedName("af.u(Ljava/lang/String;Ljava/lang/String;ZB)Lhz;")
    public static class228 method869(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field675, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class228(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field1675 == 33) {
            var6 = "_rc";
        } else if (Statics.field1675 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field2240, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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
}
