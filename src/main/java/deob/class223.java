package deob;

@ObfuscatedName("hp")
public class class223 extends class243 {

    @ObfuscatedName("hp.c")
    public final int field2684;

    @ObfuscatedName("hp.v")
    public final class226 field2680;

    @ObfuscatedName("hp.q")
    public int field2681;

    @ObfuscatedName("hp.f")
    public class238 field2679;

    @ObfuscatedName("hp.j")
    public int field2682;

    @ObfuscatedName("hp.e")
    public int field2683;

    public class223(class289 arg0, class289 arg1, int arg2, class226 arg3) {
        super(arg0, arg1);
        this.field2684 = arg2;
        this.field2680 = arg3;
        this.method4229();
    }

    @ObfuscatedName("hp.c(I)V")
    public void method4229() {
        this.field2681 = class187.method3000(this.field2684).method3361().field2089;
        this.field2679 = this.field2680.method4374(class171.method6889(this.field2681));
        class171 var1 = class171.method6889(this.method4228());
        class456 var2 = var1.method3060(false);
        if (var2 == null) {
            this.field2682 = 0;
            this.field2683 = 0;
        } else {
            this.field2682 = var2.field4796;
            this.field2683 = var2.field4795;
        }
    }

    @ObfuscatedName("hp.v(I)I")
    public int method4228() {
        return this.field2681;
    }

    @ObfuscatedName("hp.q(I)Liz;")
    public class238 method4237() {
        return this.field2679;
    }

    @ObfuscatedName("hp.f(I)I")
    public int method4230() {
        return this.field2682;
    }

    @ObfuscatedName("hp.j(B)I")
    public int method4231() {
        return this.field2683;
    }
}
