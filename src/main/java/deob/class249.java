package deob;

@ObfuscatedName("jq")
public class class249 implements class265 {

    @ObfuscatedName("jq.aj")
    public int field2902;

    @ObfuscatedName("jq.al")
    public int field2892;

    @ObfuscatedName("jq.ac")
    public int field2893;

    @ObfuscatedName("jq.ab")
    public int field2894;

    @ObfuscatedName("jq.an")
    public int field2891;

    @ObfuscatedName("jq.ao")
    public int field2896;

    @ObfuscatedName("jq.av")
    public int field2897;

    @ObfuscatedName("jq.aq")
    public int field2898;

    @ObfuscatedName("jq.ap")
    public int field2899;

    @ObfuscatedName("jq.ar")
    public int field2895;

    @ObfuscatedName("jq.aj(Ljw;B)V")
    public void method4444(class245 arg0) {
        if (arg0.field2846 > this.field2891) {
            arg0.field2846 = this.field2891;
        }
        if (arg0.field2847 < this.field2891) {
            arg0.field2847 = this.field2891;
        }
        if (arg0.field2848 > this.field2896) {
            arg0.field2848 = this.field2896;
        }
        if (arg0.field2843 < this.field2896) {
            arg0.field2843 = this.field2896;
        }
    }

    @ObfuscatedName("jq.al(IIII)Z")
    public boolean method4445(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2902 && arg0 < this.field2902 + this.field2892) {
            return arg1 >= (this.field2897 << 3) + (this.field2893 << 6) && arg1 <= (this.field2897 << 3) + (this.field2893 << 6) + 7 && arg2 >= (this.field2898 << 3) + (this.field2894 << 6) && arg2 <= (this.field2898 << 3) + (this.field2894 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jq.ac(III)Z")
    public boolean method4468(int arg0, int arg1) {
        return arg0 >= (this.field2899 << 3) + (this.field2891 << 6) && arg0 <= (this.field2899 << 3) + (this.field2891 << 6) + 7 && arg1 >= (this.field2896 << 6) + (this.field2895 << 3) && arg1 <= (this.field2896 << 6) + (this.field2895 << 3) + 7;
    }

    @ObfuscatedName("jq.ab(IIII)[I")
    public int[] method4454(int arg0, int arg1, int arg2) {
        return this.method4445(arg0, arg1, arg2) ? new int[] { this.field2899 * 8 - this.field2897 * 8 + this.field2891 * 64 - this.field2893 * 64 + arg1, this.field2895 * 8 - this.field2898 * 8 + this.field2896 * 64 - this.field2894 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jq.an(III)Llt;")
    public class304 method4443(int arg0, int arg1) {
        if (this.method4468(arg0, arg1)) {
            int var3 = this.field2897 * 8 - this.field2899 * 8 + this.field2893 * 64 - this.field2891 * 64 + arg0;
            int var4 = this.field2898 * 8 - this.field2895 * 8 + this.field2894 * 64 - this.field2896 * 64 + arg1;
            return new class304(this.field2902, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jq.ao(Lsy;I)V")
    public void method4448(class478 arg0) {
        this.field2902 = arg0.method7909();
        this.field2892 = arg0.method7909();
        this.field2893 = arg0.method7905();
        this.field2897 = arg0.method7909();
        this.field2894 = arg0.method7905();
        this.field2898 = arg0.method7909();
        this.field2891 = arg0.method7905();
        this.field2899 = arg0.method7909();
        this.field2896 = arg0.method7905();
        this.field2895 = arg0.method7909();
        this.method4731();
    }

    @ObfuscatedName("jq.av(B)V")
    public void method4731() {
    }
}
