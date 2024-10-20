package deob;

@ObfuscatedName("lv")
public final class class302 {

    public class302() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.au(I)J")
    public static final synchronized long method655() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3379) {
            Statics.field115 += Statics.field3379 - var0;
        }
        Statics.field3379 = var0;
        return Statics.field115 + var0;
    }
}
