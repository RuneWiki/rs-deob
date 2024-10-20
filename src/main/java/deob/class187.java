package deob;

@ObfuscatedName("ga")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("du.f(I)J")
    public static synchronized long method2864() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2414) {
            Statics.field1852 += Statics.field2414 - var0;
        }
        Statics.field2414 = var0;
        return Statics.field1852 + var0;
    }
}
