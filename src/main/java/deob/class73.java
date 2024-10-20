package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("be")
public class class73 {

    @ObfuscatedName("be.i")
    public static boolean field1321 = false;

    @ObfuscatedName("be.r")
    public static Hashtable field1322 = new Hashtable(16);

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.i(Ljava/io/File;B)V")
    public static void method560(File arg0) {
        Statics.field1328 = arg0;
        if (!Statics.field1328.exists()) {
            throw new RuntimeException("");
        }
        field1321 = true;
    }

    @ObfuscatedName("bh.b(Ljava/lang/String;I)Ljava/io/File;")
    public static File method1414(String arg0) {
        if (!field1321) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1322.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1328, arg0);
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
            field1322.put(arg0, var2);
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
