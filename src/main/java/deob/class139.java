package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("eo")
public class class139 {

    @ObfuscatedName("eo.a")
    public static boolean field2159 = false;

    @ObfuscatedName("eo.v")
    public static Hashtable field2156 = new Hashtable(16);

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.a(Ljava/io/File;I)V")
    public static void method293(File arg0) {
        Statics.field2975 = arg0;
        if (!Statics.field2975.exists()) {
            throw new RuntimeException("");
        }
        field2159 = true;
    }

    @ObfuscatedName("g.d(Ljava/lang/String;I)Ljava/io/File;")
    public static File method120(String arg0) {
        if (!field2159) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2156.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2975, arg0);
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
            field2156.put(arg0, var2);
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
