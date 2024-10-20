package deob;

@ObfuscatedName("ep")
public class class156 {

    public class156() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.b(I)J")
    public static synchronized long method81() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2099) {
            Statics.field99 += Statics.field2099 - var0;
        }
        Statics.field2099 = var0;
        return Statics.field99 + var0;
    }
}
