package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bp")
public class class72 {

    @ObfuscatedName("bp.b")
    public static boolean field1335 = false;

    @ObfuscatedName("bp.j")
    public static Hashtable field1332 = new Hashtable(16);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.b(Ljava/io/File;S)V")
    public static void method2189(File arg0) {
        Statics.field1331 = arg0;
        if (!Statics.field1331.exists()) {
            throw new RuntimeException("");
        }
        field1335 = true;
    }

    @ObfuscatedName("ak.c(Ljava/lang/String;B)Ljava/io/File;")
    public static File method1148(String arg0) {
        if (!field1335) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1332.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1331, arg0);
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
            field1332.put(arg0, var2);
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
