package deob;

@ObfuscatedName("jx")
public final class class270 {

    public class270() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.s(I)J")
    public static final synchronized long method3146() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3179) {
            Statics.field3181 += Statics.field3179 - var0;
        }
        Statics.field3179 = var0;
        return Statics.field3181 + var0;
    }
}
