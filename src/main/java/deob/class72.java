package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ba")
public class class72 {

    @ObfuscatedName("ba.l")
    public static boolean field1295 = false;

    @ObfuscatedName("ba.o")
    public static Hashtable field1299 = new Hashtable(16);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.l(Ljava/lang/String;S)Ljava/io/File;")
    public static File method166(String arg0) {
        if (!field1295) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1299.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1297, arg0);
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
            field1299.put(arg0, var2);
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
