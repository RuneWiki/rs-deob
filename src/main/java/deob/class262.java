package deob;

@ObfuscatedName("kx")
public class class262 implements class265 {

    @ObfuscatedName("kx.aj")
    public int field3001;

    @ObfuscatedName("kx.al")
    public int field2999;

    @ObfuscatedName("kx.ac")
    public int field3000;

    @ObfuscatedName("kx.ab")
    public int field2998;

    @ObfuscatedName("kx.an")
    public int field3002;

    @ObfuscatedName("kx.ao")
    public int field3003;

    @ObfuscatedName("kx.aj(Ljw;B)V")
    public void method4444(class245 arg0) {
        if (arg0.field2846 > this.field3002) {
            arg0.field2846 = this.field3002;
        }
        if (arg0.field2847 < this.field3002) {
            arg0.field2847 = this.field3002;
        }
        if (arg0.field2848 > this.field3003) {
            arg0.field2848 = this.field3003;
        }
        if (arg0.field2843 < this.field3003) {
            arg0.field2843 = this.field3003;
        }
    }

    @ObfuscatedName("kx.al(IIII)Z")
    public boolean method4445(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3001 && arg0 < this.field3001 + this.field2999) {
            return arg1 >> 6 == this.field3000 && arg2 >> 6 == this.field2998;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kx.ac(III)Z")
    public boolean method4468(int arg0, int arg1) {
        return arg0 >> 6 == this.field3002 && arg1 >> 6 == this.field3003;
    }

    @ObfuscatedName("kx.ab(IIII)[I")
    public int[] method4454(int arg0, int arg1, int arg2) {
        return this.method4445(arg0, arg1, arg2) ? new int[] { this.field3002 * 64 - this.field3000 * 64 + arg1, this.field3003 * 64 - this.field2998 * 64 + arg2 } : null;
    }

    @ObfuscatedName("kx.an(III)Llt;")
    public class304 method4443(int arg0, int arg1) {
        if (this.method4468(arg0, arg1)) {
            int var3 = this.field3000 * 64 - this.field3002 * 64 + arg0;
            int var4 = this.field2998 * 64 - this.field3003 * 64 + arg1;
            return new class304(this.field3001, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("kx.ao(Lsy;I)V")
    public void method4448(class478 arg0) {
        this.field3001 = arg0.method7909();
        this.field2999 = arg0.method7909();
        this.field3000 = arg0.method7905();
        this.field2998 = arg0.method7905();
        this.field3002 = arg0.method7905();
        this.field3003 = arg0.method7905();
        this.method4801();
    }

    @ObfuscatedName("kx.av(S)V")
    public void method4801() {
    }
}
