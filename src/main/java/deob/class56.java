package deob;

@ObfuscatedName("bi")
public class class56 {

    @ObfuscatedName("bi.b")
    public int field1177 = 2;

    @ObfuscatedName("bi.e")
    public int[] field1181 = new int[2];

    @ObfuscatedName("bi.g")
    public int[] field1176 = new int[2];

    @ObfuscatedName("bi.o")
    public int field1180;

    @ObfuscatedName("bi.a")
    public int field1178;

    @ObfuscatedName("bi.h")
    public int field1174;

    @ObfuscatedName("bi.j")
    public int field1175;

    @ObfuscatedName("bi.f")
    public int field1179;

    @ObfuscatedName("bi.q")
    public int field1182;

    @ObfuscatedName("bi.l")
    public int field1183;

    @ObfuscatedName("bi.d")
    public int field1184;

    public class56() {
        this.field1181[0] = 0;
        this.field1181[1] = 65535;
        this.field1176[0] = 0;
        this.field1176[1] = 65535;
    }

    @ObfuscatedName("bi.b(Ldv;)V")
    public final void method1226(class126 arg0) {
        this.field1174 = arg0.method2436();
        this.field1180 = arg0.method2439();
        this.field1178 = arg0.method2439();
        this.method1227(arg0);
    }

    @ObfuscatedName("bi.e(Ldv;)V")
    public final void method1227(class126 arg0) {
        this.field1177 = arg0.method2436();
        this.field1181 = new int[this.field1177];
        this.field1176 = new int[this.field1177];
        for (int var2 = 0; var2 < this.field1177; var2++) {
            this.field1181[var2] = arg0.method2572();
            this.field1176[var2] = arg0.method2572();
        }
    }

    @ObfuscatedName("bi.g()V")
    public final void method1228() {
        this.field1175 = 0;
        this.field1179 = 0;
        this.field1182 = 0;
        this.field1183 = 0;
        this.field1184 = 0;
    }

    @ObfuscatedName("bi.o(I)I")
    public final int method1229(int arg0) {
        if (this.field1184 >= this.field1175) {
            this.field1183 = this.field1176[this.field1179++] << 15;
            if (this.field1179 >= this.field1177) {
                this.field1179 = this.field1177 - 1;
            }
            this.field1175 = (int) ((double) this.field1181[this.field1179] / 65536.0D * (double) arg0);
            if (this.field1175 > this.field1184) {
                this.field1182 = ((this.field1176[this.field1179] << 15) - this.field1183) / (this.field1175 - this.field1184);
            }
        }
        this.field1183 += this.field1182;
        this.field1184++;
        return this.field1183 - this.field1182 >> 15;
    }
}
