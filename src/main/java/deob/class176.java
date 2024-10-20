package deob;

@ObfuscatedName("fh")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.e(B)J")
    public static synchronized long method218() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2393) {
            Statics.field2388 += Statics.field2393 - var0;
        }
        Statics.field2393 = var0;
        return Statics.field2388 + var0;
    }
}
