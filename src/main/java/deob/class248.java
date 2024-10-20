package deob;

@ObfuscatedName("jw")
public class class248 implements class269 {

    @ObfuscatedName("jw.af")
    public int field2880;

    @ObfuscatedName("jw.an")
    public int field2887;

    @ObfuscatedName("jw.aw")
    public int field2881;

    @ObfuscatedName("jw.ac")
    public int field2884;

    @ObfuscatedName("jw.au")
    public int field2882;

    @ObfuscatedName("jw.ab")
    public int field2883;

    @ObfuscatedName("jw.aq")
    public int field2879;

    @ObfuscatedName("jw.al")
    public int field2885;

    @ObfuscatedName("jw.at")
    public int field2886;

    @ObfuscatedName("jw.aa")
    public int field2888;

    @ObfuscatedName("jw.af(Ljs;I)V")
    public void method4667(class249 arg0) {
        if (arg0.field2895 > this.field2879) {
            arg0.field2895 = this.field2879;
        }
        if (arg0.field2889 < this.field2886) {
            arg0.field2889 = this.field2886;
        }
        if (arg0.field2897 > this.field2885) {
            arg0.field2897 = this.field2885;
        }
        if (arg0.field2898 < this.field2888) {
            arg0.field2898 = this.field2888;
        }
    }

    @ObfuscatedName("jw.an(IIIB)Z")
    public boolean method4668(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2880 && arg0 < this.field2887 + this.field2880) {
            return arg1 >> 6 >= this.field2881 && arg1 >> 6 <= this.field2882 && arg2 >> 6 >= this.field2884 && arg2 >> 6 <= this.field2883;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jw.aw(III)Z")
    public boolean method4673(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2879 && arg0 >> 6 <= this.field2886 && arg1 >> 6 >= this.field2885 && arg1 >> 6 <= this.field2888;
    }

    @ObfuscatedName("jw.ac(IIIB)[I")
    public int[] method4688(int arg0, int arg1, int arg2) {
        return this.method4668(arg0, arg1, arg2) ? new int[] { this.field2879 * 64 - this.field2881 * 64 + arg1, this.field2885 * 64 - this.field2884 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jw.au(IIB)Llb;")
    public class308 method4671(int arg0, int arg1) {
        if (this.method4673(arg0, arg1)) {
            int var3 = this.field2881 * 64 - this.field2879 * 64 + arg0;
            int var4 = this.field2884 * 64 - this.field2885 * 64 + arg1;
            return new class308(this.field2880, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jw.ab(Lsg;B)V")
    public void method4689(class489 arg0) {
        this.field2880 = arg0.method8248();
        this.field2887 = arg0.method8248();
        this.field2881 = arg0.method8250();
        this.field2884 = arg0.method8250();
        this.field2882 = arg0.method8250();
        this.field2883 = arg0.method8250();
        this.field2879 = arg0.method8250();
        this.field2885 = arg0.method8250();
        this.field2886 = arg0.method8250();
        this.field2888 = arg0.method8250();
        this.method4678();
    }

    @ObfuscatedName("jw.aq(I)V")
    public void method4678() {
    }
}
