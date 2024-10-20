package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("fn")
public class class167 {

    @ObfuscatedName("fn.a")
    public static boolean field1811 = false;

    @ObfuscatedName("fn.c")
    public static Hashtable field1806 = new Hashtable(16);

    public class167() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.a(Ljava/io/File;I)V")
    public static void method2792(File arg0) {
        Statics.field1807 = arg0;
        if (!Statics.field1807.exists()) {
            throw new RuntimeException("");
        }
        field1811 = true;
    }

    @ObfuscatedName("db.f(Ljava/lang/String;B)Ljava/io/File;")
    public static File method2770(String arg0) {
        if (!field1811) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1806.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1807, arg0);
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
            field1806.put(arg0, var2);
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
