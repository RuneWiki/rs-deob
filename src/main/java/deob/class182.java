package deob;

@ObfuscatedName("ab")
public class class182 extends class77 {

    @ObfuscatedName("ab.o")
    public int field2750;

    @ObfuscatedName("ab.h")
    public int field2745;

    @ObfuscatedName("ab.t")
    public int field2744;

    @ObfuscatedName("ab.p")
    public static class67 field2741 = new class67(64);

    @ObfuscatedName("ab.o(Ldy;I)V")
    public void method3449(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3451(arg0, var2);
        }
    }

    @ObfuscatedName("ab.t(Ldy;IS)V")
    public void method3451(class31 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2750 = arg0.method373();
            this.field2744 = arg0.method512();
            this.field2745 = arg0.method512();
        }
    }

    @ObfuscatedName("l.p(II)Lab;")
    public static class182 method934(int arg0) {
        class182 var1 = (class182) field2741.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2747.method1083(14, arg0);
        class182 var3 = new class182();
        if (var2 != null) {
            var3.method3449(new class31(var2));
        }
        field2741.method907(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("u.j(Leg;I)V")
    public static void method1177(class81 arg0) {
        Statics.field2747 = arg0;
    }

    @ObfuscatedName("cz.h(I)V")
    public static void method2279() {
        field2741.method910();
    }
}
