package deob;

@ObfuscatedName("aj")
public class class52 {

    @ObfuscatedName("aj.p")
    public int field1089 = 2;

    @ObfuscatedName("aj.y")
    public int field1098;

    @ObfuscatedName("aj.d")
    public int[] field1094 = new int[2];

    @ObfuscatedName("aj.c")
    public int[] field1095 = new int[2];

    @ObfuscatedName("aj.r")
    public int field1091;

    @ObfuscatedName("aj.f")
    public int field1092;

    @ObfuscatedName("aj.z")
    public int field1093;

    @ObfuscatedName("aj.o")
    public int field1088;

    @ObfuscatedName("aj.k")
    public int field1090;

    @ObfuscatedName("aj.s")
    public int field1096;

    @ObfuscatedName("aj.h")
    public int field1097;

    public class52() {
        this.field1094[0] = 0;
        this.field1094[1] = 65535;
        this.field1095[0] = 0;
        this.field1095[1] = 65535;
    }

    @ObfuscatedName("aj.p(Ldg;)V")
    public final void method1054(class110 arg0) {
        this.field1093 = arg0.method2309();
        this.field1091 = arg0.method2164();
        this.field1092 = arg0.method2164();
        this.method1051(arg0);
    }

    @ObfuscatedName("aj.y(Ldg;)V")
    public final void method1051(class110 arg0) {
        this.field1089 = arg0.method2309();
        this.field1094 = new int[this.field1089];
        this.field1095 = new int[this.field1089];
        for (int var2 = 0; var2 < this.field1089; var2++) {
            this.field1094[var2] = arg0.method2243();
            this.field1095[var2] = arg0.method2243();
        }
    }

    @ObfuscatedName("aj.d()V")
    public final void method1053() {
        this.field1088 = 0;
        this.field1090 = 0;
        this.field1096 = 0;
        this.field1097 = 0;
        this.field1098 = 0;
    }

    @ObfuscatedName("aj.c(I)I")
    public final int method1052(int arg0) {
        if (this.field1098 >= this.field1088) {
            this.field1097 = this.field1095[this.field1090++] << 15;
            if (this.field1090 >= this.field1089) {
                this.field1090 = this.field1089 - 1;
            }
            this.field1088 = (int) ((double) this.field1094[this.field1090] / 65536.0D * (double) arg0);
            if (this.field1088 > this.field1098) {
                this.field1096 = ((this.field1095[this.field1090] << 15) - this.field1097) / (this.field1088 - this.field1098);
            }
        }
        this.field1097 += this.field1096;
        this.field1098++;
        return this.field1097 - this.field1096 >> 15;
    }
}
