package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ek")
public class class135 {

    @ObfuscatedName("ek.k")
    public static boolean field2045 = false;

    @ObfuscatedName("ek.o")
    public static Hashtable field2046 = new Hashtable(16);

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.k(Ljava/lang/String;I)Ljava/io/File;")
    public static File method177(String arg0) {
        if (!field2045) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2046.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2048, arg0);
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
            field2046.put(arg0, var2);
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
