package deob;

@ObfuscatedName("ly")
public class class288 implements class291 {

    @ObfuscatedName("ly.ac")
    public int field3082;

    @ObfuscatedName("ly.al")
    public int field3077;

    @ObfuscatedName("ly.ak")
    public int field3078;

    @ObfuscatedName("ly.ax")
    public int field3076;

    @ObfuscatedName("ly.ao")
    public int field3079;

    @ObfuscatedName("ly.ah")
    public int field3081;

    @ObfuscatedName("ly.ac(Lkz;I)V")
    public void method4823(class271 arg0) {
        if (arg0.field2936 > this.field3079) {
            arg0.field2936 = this.field3079;
        }
        if (arg0.field2938 < this.field3079) {
            arg0.field2938 = this.field3079;
        }
        if (arg0.field2944 > this.field3081) {
            arg0.field2944 = this.field3081;
        }
        if (arg0.field2941 < this.field3081) {
            arg0.field2941 = this.field3081;
        }
    }

    @ObfuscatedName("ly.al(IIII)Z")
    public boolean method4848(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3082 && arg0 < this.field3082 + this.field3077) {
            return arg1 >> 6 == this.field3078 && arg2 >> 6 == this.field3076;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ly.ak(III)Z")
    public boolean method4825(int arg0, int arg1) {
        return arg0 >> 6 == this.field3079 && arg1 >> 6 == this.field3081;
    }

    @ObfuscatedName("ly.ax(IIII)[I")
    public int[] method4843(int arg0, int arg1, int arg2) {
        return this.method4848(arg0, arg1, arg2) ? new int[] { this.field3079 * 64 - this.field3078 * 64 + arg1, this.field3081 * 64 - this.field3076 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ly.ao(III)Lmo;")
    public class337 method4827(int arg0, int arg1) {
        if (this.method4825(arg0, arg1)) {
            int var3 = this.field3078 * 64 - this.field3079 * 64 + arg0;
            int var4 = this.field3076 * 64 - this.field3081 * 64 + arg1;
            return new class337(this.field3082, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ly.ah(Lul;I)V")
    public void method4844(class530 arg0) {
        this.field3082 = arg0.method8365();
        this.field3077 = arg0.method8365();
        this.field3078 = arg0.method8598();
        this.field3076 = arg0.method8598();
        this.field3079 = arg0.method8598();
        this.field3081 = arg0.method8598();
        this.method5179();
    }

    @ObfuscatedName("ly.ar(I)V")
    public void method5179() {
    }
}
