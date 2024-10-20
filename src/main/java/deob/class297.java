package deob;

@ObfuscatedName("km")
public final class class297 {

    public class297() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.f(I)J")
    public static final synchronized long method481() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3688) {
            Statics.field3689 += Statics.field3688 - var0;
        }
        Statics.field3688 = var0;
        return Statics.field3689 + var0;
    }
}
