package deob;

@ObfuscatedName("lk")
public final class class294 {

    public class294() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.af(I)J")
    public static final synchronized long method2504() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3363) {
            Statics.field3364 += Statics.field3363 - var0;
        }
        Statics.field3363 = var0;
        return Statics.field3364 + var0;
    }
}
