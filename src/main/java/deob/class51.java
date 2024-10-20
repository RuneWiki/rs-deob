package deob;

@ObfuscatedName("aj")
public class class51 {

    @ObfuscatedName("aj.e")
    public int field1111 = 2;

    @ObfuscatedName("aj.o")
    public int[] field1106 = new int[2];

    @ObfuscatedName("aj.y")
    public int field1115;

    @ObfuscatedName("aj.b")
    public int[] field1112 = new int[2];

    @ObfuscatedName("aj.w")
    public int field1105;

    @ObfuscatedName("aj.r")
    public int field1109;

    @ObfuscatedName("aj.l")
    public int field1110;

    @ObfuscatedName("aj.s")
    public int field1107;

    @ObfuscatedName("aj.f")
    public int field1108;

    @ObfuscatedName("aj.h")
    public int field1113;

    @ObfuscatedName("aj.a")
    public int field1114;

    public class51() {
        this.field1106[0] = 0;
        this.field1106[1] = 65535;
        this.field1112[0] = 0;
        this.field1112[1] = 65535;
    }

    @ObfuscatedName("aj.e(Ldl;)V")
    public final void method1000(class107 arg0) {
        this.field1110 = arg0.method2123();
        this.field1105 = arg0.method2207();
        this.field1109 = arg0.method2207();
        this.method1001(arg0);
    }

    @ObfuscatedName("aj.o(Ldl;)V")
    public final void method1001(class107 arg0) {
        this.field1111 = arg0.method2123();
        this.field1106 = new int[this.field1111];
        this.field1112 = new int[this.field1111];
        for (int var2 = 0; var2 < this.field1111; var2++) {
            this.field1106[var2] = arg0.method2232();
            this.field1112[var2] = arg0.method2232();
        }
    }

    @ObfuscatedName("aj.y()V")
    public final void method1002() {
        this.field1107 = 0;
        this.field1108 = 0;
        this.field1113 = 0;
        this.field1114 = 0;
        this.field1115 = 0;
    }

    @ObfuscatedName("aj.b(I)I")
    public final int method1003(int arg0) {
        if (this.field1115 >= this.field1107) {
            this.field1114 = this.field1112[this.field1108++] << 15;
            if (this.field1108 >= this.field1111) {
                this.field1108 = this.field1111 - 1;
            }
            this.field1107 = (int) ((double) this.field1106[this.field1108] / 65536.0D * (double) arg0);
            if (this.field1107 > this.field1115) {
                this.field1113 = ((this.field1112[this.field1108] << 15) - this.field1114) / (this.field1107 - this.field1115);
            }
        }
        this.field1114 += this.field1113;
        this.field1115++;
        return this.field1114 - this.field1113 >> 15;
    }
}
