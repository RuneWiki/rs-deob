package deob;

@ObfuscatedName("ay")
public class class52 {

    @ObfuscatedName("ay.a")
    public int field1112 = 2;

    @ObfuscatedName("ay.v")
    public int[] field1108 = new int[2];

    @ObfuscatedName("ay.i")
    public int[] field1115 = new int[2];

    @ObfuscatedName("ay.b")
    public int field1110;

    @ObfuscatedName("ay.l")
    public int field1111;

    @ObfuscatedName("ay.m")
    public int field1109;

    @ObfuscatedName("ay.w")
    public int field1113;

    @ObfuscatedName("ay.e")
    public int field1114;

    @ObfuscatedName("ay.n")
    public int field1117;

    @ObfuscatedName("ay.s")
    public int field1107;

    @ObfuscatedName("ay.k")
    public int field1116;

    public class52() {
        this.field1108[0] = 0;
        this.field1108[1] = 65535;
        this.field1115[0] = 0;
        this.field1115[1] = 65535;
    }

    @ObfuscatedName("ay.a(Ldi;)V")
    public final void method1040(class110 arg0) {
        this.field1109 = arg0.method2199();
        this.field1110 = arg0.method2136();
        this.field1111 = arg0.method2136();
        this.method1041(arg0);
    }

    @ObfuscatedName("ay.v(Ldi;)V")
    public final void method1041(class110 arg0) {
        this.field1112 = arg0.method2199();
        this.field1108 = new int[this.field1112];
        this.field1115 = new int[this.field1112];
        for (int var2 = 0; var2 < this.field1112; var2++) {
            this.field1108[var2] = arg0.method2282();
            this.field1115[var2] = arg0.method2282();
        }
    }

    @ObfuscatedName("ay.i()V")
    public final void method1042() {
        this.field1113 = 0;
        this.field1114 = 0;
        this.field1117 = 0;
        this.field1107 = 0;
        this.field1116 = 0;
    }

    @ObfuscatedName("ay.b(I)I")
    public final int method1049(int arg0) {
        if (this.field1116 >= this.field1113) {
            this.field1107 = this.field1115[this.field1114++] << 15;
            if (this.field1114 >= this.field1112) {
                this.field1114 = this.field1112 - 1;
            }
            this.field1113 = (int) ((double) this.field1108[this.field1114] / 65536.0D * (double) arg0);
            if (this.field1113 > this.field1116) {
                this.field1117 = ((this.field1115[this.field1114] << 15) - this.field1107) / (this.field1113 - this.field1116);
            }
        }
        this.field1107 += this.field1117;
        this.field1116++;
        return this.field1107 - this.field1117 >> 15;
    }
}
