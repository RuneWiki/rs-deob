package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("bv")
public class class72 {

    @ObfuscatedName("bv.t")
    public static boolean field1345 = false;

    @ObfuscatedName("bv.c")
    public static Hashtable field1340 = new Hashtable(16);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.t(Ljava/io/File;I)V")
    public static void method559(File arg0) {
        Statics.field1342 = arg0;
        if (!Statics.field1342.exists()) {
            throw new RuntimeException("");
        }
        field1345 = true;
    }

    @ObfuscatedName("fe.l(Ljava/lang/String;B)Ljava/io/File;")
    public static File method3163(String arg0) {
        if (!field1345) {
            throw new RuntimeException("");
        }
        File var1 = (File) field1340.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field1342, arg0);
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
            field1340.put(arg0, var2);
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
