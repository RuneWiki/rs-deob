package deob;

@ObfuscatedName("kw")
public class class283 implements class304 {

    @ObfuscatedName("kw.ab")
    public int field3046;

    @ObfuscatedName("kw.ay")
    public int field3050;

    @ObfuscatedName("kw.an")
    public int field3048;

    @ObfuscatedName("kw.au")
    public int field3049;

    @ObfuscatedName("kw.ax")
    public int field3054;

    @ObfuscatedName("kw.ao")
    public int field3051;

    @ObfuscatedName("kw.am")
    public int field3052;

    @ObfuscatedName("kw.ac")
    public int field3053;

    @ObfuscatedName("kw.ae")
    public int field3047;

    @ObfuscatedName("kw.ad")
    public int field3055;

    @ObfuscatedName("kw.ab(Lku;I)V")
    public void method5116(class284 arg0) {
        if (arg0.field3063 > this.field3052) {
            arg0.field3063 = this.field3052;
        }
        if (arg0.field3065 < this.field3047) {
            arg0.field3065 = this.field3047;
        }
        if (arg0.field3066 > this.field3053) {
            arg0.field3066 = this.field3053;
        }
        if (arg0.field3067 < this.field3055) {
            arg0.field3067 = this.field3055;
        }
    }

    @ObfuscatedName("kw.ay(IIII)Z")
    public boolean method5117(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3046 && arg0 < this.field3050 + this.field3046) {
            return arg1 >> 6 >= this.field3048 && arg1 >> 6 <= this.field3054 && arg2 >> 6 >= this.field3049 && arg2 >> 6 <= this.field3051;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kw.an(IIB)Z")
    public boolean method5133(int arg0, int arg1) {
        return arg0 >> 6 >= this.field3052 && arg0 >> 6 <= this.field3047 && arg1 >> 6 >= this.field3053 && arg1 >> 6 <= this.field3055;
    }

    @ObfuscatedName("kw.au(IIIB)[I")
    public int[] method5120(int arg0, int arg1, int arg2) {
        return this.method5117(arg0, arg1, arg2) ? new int[] { this.field3052 * 64 - this.field3048 * 64 + arg1, this.field3053 * 64 - this.field3049 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kw.ax(III)Lnv;")
    public class350 method5118(int arg0, int arg1) {
        if (this.method5133(arg0, arg1)) {
            int var3 = this.field3048 * 64 - this.field3052 * 64 + arg0;
            int var4 = this.field3049 * 64 - this.field3053 * 64 + arg1;
            return new class350(this.field3046, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kw.ao(Lvg;I)V")
    public void method5121(class549 arg0) {
        this.field3046 = arg0.method9025();
        this.field3050 = arg0.method9025();
        this.field3048 = arg0.method8968();
        this.field3049 = arg0.method8968();
        this.field3054 = arg0.method8968();
        this.field3051 = arg0.method8968();
        this.field3052 = arg0.method8968();
        this.field3053 = arg0.method8968();
        this.field3047 = arg0.method8968();
        this.field3055 = arg0.method8968();
        this.method5122();
    }

    @ObfuscatedName("kw.am(B)V")
    public void method5122() {
    }
}
