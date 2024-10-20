package deob;

@ObfuscatedName("bc")
public class class56 {

    @ObfuscatedName("bc.f")
    public int field1182 = 2;

    @ObfuscatedName("bc.t")
    public int[] field1178 = new int[2];

    @ObfuscatedName("bc.n")
    public int[] field1174 = new int[2];

    @ObfuscatedName("bc.e")
    public int field1180;

    @ObfuscatedName("bc.l")
    public int field1176;

    @ObfuscatedName("bc.d")
    public int field1175;

    @ObfuscatedName("bc.r")
    public int field1177;

    @ObfuscatedName("bc.k")
    public int field1179;

    @ObfuscatedName("bc.u")
    public int field1172;

    @ObfuscatedName("bc.o")
    public int field1181;

    @ObfuscatedName("bc.g")
    public int field1173;

    public class56() {
        this.field1178[0] = 0;
        this.field1178[1] = 65535;
        this.field1174[0] = 0;
        this.field1174[1] = 65535;
    }

    @ObfuscatedName("bc.f(Ldq;)V")
    public final void method1266(class127 arg0) {
        this.field1175 = arg0.method2458();
        this.field1180 = arg0.method2463();
        this.field1176 = arg0.method2463();
        this.method1255(arg0);
    }

    @ObfuscatedName("bc.t(Ldq;)V")
    public final void method1255(class127 arg0) {
        this.field1182 = arg0.method2458();
        this.field1178 = new int[this.field1182];
        this.field1174 = new int[this.field1182];
        for (int var2 = 0; var2 < this.field1182; var2++) {
            this.field1178[var2] = arg0.method2460();
            this.field1174[var2] = arg0.method2460();
        }
    }

    @ObfuscatedName("bc.n()V")
    public final void method1256() {
        this.field1177 = 0;
        this.field1179 = 0;
        this.field1172 = 0;
        this.field1181 = 0;
        this.field1173 = 0;
    }

    @ObfuscatedName("bc.e(I)I")
    public final int method1257(int arg0) {
        if (this.field1173 >= this.field1177) {
            this.field1181 = this.field1174[this.field1179++] << 15;
            if (this.field1179 >= this.field1182) {
                this.field1179 = this.field1182 - 1;
            }
            this.field1177 = (int) ((double) this.field1178[this.field1179] / 65536.0D * (double) arg0);
            if (this.field1177 > this.field1173) {
                this.field1172 = ((this.field1174[this.field1179] << 15) - this.field1181) / (this.field1177 - this.field1173);
            }
        }
        this.field1181 += this.field1172;
        this.field1173++;
        return this.field1181 - this.field1172 >> 15;
    }
}
