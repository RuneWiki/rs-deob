package deob;

@ObfuscatedName("fi")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.i(B)J")
    public static synchronized long method89() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2425) {
            Statics.field3670 += Statics.field2425 - var0;
        }
        Statics.field2425 = var0;
        return Statics.field3670 + var0;
    }
}
