package deob;

@ObfuscatedName("kg")
public final class class307 {

    public class307() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fw.m(I)J")
    public static final synchronized long method3253() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3724) {
            Statics.field3727 += Statics.field3724 - var0;
        }
        Statics.field3724 = var0;
        return Statics.field3727 + var0;
    }
}
