package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("em")
public class class135 {

    @ObfuscatedName("em.h")
    public static boolean field2070 = false;

    @ObfuscatedName("em.v")
    public static Hashtable field2076 = new Hashtable(16);

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.h(Ljava/io/File;B)V")
    public static void method2672(File arg0) {
        Statics.field2069 = arg0;
        if (!Statics.field2069.exists()) {
            throw new RuntimeException("");
        }
        field2070 = true;
    }

    @ObfuscatedName("ba.q(Ljava/lang/String;B)Ljava/io/File;")
    public static File method1596(String arg0) {
        if (!field2070) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2076.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2069, arg0);
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
            field2076.put(arg0, var2);
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
