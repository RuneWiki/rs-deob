package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bb")
public class class73 {

    @ObfuscatedName("bb.e")
    public static boolean field1321 = false;

    @ObfuscatedName("bb.k")
    public static Hashtable field1326 = new Hashtable(16);

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.e(Ljava/lang/String;I)Ljava/io/File;")
    public static File method701(String arg0) {
        if (!field1321) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1326.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1325, arg0);
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
            field1326.put(arg0, var2);
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
