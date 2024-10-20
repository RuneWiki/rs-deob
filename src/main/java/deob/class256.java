package deob;

@ObfuscatedName("ja")
public class class256 implements class269 {

    @ObfuscatedName("ja.af")
    public int field2965;

    @ObfuscatedName("ja.an")
    public int field2960;

    @ObfuscatedName("ja.aw")
    public int field2961;

    @ObfuscatedName("ja.ac")
    public int field2962;

    @ObfuscatedName("ja.au")
    public int field2970;

    @ObfuscatedName("ja.ab")
    public int field2959;

    @ObfuscatedName("ja.aq")
    public int field2971;

    @ObfuscatedName("ja.al")
    public int field2966;

    @ObfuscatedName("ja.at")
    public int field2967;

    @ObfuscatedName("ja.aa")
    public int field2968;

    @ObfuscatedName("ja.ay")
    public int field2969;

    @ObfuscatedName("ja.ao")
    public int field2964;

    @ObfuscatedName("ja.ax")
    public int field2963;

    @ObfuscatedName("ja.ai")
    public int field2972;

    @ObfuscatedName("ja.af(Ljs;I)V")
    public void method4667(class249 arg0) {
        if (arg0.field2895 > this.field2970) {
            arg0.field2895 = this.field2970;
        }
        if (arg0.field2889 < this.field2970) {
            arg0.field2889 = this.field2970;
        }
        if (arg0.field2897 > this.field2959) {
            arg0.field2897 = this.field2959;
        }
        if (arg0.field2898 < this.field2959) {
            arg0.field2898 = this.field2959;
        }
    }

    @ObfuscatedName("ja.an(IIIB)Z")
    public boolean method4668(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2965 && arg0 < this.field2965 + this.field2960) {
            return arg1 >= (this.field2971 << 3) + (this.field2961 << 6) && arg1 <= (this.field2967 << 3) + (this.field2961 << 6) + 7 && arg2 >= (this.field2966 << 3) + (this.field2962 << 6) && arg2 <= (this.field2968 << 3) + (this.field2962 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ja.aw(III)Z")
    public boolean method4673(int arg0, int arg1) {
        return arg0 >= (this.field2970 << 6) + (this.field2969 << 3) && arg0 <= (this.field2970 << 6) + (this.field2963 << 3) + 7 && arg1 >= (this.field2964 << 3) + (this.field2959 << 6) && arg1 <= (this.field2972 << 3) + (this.field2959 << 6) + 7;
    }

    @ObfuscatedName("ja.ac(IIIB)[I")
    public int[] method4688(int arg0, int arg1, int arg2) {
        return this.method4668(arg0, arg1, arg2) ? new int[] { this.field2969 * 8 - this.field2971 * 8 + this.field2970 * 64 - this.field2961 * 64 + arg1, this.field2964 * 8 - this.field2966 * 8 + this.field2959 * 64 - this.field2962 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ja.au(IIB)Llb;")
    public class308 method4671(int arg0, int arg1) {
        if (this.method4673(arg0, arg1)) {
            int var3 = this.field2971 * 8 - this.field2969 * 8 + this.field2961 * 64 - this.field2970 * 64 + arg0;
            int var4 = this.field2966 * 8 - this.field2964 * 8 + this.field2962 * 64 - this.field2959 * 64 + arg1;
            return new class308(this.field2965, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ja.ab(Lsg;B)V")
    public void method4689(class489 arg0) {
        this.field2965 = arg0.method8248();
        this.field2960 = arg0.method8248();
        this.field2961 = arg0.method8250();
        this.field2971 = arg0.method8248();
        this.field2967 = arg0.method8248();
        this.field2962 = arg0.method8250();
        this.field2966 = arg0.method8248();
        this.field2968 = arg0.method8248();
        this.field2970 = arg0.method8250();
        this.field2969 = arg0.method8248();
        this.field2963 = arg0.method8248();
        this.field2959 = arg0.method8250();
        this.field2964 = arg0.method8248();
        this.field2972 = arg0.method8248();
        this.method4946();
    }

    @ObfuscatedName("ja.aq(I)V")
    public void method4946() {
    }
}
