package deob;

@ObfuscatedName("ka")
public final class class297 {

    public class297() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("he.a(I)J")
    public static final synchronized long method3777() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3685) {
            Statics.field3684 += Statics.field3685 - var0;
        }
        Statics.field3685 = var0;
        return Statics.field3684 + var0;
    }
}
