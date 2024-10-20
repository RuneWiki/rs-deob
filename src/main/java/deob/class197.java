package deob;

@ObfuscatedName("gq")
public class class197 {

    public class197() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.d(I)J")
    public static synchronized long method1501() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field22) {
            Statics.field2586 += Statics.field22 - var0;
        }
        Statics.field22 = var0;
        return Statics.field2586 + var0;
    }
}
