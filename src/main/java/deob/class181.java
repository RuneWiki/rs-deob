package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("gi")
public class class181 {

    @ObfuscatedName("gi.ak")
    public static boolean field1901 = false;

    @ObfuscatedName("gi.aj")
    public static Hashtable field1898 = new Hashtable(16);

    public class181() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("qi.ak(Ljava/io/File;I)V")
    public static void method7114(File arg0) {
        Statics.field3562 = arg0;
        if (!Statics.field3562.exists()) {
            throw new RuntimeException("");
        }
        field1901 = true;
    }

    @ObfuscatedName("im.al(Ljava/lang/String;I)Ljava/io/File;")
    public static File method4146(String arg0) {
        if (!field1901) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1898.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field3562, arg0);
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
            field1898.put(arg0, var2);
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

    @ObfuscatedName("cg.aj(B)V")
    public static void method2012() {
        field1898.clear();
    }
}
