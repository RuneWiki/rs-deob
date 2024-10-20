package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ih")
public class class220 {

    @ObfuscatedName("ih.aq")
    public static boolean field2369 = false;

    @ObfuscatedName("ih.ag")
    public static Hashtable field2367 = new Hashtable(16);

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eg.aq(Ljava/io/File;I)V")
    public static void method2631(File arg0) {
        Statics.field2368 = arg0;
        if (!Statics.field2368.exists()) {
            throw new RuntimeException("");
        }
        field2369 = true;
    }

    @ObfuscatedName("ja.ad(Ljava/lang/String;B)Ljava/io/File;")
    public static File method4522(String arg0) {
        if (!field2369) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2367.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field2368, arg0);
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
            field2367.put(arg0, var2);
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

    @ObfuscatedName("gw.ag(B)V")
    public static void method3270() {
        field2367.clear();
    }
}
