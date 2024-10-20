package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fr")
public class class159 {

    @ObfuscatedName("fr.j")
    public static boolean field2268 = false;

    @ObfuscatedName("fr.f")
    public static Hashtable field2266 = new Hashtable(16);

    public class159() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.j(Ljava/io/File;I)V")
    public static void method2667(File arg0) {
        Statics.field2263 = arg0;
        if (!Statics.field2263.exists()) {
            throw new RuntimeException("");
        }
        field2268 = true;
    }

    @ObfuscatedName("av.h(Ljava/lang/String;I)Ljava/io/File;")
    public static File method256(String arg0) {
        if (!field2268) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2266.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2263, arg0);
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
            field2266.put(arg0, var2);
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
