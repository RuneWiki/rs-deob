package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fg")
public class class170 {

    @ObfuscatedName("fg.z")
    public static boolean field2034 = false;

    @ObfuscatedName("fg.v")
    public static Hashtable field2033 = new Hashtable(16);

    public class170() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.z(Ljava/lang/String;I)Ljava/io/File;")
    public static File method3066(String arg0) {
        if (!field2034) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2033.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2036, arg0);
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
            field2033.put(arg0, var2);
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
