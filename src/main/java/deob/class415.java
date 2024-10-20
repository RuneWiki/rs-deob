package deob;

@ObfuscatedName("oi")
public class class415 implements class320 {

    @ObfuscatedName("oi.c")
    public static final class415 field4488 = new class415(0, 0, Integer.class, new class412());

    @ObfuscatedName("oi.l")
    public static final class415 field4490 = new class415(2, 1, Long.class, new class414());

    @ObfuscatedName("oi.s")
    public static final class415 field4496 = new class415(1, 2, String.class, new class416());

    @ObfuscatedName("oi.e")
    public final int field4491;

    @ObfuscatedName("oi.r")
    public final int field4492;

    @ObfuscatedName("oi.o")
    public final Class field4493;

    @ObfuscatedName("oi.i")
    public final class411 field4494;

    @ObfuscatedName("oi.e(B)[Loi;")
    public static class415[] method6570() {
        return new class415[] { field4490, field4488, field4496 };
    }

    public class415(int arg0, int arg1, Class arg2, class411 arg3) {
        this.field4491 = arg0;
        this.field4492 = arg1;
        this.field4493 = arg2;
        this.field4494 = arg3;
    }

    @ObfuscatedName("oi.r(Ljava/lang/Class;B)Loi;")
    public static class415 method6574(Class arg0) {
        class415[] var1 = new class415[] { field4490, field4488, field4496 };
        class415[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class415 var4 = var2[var3];
            if (var4.field4493 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("oi.o(Ljava/lang/Object;Lpi;I)V")
    public static void method6564(Object arg0, class421 arg1) {
        class411 var2 = Statics.method6565(arg0.getClass());
        var2.method6550(arg0, arg1);
    }

    @ObfuscatedName("oi.c(I)I")
    public int method38() {
        return this.field4492;
    }

    @ObfuscatedName("oi.w(Lpi;I)Ljava/lang/Object;")
    public Object method6566(class421 arg0) {
        return this.field4494.method6545(arg0);
    }
}
