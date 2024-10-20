package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fd")
public class class159 {

    @ObfuscatedName("fd.i")
    public static boolean field2261 = false;

    @ObfuscatedName("fd.a")
    public static Hashtable field2262 = new Hashtable(16);

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.i(Ljava/lang/String;I)Ljava/io/File;")
    public static File method256(String arg0) {
        if (!field2261) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2262.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2266, arg0);
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
            field2262.put(arg0, var2);
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
