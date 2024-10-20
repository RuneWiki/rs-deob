package deob;

@ObfuscatedName("ji")
public class class280 extends class219 {

    @ObfuscatedName("ji.i")
    public static class213 field3551 = new class213(64);

    @ObfuscatedName("ji.o")
    public class210 field3552;

    @ObfuscatedName("fj.c(Ljm;I)V")
    public static void method3013(class262 arg0) {
        Statics.field3550 = arg0;
    }

    @ObfuscatedName("ce.i(II)Lji;")
    public static class280 method1776(int arg0) {
        class280 var1 = (class280) field3551.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3550.method4190(34, arg0);
        class280 var3 = new class280();
        if (var2 != null) {
            var3.method4552(new class195(var2));
        }
        var3.method4551();
        field3551.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.o(B)V")
    public void method4551() {
    }

    @ObfuscatedName("ji.j(Lgp;I)V")
    public void method4552(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4553(arg0, var2);
        }
    }

    @ObfuscatedName("ji.k(Lgp;II)V")
    public void method4553(class195 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3552 = class277.method4160(arg0, this.field3552);
        }
    }

    @ObfuscatedName("ji.x(IIB)I")
    public int method4554(int arg0, int arg1) {
        return class277.method180(this.field3552, arg0, arg1);
    }

    @ObfuscatedName("ji.z(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4555(int arg0, String arg1) {
        return class277.method2942(this.field3552, arg0, arg1);
    }

    @ObfuscatedName("bd.p(I)V")
    public static void method1470() {
        field3551.method3629();
    }
}
