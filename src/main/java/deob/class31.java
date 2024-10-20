package deob;

@ObfuscatedName("ap")
public class class31 implements class43 {

    @ObfuscatedName("ap.a")
    public int field428;

    @ObfuscatedName("ap.j")
    public int field421;

    @ObfuscatedName("ap.n")
    public int field422;

    @ObfuscatedName("ap.r")
    public int field423;

    @ObfuscatedName("ap.v")
    public int field432;

    @ObfuscatedName("ap.e")
    public int field425;

    @ObfuscatedName("ap.l")
    public int field420;

    @ObfuscatedName("ap.s")
    public int field427;

    @ObfuscatedName("ap.w")
    public int field424;

    @ObfuscatedName("ap.p")
    public int field426;

    @ObfuscatedName("ap.a(Lam;I)V")
    public void method170(class33 arg0) {
        if (arg0.field448 > this.field420) {
            arg0.field448 = this.field420;
        }
        if (arg0.field449 < this.field424) {
            arg0.field449 = this.field424;
        }
        if (arg0.field442 > this.field427) {
            arg0.field442 = this.field427;
        }
        if (arg0.field451 < this.field426) {
            arg0.field451 = this.field426;
        }
    }

    @ObfuscatedName("ap.j(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field428 && arg0 < this.field428 + this.field421) {
            return arg1 >> 6 >= this.field422 && arg1 >> 6 <= this.field432 && arg2 >> 6 >= this.field423 && arg2 >> 6 <= this.field425;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.n(III)Z")
    public boolean method197(int arg0, int arg1) {
        return arg0 >> 6 >= this.field420 && arg0 >> 6 <= this.field424 && arg1 >> 6 >= this.field427 && arg1 >> 6 <= this.field426;
    }

    @ObfuscatedName("ap.r(IIIB)[I")
    public int[] method173(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field420 * 64 - this.field422 * 64 + arg1, this.field427 * 64 - this.field423 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ap.v(III)Lhd;")
    public class213 method174(int arg0, int arg1) {
        if (this.method197(arg0, arg1)) {
            int var3 = this.field422 * 64 - this.field420 * 64 + arg0;
            int var4 = this.field423 * 64 - this.field427 * 64 + arg1;
            return new class213(this.field428, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.e(Lfe;I)V")
    public void method182(class174 arg0) {
        this.field428 = arg0.method2871();
        this.field421 = arg0.method2871();
        this.field422 = arg0.method2873();
        this.field423 = arg0.method2873();
        this.field432 = arg0.method2873();
        this.field425 = arg0.method2873();
        this.field420 = arg0.method2873();
        this.field427 = arg0.method2873();
        this.field424 = arg0.method2873();
        this.field426 = arg0.method2873();
        this.method232();
    }

    @ObfuscatedName("ap.l(I)V")
    public void method232() {
    }
}
