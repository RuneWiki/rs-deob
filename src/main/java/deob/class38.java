package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ar")
public class class38 {

    @ObfuscatedName("ar.g")
    public static class14 field508 = null;

    @ObfuscatedName("ar.w")
    public static class14 field516 = null;

    @ObfuscatedName("ar.v")
    public static class14 field509 = null;

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dy.t(Ljava/io/File;Ljava/io/File;I)V")
    public static void method1461(File arg0, File arg1) {
        try {
            class13 var2 = new class13(Statics.field514, "rw", 10000L);
            class135 var3 = new class135(500);
            var3.method1558(3);
            var3.method1558(arg1 == null ? 0 : 1);
            var3.method1579(arg0.getPath());
            if (arg1 != null) {
                var3.method1579(arg1.getPath());
            }
            var2.method125(var3.field1723, 0, var3.field1722);
            var2.method117();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("au.n(Ljava/io/File;ZB)Z")
    public static boolean method436(File arg0, boolean arg1) {
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

    @ObfuscatedName("q.q(Lec;IS)V")
    public static void method44(class135 arg0, int arg1) {
        if (field508 == null) {
            return;
        }
        try {
            field508.method139(0L);
            field508.method144(arg0.field1723, arg1, 24);
        } catch (Exception var3) {
        }
    }
}
