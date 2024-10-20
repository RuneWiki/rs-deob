package deob;

@ObfuscatedName("ky")
public class class280 implements class301 {

    @ObfuscatedName("ky.ak")
    public int field3065;

    @ObfuscatedName("ky.al")
    public int field3061;

    @ObfuscatedName("ky.aj")
    public int field3068;

    @ObfuscatedName("ky.az")
    public int field3058;

    @ObfuscatedName("ky.af")
    public int field3062;

    @ObfuscatedName("ky.aa")
    public int field3063;

    @ObfuscatedName("ky.at")
    public int field3059;

    @ObfuscatedName("ky.ab")
    public int field3064;

    @ObfuscatedName("ky.ac")
    public int field3066;

    @ObfuscatedName("ky.ao")
    public int field3067;

    @ObfuscatedName("ky.ak(Lkz;I)V")
    public void method5109(class281 arg0) {
        if (arg0.field3077 > this.field3059) {
            arg0.field3077 = this.field3059;
        }
        if (arg0.field3078 < this.field3066) {
            arg0.field3078 = this.field3066;
        }
        if (arg0.field3076 > this.field3064) {
            arg0.field3076 = this.field3064;
        }
        if (arg0.field3071 < this.field3067) {
            arg0.field3071 = this.field3067;
        }
    }

    @ObfuscatedName("ky.al(IIII)Z")
    public boolean method5097(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3065 && arg0 < this.field3065 + this.field3061) {
            return arg1 >> 6 >= this.field3068 && arg1 >> 6 <= this.field3062 && arg2 >> 6 >= this.field3058 && arg2 >> 6 <= this.field3063;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ky.aj(III)Z")
    public boolean method5082(int arg0, int arg1) {
        return arg0 >> 6 >= this.field3059 && arg0 >> 6 <= this.field3066 && arg1 >> 6 >= this.field3064 && arg1 >> 6 <= this.field3067;
    }

    @ObfuscatedName("ky.az(IIII)[I")
    public int[] method5084(int arg0, int arg1, int arg2) {
        return this.method5097(arg0, arg1, arg2) ? new int[] { this.field3059 * 64 - this.field3068 * 64 + arg1, this.field3064 * 64 - this.field3058 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ky.af(III)Lnj;")
    public class347 method5087(int arg0, int arg1) {
        if (this.method5082(arg0, arg1)) {
            int var3 = this.field3068 * 64 - this.field3059 * 64 + arg0;
            int var4 = this.field3058 * 64 - this.field3064 * 64 + arg1;
            return new class347(this.field3065, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ky.aa(Lua;B)V")
    public void method5085(class546 arg0) {
        this.field3065 = arg0.method8796();
        this.field3061 = arg0.method8796();
        this.field3068 = arg0.method8798();
        this.field3058 = arg0.method8798();
        this.field3062 = arg0.method8798();
        this.field3063 = arg0.method8798();
        this.field3059 = arg0.method8798();
        this.field3064 = arg0.method8798();
        this.field3066 = arg0.method8798();
        this.field3067 = arg0.method8798();
        this.method5086();
    }

    @ObfuscatedName("ky.at(B)V")
    public void method5086() {
    }
}
