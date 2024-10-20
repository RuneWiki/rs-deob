package deob;

@ObfuscatedName("fy")
public class class179 {

    public class179() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.s(I)J")
    public static synchronized long method3585() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field324) {
            Statics.field2424 += Statics.field324 - var0;
        }
        Statics.field324 = var0;
        return Statics.field2424 + var0;
    }
}
