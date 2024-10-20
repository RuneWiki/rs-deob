package deob;

@ObfuscatedName("jj")
public class class285 {

    @ObfuscatedName("jj.s")
    public final int field3648;

    @ObfuscatedName("jj.t")
    public final long field3646;

    @ObfuscatedName("jj.v")
    public final class286 field3647;

    @ObfuscatedName("jj.j")
    public String field3651;

    @ObfuscatedName("jj.l")
    public String field3649;

    public class285(class385 arg0, byte arg1, int arg2) {
        this.field3651 = arg0.method5967();
        this.field3649 = arg0.method5967();
        this.field3648 = arg0.method6053();
        this.field3646 = arg0.method5964();
        int var4 = arg0.method6182();
        int var5 = arg0.method6182();
        this.field3647 = new class286();
        this.field3647.method4610(2);
        this.field3647.method4611(arg1);
        this.field3647.field3656 = var4;
        this.field3647.field3653 = var5;
        this.field3647.field3657 = 0;
        this.field3647.field3659 = 0;
        this.field3647.field3654 = arg2;
    }

    @ObfuscatedName("jj.s(B)Ljava/lang/String;")
    public String method4596() {
        return this.field3651;
    }

    @ObfuscatedName("jj.t(I)Ljava/lang/String;")
    public String method4597() {
        return this.field3649;
    }
}
