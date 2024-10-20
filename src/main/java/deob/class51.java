package deob;

@ObfuscatedName("as")
public class class51 {

    @ObfuscatedName("as.i")
    public int field1112 = 2;

    @ObfuscatedName("as.c")
    public int[] field1107 = new int[2];

    @ObfuscatedName("as.h")
    public int[] field1109 = new int[2];

    @ObfuscatedName("as.v")
    public int field1111;

    @ObfuscatedName("as.q")
    public int field1110;

    @ObfuscatedName("as.s")
    public int field1108;

    @ObfuscatedName("as.g")
    public int field1114;

    @ObfuscatedName("as.u")
    public int field1113;

    @ObfuscatedName("as.d")
    public int field1106;

    @ObfuscatedName("as.y")
    public int field1116;

    @ObfuscatedName("as.e")
    public int field1115;

    public class51() {
        this.field1107[0] = 0;
        this.field1107[1] = 65535;
        this.field1109[0] = 0;
        this.field1109[1] = 65535;
    }

    @ObfuscatedName("as.i(Ldm;)V")
    public final void method1030(class107 arg0) {
        this.field1108 = arg0.method2151();
        this.field1111 = arg0.method2156();
        this.field1110 = arg0.method2156();
        this.method1042(arg0);
    }

    @ObfuscatedName("as.c(Ldm;)V")
    public final void method1042(class107 arg0) {
        this.field1112 = arg0.method2151();
        this.field1107 = new int[this.field1112];
        this.field1109 = new int[this.field1112];
        for (int var2 = 0; var2 < this.field1112; var2++) {
            this.field1107[var2] = arg0.method2313();
            this.field1109[var2] = arg0.method2313();
        }
    }

    @ObfuscatedName("as.h()V")
    public final void method1031() {
        this.field1114 = 0;
        this.field1113 = 0;
        this.field1106 = 0;
        this.field1115 = 0;
        this.field1116 = 0;
    }

    @ObfuscatedName("as.v(I)I")
    public final int method1038(int arg0) {
        if (this.field1116 >= this.field1114) {
            this.field1115 = this.field1109[this.field1113++] << 15;
            if (this.field1113 >= this.field1112) {
                this.field1113 = this.field1112 - 1;
            }
            this.field1114 = (int) ((double) this.field1107[this.field1113] / 65536.0D * (double) arg0);
            if (this.field1114 > this.field1116) {
                this.field1106 = ((this.field1109[this.field1113] << 15) - this.field1115) / (this.field1114 - this.field1116);
            }
        }
        this.field1115 += this.field1106;
        this.field1116++;
        return this.field1115 - this.field1106 >> 15;
    }
}
