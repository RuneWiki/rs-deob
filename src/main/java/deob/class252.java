package deob;

@ObfuscatedName("jz")
public class class252 implements class265 {

    @ObfuscatedName("jz.aj")
    public int field2919;

    @ObfuscatedName("jz.al")
    public int field2923;

    @ObfuscatedName("jz.ac")
    public int field2916;

    @ObfuscatedName("jz.ab")
    public int field2927;

    @ObfuscatedName("jz.an")
    public int field2918;

    @ObfuscatedName("jz.ao")
    public int field2928;

    @ObfuscatedName("jz.av")
    public int field2920;

    @ObfuscatedName("jz.aq")
    public int field2921;

    @ObfuscatedName("jz.ap")
    public int field2922;

    @ObfuscatedName("jz.ar")
    public int field2917;

    @ObfuscatedName("jz.ak")
    public int field2924;

    @ObfuscatedName("jz.ax")
    public int field2925;

    @ObfuscatedName("jz.as")
    public int field2926;

    @ObfuscatedName("jz.ay")
    public int field2915;

    @ObfuscatedName("jz.aj(Ljw;B)V")
    public void method4444(class245 arg0) {
        if (arg0.field2846 > this.field2918) {
            arg0.field2846 = this.field2918;
        }
        if (arg0.field2847 < this.field2918) {
            arg0.field2847 = this.field2918;
        }
        if (arg0.field2848 > this.field2928) {
            arg0.field2848 = this.field2928;
        }
        if (arg0.field2843 < this.field2928) {
            arg0.field2843 = this.field2928;
        }
    }

    @ObfuscatedName("jz.al(IIII)Z")
    public boolean method4445(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2919 && arg0 < this.field2923 + this.field2919) {
            return arg1 >= (this.field2920 << 3) + (this.field2916 << 6) && arg1 <= (this.field2922 << 3) + (this.field2916 << 6) + 7 && arg2 >= (this.field2927 << 6) + (this.field2921 << 3) && arg2 <= (this.field2927 << 6) + (this.field2917 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jz.ac(III)Z")
    public boolean method4468(int arg0, int arg1) {
        return arg0 >= (this.field2924 << 3) + (this.field2918 << 6) && arg0 <= (this.field2926 << 3) + (this.field2918 << 6) + 7 && arg1 >= (this.field2928 << 6) + (this.field2925 << 3) && arg1 <= (this.field2928 << 6) + (this.field2915 << 3) + 7;
    }

    @ObfuscatedName("jz.ab(IIII)[I")
    public int[] method4454(int arg0, int arg1, int arg2) {
        return this.method4445(arg0, arg1, arg2) ? new int[] { this.field2924 * 8 - this.field2920 * 8 + this.field2918 * 64 - this.field2916 * 64 + arg1, this.field2925 * 8 - this.field2921 * 8 + this.field2928 * 64 - this.field2927 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jz.an(III)Llt;")
    public class304 method4443(int arg0, int arg1) {
        if (this.method4468(arg0, arg1)) {
            int var3 = this.field2920 * 8 - this.field2924 * 8 + this.field2916 * 64 - this.field2918 * 64 + arg0;
            int var4 = this.field2921 * 8 - this.field2925 * 8 + this.field2927 * 64 - this.field2928 * 64 + arg1;
            return new class304(this.field2919, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jz.ao(Lsy;I)V")
    public void method4448(class478 arg0) {
        this.field2919 = arg0.method7909();
        this.field2923 = arg0.method7909();
        this.field2916 = arg0.method7905();
        this.field2920 = arg0.method7909();
        this.field2922 = arg0.method7909();
        this.field2927 = arg0.method7905();
        this.field2921 = arg0.method7909();
        this.field2917 = arg0.method7909();
        this.field2918 = arg0.method7905();
        this.field2924 = arg0.method7909();
        this.field2926 = arg0.method7909();
        this.field2928 = arg0.method7905();
        this.field2925 = arg0.method7909();
        this.field2915 = arg0.method7909();
        this.method4745();
    }

    @ObfuscatedName("jz.av(B)V")
    public void method4745() {
    }
}
