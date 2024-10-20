package deob;

@ObfuscatedName("gp")
public class class185 {

    public class185() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gk.z(I)J")
    public static synchronized long method3250() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2352) {
            Statics.field2351 += Statics.field2352 - var0;
        }
        Statics.field2352 = var0;
        return Statics.field2351 + var0;
    }
}
