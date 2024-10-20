package deob;

@ObfuscatedName("fy")
public class class163 {

    public class163() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.n(B)J")
    public static synchronized long method3594() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2310) {
            Statics.field2307 += Statics.field2310 - var0;
        }
        Statics.field2310 = var0;
        return Statics.field2307 + var0;
    }
}
