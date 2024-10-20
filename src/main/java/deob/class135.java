package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ey")
public class class135 {

    @ObfuscatedName("ey.a")
    public static boolean field2076 = false;

    @ObfuscatedName("ey.f")
    public static Hashtable field2080 = new Hashtable(16);

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.a(Ljava/io/File;B)V")
    public static void method555(File arg0) {
        Statics.field2077 = arg0;
        if (!Statics.field2077.exists()) {
            throw new RuntimeException("");
        }
        field2076 = true;
    }

    @ObfuscatedName("p.r(Ljava/lang/String;B)Ljava/io/File;")
    public static File method567(String arg0) {
        if (!field2076) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2080.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2077, arg0);
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
            field2080.put(arg0, var2);
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
