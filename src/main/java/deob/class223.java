package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("iv")
public class class223 {

    @ObfuscatedName("iv.ac")
    public static boolean field2399 = false;

    @ObfuscatedName("iv.ag")
    public static Hashtable field2398 = new Hashtable(16);

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.ac(Ljava/io/File;I)V")
    public static void method196(File arg0) {
        Statics.field2396 = arg0;
        if (!Statics.field2396.exists()) {
            throw new RuntimeException("");
        }
        field2399 = true;
    }

    @ObfuscatedName("ka.ae(Ljava/lang/String;I)Ljava/io/File;")
    public static File method5150(String arg0) {
        if (!field2399) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2398.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2396, arg0);
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
            field2398.put(arg0, var2);
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

    @ObfuscatedName("eo.ag(I)V")
    public static void method2919() {
        field2398.clear();
    }
}
