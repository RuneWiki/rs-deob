package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ei")
public class class146 {

    @ObfuscatedName("ei.l")
    public static boolean field1568 = false;

    @ObfuscatedName("ei.f")
    public static Hashtable field1570 = new Hashtable(16);

    public class146() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.l(Ljava/lang/String;S)Ljava/io/File;")
    public static File method2508(String arg0) {
        if (!field1568) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1570.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1569, arg0);
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
            field1570.put(arg0, var2);
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
