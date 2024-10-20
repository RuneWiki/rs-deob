package deob;

@ObfuscatedName("fd")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.w(I)J")
    public static synchronized long method3200() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2404) {
            Statics.field2405 += Statics.field2404 - var0;
        }
        Statics.field2404 = var0;
        return Statics.field2405 + var0;
    }
}
