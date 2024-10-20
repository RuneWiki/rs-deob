package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fg")
public class class158 {

    @ObfuscatedName("fg.c")
    public static boolean field2221 = false;

    @ObfuscatedName("fg.i")
    public static Hashtable field2218 = new Hashtable(16);

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.c(Ljava/io/File;I)V")
    public static void method1656(File arg0) {
        Statics.field2217 = arg0;
        if (!Statics.field2217.exists()) {
            throw new RuntimeException("");
        }
        field2221 = true;
    }

    @ObfuscatedName("ar.o(Ljava/lang/String;I)Ljava/io/File;")
    public static File method451(String arg0) {
        if (!field2221) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2218.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2217, arg0);
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
            field2218.put(arg0, var2);
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
