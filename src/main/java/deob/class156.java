package deob;

@ObfuscatedName("ej")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.i(I)J")
    public static synchronized long method1307() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2109) {
            Statics.field2110 += Statics.field2109 - var0;
        }
        Statics.field2109 = var0;
        return Statics.field2110 + var0;
    }
}
