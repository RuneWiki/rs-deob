package deob;

@ObfuscatedName("li")
public class class288 implements class301 {

    @ObfuscatedName("li.ak")
    public int field3151;

    @ObfuscatedName("li.al")
    public int field3150;

    @ObfuscatedName("li.aj")
    public int field3149;

    @ObfuscatedName("li.az")
    public int field3152;

    @ObfuscatedName("li.af")
    public int field3161;

    @ObfuscatedName("li.aa")
    public int field3154;

    @ObfuscatedName("li.at")
    public int field3155;

    @ObfuscatedName("li.ab")
    public int field3156;

    @ObfuscatedName("li.ac")
    public int field3157;

    @ObfuscatedName("li.ao")
    public int field3158;

    @ObfuscatedName("li.ah")
    public int field3159;

    @ObfuscatedName("li.av")
    public int field3160;

    @ObfuscatedName("li.aq")
    public int field3153;

    @ObfuscatedName("li.ap")
    public int field3162;

    @ObfuscatedName("li.ak(Lkz;I)V")
    public void method5109(class281 arg0) {
        if (arg0.field3077 > this.field3161) {
            arg0.field3077 = this.field3161;
        }
        if (arg0.field3078 < this.field3161) {
            arg0.field3078 = this.field3161;
        }
        if (arg0.field3076 > this.field3154) {
            arg0.field3076 = this.field3154;
        }
        if (arg0.field3071 < this.field3154) {
            arg0.field3071 = this.field3154;
        }
    }

    @ObfuscatedName("li.al(IIII)Z")
    public boolean method5097(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3151 && arg0 < this.field3151 + this.field3150) {
            return arg1 >= (this.field3155 << 3) + (this.field3149 << 6) && arg1 <= (this.field3157 << 3) + (this.field3149 << 6) + 7 && arg2 >= (this.field3156 << 3) + (this.field3152 << 6) && arg2 <= (this.field3158 << 3) + (this.field3152 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("li.aj(III)Z")
    public boolean method5082(int arg0, int arg1) {
        return arg0 >= (this.field3161 << 6) + (this.field3159 << 3) && arg0 <= (this.field3161 << 6) + (this.field3153 << 3) + 7 && arg1 >= (this.field3160 << 3) + (this.field3154 << 6) && arg1 <= (this.field3162 << 3) + (this.field3154 << 6) + 7;
    }

    @ObfuscatedName("li.az(IIII)[I")
    public int[] method5084(int arg0, int arg1, int arg2) {
        return this.method5097(arg0, arg1, arg2) ? new int[] { this.field3159 * 8 - this.field3155 * 8 + this.field3161 * 64 - this.field3149 * 64 + arg1, this.field3160 * 8 - this.field3156 * 8 + this.field3154 * 64 - this.field3152 * 64 + arg2 } : null;
    }

    @ObfuscatedName("li.af(III)Lnj;")
    public class347 method5087(int arg0, int arg1) {
        if (this.method5082(arg0, arg1)) {
            int var3 = this.field3155 * 8 - this.field3159 * 8 + this.field3149 * 64 - this.field3161 * 64 + arg0;
            int var4 = this.field3156 * 8 - this.field3160 * 8 + this.field3152 * 64 - this.field3154 * 64 + arg1;
            return new class347(this.field3151, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("li.aa(Lua;B)V")
    public void method5085(class546 arg0) {
        this.field3151 = arg0.method8796();
        this.field3150 = arg0.method8796();
        this.field3149 = arg0.method8798();
        this.field3155 = arg0.method8796();
        this.field3157 = arg0.method8796();
        this.field3152 = arg0.method8798();
        this.field3156 = arg0.method8796();
        this.field3158 = arg0.method8796();
        this.field3161 = arg0.method8798();
        this.field3159 = arg0.method8796();
        this.field3153 = arg0.method8796();
        this.field3154 = arg0.method8798();
        this.field3160 = arg0.method8796();
        this.field3162 = arg0.method8796();
        this.method5386();
    }

    @ObfuscatedName("li.at(I)V")
    public void method5386() {
    }
}
