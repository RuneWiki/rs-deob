package deob;

@ObfuscatedName("bu")
public class class53 {

    @ObfuscatedName("bu.q")
    public int field1108 = 2;

    @ObfuscatedName("bu.s")
    public int[] field1104 = new int[2];

    @ObfuscatedName("bu.h")
    public int[] field1105 = new int[2];

    @ObfuscatedName("bu.e")
    public int field1106;

    @ObfuscatedName("bu.n")
    public int field1113;

    @ObfuscatedName("bu.t")
    public int field1107;

    @ObfuscatedName("bu.l")
    public int field1109;

    @ObfuscatedName("bu.m")
    public int field1110;

    @ObfuscatedName("bu.o")
    public int field1111;

    @ObfuscatedName("bu.k")
    public int field1103;

    @ObfuscatedName("bu.p")
    public int field1112;

    public class53() {
        this.field1104[0] = 0;
        this.field1104[1] = 65535;
        this.field1105[0] = 0;
        this.field1105[1] = 65535;
    }

    @ObfuscatedName("bu.q(Ldx;)V")
    public final void method1031(class111 arg0) {
        this.field1107 = arg0.method2231();
        this.field1106 = arg0.method2153();
        this.field1113 = arg0.method2153();
        this.method1032(arg0);
    }

    @ObfuscatedName("bu.s(Ldx;)V")
    public final void method1032(class111 arg0) {
        this.field1108 = arg0.method2231();
        this.field1104 = new int[this.field1108];
        this.field1105 = new int[this.field1108];
        for (int var2 = 0; var2 < this.field1108; var2++) {
            this.field1104[var2] = arg0.method2307();
            this.field1105[var2] = arg0.method2307();
        }
    }

    @ObfuscatedName("bu.h()V")
    public final void method1033() {
        this.field1109 = 0;
        this.field1110 = 0;
        this.field1111 = 0;
        this.field1103 = 0;
        this.field1112 = 0;
    }

    @ObfuscatedName("bu.e(I)I")
    public final int method1039(int arg0) {
        if (this.field1112 >= this.field1109) {
            this.field1103 = this.field1105[this.field1110++] << 15;
            if (this.field1110 >= this.field1108) {
                this.field1110 = this.field1108 - 1;
            }
            this.field1109 = (int) ((double) this.field1104[this.field1110] / 65536.0D * (double) arg0);
            if (this.field1109 > this.field1112) {
                this.field1111 = ((this.field1105[this.field1110] << 15) - this.field1103) / (this.field1109 - this.field1112);
            }
        }
        this.field1103 += this.field1111;
        this.field1112++;
        return this.field1103 - this.field1111 >> 15;
    }
}
