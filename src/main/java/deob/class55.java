package deob;

@ObfuscatedName("bk")
public class class55 {

    @ObfuscatedName("bk.v")
    public int field1166 = 2;

    @ObfuscatedName("bk.f")
    public int[] field1165 = new int[2];

    @ObfuscatedName("bk.n")
    public int[] field1173 = new int[2];

    @ObfuscatedName("bk.c")
    public int field1168;

    @ObfuscatedName("bk.r")
    public int field1169;

    @ObfuscatedName("bk.k")
    public int field1170;

    @ObfuscatedName("bk.e")
    public int field1167;

    @ObfuscatedName("bk.q")
    public int field1172;

    @ObfuscatedName("bk.u")
    public int field1174;

    @ObfuscatedName("bk.s")
    public int field1171;

    @ObfuscatedName("bk.l")
    public int field1175;

    public class55() {
        this.field1165[0] = 0;
        this.field1165[1] = 65535;
        this.field1173[0] = 0;
        this.field1173[1] = 65535;
    }

    @ObfuscatedName("bk.v(Ldr;)V")
    public final void method1271(class126 arg0) {
        this.field1170 = arg0.method2466();
        this.field1168 = arg0.method2500();
        this.field1169 = arg0.method2500();
        this.method1272(arg0);
    }

    @ObfuscatedName("bk.f(Ldr;)V")
    public final void method1272(class126 arg0) {
        this.field1166 = arg0.method2466();
        this.field1165 = new int[this.field1166];
        this.field1173 = new int[this.field1166];
        for (int var2 = 0; var2 < this.field1166; var2++) {
            this.field1165[var2] = arg0.method2468();
            this.field1173[var2] = arg0.method2468();
        }
    }

    @ObfuscatedName("bk.n()V")
    public final void method1273() {
        this.field1167 = 0;
        this.field1172 = 0;
        this.field1174 = 0;
        this.field1171 = 0;
        this.field1175 = 0;
    }

    @ObfuscatedName("bk.c(I)I")
    public final int method1274(int arg0) {
        if (this.field1175 >= this.field1167) {
            this.field1171 = this.field1173[this.field1172++] << 15;
            if (this.field1172 >= this.field1166) {
                this.field1172 = this.field1166 - 1;
            }
            this.field1167 = (int) ((double) this.field1165[this.field1172] / 65536.0D * (double) arg0);
            if (this.field1167 > this.field1175) {
                this.field1174 = ((this.field1173[this.field1172] << 15) - this.field1171) / (this.field1167 - this.field1175);
            }
        }
        this.field1171 += this.field1174;
        this.field1175++;
        return this.field1171 - this.field1174 >> 15;
    }
}
