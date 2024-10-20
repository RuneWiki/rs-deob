package deob;

@ObfuscatedName("by")
public class class56 {

    @ObfuscatedName("by.a")
    public int field1173 = 2;

    @ObfuscatedName("by.r")
    public int[] field1174 = new int[2];

    @ObfuscatedName("by.u")
    public int[] field1171 = new int[2];

    @ObfuscatedName("by.t")
    public int field1172;

    @ObfuscatedName("by.k")
    public int field1169;

    @ObfuscatedName("by.v")
    public int field1170;

    @ObfuscatedName("by.g")
    public int field1175;

    @ObfuscatedName("by.n")
    public int field1176;

    @ObfuscatedName("by.q")
    public int field1177;

    @ObfuscatedName("by.i")
    public int field1178;

    @ObfuscatedName("by.p")
    public int field1179;

    public class56() {
        this.field1174[0] = 0;
        this.field1174[1] = 65535;
        this.field1171[0] = 0;
        this.field1171[1] = 65535;
    }

    @ObfuscatedName("by.a(Ldf;)V")
    public final void method1173(class126 arg0) {
        this.field1170 = arg0.method2481();
        this.field1172 = arg0.method2383();
        this.field1169 = arg0.method2383();
        this.method1174(arg0);
    }

    @ObfuscatedName("by.r(Ldf;)V")
    public final void method1174(class126 arg0) {
        this.field1173 = arg0.method2481();
        this.field1174 = new int[this.field1173];
        this.field1171 = new int[this.field1173];
        for (int var2 = 0; var2 < this.field1173; var2++) {
            this.field1174[var2] = arg0.method2373();
            this.field1171[var2] = arg0.method2373();
        }
    }

    @ObfuscatedName("by.u()V")
    public final void method1187() {
        this.field1175 = 0;
        this.field1176 = 0;
        this.field1177 = 0;
        this.field1178 = 0;
        this.field1179 = 0;
    }

    @ObfuscatedName("by.t(I)I")
    public final int method1176(int arg0) {
        if (this.field1179 >= this.field1175) {
            this.field1178 = this.field1171[this.field1176++] << 15;
            if (this.field1176 >= this.field1173) {
                this.field1176 = this.field1173 - 1;
            }
            this.field1175 = (int) ((double) this.field1174[this.field1176] / 65536.0D * (double) arg0);
            if (this.field1175 > this.field1179) {
                this.field1177 = ((this.field1171[this.field1176] << 15) - this.field1178) / (this.field1175 - this.field1179);
            }
        }
        this.field1178 += this.field1177;
        this.field1179++;
        return this.field1178 - this.field1177 >> 15;
    }
}
