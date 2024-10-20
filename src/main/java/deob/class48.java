package deob;

@ObfuscatedName("aq")
public class class48 {

    @ObfuscatedName("aq.z")
    public int field1069 = 2;

    @ObfuscatedName("aq.n")
    public int[] field1076 = new int[2];

    @ObfuscatedName("aq.u")
    public int[] field1068 = new int[2];

    @ObfuscatedName("aq.t")
    public int field1071;

    @ObfuscatedName("aq.e")
    public int field1072;

    @ObfuscatedName("aq.a")
    public int field1073;

    @ObfuscatedName("aq.l")
    public int field1074;

    @ObfuscatedName("aq.v")
    public int field1075;

    @ObfuscatedName("aq.j")
    public int field1077;

    @ObfuscatedName("aq.k")
    public int field1070;

    @ObfuscatedName("aq.g")
    public int field1078;

    public class48() {
        this.field1076[0] = 0;
        this.field1076[1] = 65535;
        this.field1068[0] = 0;
        this.field1068[1] = 65535;
    }

    @ObfuscatedName("aq.z(Lcj;)V")
    public final void method1022(class104 arg0) {
        this.field1073 = arg0.method2257();
        this.field1071 = arg0.method2130();
        this.field1072 = arg0.method2130();
        this.method1027(arg0);
    }

    @ObfuscatedName("aq.n(Lcj;)V")
    public final void method1027(class104 arg0) {
        this.field1069 = arg0.method2257();
        this.field1076 = new int[this.field1069];
        this.field1068 = new int[this.field1069];
        for (int var2 = 0; var2 < this.field1069; var2++) {
            this.field1076[var2] = arg0.method2206();
            this.field1068[var2] = arg0.method2206();
        }
    }

    @ObfuscatedName("aq.u()V")
    public final void method1023() {
        this.field1074 = 0;
        this.field1075 = 0;
        this.field1077 = 0;
        this.field1070 = 0;
        this.field1078 = 0;
    }

    @ObfuscatedName("aq.t(I)I")
    public final int method1024(int arg0) {
        if (this.field1078 >= this.field1074) {
            this.field1070 = this.field1068[this.field1075++] << 15;
            if (this.field1075 >= this.field1069) {
                this.field1075 = this.field1069 - 1;
            }
            this.field1074 = (int) ((double) this.field1076[this.field1075] / 65536.0D * (double) arg0);
            if (this.field1074 > this.field1078) {
                this.field1077 = ((this.field1068[this.field1075] << 15) - this.field1070) / (this.field1074 - this.field1078);
            }
        }
        this.field1070 += this.field1077;
        this.field1078++;
        return this.field1070 - this.field1077 >> 15;
    }
}
