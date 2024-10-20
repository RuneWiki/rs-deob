package deob;

@ObfuscatedName("be")
public class class63 {

    public class63() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.t(I)J")
    public static synchronized long method697() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field804) {
            Statics.field805 += Statics.field804 - var0;
        }
        Statics.field804 = var0;
        return Statics.field805 + var0;
    }
}
