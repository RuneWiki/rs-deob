package deob;

@ObfuscatedName("ki")
public final class class287 {

    public class287() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.f(I)J")
    public static final synchronized long method3099() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3336) {
            Statics.field3338 += Statics.field3336 - var0;
        }
        Statics.field3336 = var0;
        return Statics.field3338 + var0;
    }
}
