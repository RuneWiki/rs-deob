package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ew")
public class class135 {

    @ObfuscatedName("ew.h")
    public static boolean field2087 = false;

    @ObfuscatedName("ew.i")
    public static Hashtable field2084 = new Hashtable(16);

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.h(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2115(String arg0) {
        if (!field2087) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2084.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field585, arg0);
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
            field2084.put(arg0, var2);
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
