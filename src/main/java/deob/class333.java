package deob;

@ObfuscatedName("ln")
public class class333 {

    @ObfuscatedName("ln.f")
    public static final class333 field3893 = new class333(0);

    @ObfuscatedName("ln.o")
    public static final class333 field3892 = new class333(1);

    @ObfuscatedName("ln.u")
    public static final class333 field3894 = new class333(2);

    @ObfuscatedName("ln.p")
    public final int field3891;

    public class333(int arg0) {
        this.field3891 = arg0;
    }

    @ObfuscatedName("hn.f(IB)Lln;")
    public static class333 method3468(int arg0) {
        class333[] var1 = new class333[] { field3893, field3894, field3892 };
        class333[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class333 var4 = var2[var3];
            if (var4.field3891 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
