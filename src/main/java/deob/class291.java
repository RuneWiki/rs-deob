package deob;

@ObfuscatedName("lv")
public class class291 implements class304 {

    @ObfuscatedName("lv.ab")
    public int field3139;

    @ObfuscatedName("lv.ay")
    public int field3127;

    @ObfuscatedName("lv.an")
    public int field3128;

    @ObfuscatedName("lv.au")
    public int field3135;

    @ObfuscatedName("lv.ax")
    public int field3130;

    @ObfuscatedName("lv.ao")
    public int field3129;

    @ObfuscatedName("lv.am")
    public int field3132;

    @ObfuscatedName("lv.ac")
    public int field3133;

    @ObfuscatedName("lv.ae")
    public int field3134;

    @ObfuscatedName("lv.ad")
    public int field3126;

    @ObfuscatedName("lv.aq")
    public int field3136;

    @ObfuscatedName("lv.al")
    public int field3137;

    @ObfuscatedName("lv.aj")
    public int field3138;

    @ObfuscatedName("lv.as")
    public int field3131;

    @ObfuscatedName("lv.ab(Lku;I)V")
    public void method5116(class284 arg0) {
        if (arg0.field3063 > this.field3130) {
            arg0.field3063 = this.field3130;
        }
        if (arg0.field3065 < this.field3130) {
            arg0.field3065 = this.field3130;
        }
        if (arg0.field3066 > this.field3129) {
            arg0.field3066 = this.field3129;
        }
        if (arg0.field3067 < this.field3129) {
            arg0.field3067 = this.field3129;
        }
    }

    @ObfuscatedName("lv.ay(IIII)Z")
    public boolean method5117(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3139 && arg0 < this.field3139 + this.field3127) {
            return arg1 >= (this.field3132 << 3) + (this.field3128 << 6) && arg1 <= (this.field3134 << 3) + (this.field3128 << 6) + 7 && arg2 >= (this.field3135 << 6) + (this.field3133 << 3) && arg2 <= (this.field3135 << 6) + (this.field3126 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lv.an(IIB)Z")
    public boolean method5133(int arg0, int arg1) {
        return arg0 >= (this.field3136 << 3) + (this.field3130 << 6) && arg0 <= (this.field3138 << 3) + (this.field3130 << 6) + 7 && arg1 >= (this.field3137 << 3) + (this.field3129 << 6) && arg1 <= (this.field3131 << 3) + (this.field3129 << 6) + 7;
    }

    @ObfuscatedName("lv.au(IIIB)[I")
    public int[] method5120(int arg0, int arg1, int arg2) {
        return this.method5117(arg0, arg1, arg2) ? new int[] { this.field3136 * 8 - this.field3132 * 8 + this.field3130 * 64 - this.field3128 * 64 + arg1, this.field3137 * 8 - this.field3133 * 8 + this.field3129 * 64 - this.field3135 * 64 + arg2 } : null;
    }

    @ObfuscatedName("lv.ax(III)Lnv;")
    public class350 method5118(int arg0, int arg1) {
        if (this.method5133(arg0, arg1)) {
            int var3 = this.field3132 * 8 - this.field3136 * 8 + this.field3128 * 64 - this.field3130 * 64 + arg0;
            int var4 = this.field3133 * 8 - this.field3137 * 8 + this.field3135 * 64 - this.field3129 * 64 + arg1;
            return new class350(this.field3139, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("lv.ao(Lvg;I)V")
    public void method5121(class549 arg0) {
        this.field3139 = arg0.method9025();
        this.field3127 = arg0.method9025();
        this.field3128 = arg0.method8968();
        this.field3132 = arg0.method9025();
        this.field3134 = arg0.method9025();
        this.field3135 = arg0.method8968();
        this.field3133 = arg0.method9025();
        this.field3126 = arg0.method9025();
        this.field3130 = arg0.method8968();
        this.field3136 = arg0.method9025();
        this.field3138 = arg0.method9025();
        this.field3129 = arg0.method8968();
        this.field3137 = arg0.method9025();
        this.field3131 = arg0.method9025();
        this.method5415();
    }

    @ObfuscatedName("lv.am(B)V")
    public void method5415() {
    }
}
