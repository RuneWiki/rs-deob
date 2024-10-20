package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bz")
public class class71 {

    @ObfuscatedName("bz.g")
    public static boolean field1293 = false;

    @ObfuscatedName("bz.n")
    public static Hashtable field1292 = new Hashtable(16);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.g(Ljava/io/File;I)V")
    public static void method820(File arg0) {
        Statics.field2004 = arg0;
        if (!Statics.field2004.exists()) {
            throw new RuntimeException("");
        }
        field1293 = true;
    }

    @ObfuscatedName("k.e(Ljava/lang/String;I)Ljava/io/File;")
    public static File method225(String arg0) {
        if (!field1293) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1292.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2004, arg0);
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
            field1292.put(arg0, var2);
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
