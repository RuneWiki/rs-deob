package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fc")
public class class158 {

    @ObfuscatedName("fc.i")
    public static boolean field2282 = false;

    @ObfuscatedName("fc.e")
    public static Hashtable field2280 = new Hashtable(16);

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.i(Ljava/lang/String;I)Ljava/io/File;")
    public static File method231(String arg0) {
        if (!field2282) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2280.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2279, arg0);
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
            field2280.put(arg0, var2);
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
