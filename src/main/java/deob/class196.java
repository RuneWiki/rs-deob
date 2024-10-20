package deob;

@ObfuscatedName("gf")
public class class196 {

    public class196() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gi.b(B)J")
    public static synchronized long method3211() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field258) {
            Statics.field2555 += Statics.field258 - var0;
        }
        Statics.field258 = var0;
        return Statics.field2555 + var0;
    }
}
