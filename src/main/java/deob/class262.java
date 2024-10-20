package deob;

@ObfuscatedName("jr")
public final class class262 {

    public class262() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ja.c(I)J")
    public static final synchronized long method4787() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3088) {
            Statics.field3084 += Statics.field3088 - var0;
        }
        Statics.field3088 = var0;
        return Statics.field3084 + var0;
    }
}
