package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fi")
public class class158 {

    @ObfuscatedName("fi.e")
    public static boolean field2241 = false;

    @ObfuscatedName("fi.m")
    public static Hashtable field2243 = new Hashtable(16);

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.e(Ljava/lang/String;S)Ljava/io/File;")
    public static File method140(String arg0) {
        if (!field2241) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2243.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2242, arg0);
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
            field2243.put(arg0, var2);
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
