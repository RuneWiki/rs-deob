package deob;

@ObfuscatedName("et")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.q(B)J")
    public static synchronized long method12() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2113) {
            Statics.field2114 += Statics.field2113 - var0;
        }
        Statics.field2113 = var0;
        return Statics.field2114 + var0;
    }
}
