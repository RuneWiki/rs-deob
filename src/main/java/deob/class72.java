package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ba")
public class class72 {

    @ObfuscatedName("ba.x")
    public static boolean field1276 = false;

    @ObfuscatedName("ba.k")
    public static Hashtable field1277 = new Hashtable(16);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.x(Ljava/io/File;B)V")
    public static void method6(File arg0) {
        Statics.field1275 = arg0;
        if (!Statics.field1275.exists()) {
            throw new RuntimeException("");
        }
        field1276 = true;
    }

    @ObfuscatedName("d.p(Ljava/lang/String;I)Ljava/io/File;")
    public static File method214(String arg0) {
        if (!field1276) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1277.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1275, arg0);
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
            field1277.put(arg0, var2);
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
