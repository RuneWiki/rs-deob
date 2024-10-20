package deob;

@ObfuscatedName("kw")
public class class279 extends class299 {

    @ObfuscatedName("kw.ak")
    public final int field3053;

    @ObfuscatedName("kw.al")
    public final class282 field3056;

    @ObfuscatedName("kw.aj")
    public int field3054;

    @ObfuscatedName("kw.az")
    public class294 field3055;

    @ObfuscatedName("kw.af")
    public int field3052;

    @ObfuscatedName("kw.aa")
    public int field3057;

    public class279(class347 arg0, class347 arg1, int arg2, class282 arg3) {
        super(arg0, arg1);
        this.field3053 = arg2;
        this.field3056 = arg3;
        this.method5071();
    }

    @ObfuscatedName("kw.ak(S)V")
    public void method5071() {
        this.field3054 = class224.method3868(this.field3053).method3882().field2311;
        this.field3055 = this.field3056.method5223(class199.method3551(this.field3054));
        class199 var1 = class199.method3551(this.method5061());
        class560 var2 = var1.method3527(false);
        if (var2 == null) {
            this.field3052 = 0;
            this.field3057 = 0;
        } else {
            this.field3052 = var2.field5441;
            this.field3057 = var2.field5442;
        }
    }

    @ObfuscatedName("kw.al(I)I")
    public int method5061() {
        return this.field3054;
    }

    @ObfuscatedName("kw.aj(B)Llh;")
    public class294 method5077() {
        return this.field3055;
    }

    @ObfuscatedName("kw.az(I)I")
    public int method5065() {
        return this.field3052;
    }

    @ObfuscatedName("kw.af(I)I")
    public int method5064() {
        return this.field3057;
    }
}
