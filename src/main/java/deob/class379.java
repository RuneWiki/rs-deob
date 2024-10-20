package deob;

@ObfuscatedName("nb")
public final class class379 {

    public class379() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.f(B)J")
    public static final synchronized long method1540() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field4147) {
            Statics.field4146 += Statics.field4147 - var0;
        }
        Statics.field4147 = var0;
        return Statics.field4146 + var0;
    }
}
