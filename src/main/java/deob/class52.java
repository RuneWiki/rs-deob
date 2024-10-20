package deob;

@ObfuscatedName("ax")
public class class52 {

    @ObfuscatedName("ax.c")
    public int field1103 = 2;

    @ObfuscatedName("ax.j")
    public int[] field1101 = new int[2];

    @ObfuscatedName("ax.y")
    public int field1100;

    @ObfuscatedName("ax.r")
    public int[] field1102 = new int[2];

    @ObfuscatedName("ax.f")
    public int field1110;

    @ObfuscatedName("ax.l")
    public int field1104;

    @ObfuscatedName("ax.b")
    public int field1105;

    @ObfuscatedName("ax.k")
    public int field1106;

    @ObfuscatedName("ax.g")
    public int field1107;

    @ObfuscatedName("ax.v")
    public int field1108;

    @ObfuscatedName("ax.i")
    public int field1109;

    public class52() {
        this.field1101[0] = 0;
        this.field1101[1] = 65535;
        this.field1102[0] = 0;
        this.field1102[1] = 65535;
    }

    @ObfuscatedName("ax.c(Ldx;)V")
    public final void method1044(class108 arg0) {
        this.field1105 = arg0.method2134();
        this.field1110 = arg0.method2144();
        this.field1104 = arg0.method2144();
        this.method1045(arg0);
    }

    @ObfuscatedName("ax.j(Ldx;)V")
    public final void method1045(class108 arg0) {
        this.field1103 = arg0.method2134();
        this.field1101 = new int[this.field1103];
        this.field1102 = new int[this.field1103];
        for (int var2 = 0; var2 < this.field1103; var2++) {
            this.field1101[var2] = arg0.method2136();
            this.field1102[var2] = arg0.method2136();
        }
    }

    @ObfuscatedName("ax.y()V")
    public final void method1048() {
        this.field1106 = 0;
        this.field1107 = 0;
        this.field1108 = 0;
        this.field1109 = 0;
        this.field1100 = 0;
    }

    @ObfuscatedName("ax.r(I)I")
    public final int method1047(int arg0) {
        if (this.field1100 >= this.field1106) {
            this.field1109 = this.field1102[this.field1107++] << 15;
            if (this.field1107 >= this.field1103) {
                this.field1107 = this.field1103 - 1;
            }
            this.field1106 = (int) ((double) this.field1101[this.field1107] / 65536.0D * (double) arg0);
            if (this.field1106 > this.field1100) {
                this.field1108 = ((this.field1102[this.field1107] << 15) - this.field1109) / (this.field1106 - this.field1100);
            }
        }
        this.field1109 += this.field1108;
        this.field1100++;
        return this.field1109 - this.field1108 >> 15;
    }
}
