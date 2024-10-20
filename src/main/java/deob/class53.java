package deob;

@ObfuscatedName("bs")
public class class53 {

    @ObfuscatedName("bs.n")
    public int field1136 = 2;

    @ObfuscatedName("bs.d")
    public int[] field1140 = new int[2];

    @ObfuscatedName("bs.z")
    public int[] field1134 = new int[2];

    @ObfuscatedName("bs.y")
    public int field1141;

    @ObfuscatedName("bs.e")
    public int field1132;

    @ObfuscatedName("bs.g")
    public int field1135;

    @ObfuscatedName("bs.f")
    public int field1131;

    @ObfuscatedName("bs.m")
    public int field1137;

    @ObfuscatedName("bs.a")
    public int field1138;

    @ObfuscatedName("bs.h")
    public int field1139;

    @ObfuscatedName("bs.l")
    public int field1133;

    public class53() {
        this.field1140[0] = 0;
        this.field1140[1] = 65535;
        this.field1134[0] = 0;
        this.field1134[1] = 65535;
    }

    @ObfuscatedName("bs.n(Ldl;)V")
    public final void method1095(class111 arg0) {
        this.field1131 = arg0.method2228();
        this.field1132 = arg0.method2233();
        this.field1135 = arg0.method2233();
        this.method1090(arg0);
    }

    @ObfuscatedName("bs.d(Ldl;)V")
    public final void method1090(class111 arg0) {
        this.field1136 = arg0.method2228();
        this.field1140 = new int[this.field1136];
        this.field1134 = new int[this.field1136];
        for (int var2 = 0; var2 < this.field1136; var2++) {
            this.field1140[var2] = arg0.method2231();
            this.field1134[var2] = arg0.method2231();
        }
    }

    @ObfuscatedName("bs.z()V")
    public final void method1091() {
        this.field1137 = 0;
        this.field1138 = 0;
        this.field1139 = 0;
        this.field1133 = 0;
        this.field1141 = 0;
    }

    @ObfuscatedName("bs.y(I)I")
    public final int method1092(int arg0) {
        if (this.field1141 >= this.field1137) {
            this.field1133 = this.field1134[this.field1138++] << 15;
            if (this.field1138 >= this.field1136) {
                this.field1138 = this.field1136 - 1;
            }
            this.field1137 = (int) ((double) this.field1140[this.field1138] / 65536.0D * (double) arg0);
            if (this.field1137 > this.field1141) {
                this.field1139 = ((this.field1134[this.field1138] << 15) - this.field1133) / (this.field1137 - this.field1141);
            }
        }
        this.field1133 += this.field1139;
        this.field1141++;
        return this.field1133 - this.field1139 >> 15;
    }
}
