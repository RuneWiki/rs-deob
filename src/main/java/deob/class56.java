package deob;

@ObfuscatedName("bx")
public class class56 {

    @ObfuscatedName("bx.g")
    public int field1183 = 2;

    @ObfuscatedName("bx.m")
    public int[] field1177 = new int[2];

    @ObfuscatedName("bx.v")
    public int[] field1178 = new int[2];

    @ObfuscatedName("bx.r")
    public int field1179;

    @ObfuscatedName("bx.n")
    public int field1176;

    @ObfuscatedName("bx.i")
    public int field1181;

    @ObfuscatedName("bx.s")
    public int field1182;

    @ObfuscatedName("bx.w")
    public int field1184;

    @ObfuscatedName("bx.d")
    public int field1185;

    @ObfuscatedName("bx.t")
    public int field1180;

    @ObfuscatedName("bx.f")
    public int field1186;

    public class56() {
        this.field1177[0] = 0;
        this.field1177[1] = 65535;
        this.field1178[0] = 0;
        this.field1178[1] = 65535;
    }

    @ObfuscatedName("bx.g(Ldr;)V")
    public final void method1253(class127 arg0) {
        this.field1181 = arg0.method2414();
        this.field1179 = arg0.method2430();
        this.field1176 = arg0.method2430();
        this.method1255(arg0);
    }

    @ObfuscatedName("bx.m(Ldr;)V")
    public final void method1255(class127 arg0) {
        this.field1183 = arg0.method2414();
        this.field1177 = new int[this.field1183];
        this.field1178 = new int[this.field1183];
        for (int var2 = 0; var2 < this.field1183; var2++) {
            this.field1177[var2] = arg0.method2416();
            this.field1178[var2] = arg0.method2416();
        }
    }

    @ObfuscatedName("bx.v()V")
    public final void method1249() {
        this.field1182 = 0;
        this.field1184 = 0;
        this.field1185 = 0;
        this.field1180 = 0;
        this.field1186 = 0;
    }

    @ObfuscatedName("bx.r(I)I")
    public final int method1257(int arg0) {
        if (this.field1186 >= this.field1182) {
            this.field1180 = this.field1178[this.field1184++] << 15;
            if (this.field1184 >= this.field1183) {
                this.field1184 = this.field1183 - 1;
            }
            this.field1182 = (int) ((double) this.field1177[this.field1184] / 65536.0D * (double) arg0);
            if (this.field1182 > this.field1186) {
                this.field1185 = ((this.field1178[this.field1184] << 15) - this.field1180) / (this.field1182 - this.field1186);
            }
        }
        this.field1180 += this.field1185;
        this.field1186++;
        return this.field1180 - this.field1185 >> 15;
    }
}
