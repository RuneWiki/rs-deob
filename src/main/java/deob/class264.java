package deob;

@ObfuscatedName("jl")
public class class264 extends class214 {

    @ObfuscatedName("jl.s")
    public static class208 field3344 = new class208(64);

    @ObfuscatedName("jl.g")
    public boolean field3346 = false;

    @ObfuscatedName("jl.a(Lgx;B)V")
    public void method4636(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4643(arg0, var2);
        }
    }

    @ObfuscatedName("jl.s(Lgx;II)V")
    public void method4643(class190 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3346 = true;
        }
    }
}
