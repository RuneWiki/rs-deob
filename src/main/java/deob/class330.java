package deob;

@ObfuscatedName("my")
public final class class330 {

    public class330() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ck.ap(I)J")
    public static final synchronized long method2257() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3605) {
            Statics.field3603 += Statics.field3605 - var0;
        }
        Statics.field3605 = var0;
        return Statics.field3603 + var0;
    }
}
