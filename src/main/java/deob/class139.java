package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("eo")
public class class139 {

    @ObfuscatedName("eo.m")
    public static boolean field2137 = false;

    @ObfuscatedName("eo.e")
    public static Hashtable field2141 = new Hashtable(16);

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.m(Ljava/io/File;I)V")
    public static void method2135(File arg0) {
        Statics.field2136 = arg0;
        if (!Statics.field2136.exists()) {
            throw new RuntimeException("");
        }
        field2137 = true;
    }

    @ObfuscatedName("s.w(Ljava/lang/String;I)Ljava/io/File;")
    public static File method164(String arg0) {
        if (!field2137) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2141.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2136, arg0);
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
