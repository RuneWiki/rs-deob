package deob;

@ObfuscatedName("nx")
public final class class381 {

    public class381() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hw.f(B)J")
    public static final synchronized long method4000() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field4152) {
            Statics.field2114 += Statics.field4152 - var0;
        }
        Statics.field4152 = var0;
        return Statics.field2114 + var0;
    }
}
