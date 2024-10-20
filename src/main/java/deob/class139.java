package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("er")
public class class139 {

    @ObfuscatedName("er.l")
    public static boolean field2139 = false;

    @ObfuscatedName("er.r")
    public static Hashtable field2145 = new Hashtable(16);

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.l(Ljava/io/File;I)V")
    public static void method203(File arg0) {
        Statics.field2138 = arg0;
        if (!Statics.field2138.exists()) {
            throw new RuntimeException("");
        }
        field2139 = true;
    }

    @ObfuscatedName("fe.g(Ljava/lang/String;B)Ljava/io/File;")
    public static File method3406(String arg0) {
        if (!field2139) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2145.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2138, arg0);
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
            field2145.put(arg0, var2);
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
