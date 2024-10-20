package deob;

@ObfuscatedName("io")
public class class234 {

    @ObfuscatedName("io.at")
    public static final class234 field2440 = new class234(0, 0, 4);

    @ObfuscatedName("io.ah")
    public static final class234 field2436 = new class234(2, 1, 2);

    @ObfuscatedName("io.ar")
    public static final class234 field2435 = new class234(1, 2, 0);

    @ObfuscatedName("io.ao")
    public final int field2438;

    @ObfuscatedName("io.ab")
    public final int field2439;

    @ObfuscatedName("io.au")
    public final int field2437;

    public class234(int arg0, int arg1, int arg2) {
        this.field2438 = arg0;
        this.field2439 = arg1;
        this.field2437 = arg2;
    }

    @ObfuscatedName("io.at(FB)Z")
    public boolean method4109(float arg0) {
        return arg0 >= (float) this.field2437;
    }

    @ObfuscatedName("io.ah(IB)Lio;")
    public static class234 method4110(int arg0) {
        class234[] var1 = new class234[] { field2435, field2436, field2440 };
        class234[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class234 var4 = var2[var3];
            if (var4.field2439 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
