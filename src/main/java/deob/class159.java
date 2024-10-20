package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fe")
public class class159 {

    @ObfuscatedName("fe.e")
    public static boolean field2243 = false;

    @ObfuscatedName("fe.g")
    public static Hashtable field2241 = new Hashtable(16);

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.e(Ljava/io/File;I)V")
    public static void method1668(File arg0) {
        Statics.field2239 = arg0;
        if (!Statics.field2239.exists()) {
            throw new RuntimeException("");
        }
        field2243 = true;
    }

    @ObfuscatedName("bs.n(Ljava/lang/String;I)Ljava/io/File;")
    public static File method1040(String arg0) {
        if (!field2243) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2241.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2239, arg0);
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
            field2241.put(arg0, var2);
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
