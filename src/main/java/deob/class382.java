package deob;

@ObfuscatedName("nw")
public final class class382 {

    public class382() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.s(B)J")
    public static final synchronized long method2013() {
        long var0 = System.currentTimeMillis();
        if (var0 < Statics.field3626) {
            Statics.field4174 += Statics.field3626 - var0;
        }
        Statics.field3626 = var0;
        return Statics.field4174 + var0;
    }
}
