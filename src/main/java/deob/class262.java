package deob;

@ObfuscatedName("jg")
public class class262 extends class215 {

    @ObfuscatedName("jg.o")
    public static class210 field3387 = new class210(64);

    @ObfuscatedName("jg.p")
    public int field3386 = 0;

    @ObfuscatedName("ac.b(Lie;B)V")
    public static void method567(class256 arg0) {
        Statics.field3388 = arg0;
        Statics.field2567 = Statics.field3388.method4172(16);
    }

    @ObfuscatedName("jg.o(Lgn;I)V")
    public void method4328(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4326(arg0, var2);
        }
    }

    @ObfuscatedName("jg.p(Lgn;II)V")
    public void method4326(class194 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3386 = arg0.method3249();
        }
    }

    @ObfuscatedName("ar.a(I)V")
    public static void method506() {
        field3387.method3661();
    }
}
