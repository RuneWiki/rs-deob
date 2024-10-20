package deob;

@ObfuscatedName("et")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.u(I)J")
    public static synchronized long method118() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2096) {
            Statics.field2092 += Statics.field2096 - var0;
        }
        Statics.field2096 = var0;
        return Statics.field2092 + var0;
    }
}
