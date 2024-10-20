package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("gy")
public class class175 {

    @ObfuscatedName("gy.at")
    public static boolean field1841 = false;

    @ObfuscatedName("gy.av")
    public static Hashtable field1839 = new Hashtable(16);

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("es.at(Ljava/lang/String;B)Ljava/io/File;")
    public static File method2755(String arg0) {
        if (!field1841) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1839.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1840, arg0);
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
            field1839.put(arg0, var2);
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
