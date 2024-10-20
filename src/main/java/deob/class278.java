package deob;

@ObfuscatedName("kw")
public class class278 implements class291 {

    @ObfuscatedName("kw.ac")
    public int field3004;

    @ObfuscatedName("kw.al")
    public int field3002;

    @ObfuscatedName("kw.ak")
    public int field3003;

    @ObfuscatedName("kw.ax")
    public int field3013;

    @ObfuscatedName("kw.ao")
    public int field3005;

    @ObfuscatedName("kw.ah")
    public int field3006;

    @ObfuscatedName("kw.ar")
    public int field3007;

    @ObfuscatedName("kw.ab")
    public int field3011;

    @ObfuscatedName("kw.am")
    public int field3009;

    @ObfuscatedName("kw.av")
    public int field3001;

    @ObfuscatedName("kw.ag")
    public int field3010;

    @ObfuscatedName("kw.aa")
    public int field3012;

    @ObfuscatedName("kw.ap")
    public int field3008;

    @ObfuscatedName("kw.ay")
    public int field3014;

    @ObfuscatedName("kw.ac(Lkz;I)V")
    public void method4823(class271 arg0) {
        if (arg0.field2936 > this.field3005) {
            arg0.field2936 = this.field3005;
        }
        if (arg0.field2938 < this.field3005) {
            arg0.field2938 = this.field3005;
        }
        if (arg0.field2944 > this.field3006) {
            arg0.field2944 = this.field3006;
        }
        if (arg0.field2941 < this.field3006) {
            arg0.field2941 = this.field3006;
        }
    }

    @ObfuscatedName("kw.al(IIII)Z")
    public boolean method4848(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3004 && arg0 < this.field3004 + this.field3002) {
            return arg1 >= (this.field3007 << 3) + (this.field3003 << 6) && arg1 <= (this.field3009 << 3) + (this.field3003 << 6) + 7 && arg2 >= (this.field3013 << 6) + (this.field3011 << 3) && arg2 <= (this.field3013 << 6) + (this.field3001 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kw.ak(III)Z")
    public boolean method4825(int arg0, int arg1) {
        return arg0 >= (this.field3010 << 3) + (this.field3005 << 6) && arg0 <= (this.field3008 << 3) + (this.field3005 << 6) + 7 && arg1 >= (this.field3012 << 3) + (this.field3006 << 6) && arg1 <= (this.field3014 << 3) + (this.field3006 << 6) + 7;
    }

    @ObfuscatedName("kw.ax(IIII)[I")
    public int[] method4843(int arg0, int arg1, int arg2) {
        return this.method4848(arg0, arg1, arg2) ? new int[] { this.field3010 * 8 - this.field3007 * 8 + this.field3005 * 64 - this.field3003 * 64 + arg1, this.field3012 * 8 - this.field3011 * 8 + this.field3006 * 64 - this.field3013 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kw.ao(III)Lmo;")
    public class337 method4827(int arg0, int arg1) {
        if (this.method4825(arg0, arg1)) {
            int var3 = this.field3007 * 8 - this.field3010 * 8 + this.field3003 * 64 - this.field3005 * 64 + arg0;
            int var4 = this.field3011 * 8 - this.field3012 * 8 + this.field3013 * 64 - this.field3006 * 64 + arg1;
            return new class337(this.field3004, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kw.ah(Lul;I)V")
    public void method4844(class530 arg0) {
        this.field3004 = arg0.method8365();
        this.field3002 = arg0.method8365();
        this.field3003 = arg0.method8598();
        this.field3007 = arg0.method8365();
        this.field3009 = arg0.method8365();
        this.field3013 = arg0.method8598();
        this.field3011 = arg0.method8365();
        this.field3001 = arg0.method8365();
        this.field3005 = arg0.method8598();
        this.field3010 = arg0.method8365();
        this.field3008 = arg0.method8365();
        this.field3006 = arg0.method8598();
        this.field3012 = arg0.method8365();
        this.field3014 = arg0.method8365();
        this.method5126();
    }

    @ObfuscatedName("kw.ar(B)V")
    public void method5126() {
    }
}
