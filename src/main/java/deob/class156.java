package deob;

@ObfuscatedName("el")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.x(I)J")
    public static synchronized long method1898() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2103) {
            Statics.field2108 += Statics.field2103 - var0;
        }
        Statics.field2103 = var0;
        return Statics.field2108 + var0;
    }
}
