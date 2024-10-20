package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fl")
public class class159 {

    @ObfuscatedName("fl.b")
    public static boolean field2163 = false;

    @ObfuscatedName("fl.r")
    public static Hashtable field2158 = new Hashtable(16);

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.b(Ljava/io/File;B)V")
    public static void method35(File arg0) {
        Statics.field2157 = arg0;
        if (!Statics.field2157.exists()) {
            throw new RuntimeException("");
        }
        field2163 = true;
    }

    @ObfuscatedName("jv.s(Ljava/lang/String;B)Ljava/io/File;")
    public static File method4572(String arg0) {
        if (!field2163) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2158.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2157, arg0);
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
            field2158.put(arg0, var2);
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
