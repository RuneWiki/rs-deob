package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("et")
public class class144 {

    @ObfuscatedName("et.y")
    public static class385 field1552 = null;

    @ObfuscatedName("et.v")
    public static class385 field1551 = null;

    @ObfuscatedName("et.f")
    public static class385 field1554 = null;

    public class144() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.n(Ljava/lang/String;Ljava/lang/String;ZB)Lnn;")
    public static class384 method18(String arg0, String arg1, boolean arg2) {
        File var3 = new File(Statics.field1549, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class384(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (Statics.field4265 == 33) {
            var6 = "_rc";
        } else if (Statics.field4265 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(Statics.field1001, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class384(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class384(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lc.c(B)V")
    public static void method5482() {
        try {
            File var0 = new File(Statics.field1001, "random.dat");
            if (var0.exists()) {
                field1552 = new class385(new class384(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < Statics.field964.length; var1++) {
                    for (int var2 = 0; var2 < Statics.field1261.length; var2++) {
                        File var3 = new File(Statics.field1261[var2] + Statics.field964[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            field1552 = new class385(new class384(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (field1552 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                field1552 = new class385(new class384(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }
}
