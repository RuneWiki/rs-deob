package deob;

@ObfuscatedName("fl")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fo.i(I)J")
    public static synchronized long method2862() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2418) {
            Statics.field2419 += Statics.field2418 - var0;
        }
        Statics.field2418 = var0;
        return Statics.field2419 + var0;
    }
}
