package deob;

@ObfuscatedName("lc")
public class class287 extends class299 {

    @ObfuscatedName("lc.ak")
    public final int field3148;

    @ObfuscatedName("lc.al")
    public final class294 field3143;

    @ObfuscatedName("lc.aj")
    public final int field3144;

    @ObfuscatedName("lc.az")
    public final int field3142;

    public class287(class347 arg0, class347 arg1, int arg2, class294 arg3) {
        super(arg0, arg1);
        this.field3148 = arg2;
        this.field3143 = arg3;
        class199 var5 = class199.method3551(this.method5061());
        class560 var6 = var5.method3527(false);
        if (var6 == null) {
            this.field3144 = 0;
            this.field3142 = 0;
        } else {
            this.field3144 = var6.field5441;
            this.field3142 = var6.field5442;
        }
    }

    @ObfuscatedName("lc.al(I)I")
    public int method5061() {
        return this.field3148;
    }

    @ObfuscatedName("lc.aj(B)Llh;")
    public class294 method5077() {
        return this.field3143;
    }

    @ObfuscatedName("lc.az(I)I")
    public int method5065() {
        return this.field3144;
    }

    @ObfuscatedName("lc.af(I)I")
    public int method5064() {
        return this.field3142;
    }
}
