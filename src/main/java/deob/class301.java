package deob;

@ObfuscatedName("lq")
public class class301 implements class304 {

    @ObfuscatedName("lq.ab")
    public int field3200;

    @ObfuscatedName("lq.ay")
    public int field3206;

    @ObfuscatedName("lq.an")
    public int field3201;

    @ObfuscatedName("lq.au")
    public int field3203;

    @ObfuscatedName("lq.ax")
    public int field3204;

    @ObfuscatedName("lq.ao")
    public int field3205;

    @ObfuscatedName("lq.ab(Lku;I)V")
    public void method5116(class284 arg0) {
        if (arg0.field3063 > this.field3204) {
            arg0.field3063 = this.field3204;
        }
        if (arg0.field3065 < this.field3204) {
            arg0.field3065 = this.field3204;
        }
        if (arg0.field3066 > this.field3205) {
            arg0.field3066 = this.field3205;
        }
        if (arg0.field3067 < this.field3205) {
            arg0.field3067 = this.field3205;
        }
    }

    @ObfuscatedName("lq.ay(IIII)Z")
    public boolean method5117(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3200 && arg0 < this.field3206 + this.field3200) {
            return arg1 >> 6 == this.field3201 && arg2 >> 6 == this.field3203;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lq.an(IIB)Z")
    public boolean method5133(int arg0, int arg1) {
        return arg0 >> 6 == this.field3204 && arg1 >> 6 == this.field3205;
    }

    @ObfuscatedName("lq.au(IIIB)[I")
    public int[] method5120(int arg0, int arg1, int arg2) {
        return this.method5117(arg0, arg1, arg2) ? new int[] { this.field3204 * 64 - this.field3201 * 64 + arg1, this.field3205 * 64 - this.field3203 * 64 + arg2 } : null;
    }

    @ObfuscatedName("lq.ax(III)Lnv;")
    public class350 method5118(int arg0, int arg1) {
        if (this.method5133(arg0, arg1)) {
            int var3 = this.field3201 * 64 - this.field3204 * 64 + arg0;
            int var4 = this.field3203 * 64 - this.field3205 * 64 + arg1;
            return new class350(this.field3200, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("lq.ao(Lvg;I)V")
    public void method5121(class549 arg0) {
        this.field3200 = arg0.method9025();
        this.field3206 = arg0.method9025();
        this.field3201 = arg0.method8968();
        this.field3203 = arg0.method8968();
        this.field3204 = arg0.method8968();
        this.field3205 = arg0.method8968();
        this.method5479();
    }

    @ObfuscatedName("lq.am(I)V")
    public void method5479() {
    }
}
