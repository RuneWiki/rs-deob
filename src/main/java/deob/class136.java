package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ep")
public class class136 {

    @ObfuscatedName("ep.a")
    public static class196 field2104 = null;

    @ObfuscatedName("ep.i")
    public static class196 field2105 = null;

    @ObfuscatedName("ep.y")
    public static class196 field2112 = null;

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.g(Ljava/io/File;Ljava/io/File;B)V")
    public static void method1890(File arg0, File arg1) {
        try {
            class195 var2 = new class195(Statics.field2100, "rw", 10000L);
            class107 var3 = new class107(500);
            var3.method2126(3);
            var3.method2126(arg1 == null ? 0 : 1);
            var3.method2261(arg0.getPath());
            if (arg1 != null) {
                var3.method2261(arg1.getPath());
            }
            var2.method3437(var3.field1840, 0, var3.field1839);
            var2.method3430();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("cw.v(Ljava/io/File;ZI)Z")
    public static boolean method2089(File arg0, boolean arg1) {
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

    @ObfuscatedName("aw.z(Ljava/lang/String;Ljava/lang/String;ZB)Lgs;")
    public static class195 method602(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field2097, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class195(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field208 == 33) {
            var6 = "_rc";
        } else if (Statics.field208 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1262, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class195(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class195(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }
}
