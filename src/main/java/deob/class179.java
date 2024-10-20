package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fc")
public class class179 {

    @ObfuscatedName("fc.h")
    public static boolean field2077 = false;

    @ObfuscatedName("fc.x")
    public static Hashtable field2078 = new Hashtable(16);

    public class179() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.h(Ljava/lang/String;I)Ljava/io/File;")
    public static File method3098(String arg0) {
        if (!field2077) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2078.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2073, arg0);
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
            field2078.put(arg0, var2);
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
