package deob;

@ObfuscatedName("ax")
public class class52 {

    @ObfuscatedName("ax.v")
    public int field1111 = 2;

    @ObfuscatedName("ax.m")
    public int[] field1105 = new int[2];

    @ObfuscatedName("ax.e")
    public int[] field1106 = new int[2];

    @ObfuscatedName("ax.h")
    public int field1112;

    @ObfuscatedName("ax.p")
    public int field1108;

    @ObfuscatedName("ax.j")
    public int field1109;

    @ObfuscatedName("ax.i")
    public int field1110;

    @ObfuscatedName("ax.u")
    public int field1107;

    @ObfuscatedName("ax.l")
    public int field1104;

    @ObfuscatedName("ax.k")
    public int field1113;

    @ObfuscatedName("ax.q")
    public int field1114;

    public class52() {
        this.field1105[0] = 0;
        this.field1105[1] = 65535;
        this.field1106[0] = 0;
        this.field1106[1] = 65535;
    }

    @ObfuscatedName("ax.x(Ldm;)V")
    public final void method1057(class108 arg0) {
        this.field1109 = arg0.method2299();
        this.field1112 = arg0.method2132();
        this.field1108 = arg0.method2132();
        this.method1058(arg0);
    }

    @ObfuscatedName("ax.v(Ldm;)V")
    public final void method1058(class108 arg0) {
        this.field1111 = arg0.method2299();
        this.field1105 = new int[this.field1111];
        this.field1106 = new int[this.field1111];
        for (int var2 = 0; var2 < this.field1111; var2++) {
            this.field1105[var2] = arg0.method2129();
            this.field1106[var2] = arg0.method2129();
        }
    }

    @ObfuscatedName("ax.m()V")
    public final void method1064() {
        this.field1110 = 0;
        this.field1107 = 0;
        this.field1104 = 0;
        this.field1113 = 0;
        this.field1114 = 0;
    }

    @ObfuscatedName("ax.e(I)I")
    public final int method1065(int arg0) {
        if (this.field1114 >= this.field1110) {
            this.field1113 = this.field1106[this.field1107++] << 15;
            if (this.field1107 >= this.field1111) {
                this.field1107 = this.field1111 - 1;
            }
            this.field1110 = (int) ((double) this.field1105[this.field1107] / 65536.0D * (double) arg0);
            if (this.field1110 > this.field1114) {
                this.field1104 = ((this.field1106[this.field1107] << 15) - this.field1113) / (this.field1110 - this.field1114);
            }
        }
        this.field1113 += this.field1104;
        this.field1114++;
        return this.field1113 - this.field1104 >> 15;
    }
}
