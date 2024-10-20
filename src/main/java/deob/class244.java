package deob;

@ObfuscatedName("jf")
public class class244 implements class265 {

    @ObfuscatedName("jf.aj")
    public int field2829;

    @ObfuscatedName("jf.al")
    public int field2830;

    @ObfuscatedName("jf.ac")
    public int field2831;

    @ObfuscatedName("jf.ab")
    public int field2832;

    @ObfuscatedName("jf.an")
    public int field2835;

    @ObfuscatedName("jf.ao")
    public int field2834;

    @ObfuscatedName("jf.av")
    public int field2836;

    @ObfuscatedName("jf.aq")
    public int field2833;

    @ObfuscatedName("jf.ap")
    public int field2837;

    @ObfuscatedName("jf.ar")
    public int field2838;

    @ObfuscatedName("jf.aj(Ljw;B)V")
    public void method4444(class245 arg0) {
        if (arg0.field2846 > this.field2836) {
            arg0.field2846 = this.field2836;
        }
        if (arg0.field2847 < this.field2837) {
            arg0.field2847 = this.field2837;
        }
        if (arg0.field2848 > this.field2833) {
            arg0.field2848 = this.field2833;
        }
        if (arg0.field2843 < this.field2838) {
            arg0.field2843 = this.field2838;
        }
    }

    @ObfuscatedName("jf.al(IIII)Z")
    public boolean method4445(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2829 && arg0 < this.field2830 + this.field2829) {
            return arg1 >> 6 >= this.field2831 && arg1 >> 6 <= this.field2835 && arg2 >> 6 >= this.field2832 && arg2 >> 6 <= this.field2834;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jf.ac(III)Z")
    public boolean method4468(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2836 && arg0 >> 6 <= this.field2837 && arg1 >> 6 >= this.field2833 && arg1 >> 6 <= this.field2838;
    }

    @ObfuscatedName("jf.ab(IIII)[I")
    public int[] method4454(int arg0, int arg1, int arg2) {
        return this.method4445(arg0, arg1, arg2) ? new int[] { this.field2836 * 64 - this.field2831 * 64 + arg1, this.field2833 * 64 - this.field2832 * 64 + arg2 } : null;
    }

    @ObfuscatedName("jf.an(III)Llt;")
    public class304 method4443(int arg0, int arg1) {
        if (this.method4468(arg0, arg1)) {
            int var3 = this.field2831 * 64 - this.field2836 * 64 + arg0;
            int var4 = this.field2832 * 64 - this.field2833 * 64 + arg1;
            return new class304(this.field2829, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("jf.ao(Lsy;I)V")
    public void method4448(class478 arg0) {
        this.field2829 = arg0.method7909();
        this.field2830 = arg0.method7909();
        this.field2831 = arg0.method7905();
        this.field2832 = arg0.method7905();
        this.field2835 = arg0.method7905();
        this.field2834 = arg0.method7905();
        this.field2836 = arg0.method7905();
        this.field2833 = arg0.method7905();
        this.field2837 = arg0.method7905();
        this.field2838 = arg0.method7905();
        this.method4456();
    }

    @ObfuscatedName("jf.av(I)V")
    public void method4456() {
    }
}
