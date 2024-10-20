package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fj")
public class class179 {

    @ObfuscatedName("fj.n")
    public static boolean field2073 = false;

    @ObfuscatedName("fj.d")
    public static Hashtable field2074 = new Hashtable(16);

    public class179() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.n(Ljava/io/File;B)V")
    public static void method27(File arg0) {
        Statics.field2075 = arg0;
        if (!Statics.field2075.exists()) {
            throw new RuntimeException("");
        }
        field2073 = true;
    }

    @ObfuscatedName("cj.v(Ljava/lang/String;B)Ljava/io/File;")
    public static File method1986(String arg0) {
        if (!field2073) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2074.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2075, arg0);
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
            field2074.put(arg0, var2);
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
