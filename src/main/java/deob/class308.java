package deob;

@ObfuscatedName("kh")
public final class class308 {

    public class308() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kq.h(I)J")
    public static final synchronized long method4891() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3745) {
            Statics.field3744 += Statics.field3745 - var0;
        }
        Statics.field3745 = var0;
        return Statics.field3744 + var0;
    }
}
