package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ft")
public class class170 {

    @ObfuscatedName("ft.b")
    public static boolean field2186 = false;

    @ObfuscatedName("ft.o")
    public static Hashtable field2184 = new Hashtable(16);

    public class170() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.b(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2384(String arg0) {
        if (!field2186) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2184.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2183, arg0);
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
            field2184.put(arg0, var2);
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
