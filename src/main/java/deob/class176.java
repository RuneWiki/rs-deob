package deob;

@ObfuscatedName("fw")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.d(I)J")
    public static synchronized long method2725() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field2422) {
            Statics.field2420 += Statics.field2422 - var0;
        }
        Statics.field2422 = var0;
        return Statics.field2420 + var0;
    }
}
