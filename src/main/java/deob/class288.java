package deob;

@ObfuscatedName("ln")
public class class288 implements class304 {

    @ObfuscatedName("ln.ab")
    public int field3116;

    @ObfuscatedName("ln.ay")
    public int field3105;

    @ObfuscatedName("ln.an")
    public int field3110;

    @ObfuscatedName("ln.au")
    public int field3107;

    @ObfuscatedName("ln.ax")
    public int field3108;

    @ObfuscatedName("ln.ao")
    public int field3117;

    @ObfuscatedName("ln.am")
    public int field3112;

    @ObfuscatedName("ln.ac")
    public int field3109;

    @ObfuscatedName("ln.ae")
    public int field3111;

    @ObfuscatedName("ln.ad")
    public int field3113;

    @ObfuscatedName("ln.ab(Lku;I)V")
    public void method5116(class284 arg0) {
        if (arg0.field3063 > this.field3108) {
            arg0.field3063 = this.field3108;
        }
        if (arg0.field3065 < this.field3108) {
            arg0.field3065 = this.field3108;
        }
        if (arg0.field3066 > this.field3117) {
            arg0.field3066 = this.field3117;
        }
        if (arg0.field3067 < this.field3117) {
            arg0.field3067 = this.field3117;
        }
    }

    @ObfuscatedName("ln.ay(IIII)Z")
    public boolean method5117(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3116 && arg0 < this.field3116 + this.field3105) {
            return arg1 >= (this.field3112 << 3) + (this.field3110 << 6) && arg1 <= (this.field3112 << 3) + (this.field3110 << 6) + 7 && arg2 >= (this.field3109 << 3) + (this.field3107 << 6) && arg2 <= (this.field3109 << 3) + (this.field3107 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ln.an(IIB)Z")
    public boolean method5133(int arg0, int arg1) {
        return arg0 >= (this.field3111 << 3) + (this.field3108 << 6) && arg0 <= (this.field3111 << 3) + (this.field3108 << 6) + 7 && arg1 >= (this.field3117 << 6) + (this.field3113 << 3) && arg1 <= (this.field3117 << 6) + (this.field3113 << 3) + 7;
    }

    @ObfuscatedName("ln.au(IIIB)[I")
    public int[] method5120(int arg0, int arg1, int arg2) {
        return this.method5117(arg0, arg1, arg2) ? new int[] { this.field3111 * 8 - this.field3112 * 8 + this.field3108 * 64 - this.field3110 * 64 + arg1, this.field3113 * 8 - this.field3109 * 8 + this.field3117 * 64 - this.field3107 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ln.ax(III)Lnv;")
    public class350 method5118(int arg0, int arg1) {
        if (this.method5133(arg0, arg1)) {
            int var3 = this.field3112 * 8 - this.field3111 * 8 + this.field3110 * 64 - this.field3108 * 64 + arg0;
            int var4 = this.field3109 * 8 - this.field3113 * 8 + this.field3107 * 64 - this.field3117 * 64 + arg1;
            return new class350(this.field3116, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ln.ao(Lvg;I)V")
    public void method5121(class549 arg0) {
        this.field3116 = arg0.method9025();
        this.field3105 = arg0.method9025();
        this.field3110 = arg0.method8968();
        this.field3112 = arg0.method9025();
        this.field3107 = arg0.method8968();
        this.field3109 = arg0.method9025();
        this.field3108 = arg0.method8968();
        this.field3111 = arg0.method9025();
        this.field3117 = arg0.method8968();
        this.field3113 = arg0.method9025();
        this.method5408();
    }

    @ObfuscatedName("ln.am(I)V")
    public void method5408() {
    }
}
