package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ew")
public class class156 {

    @ObfuscatedName("ew.c")
    public static boolean field1698 = false;

    @ObfuscatedName("ew.p")
    public static Hashtable field1696 = new Hashtable(16);

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("il.c(Ljava/io/File;B)V")
    public static void method4571(File arg0) {
        Statics.field1490 = arg0;
        if (!Statics.field1490.exists()) {
            throw new RuntimeException("");
        }
        field1698 = true;
    }

    @ObfuscatedName("am.b(Ljava/lang/String;I)Ljava/io/File;")
    public static File method604(String arg0) {
        if (!field1698) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1696.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1490, arg0);
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
            field1696.put(arg0, var2);
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
