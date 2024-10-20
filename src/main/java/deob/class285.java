package deob;

@ObfuscatedName("kh")
public class class285 implements class301 {

    @ObfuscatedName("kh.ak")
    public int field3125;

    @ObfuscatedName("kh.al")
    public int field3130;

    @ObfuscatedName("kh.aj")
    public int field3127;

    @ObfuscatedName("kh.az")
    public int field3124;

    @ObfuscatedName("kh.af")
    public int field3128;

    @ObfuscatedName("kh.aa")
    public int field3129;

    @ObfuscatedName("kh.at")
    public int field3126;

    @ObfuscatedName("kh.ab")
    public int field3131;

    @ObfuscatedName("kh.ac")
    public int field3136;

    @ObfuscatedName("kh.ao")
    public int field3133;

    @ObfuscatedName("kh.ak(Lkz;I)V")
    public void method5109(class281 arg0) {
        if (arg0.field3077 > this.field3128) {
            arg0.field3077 = this.field3128;
        }
        if (arg0.field3078 < this.field3128) {
            arg0.field3078 = this.field3128;
        }
        if (arg0.field3076 > this.field3129) {
            arg0.field3076 = this.field3129;
        }
        if (arg0.field3071 < this.field3129) {
            arg0.field3071 = this.field3129;
        }
    }

    @ObfuscatedName("kh.al(IIII)Z")
    public boolean method5097(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3125 && arg0 < this.field3130 + this.field3125) {
            return arg1 >= (this.field3127 << 6) + (this.field3126 << 3) && arg1 <= (this.field3127 << 6) + (this.field3126 << 3) + 7 && arg2 >= (this.field3131 << 3) + (this.field3124 << 6) && arg2 <= (this.field3131 << 3) + (this.field3124 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kh.aj(III)Z")
    public boolean method5082(int arg0, int arg1) {
        return arg0 >= (this.field3136 << 3) + (this.field3128 << 6) && arg0 <= (this.field3136 << 3) + (this.field3128 << 6) + 7 && arg1 >= (this.field3133 << 3) + (this.field3129 << 6) && arg1 <= (this.field3133 << 3) + (this.field3129 << 6) + 7;
    }

    @ObfuscatedName("kh.az(IIII)[I")
    public int[] method5084(int arg0, int arg1, int arg2) {
        return this.method5097(arg0, arg1, arg2) ? new int[] { this.field3136 * 8 - this.field3126 * 8 + this.field3128 * 64 - this.field3127 * 64 + arg1, this.field3133 * 8 - this.field3131 * 8 + this.field3129 * 64 - this.field3124 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kh.af(III)Lnj;")
    public class347 method5087(int arg0, int arg1) {
        if (this.method5082(arg0, arg1)) {
            int var3 = this.field3126 * 8 - this.field3136 * 8 + this.field3127 * 64 - this.field3128 * 64 + arg0;
            int var4 = this.field3131 * 8 - this.field3133 * 8 + this.field3124 * 64 - this.field3129 * 64 + arg1;
            return new class347(this.field3125, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kh.aa(Lua;B)V")
    public void method5085(class546 arg0) {
        this.field3125 = arg0.method8796();
        this.field3130 = arg0.method8796();
        this.field3127 = arg0.method8798();
        this.field3126 = arg0.method8796();
        this.field3124 = arg0.method8798();
        this.field3131 = arg0.method8796();
        this.field3128 = arg0.method8798();
        this.field3136 = arg0.method8796();
        this.field3129 = arg0.method8798();
        this.field3133 = arg0.method8796();
        this.method5376();
    }

    @ObfuscatedName("kh.at(I)V")
    public void method5376() {
    }
}
