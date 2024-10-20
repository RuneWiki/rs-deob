package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("gs")
public class class178 {

    @ObfuscatedName("gs.az")
    public static boolean field1892 = false;

    @ObfuscatedName("gs.af")
    public static Hashtable field1890 = new Hashtable(16);

    public class178() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.az(Ljava/lang/String;S)Ljava/io/File;")
    public static File method2862(String arg0) {
        if (!field1892) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1890.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1889, arg0);
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
            field1890.put(arg0, var2);
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

    @ObfuscatedName("hu.ah(B)V")
    public static void method3501() {
        field1890.clear();
    }
}
