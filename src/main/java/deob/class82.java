package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("cn")
public class class82 {

    @ObfuscatedName("cn.c")
    public static class30 field1412 = null;

    @ObfuscatedName("cn.m")
    public static class30 field1413 = null;

    @ObfuscatedName("cn.a")
    public static class30 field1414 = null;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.l(Ljava/io/File;ZB)Z")
    public static boolean method1526(File arg0, boolean arg1) {
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

    @ObfuscatedName("bw.b(Ljava/lang/String;Ljava/lang/String;ZI)Lan;")
    public static class29 method1563(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1105, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class29(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field293 == 33) {
            var6 = "_rc";
        } else if (Statics.field293 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1955, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
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
}
