package deob;

@ObfuscatedName("gm")
public class class183 {

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jd.m(I)J")
    public static synchronized long method4541() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2512) {
            Statics.field2511 += Statics.field2512 - var0;
        }
        Statics.field2512 = var0;
        return Statics.field2511 + var0;
    }
}
