package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bv")
public class class72 {

    @ObfuscatedName("bv.p")
    public static boolean field1301 = false;

    @ObfuscatedName("bv.d")
    public static Hashtable field1297 = new Hashtable(16);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.p(Ljava/io/File;I)V")
    public static void method208(File arg0) {
        Statics.field1811 = arg0;
        if (!Statics.field1811.exists()) {
            throw new RuntimeException("");
        }
        field1301 = true;
    }

    @ObfuscatedName("eo.l(Ljava/lang/String;I)Ljava/io/File;")
    public static File method3171(String arg0) {
        if (!field1301) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1297.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1811, arg0);
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
            field1297.put(arg0, var2);
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
