package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fk")
public class class158 {

    @ObfuscatedName("fk.d")
    public static boolean field2233 = false;

    @ObfuscatedName("fk.x")
    public static Hashtable field2236 = new Hashtable(16);

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.d(Ljava/io/File;I)V")
    public static void method1013(File arg0) {
        Statics.field2234 = arg0;
        if (!Statics.field2234.exists()) {
            throw new RuntimeException("");
        }
        field2233 = true;
    }

    @ObfuscatedName("de.q(Ljava/lang/String;I)Ljava/io/File;")
    public static File method1999(String arg0) {
        if (!field2233) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2236.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2234, arg0);
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
            field2236.put(arg0, var2);
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
