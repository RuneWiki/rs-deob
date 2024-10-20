package deob;

@ObfuscatedName("jy")
public class class253 implements class269 {

    @ObfuscatedName("jy.af")
    public int field2943;

    @ObfuscatedName("jy.an")
    public int field2946;

    @ObfuscatedName("jy.aw")
    public int field2938;

    @ObfuscatedName("jy.ac")
    public int field2940;

    @ObfuscatedName("jy.au")
    public int field2937;

    @ObfuscatedName("jy.ab")
    public int field2948;

    @ObfuscatedName("jy.aq")
    public int field2942;

    @ObfuscatedName("jy.al")
    public int field2944;

    @ObfuscatedName("jy.at")
    public int field2945;

    @ObfuscatedName("jy.aa")
    public int field2941;

    @ObfuscatedName("jy.af(Ljs;I)V")
    public void method4667(class249 arg0) {
        if (arg0.field2895 > this.field2937) {
            arg0.field2895 = this.field2937;
        }
        if (arg0.field2889 < this.field2937) {
            arg0.field2889 = this.field2937;
        }
        if (arg0.field2897 > this.field2948) {
            arg0.field2897 = this.field2948;
        }
        if (arg0.field2898 < this.field2948) {
            arg0.field2898 = this.field2948;
        }
    }

    @ObfuscatedName("jy.an(IIIB)Z")
    public boolean method4668(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2943 && arg0 < this.field2946 + this.field2943) {
            return arg1 >= (this.field2942 << 3) + (this.field2938 << 6) && arg1 <= (this.field2942 << 3) + (this.field2938 << 6) + 7 && arg2 >= (this.field2944 << 3) + (this.field2940 << 6) && arg2 <= (this.field2944 << 3) + (this.field2940 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jy.aw(III)Z")
    public boolean method4673(int arg0, int arg1) {
        return arg0 >= (this.field2945 << 3) + (this.field2937 << 6) && arg0 <= (this.field2945 << 3) + (this.field2937 << 6) + 7 && arg1 >= (this.field2948 << 6) + (this.field2941 << 3) && arg1 <= (this.field2948 << 6) + (this.field2941 << 3) + 7;
    }

    @ObfuscatedName("jy.ac(IIIB)[I")
    public int[] method4688(int arg0, int arg1, int arg2) {
        return this.method4668(arg0, arg1, arg2) ? new int[] { this.field2945 * 8 - this.field2942 * 8 + this.field2937 * 64 - this.field2938 * 64 + arg1, this.field2941 * 8 - this.field2944 * 8 + this.field2948 * 64 - this.field2940 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jy.au(IIB)Llb;")
    public class308 method4671(int arg0, int arg1) {
        if (this.method4673(arg0, arg1)) {
            int var3 = this.field2942 * 8 - this.field2945 * 8 + this.field2938 * 64 - this.field2937 * 64 + arg0;
            int var4 = this.field2944 * 8 - this.field2941 * 8 + this.field2940 * 64 - this.field2948 * 64 + arg1;
            return new class308(this.field2943, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jy.ab(Lsg;B)V")
    public void method4689(class489 arg0) {
        this.field2943 = arg0.method8248();
        this.field2946 = arg0.method8248();
        this.field2938 = arg0.method8250();
        this.field2942 = arg0.method8248();
        this.field2940 = arg0.method8250();
        this.field2944 = arg0.method8248();
        this.field2937 = arg0.method8250();
        this.field2945 = arg0.method8248();
        this.field2948 = arg0.method8250();
        this.field2941 = arg0.method8248();
        this.method4935();
    }

    @ObfuscatedName("jy.aq(I)V")
    public void method4935() {
    }
}
