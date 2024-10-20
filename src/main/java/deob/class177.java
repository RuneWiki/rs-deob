package deob;

@ObfuscatedName("fa")
public class class177 {

    public class177() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.j(I)J")
    public static synchronized long method1067() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2408) {
            Statics.field2405 += Statics.field2408 - var0;
        }
        Statics.field2408 = var0;
        return Statics.field2405 + var0;
    }
}
