package deob;

@ObfuscatedName("mo")
public final class class326 {

    public class326() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.ak(I)J")
    public static final synchronized long method2895() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3554) {
            Statics.field5263 += Statics.field3554 - var0;
        }
        Statics.field3554 = var0;
        return Statics.field5263 + var0;
    }
}
