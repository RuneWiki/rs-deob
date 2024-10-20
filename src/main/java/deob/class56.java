package deob;

@ObfuscatedName("bn")
public class class56 {

    @ObfuscatedName("bn.l")
    public int field1183 = 2;

    @ObfuscatedName("bn.b")
    public int[] field1178 = new int[2];

    @ObfuscatedName("bn.o")
    public int[] field1184 = new int[2];

    @ObfuscatedName("bn.w")
    public int field1180;

    @ObfuscatedName("bn.r")
    public int field1181;

    @ObfuscatedName("bn.k")
    public int field1187;

    @ObfuscatedName("bn.z")
    public int field1182;

    @ObfuscatedName("bn.g")
    public int field1177;

    @ObfuscatedName("bn.n")
    public int field1185;

    @ObfuscatedName("bn.j")
    public int field1186;

    @ObfuscatedName("bn.c")
    public int field1179;

    public class56() {
        this.field1178[0] = 0;
        this.field1178[1] = 65535;
        this.field1184[0] = 0;
        this.field1184[1] = 65535;
    }

    @ObfuscatedName("bn.l(Ldm;)V")
    public final void method1248(class127 arg0) {
        this.field1187 = arg0.method2440();
        this.field1180 = arg0.method2586();
        this.field1181 = arg0.method2586();
        this.method1247(arg0);
    }

    @ObfuscatedName("bn.b(Ldm;)V")
    public final void method1247(class127 arg0) {
        this.field1183 = arg0.method2440();
        this.field1178 = new int[this.field1183];
        this.field1184 = new int[this.field1183];
        for (int var2 = 0; var2 < this.field1183; var2++) {
            this.field1178[var2] = arg0.method2442();
            this.field1184[var2] = arg0.method2442();
        }
    }

    @ObfuscatedName("bn.o()V")
    public final void method1246() {
        this.field1182 = 0;
        this.field1177 = 0;
        this.field1185 = 0;
        this.field1186 = 0;
        this.field1179 = 0;
    }

    @ObfuscatedName("bn.w(I)I")
    public final int method1249(int arg0) {
        if (this.field1179 >= this.field1182) {
            this.field1186 = this.field1184[this.field1177++] << 15;
            if (this.field1177 >= this.field1183) {
                this.field1177 = this.field1183 - 1;
            }
            this.field1182 = (int) ((double) this.field1178[this.field1177] / 65536.0D * (double) arg0);
            if (this.field1182 > this.field1179) {
                this.field1185 = ((this.field1184[this.field1177] << 15) - this.field1186) / (this.field1182 - this.field1179);
            }
        }
        this.field1186 += this.field1185;
        this.field1179++;
        return this.field1186 - this.field1185 >> 15;
    }
}
