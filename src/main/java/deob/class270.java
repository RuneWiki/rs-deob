package deob;

@ObfuscatedName("jl")
public final class class270 {

    @ObfuscatedName("jl.x")
    public class185 field3530 = new class185();

    public class270() {
        this.field3530.field2110 = this.field3530;
        this.field3530.field2108 = this.field3530;
    }

    @ObfuscatedName("jl.x(Lge;)V")
    public void method4478(class185 arg0) {
        if (arg0.field2108 != null) {
            arg0.method3351();
        }
        arg0.field2108 = this.field3530.field2108;
        arg0.field2110 = this.field3530;
        arg0.field2108.field2110 = arg0;
        arg0.field2110.field2108 = arg0;
    }

    @ObfuscatedName("jl.m(Lge;)V")
    public void method4479(class185 arg0) {
        if (arg0.field2108 != null) {
            arg0.method3351();
        }
        arg0.field2108 = this.field3530;
        arg0.field2110 = this.field3530.field2110;
        arg0.field2108.field2110 = arg0;
        arg0.field2110.field2108 = arg0;
    }

    @ObfuscatedName("jl.k()Lge;")
    public class185 method4482() {
        class185 var1 = this.field3530.field2110;
        return this.field3530 == var1 ? null : var1;
    }
}
