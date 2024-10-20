package deob;

@ObfuscatedName("kp")
public final class class308 {

    public class308() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jh.f(S)J")
    public static final synchronized long method4786() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field566) {
            Statics.field3732 += Statics.field566 - var0;
        }
        Statics.field566 = var0;
        return Statics.field3732 + var0;
    }
}
