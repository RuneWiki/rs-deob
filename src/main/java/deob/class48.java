package deob;

@ObfuscatedName("ab")
public class class48 {

    @ObfuscatedName("ab.m")
    public int field1073 = 2;

    @ObfuscatedName("ab.k")
    public int[] field1068 = new int[2];

    @ObfuscatedName("ab.y")
    public int field1078;

    @ObfuscatedName("ab.g")
    public int[] field1070 = new int[2];

    @ObfuscatedName("ab.r")
    public int field1069;

    @ObfuscatedName("ab.i")
    public int field1072;

    @ObfuscatedName("ab.f")
    public int field1076;

    @ObfuscatedName("ab.a")
    public int field1074;

    @ObfuscatedName("ab.w")
    public int field1071;

    @ObfuscatedName("ab.u")
    public int field1075;

    @ObfuscatedName("ab.d")
    public int field1077;

    public class48() {
        this.field1068[0] = 0;
        this.field1068[1] = 65535;
        this.field1070[0] = 0;
        this.field1070[1] = 65535;
    }

    @ObfuscatedName("ab.m(Lcb;)V")
    public final void method1006(class104 arg0) {
        this.field1076 = arg0.method2190();
        this.field1069 = arg0.method2135();
        this.field1072 = arg0.method2135();
        this.method1007(arg0);
    }

    @ObfuscatedName("ab.k(Lcb;)V")
    public final void method1007(class104 arg0) {
        this.field1073 = arg0.method2190();
        this.field1068 = new int[this.field1073];
        this.field1070 = new int[this.field1073];
        for (int var2 = 0; var2 < this.field1073; var2++) {
            this.field1068[var2] = arg0.method2132();
            this.field1070[var2] = arg0.method2132();
        }
    }

    @ObfuscatedName("ab.y()V")
    public final void method1008() {
        this.field1074 = 0;
        this.field1071 = 0;
        this.field1075 = 0;
        this.field1077 = 0;
        this.field1078 = 0;
    }

    @ObfuscatedName("ab.g(I)I")
    public final int method1019(int arg0) {
        if (this.field1078 >= this.field1074) {
            this.field1077 = this.field1070[this.field1071++] << 15;
            if (this.field1071 >= this.field1073) {
                this.field1071 = this.field1073 - 1;
            }
            this.field1074 = (int) ((double) this.field1068[this.field1071] / 65536.0D * (double) arg0);
            if (this.field1074 > this.field1078) {
                this.field1075 = ((this.field1070[this.field1071] << 15) - this.field1077) / (this.field1074 - this.field1078);
            }
        }
        this.field1077 += this.field1075;
        this.field1078++;
        return this.field1077 - this.field1075 >> 15;
    }
}
