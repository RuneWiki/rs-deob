package deob;

@ObfuscatedName("jl")
public class class265 extends class215 {

    @ObfuscatedName("jl.q")
    public static class210 field3418 = new class210(64);

    @ObfuscatedName("jl.o")
    public boolean field3417 = false;

    @ObfuscatedName("jl.q(Lgn;I)V")
    public void method4379(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4380(arg0, var2);
        }
    }

    @ObfuscatedName("jl.o(Lgn;II)V")
    public void method4380(class194 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3417 = true;
        }
    }
}
