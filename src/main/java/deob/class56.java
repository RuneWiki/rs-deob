package deob;

@ObfuscatedName("bh")
public class class56 {

    @ObfuscatedName("bh.p")
    public int field1184 = 2;

    @ObfuscatedName("bh.e")
    public int[] field1179 = new int[2];

    @ObfuscatedName("bh.a")
    public int[] field1181 = new int[2];

    @ObfuscatedName("bh.h")
    public int field1182;

    @ObfuscatedName("bh.y")
    public int field1189;

    @ObfuscatedName("bh.j")
    public int field1186;

    @ObfuscatedName("bh.l")
    public int field1183;

    @ObfuscatedName("bh.f")
    public int field1185;

    @ObfuscatedName("bh.n")
    public int field1180;

    @ObfuscatedName("bh.k")
    public int field1187;

    @ObfuscatedName("bh.q")
    public int field1188;

    public class56() {
        this.field1179[0] = 0;
        this.field1179[1] = 65535;
        this.field1181[0] = 0;
        this.field1181[1] = 65535;
    }

    @ObfuscatedName("bh.p(Ldj;)V")
    public final void method1273(class127 arg0) {
        this.field1183 = arg0.method2494();
        this.field1182 = arg0.method2617();
        this.field1186 = arg0.method2617();
        this.method1260(arg0);
    }

    @ObfuscatedName("bh.e(Ldj;)V")
    public final void method1260(class127 arg0) {
        this.field1184 = arg0.method2494();
        this.field1179 = new int[this.field1184];
        this.field1181 = new int[this.field1184];
        for (int var2 = 0; var2 < this.field1184; var2++) {
            this.field1179[var2] = arg0.method2496();
            this.field1181[var2] = arg0.method2496();
        }
    }

    @ObfuscatedName("bh.a()V")
    public final void method1261() {
        this.field1185 = 0;
        this.field1180 = 0;
        this.field1187 = 0;
        this.field1188 = 0;
        this.field1189 = 0;
    }

    @ObfuscatedName("bh.h(I)I")
    public final int method1263(int arg0) {
        if (this.field1189 >= this.field1185) {
            this.field1188 = this.field1181[this.field1180++] << 15;
            if (this.field1180 >= this.field1184) {
                this.field1180 = this.field1184 - 1;
            }
            this.field1185 = (int) ((double) this.field1179[this.field1180] / 65536.0D * (double) arg0);
            if (this.field1185 > this.field1189) {
                this.field1187 = ((this.field1181[this.field1180] << 15) - this.field1188) / (this.field1185 - this.field1189);
            }
        }
        this.field1188 += this.field1187;
        this.field1189++;
        return this.field1188 - this.field1187 >> 15;
    }
}
