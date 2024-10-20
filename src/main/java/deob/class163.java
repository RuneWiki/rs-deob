package deob;

@ObfuscatedName("fb")
public class class163 {

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.k(B)J")
    public static synchronized long method225() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2281) {
            Statics.field2278 += Statics.field2281 - var0;
        }
        Statics.field2281 = var0;
        return Statics.field2278 + var0;
    }
}
