package deob;

@ObfuscatedName("ay")
public class class51 {

    @ObfuscatedName("ay.t")
    public int field1097 = 2;

    @ObfuscatedName("ay.o")
    public int[] field1106 = new int[2];

    @ObfuscatedName("ay.i")
    public int[] field1099 = new int[2];

    @ObfuscatedName("ay.p")
    public int field1101;

    @ObfuscatedName("ay.c")
    public int field1102;

    @ObfuscatedName("ay.y")
    public int field1107;

    @ObfuscatedName("ay.g")
    public int field1098;

    @ObfuscatedName("ay.l")
    public int field1103;

    @ObfuscatedName("ay.h")
    public int field1104;

    @ObfuscatedName("ay.n")
    public int field1105;

    @ObfuscatedName("ay.w")
    public int field1100;

    public class51() {
        this.field1106[0] = 0;
        this.field1106[1] = 65535;
        this.field1099[0] = 0;
        this.field1099[1] = 65535;
    }

    @ObfuscatedName("ay.t(Ldg;)V")
    public final void method1000(class107 arg0) {
        this.field1098 = arg0.method2118();
        this.field1101 = arg0.method2152();
        this.field1102 = arg0.method2152();
        this.method1001(arg0);
    }

    @ObfuscatedName("ay.o(Ldg;)V")
    public final void method1001(class107 arg0) {
        this.field1097 = arg0.method2118();
        this.field1106 = new int[this.field1097];
        this.field1099 = new int[this.field1097];
        for (int var2 = 0; var2 < this.field1097; var2++) {
            this.field1106[var2] = arg0.method2120();
            this.field1099[var2] = arg0.method2120();
        }
    }

    @ObfuscatedName("ay.i()V")
    public final void method1002() {
        this.field1103 = 0;
        this.field1104 = 0;
        this.field1105 = 0;
        this.field1100 = 0;
        this.field1107 = 0;
    }

    @ObfuscatedName("ay.p(I)I")
    public final int method1003(int arg0) {
        if (this.field1107 >= this.field1103) {
            this.field1100 = this.field1099[this.field1104++] << 15;
            if (this.field1104 >= this.field1097) {
                this.field1104 = this.field1097 - 1;
            }
            this.field1103 = (int) ((double) this.field1106[this.field1104] / 65536.0D * (double) arg0);
            if (this.field1103 > this.field1107) {
                this.field1105 = ((this.field1099[this.field1104] << 15) - this.field1100) / (this.field1103 - this.field1107);
            }
        }
        this.field1100 += this.field1105;
        this.field1107++;
        return this.field1100 - this.field1105 >> 15;
    }
}
