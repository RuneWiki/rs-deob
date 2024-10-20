package deob;

@ObfuscatedName("kn")
public class class270 implements class291 {

    @ObfuscatedName("kn.ac")
    public int field2920;

    @ObfuscatedName("kn.al")
    public int field2921;

    @ObfuscatedName("kn.ak")
    public int field2923;

    @ObfuscatedName("kn.ax")
    public int field2928;

    @ObfuscatedName("kn.ao")
    public int field2930;

    @ObfuscatedName("kn.ah")
    public int field2925;

    @ObfuscatedName("kn.ar")
    public int field2926;

    @ObfuscatedName("kn.ab")
    public int field2927;

    @ObfuscatedName("kn.am")
    public int field2924;

    @ObfuscatedName("kn.av")
    public int field2929;

    @ObfuscatedName("kn.ac(Lkz;I)V")
    public void method4823(class271 arg0) {
        if (arg0.field2936 > this.field2926) {
            arg0.field2936 = this.field2926;
        }
        if (arg0.field2938 < this.field2924) {
            arg0.field2938 = this.field2924;
        }
        if (arg0.field2944 > this.field2927) {
            arg0.field2944 = this.field2927;
        }
        if (arg0.field2941 < this.field2929) {
            arg0.field2941 = this.field2929;
        }
    }

    @ObfuscatedName("kn.al(IIII)Z")
    public boolean method4848(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2920 && arg0 < this.field2921 + this.field2920) {
            return arg1 >> 6 >= this.field2923 && arg1 >> 6 <= this.field2930 && arg2 >> 6 >= this.field2928 && arg2 >> 6 <= this.field2925;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kn.ak(III)Z")
    public boolean method4825(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2926 && arg0 >> 6 <= this.field2924 && arg1 >> 6 >= this.field2927 && arg1 >> 6 <= this.field2929;
    }

    @ObfuscatedName("kn.ax(IIII)[I")
    public int[] method4843(int arg0, int arg1, int arg2) {
        return this.method4848(arg0, arg1, arg2) ? new int[] { this.field2926 * 64 - this.field2923 * 64 + arg1, this.field2927 * 64 - this.field2928 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kn.ao(III)Lmo;")
    public class337 method4827(int arg0, int arg1) {
        if (this.method4825(arg0, arg1)) {
            int var3 = this.field2923 * 64 - this.field2926 * 64 + arg0;
            int var4 = this.field2928 * 64 - this.field2927 * 64 + arg1;
            return new class337(this.field2920, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kn.ah(Lul;I)V")
    public void method4844(class530 arg0) {
        this.field2920 = arg0.method8365();
        this.field2921 = arg0.method8365();
        this.field2923 = arg0.method8598();
        this.field2928 = arg0.method8598();
        this.field2930 = arg0.method8598();
        this.field2925 = arg0.method8598();
        this.field2926 = arg0.method8598();
        this.field2927 = arg0.method8598();
        this.field2924 = arg0.method8598();
        this.field2929 = arg0.method8598();
        this.method4829();
    }

    @ObfuscatedName("kn.ar(S)V")
    public void method4829() {
    }
}
