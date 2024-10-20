package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fg")
public class class158 {

    @ObfuscatedName("fg.i")
    public static boolean field2237 = false;

    @ObfuscatedName("fg.u")
    public static Hashtable field2236 = new Hashtable(16);

    public class158() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.i(Ljava/io/File;B)V")
    public static void method1638(File arg0) {
        Statics.field2235 = arg0;
        if (!Statics.field2235.exists()) {
            throw new RuntimeException("");
        }
        field2237 = true;
    }

    @ObfuscatedName("az.h(Ljava/lang/String;I)Ljava/io/File;")
    public static File method204(String arg0) {
        if (!field2237) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2236.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2235, arg0);
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
