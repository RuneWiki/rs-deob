package deob;

@ObfuscatedName("lp")
public final class class303 {

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eh.aw(I)J")
    public static final synchronized long method2705() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3369) {
            Statics.field3370 += Statics.field3369 - var0;
        }
        Statics.field3369 = var0;
        return Statics.field3370 + var0;
    }
}
