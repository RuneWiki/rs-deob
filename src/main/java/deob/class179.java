package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fl")
public class class179 {

    @ObfuscatedName("fl.m")
    public static boolean field2087 = false;

    @ObfuscatedName("fl.q")
    public static Hashtable field2086 = new Hashtable(16);

    public class179() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hi.m(Ljava/io/File;I)V")
    public static void method3647(File arg0) {
        Statics.field2085 = arg0;
        if (!Statics.field2085.exists()) {
            throw new RuntimeException("");
        }
        field2087 = true;
    }

    @ObfuscatedName("ij.o(Ljava/lang/String;B)Ljava/io/File;")
    public static File method3877(String arg0) {
        if (!field2087) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2086.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2085, arg0);
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
            field2086.put(arg0, var2);
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
