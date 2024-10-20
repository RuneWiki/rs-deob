package deob;

@ObfuscatedName("bx")
public class class63 {

    public class63() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.r(I)J")
    public static synchronized long method1135() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field809) {
            Statics.field810 += Statics.field809 - var0;
        }
        Statics.field809 = var0;
        return Statics.field810 + var0;
    }
}
