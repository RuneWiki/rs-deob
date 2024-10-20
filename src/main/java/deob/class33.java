package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("ah")
public class class33 {

    @ObfuscatedName("ah.t")
    public static boolean field369 = false;

    @ObfuscatedName("ah.q")
    public static Hashtable field370 = new Hashtable(16);

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.t(Ljava/lang/String;B)Ljava/io/File;")
    public static File method51(String arg0) {
        if (!field369) {
            throw new RuntimeException("");
        }
        File var1 = (File) field370.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1218, arg0);
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
            field370.put(arg0, var2);
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
