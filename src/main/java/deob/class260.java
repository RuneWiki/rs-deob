package deob;

@ObfuscatedName("in")
public class class260 extends class202 {

    @ObfuscatedName("in.s")
    public static class197 field3443 = new class197(64);

    @ObfuscatedName("in.r")
    public class194 field3445;

    @ObfuscatedName("hf.b(IB)Lin;")
    public static class260 method3794(int arg0) {
        class260 var1 = (class260) field3443.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3446.method3887(34, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4156(new class181(var2));
        }
        var3.method4137();
        field3443.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.s(I)V")
    public void method4137() {
    }

    @ObfuscatedName("in.r(Lfs;I)V")
    public void method4156(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4138(arg0, var2);
        }
    }

    @ObfuscatedName("in.g(Lfs;II)V")
    public void method4138(class181 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3445 = class257.method194(arg0, this.field3445);
        }
    }

    @ObfuscatedName("in.x(III)I")
    public int method4139(int arg0, int arg1) {
        return class257.method4097(this.field3445, arg0, arg1);
    }

    @ObfuscatedName("in.f(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4145(int arg0, String arg1) {
        return class257.method1712(this.field3445, arg0, arg1);
    }

    @ObfuscatedName("jl.u(I)V")
    public static void method4631() {
        field3443.method3333();
    }
}
