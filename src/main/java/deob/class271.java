package deob;

@ObfuscatedName("ja")
public final class class271 {

    public class271() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lj.c(I)J")
    public static final synchronized long method5624() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3202) {
            Statics.field4198 += Statics.field3202 - var0;
        }
        Statics.field3202 = var0;
        return Statics.field4198 + var0;
    }
}
