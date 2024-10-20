package deob;

@ObfuscatedName("bg")
public class class53 {

    @ObfuscatedName("bg.p")
    public int field1148 = 2;

    @ObfuscatedName("bg.k")
    public int[] field1143 = new int[2];

    @ObfuscatedName("bg.e")
    public int[] field1142 = new int[2];

    @ObfuscatedName("bg.f")
    public int field1152;

    @ObfuscatedName("bg.w")
    public int field1146;

    @ObfuscatedName("bg.t")
    public int field1144;

    @ObfuscatedName("bg.s")
    public int field1145;

    @ObfuscatedName("bg.c")
    public int field1149;

    @ObfuscatedName("bg.d")
    public int field1150;

    @ObfuscatedName("bg.v")
    public int field1151;

    @ObfuscatedName("bg.m")
    public int field1147;

    public class53() {
        this.field1143[0] = 0;
        this.field1143[1] = 65535;
        this.field1142[0] = 0;
        this.field1142[1] = 65535;
    }

    @ObfuscatedName("bg.p(Lde;)V")
    public final void method1062(class111 arg0) {
        this.field1144 = arg0.method2314();
        this.field1152 = arg0.method2350();
        this.field1146 = arg0.method2350();
        this.method1061(arg0);
    }

    @ObfuscatedName("bg.k(Lde;)V")
    public final void method1061(class111 arg0) {
        this.field1148 = arg0.method2314();
        this.field1143 = new int[this.field1148];
        this.field1142 = new int[this.field1148];
        for (int var2 = 0; var2 < this.field1148; var2++) {
            this.field1143[var2] = arg0.method2177();
            this.field1142[var2] = arg0.method2177();
        }
    }

    @ObfuscatedName("bg.e()V")
    public final void method1064() {
        this.field1145 = 0;
        this.field1149 = 0;
        this.field1150 = 0;
        this.field1151 = 0;
        this.field1147 = 0;
    }

    @ObfuscatedName("bg.f(I)I")
    public final int method1065(int arg0) {
        if (this.field1147 >= this.field1145) {
            this.field1151 = this.field1142[this.field1149++] << 15;
            if (this.field1149 >= this.field1148) {
                this.field1149 = this.field1148 - 1;
            }
            this.field1145 = (int) ((double) this.field1143[this.field1149] / 65536.0D * (double) arg0);
            if (this.field1145 > this.field1147) {
                this.field1150 = ((this.field1142[this.field1149] << 15) - this.field1151) / (this.field1145 - this.field1147);
            }
        }
        this.field1151 += this.field1150;
        this.field1147++;
        return this.field1151 - this.field1150 >> 15;
    }
}
