package deob;

@ObfuscatedName("ga")
public class class187 {

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bt.y(I)J")
    public static synchronized long method1700() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2391) {
            Statics.field2390 += Statics.field2391 - var0;
        }
        Statics.field2391 = var0;
        return Statics.field2390 + var0;
    }
}
