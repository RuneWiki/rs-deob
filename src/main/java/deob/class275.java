package deob;

@ObfuscatedName("ks")
public class class275 implements class291 {

    @ObfuscatedName("ks.ac")
    public int field2987;

    @ObfuscatedName("ks.al")
    public int field2991;

    @ObfuscatedName("ks.ak")
    public int field2983;

    @ObfuscatedName("ks.ax")
    public int field2984;

    @ObfuscatedName("ks.ao")
    public int field2982;

    @ObfuscatedName("ks.ah")
    public int field2986;

    @ObfuscatedName("ks.ar")
    public int field2985;

    @ObfuscatedName("ks.ab")
    public int field2981;

    @ObfuscatedName("ks.am")
    public int field2989;

    @ObfuscatedName("ks.av")
    public int field2988;

    @ObfuscatedName("ks.ac(Lkz;I)V")
    public void method4823(class271 arg0) {
        if (arg0.field2936 > this.field2982) {
            arg0.field2936 = this.field2982;
        }
        if (arg0.field2938 < this.field2982) {
            arg0.field2938 = this.field2982;
        }
        if (arg0.field2944 > this.field2986) {
            arg0.field2944 = this.field2986;
        }
        if (arg0.field2941 < this.field2986) {
            arg0.field2941 = this.field2986;
        }
    }

    @ObfuscatedName("ks.al(IIII)Z")
    public boolean method4848(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2987 && arg0 < this.field2991 + this.field2987) {
            return arg1 >= (this.field2985 << 3) + (this.field2983 << 6) && arg1 <= (this.field2985 << 3) + (this.field2983 << 6) + 7 && arg2 >= (this.field2984 << 6) + (this.field2981 << 3) && arg2 <= (this.field2984 << 6) + (this.field2981 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ks.ak(III)Z")
    public boolean method4825(int arg0, int arg1) {
        return arg0 >= (this.field2989 << 3) + (this.field2982 << 6) && arg0 <= (this.field2989 << 3) + (this.field2982 << 6) + 7 && arg1 >= (this.field2988 << 3) + (this.field2986 << 6) && arg1 <= (this.field2988 << 3) + (this.field2986 << 6) + 7;
    }

    @ObfuscatedName("ks.ax(IIII)[I")
    public int[] method4843(int arg0, int arg1, int arg2) {
        return this.method4848(arg0, arg1, arg2) ? new int[] { this.field2989 * 8 - this.field2985 * 8 + this.field2982 * 64 - this.field2983 * 64 + arg1, this.field2988 * 8 - this.field2981 * 8 + this.field2986 * 64 - this.field2984 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ks.ao(III)Lmo;")
    public class337 method4827(int arg0, int arg1) {
        if (this.method4825(arg0, arg1)) {
            int var3 = this.field2985 * 8 - this.field2989 * 8 + this.field2983 * 64 - this.field2982 * 64 + arg0;
            int var4 = this.field2981 * 8 - this.field2988 * 8 + this.field2984 * 64 - this.field2986 * 64 + arg1;
            return new class337(this.field2987, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ks.ah(Lul;I)V")
    public void method4844(class530 arg0) {
        this.field2987 = arg0.method8365();
        this.field2991 = arg0.method8365();
        this.field2983 = arg0.method8598();
        this.field2985 = arg0.method8365();
        this.field2984 = arg0.method8598();
        this.field2981 = arg0.method8365();
        this.field2982 = arg0.method8598();
        this.field2989 = arg0.method8365();
        this.field2986 = arg0.method8598();
        this.field2988 = arg0.method8365();
        this.method5118();
    }

    @ObfuscatedName("ks.ar(B)V")
    public void method5118() {
    }
}
