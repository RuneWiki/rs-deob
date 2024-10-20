package deob;

@ObfuscatedName("kk")
public final class class297 {

    public class297() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.u(I)J")
    public static final synchronized long method3217() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3696) {
            Statics.field3697 += Statics.field3696 - var0;
        }
        Statics.field3696 = var0;
        return Statics.field3697 + var0;
    }
}
