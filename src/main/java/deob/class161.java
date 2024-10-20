package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fg")
public class class161 {

    @ObfuscatedName("fg.g")
    public static boolean field2044 = false;

    @ObfuscatedName("fg.e")
    public static Hashtable field2041 = new Hashtable(16);

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.g(Ljava/io/File;B)V")
    public static void method3105(File arg0) {
        Statics.field3803 = arg0;
        if (!Statics.field3803.exists()) {
            throw new RuntimeException("");
        }
        field2044 = true;
    }

    @ObfuscatedName("ag.r(Ljava/lang/String;I)Ljava/io/File;")
    public static File method586(String arg0) {
        if (!field2044) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2041.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field3803, arg0);
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
            field2041.put(arg0, var2);
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
