package deob;

@ObfuscatedName("oh")
public final class class398 {

    public class398() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.l(I)J")
    public static final synchronized long method2299() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field4284) {
            Statics.field2920 += Statics.field4284 - var0;
        }
        Statics.field4284 = var0;
        return Statics.field2920 + var0;
    }
}
