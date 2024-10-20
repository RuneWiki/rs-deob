package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("eg")
public class class139 {

    @ObfuscatedName("eg.f")
    public static boolean field2140 = false;

    @ObfuscatedName("eg.n")
    public static Hashtable field2138 = new Hashtable(16);

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dh.f(Ljava/io/File;I)V")
    public static void method2324(File arg0) {
        Statics.field2137 = arg0;
        if (!Statics.field2137.exists()) {
            throw new RuntimeException("");
        }
        field2140 = true;
    }

    @ObfuscatedName("ei.e(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2812(String arg0) {
        if (!field2140) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2138.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2137, arg0);
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
            field2138.put(arg0, var2);
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
