package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fm")
public class class161 {

    @ObfuscatedName("fm.c")
    public static boolean field1781 = false;

    @ObfuscatedName("fm.f")
    public static Hashtable field1774 = new Hashtable(16);

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.c(Ljava/io/File;I)V")
    public static void method2220(File arg0) {
        Statics.field1775 = arg0;
        if (!Statics.field1775.exists()) {
            throw new RuntimeException("");
        }
        field1781 = true;
    }

    @ObfuscatedName("y.p(Ljava/lang/String;I)Ljava/io/File;")
    public static File method311(String arg0) {
        if (!field1781) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1774.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1775, arg0);
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
            field1774.put(arg0, var2);
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
