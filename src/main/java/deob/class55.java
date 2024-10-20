package deob;

@ObfuscatedName("bh")
public class class55 {

    @ObfuscatedName("bh.u")
    public int field1180 = 2;

    @ObfuscatedName("bh.k")
    public int[] field1172 = new int[2];

    @ObfuscatedName("bh.m")
    public int[] field1174 = new int[2];

    @ObfuscatedName("bh.n")
    public int field1173;

    @ObfuscatedName("bh.q")
    public int field1176;

    @ObfuscatedName("bh.a")
    public int field1177;

    @ObfuscatedName("bh.g")
    public int field1178;

    @ObfuscatedName("bh.j")
    public int field1179;

    @ObfuscatedName("bh.l")
    public int field1175;

    @ObfuscatedName("bh.w")
    public int field1181;

    @ObfuscatedName("bh.z")
    public int field1182;

    public class55() {
        this.field1172[0] = 0;
        this.field1172[1] = 65535;
        this.field1174[0] = 0;
        this.field1174[1] = 65535;
    }

    @ObfuscatedName("bh.u(Ldl;)V")
    public final void method1233(class126 arg0) {
        this.field1177 = arg0.method2559();
        this.field1173 = arg0.method2526();
        this.field1176 = arg0.method2526();
        this.method1234(arg0);
    }

    @ObfuscatedName("bh.k(Ldl;)V")
    public final void method1234(class126 arg0) {
        this.field1180 = arg0.method2559();
        this.field1172 = new int[this.field1180];
        this.field1174 = new int[this.field1180];
        for (int var2 = 0; var2 < this.field1180; var2++) {
            this.field1172[var2] = arg0.method2450();
            this.field1174[var2] = arg0.method2450();
        }
    }

    @ObfuscatedName("bh.x()V")
    public final void method1239() {
        this.field1178 = 0;
        this.field1179 = 0;
        this.field1175 = 0;
        this.field1181 = 0;
        this.field1182 = 0;
    }

    @ObfuscatedName("bh.m(I)I")
    public final int method1236(int arg0) {
        if (this.field1182 >= this.field1178) {
            this.field1181 = this.field1174[this.field1179++] << 15;
            if (this.field1179 >= this.field1180) {
                this.field1179 = this.field1180 - 1;
            }
            this.field1178 = (int) ((double) this.field1172[this.field1179] / 65536.0D * (double) arg0);
            if (this.field1178 > this.field1182) {
                this.field1175 = ((this.field1174[this.field1179] << 15) - this.field1181) / (this.field1178 - this.field1182);
            }
        }
        this.field1181 += this.field1175;
        this.field1182++;
        return this.field1181 - this.field1175 >> 15;
    }
}
