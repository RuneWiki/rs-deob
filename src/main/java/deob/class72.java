package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bn")
public class class72 {

    @ObfuscatedName("bn.p")
    public static boolean field1310 = false;

    @ObfuscatedName("bn.o")
    public static Hashtable field1315 = new Hashtable(16);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.p(Ljava/io/File;I)V")
    public static void method2405(File arg0) {
        Statics.field1762 = arg0;
        if (!Statics.field1762.exists()) {
            throw new RuntimeException("");
        }
        field1310 = true;
    }

    @ObfuscatedName("by.i(Ljava/lang/String;S)Ljava/io/File;")
    public static File method1400(String arg0) {
        if (!field1310) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1315.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1762, arg0);
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
            field1315.put(arg0, var2);
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
