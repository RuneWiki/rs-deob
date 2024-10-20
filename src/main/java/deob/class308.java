package deob;

@ObfuscatedName("kc")
public final class class308 {

    public class308() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.n(I)J")
    public static final synchronized long method1082() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3735) {
            Statics.field3736 += Statics.field3735 - var0;
        }
        Statics.field3735 = var0;
        return Statics.field3736 + var0;
    }
}
