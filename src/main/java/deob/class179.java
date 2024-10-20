package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fw")
public class class179 {

    @ObfuscatedName("fw.z")
    public static boolean field2099 = false;

    @ObfuscatedName("fw.s")
    public static Hashtable field2097 = new Hashtable(16);

    public class179() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.z(Ljava/io/File;I)V")
    public static void method332(File arg0) {
        Statics.field2098 = arg0;
        if (!Statics.field2098.exists()) {
            throw new RuntimeException("");
        }
        field2099 = true;
    }

    @ObfuscatedName("az.k(Ljava/lang/String;I)Ljava/io/File;")
    public static File method566(String arg0) {
        if (!field2099) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2097.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2098, arg0);
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
            field2097.put(arg0, var2);
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
