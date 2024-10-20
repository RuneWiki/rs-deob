package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fm")
public class class160 {

    @ObfuscatedName("fm.v")
    public static boolean field1735 = false;

    @ObfuscatedName("fm.i")
    public static Hashtable field1734 = new Hashtable(16);

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.v(Ljava/io/File;B)V")
    public static void method2692(File arg0) {
        Statics.field1460 = arg0;
        if (!Statics.field1460.exists()) {
            throw new RuntimeException("");
        }
        field1735 = true;
    }

    @ObfuscatedName("be.c(Ljava/lang/String;I)Ljava/io/File;")
    public static File method1052(String arg0) {
        if (!field1735) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1734.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1460, arg0);
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
            field1734.put(arg0, var2);
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
