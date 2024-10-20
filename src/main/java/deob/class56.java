package deob;

@ObfuscatedName("bl")
public class class56 {

    @ObfuscatedName("bl.y")
    public int field1175;

    @ObfuscatedName("bl.m")
    public int field1184 = 2;

    @ObfuscatedName("bl.d")
    public int[] field1180 = new int[2];

    @ObfuscatedName("bl.k")
    public int[] field1176 = new int[2];

    @ObfuscatedName("bl.n")
    public int field1177;

    @ObfuscatedName("bl.s")
    public int field1178;

    @ObfuscatedName("bl.b")
    public int field1179;

    @ObfuscatedName("bl.j")
    public int field1181;

    @ObfuscatedName("bl.p")
    public int field1174;

    @ObfuscatedName("bl.l")
    public int field1182;

    @ObfuscatedName("bl.i")
    public int field1183;

    public class56() {
        this.field1180[0] = 0;
        this.field1180[1] = 65535;
        this.field1176[0] = 0;
        this.field1176[1] = 65535;
    }

    @ObfuscatedName("bl.y(Ldp;)V")
    public final void method1248(class127 arg0) {
        this.field1179 = arg0.method2534();
        this.field1177 = arg0.method2628();
        this.field1178 = arg0.method2628();
        this.method1247(arg0);
    }

    @ObfuscatedName("bl.m(Ldp;)V")
    public final void method1247(class127 arg0) {
        this.field1184 = arg0.method2534();
        this.field1180 = new int[this.field1184];
        this.field1176 = new int[this.field1184];
        for (int var2 = 0; var2 < this.field1184; var2++) {
            this.field1180[var2] = arg0.method2460();
            this.field1176[var2] = arg0.method2460();
        }
    }

    @ObfuscatedName("bl.d()V")
    public final void method1249() {
        this.field1181 = 0;
        this.field1174 = 0;
        this.field1182 = 0;
        this.field1183 = 0;
        this.field1175 = 0;
    }

    @ObfuscatedName("bl.k(I)I")
    public final int method1250(int arg0) {
        if (this.field1175 >= this.field1181) {
            this.field1183 = this.field1176[this.field1174++] << 15;
            if (this.field1174 >= this.field1184) {
                this.field1174 = this.field1184 - 1;
            }
            this.field1181 = (int) ((double) this.field1180[this.field1174] / 65536.0D * (double) arg0);
            if (this.field1181 > this.field1175) {
                this.field1182 = ((this.field1176[this.field1174] << 15) - this.field1183) / (this.field1181 - this.field1175);
            }
        }
        this.field1183 += this.field1182;
        this.field1175++;
        return this.field1183 - this.field1182 >> 15;
    }
}
