package deob;

@ObfuscatedName("kb")
public final class class297 {

    public class297() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.z(I)J")
    public static final synchronized long method502() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3689) {
            Statics.field3690 += Statics.field3689 - var0;
        }
        Statics.field3689 = var0;
        return Statics.field3690 + var0;
    }
}
