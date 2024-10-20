package deob;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfuscatedName("if")
public class class223 {

    @ObfuscatedName("if.ap")
    public static boolean field2399 = false;

    @ObfuscatedName("if.ak")
    public static Hashtable field2402 = new Hashtable(16);

    public class223() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mw.ap(Ljava/io/File;I)V")
    public static void method5968(File arg0) {
        Statics.field72 = arg0;
        if (!Statics.field72.exists()) {
            throw new RuntimeException("");
        }
        field2399 = true;
    }

    @ObfuscatedName("dv.aw(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2567(String arg0) {
        if (!field2399) {
            throw new RuntimeException("");
        }
        File var1 = (File) field2402.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(Statics.field72, arg0);
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
            field2402.put(arg0, var2);
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

    @ObfuscatedName("bd.ak(I)V")
    public static void method835() {
        field2402.clear();
    }
}
