package deob;

@ObfuscatedName("br")
public class class55 {

    @ObfuscatedName("br.g")
    public int field1180 = 2;

    @ObfuscatedName("br.e")
    public int[] field1171 = new int[2];

    @ObfuscatedName("br.n")
    public int[] field1173 = new int[2];

    @ObfuscatedName("br.j")
    public int field1175;

    @ObfuscatedName("br.i")
    public int field1174;

    @ObfuscatedName("br.o")
    public int field1178;

    @ObfuscatedName("br.l")
    public int field1176;

    @ObfuscatedName("br.p")
    public int field1177;

    @ObfuscatedName("br.t")
    public int field1172;

    @ObfuscatedName("br.w")
    public int field1179;

    @ObfuscatedName("br.r")
    public int field1170;

    public class55() {
        this.field1171[0] = 0;
        this.field1171[1] = 65535;
        this.field1173[0] = 0;
        this.field1173[1] = 65535;
    }

    @ObfuscatedName("br.g(Ldu;)V")
    public final void method1225(class126 arg0) {
        this.field1178 = arg0.method2485();
        this.field1175 = arg0.method2593();
        this.field1174 = arg0.method2593();
        this.method1226(arg0);
    }

    @ObfuscatedName("br.e(Ldu;)V")
    public final void method1226(class126 arg0) {
        this.field1180 = arg0.method2485();
        this.field1171 = new int[this.field1180];
        this.field1173 = new int[this.field1180];
        for (int var2 = 0; var2 < this.field1180; var2++) {
            this.field1171[var2] = arg0.method2487();
            this.field1173[var2] = arg0.method2487();
        }
    }

    @ObfuscatedName("br.n()V")
    public final void method1235() {
        this.field1176 = 0;
        this.field1177 = 0;
        this.field1172 = 0;
        this.field1179 = 0;
        this.field1170 = 0;
    }

    @ObfuscatedName("br.j(I)I")
    public final int method1228(int arg0) {
        if (this.field1170 >= this.field1176) {
            this.field1179 = this.field1173[this.field1177++] << 15;
            if (this.field1177 >= this.field1180) {
                this.field1177 = this.field1180 - 1;
            }
            this.field1176 = (int) ((double) this.field1171[this.field1177] / 65536.0D * (double) arg0);
            if (this.field1176 > this.field1170) {
                this.field1172 = ((this.field1173[this.field1177] << 15) - this.field1179) / (this.field1176 - this.field1170);
            }
        }
        this.field1179 += this.field1172;
        this.field1170++;
        return this.field1179 - this.field1172 >> 15;
    }
}
