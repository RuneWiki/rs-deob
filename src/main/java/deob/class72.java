package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bj")
public class class72 {

    @ObfuscatedName("bj.g")
    public static boolean field1299 = false;

    @ObfuscatedName("bj.v")
    public static Hashtable field1297 = new Hashtable(16);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.g(Ljava/io/File;I)V")
    public static void method1(File arg0) {
        Statics.field1296 = arg0;
        if (!Statics.field1296.exists()) {
            throw new RuntimeException("");
        }
        field1299 = true;
    }

    @ObfuscatedName("a.m(Ljava/lang/String;B)Ljava/io/File;")
    public static File method189(String arg0) {
        if (!field1299) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1297.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1296, arg0);
        RandomAccessFile var3 = null;
        try {
            File var4 = new File(var2.getParent());
            if (!var4.exists()) {
                throw new RuntimeException("");
            }
            var3 = new RandomAccessFile(var2, "rw");
            int var5 = var3.read();
            var3.seek(0L);
            var3.write(var5);
            var3.seek(0L);
            var3.close();
            field1297.put(arg0, var2);
            return var2;
        } catch (Exception var10) {
            try {
                if (var3 != null) {
                    var3.close();
                    Object var7 = null;
                }
            } catch (Exception var9) {
            }
            throw new RuntimeException();
        }
    }
}
