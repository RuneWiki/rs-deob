package deob;

@ObfuscatedName("lo")
public class class298 implements class301 {

    @ObfuscatedName("lo.ak")
    public int field3218;

    @ObfuscatedName("lo.al")
    public int field3219;

    @ObfuscatedName("lo.aj")
    public int field3222;

    @ObfuscatedName("lo.az")
    public int field3220;

    @ObfuscatedName("lo.af")
    public int field3221;

    @ObfuscatedName("lo.aa")
    public int field3223;

    @ObfuscatedName("lo.ak(Lkz;I)V")
    public void method5109(class281 arg0) {
        if (arg0.field3077 > this.field3221) {
            arg0.field3077 = this.field3221;
        }
        if (arg0.field3078 < this.field3221) {
            arg0.field3078 = this.field3221;
        }
        if (arg0.field3076 > this.field3223) {
            arg0.field3076 = this.field3223;
        }
        if (arg0.field3071 < this.field3223) {
            arg0.field3071 = this.field3223;
        }
    }

    @ObfuscatedName("lo.al(IIII)Z")
    public boolean method5097(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3218 && arg0 < this.field3219 + this.field3218) {
            return arg1 >> 6 == this.field3222 && arg2 >> 6 == this.field3220;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lo.aj(III)Z")
    public boolean method5082(int arg0, int arg1) {
        return arg0 >> 6 == this.field3221 && arg1 >> 6 == this.field3223;
    }

    @ObfuscatedName("lo.az(IIII)[I")
    public int[] method5084(int arg0, int arg1, int arg2) {
        return this.method5097(arg0, arg1, arg2) ? new int[] { this.field3221 * 64 - this.field3222 * 64 + arg1, this.field3223 * 64 - this.field3220 * 64 + arg2 } : null;
    }

    @ObfuscatedName("lo.af(III)Lnj;")
    public class347 method5087(int arg0, int arg1) {
        if (this.method5082(arg0, arg1)) {
            int var3 = this.field3222 * 64 - this.field3221 * 64 + arg0;
            int var4 = this.field3220 * 64 - this.field3223 * 64 + arg1;
            return new class347(this.field3218, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("lo.aa(Lua;B)V")
    public void method5085(class546 arg0) {
        this.field3218 = arg0.method8796();
        this.field3219 = arg0.method8796();
        this.field3222 = arg0.method8798();
        this.field3220 = arg0.method8798();
        this.field3221 = arg0.method8798();
        this.field3223 = arg0.method8798();
        this.method5441();
    }

    @ObfuscatedName("lo.at(I)V")
    public void method5441() {
    }
}
