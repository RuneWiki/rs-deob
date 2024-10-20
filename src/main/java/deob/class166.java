package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fz")
public class class166 {

    @ObfuscatedName("fz.a")
    public static boolean field2056 = false;

    @ObfuscatedName("fz.g")
    public static Hashtable field2058 = new Hashtable(16);

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("em.a(Ljava/io/File;I)V")
    public static void method3063(File arg0) {
        Statics.field2057 = arg0;
        if (!Statics.field2057.exists()) {
            throw new RuntimeException("");
        }
        field2056 = true;
    }

    @ObfuscatedName("be.s(Ljava/lang/String;B)Ljava/io/File;")
    public static File method958(String arg0) {
        if (!field2056) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2058.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2057, arg0);
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
            field2058.put(arg0, var2);
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
