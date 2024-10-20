package deob;

@ObfuscatedName("dh")
public class class42 {

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.v(I)J")
    public static synchronized long method1378() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field443) {
            Statics.field437 += Statics.field443 - var0;
        }
        Statics.field443 = var0;
        return Statics.field437 + var0;
    }
}
