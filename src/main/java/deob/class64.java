package deob;

@ObfuscatedName("bj")
public class class64 {

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.q(B)J")
    public static synchronized long method535() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field830) {
            Statics.field829 += Statics.field830 - var0;
        }
        Statics.field830 = var0;
        return Statics.field829 + var0;
    }
}
