package deob;

@ObfuscatedName("op")
public final class class416 {

    public class416() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mi.c(I)J")
    public static final synchronized long method5860() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field4467) {
            Statics.field4468 += Statics.field4467 - var0;
        }
        Statics.field4467 = var0;
        return Statics.field4468 + var0;
    }
}
