package deob;

@ObfuscatedName("jl")
public class class268 extends class209 {

    @ObfuscatedName("jl.h")
    public static class203 field3389 = new class203(64);

    @ObfuscatedName("jl.e")
    public class200 field3392;

    @ObfuscatedName("jl.f(I)V")
    public void method4609() {
    }

    @ObfuscatedName("jl.h(Lgx;I)V")
    public void method4612(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4621(arg0, var2);
        }
    }

    @ObfuscatedName("jl.e(Lgx;II)V")
    public void method4621(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3392 = class265.method1460(arg0, this.field3392);
        }
    }

    @ObfuscatedName("jl.b(III)I")
    public int method4606(int arg0, int arg1) {
        return class265.method4252(this.field3392, arg0, arg1);
    }

    @ObfuscatedName("jl.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4604(int arg0, String arg1) {
        return Statics.method213(this.field3392, arg0, arg1);
    }

    @ObfuscatedName("eh.w(I)V")
    public static void method2989() {
        field3389.method3725();
    }
}
