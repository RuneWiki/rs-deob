package deob;

@ObfuscatedName("jf")
public final class class270 {

    public class270() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.o(I)J")
    public static final synchronized long method2485() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3216) {
            Statics.field3218 += Statics.field3216 - var0;
        }
        Statics.field3216 = var0;
        return Statics.field3218 + var0;
    }
}
