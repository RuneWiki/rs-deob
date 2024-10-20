package deob;

@ObfuscatedName("bs")
public class class59 {

    @ObfuscatedName("bs.i")
    public int field1070 = 2;

    @ObfuscatedName("bs.e")
    public int[] field1069 = new int[2];

    @ObfuscatedName("bs.f")
    public int[] field1076 = new int[2];

    @ObfuscatedName("bs.k")
    public int field1071;

    @ObfuscatedName("bs.g")
    public int field1072;

    @ObfuscatedName("bs.n")
    public int field1077;

    @ObfuscatedName("bs.a")
    public int field1074;

    @ObfuscatedName("bs.q")
    public int field1075;

    @ObfuscatedName("bs.w")
    public int field1073;

    @ObfuscatedName("bs.v")
    public int field1068;

    @ObfuscatedName("bs.h")
    public int field1078;

    public class59() {
        this.field1069[0] = 0;
        this.field1069[1] = 65535;
        this.field1076[0] = 0;
        this.field1076[1] = 65535;
    }

    @ObfuscatedName("bs.i(Let;)V")
    public final void method1055(class154 arg0) {
        this.field1077 = arg0.method2573();
        this.field1071 = arg0.method2658();
        this.field1072 = arg0.method2658();
        this.method1054(arg0);
    }

    @ObfuscatedName("bs.e(Let;)V")
    public final void method1054(class154 arg0) {
        this.field1070 = arg0.method2573();
        this.field1069 = new int[this.field1070];
        this.field1076 = new int[this.field1070];
        for (int var2 = 0; var2 < this.field1070; var2++) {
            this.field1069[var2] = arg0.method2575();
            this.field1076[var2] = arg0.method2575();
        }
    }

    @ObfuscatedName("bs.f()V")
    public final void method1063() {
        this.field1074 = 0;
        this.field1075 = 0;
        this.field1073 = 0;
        this.field1068 = 0;
        this.field1078 = 0;
    }

    @ObfuscatedName("bs.k(I)I")
    public final int method1058(int arg0) {
        if (this.field1078 >= this.field1074) {
            this.field1068 = this.field1076[this.field1075++] << 15;
            if (this.field1075 >= this.field1070) {
                this.field1075 = this.field1070 - 1;
            }
            this.field1074 = (int) ((double) this.field1069[this.field1075] / 65536.0D * (double) arg0);
            if (this.field1074 > this.field1078) {
                this.field1073 = ((this.field1076[this.field1075] << 15) - this.field1068) / (this.field1074 - this.field1078);
            }
        }
        this.field1068 += this.field1073;
        this.field1078++;
        return this.field1068 - this.field1073 >> 15;
    }
}
