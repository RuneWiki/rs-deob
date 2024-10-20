package deob;

@ObfuscatedName("ka")
public class class266 implements class269 {

    @ObfuscatedName("ka.af")
    public int field3045;

    @ObfuscatedName("ka.an")
    public int field3042;

    @ObfuscatedName("ka.aw")
    public int field3043;

    @ObfuscatedName("ka.ac")
    public int field3044;

    @ObfuscatedName("ka.au")
    public int field3046;

    @ObfuscatedName("ka.ab")
    public int field3047;

    @ObfuscatedName("ka.af(Ljs;I)V")
    public void method4667(class249 arg0) {
        if (arg0.field2895 > this.field3046) {
            arg0.field2895 = this.field3046;
        }
        if (arg0.field2889 < this.field3046) {
            arg0.field2889 = this.field3046;
        }
        if (arg0.field2897 > this.field3047) {
            arg0.field2897 = this.field3047;
        }
        if (arg0.field2898 < this.field3047) {
            arg0.field2898 = this.field3047;
        }
    }

    @ObfuscatedName("ka.an(IIIB)Z")
    public boolean method4668(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3045 && arg0 < this.field3045 + this.field3042) {
            return arg1 >> 6 == this.field3043 && arg2 >> 6 == this.field3044;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ka.aw(III)Z")
    public boolean method4673(int arg0, int arg1) {
        return arg0 >> 6 == this.field3046 && arg1 >> 6 == this.field3047;
    }

    @ObfuscatedName("ka.ac(IIIB)[I")
    public int[] method4688(int arg0, int arg1, int arg2) {
        return this.method4668(arg0, arg1, arg2) ? new int[] { this.field3046 * 64 - this.field3043 * 64 + arg1, this.field3047 * 64 - this.field3044 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ka.au(IIB)Llb;")
    public class308 method4671(int arg0, int arg1) {
        if (this.method4673(arg0, arg1)) {
            int var3 = this.field3043 * 64 - this.field3046 * 64 + arg0;
            int var4 = this.field3044 * 64 - this.field3047 * 64 + arg1;
            return new class308(this.field3045, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ka.ab(Lsg;B)V")
    public void method4689(class489 arg0) {
        this.field3045 = arg0.method8248();
        this.field3042 = arg0.method8248();
        this.field3043 = arg0.method8250();
        this.field3044 = arg0.method8250();
        this.field3046 = arg0.method8250();
        this.field3047 = arg0.method8250();
        this.method5003();
    }

    @ObfuscatedName("ka.aq(B)V")
    public void method5003() {
    }
}
