package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ea")
public class class135 {

    @ObfuscatedName("ea.j")
    public static boolean field2067 = false;

    @ObfuscatedName("ea.f")
    public static Hashtable field2065 = new Hashtable(16);

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.j(Ljava/lang/String;S)Ljava/io/File;")
    public static File method1059(String arg0) {
        if (!field2067) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2065.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2066, arg0);
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
            field2065.put(arg0, var2);
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
