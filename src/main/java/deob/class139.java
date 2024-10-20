package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ev")
public class class139 {

    @ObfuscatedName("ev.k")
    public static boolean field2142 = false;

    @ObfuscatedName("ev.f")
    public static Hashtable field2141 = new Hashtable(16);

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.k(Ljava/io/File;B)V")
    public static void method1622(File arg0) {
        Statics.field3218 = arg0;
        if (!Statics.field3218.exists()) {
            throw new RuntimeException("");
        }
        field2142 = true;
    }

    @ObfuscatedName("b.q(Ljava/lang/String;B)Ljava/io/File;")
    public static File method131(String arg0) {
        if (!field2142) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2141.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field3218, arg0);
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
            field2141.put(arg0, var2);
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
