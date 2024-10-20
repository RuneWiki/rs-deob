package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ef")
public class class133 {

    @ObfuscatedName("ef.s")
    public static boolean field1483 = false;

    @ObfuscatedName("ef.v")
    public static Hashtable field1484 = new Hashtable(16);

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hi.s(Ljava/io/File;B)V")
    public static void method3959(File arg0) {
        Statics.field1482 = arg0;
        if (!Statics.field1482.exists()) {
            throw new RuntimeException("");
        }
        field1483 = true;
    }

    @ObfuscatedName("bm.t(Ljava/lang/String;B)Ljava/io/File;")
    public static File method1679(String arg0) {
        if (!field1483) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1484.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1482, arg0);
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
            field1484.put(arg0, var2);
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
