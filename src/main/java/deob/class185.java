package deob;

@ObfuscatedName("gb")
public class class185 {

    public class185() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.w(I)J")
    public static synchronized long method3151() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2289) {
            Statics.field2381 += Statics.field2289 - var0;
        }
        Statics.field2289 = var0;
        return Statics.field2381 + var0;
    }
}
