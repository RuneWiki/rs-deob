package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ep")
public class class136 {

    @ObfuscatedName("ep.w")
    public static boolean field2101 = false;

    @ObfuscatedName("ep.t")
    public static Hashtable field2096 = new Hashtable(16);

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.w(Ljava/io/File;I)V")
    public static void method99(File arg0) {
        Statics.field2097 = arg0;
        if (!Statics.field2097.exists()) {
            throw new RuntimeException("");
        }
        field2101 = true;
    }

    @ObfuscatedName("u.x(Ljava/lang/String;I)Ljava/io/File;")
    public static File method177(String arg0) {
        if (!field2101) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2096.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2097, arg0);
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
            field2096.put(arg0, var2);
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
