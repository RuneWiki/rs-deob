package deob;

@ObfuscatedName("bp")
public class class58 {

    @ObfuscatedName("bp.f")
    public int field1204 = 2;

    @ObfuscatedName("bp.s")
    public int[] field1205 = new int[2];

    @ObfuscatedName("bp.q")
    public int[] field1211 = new int[2];

    @ObfuscatedName("bp.g")
    public int field1207;

    @ObfuscatedName("bp.m")
    public int field1208;

    @ObfuscatedName("bp.t")
    public int field1209;

    @ObfuscatedName("bp.j")
    public int field1206;

    @ObfuscatedName("bp.n")
    public int field1212;

    @ObfuscatedName("bp.l")
    public int field1210;

    @ObfuscatedName("bp.i")
    public int field1213;

    @ObfuscatedName("bp.w")
    public int field1214;

    public class58() {
        this.field1205[0] = 0;
        this.field1205[1] = 65535;
        this.field1211[0] = 0;
        this.field1211[1] = 65535;
    }

    @ObfuscatedName("bp.f(Ldn;)V")
    public final void method1202(class119 arg0) {
        this.field1209 = arg0.method2363();
        this.field1207 = arg0.method2368();
        this.field1208 = arg0.method2368();
        this.method1203(arg0);
    }

    @ObfuscatedName("bp.s(Ldn;)V")
    public final void method1203(class119 arg0) {
        this.field1204 = arg0.method2363();
        this.field1205 = new int[this.field1204];
        this.field1211 = new int[this.field1204];
        for (int var2 = 0; var2 < this.field1204; var2++) {
            this.field1205[var2] = arg0.method2353();
            this.field1211[var2] = arg0.method2353();
        }
    }

    @ObfuscatedName("bp.q()V")
    public final void method1204() {
        this.field1206 = 0;
        this.field1212 = 0;
        this.field1210 = 0;
        this.field1213 = 0;
        this.field1214 = 0;
    }

    @ObfuscatedName("bp.g(I)I")
    public final int method1206(int arg0) {
        if (this.field1214 >= this.field1206) {
            this.field1213 = this.field1211[this.field1212++] << 15;
            if (this.field1212 >= this.field1204) {
                this.field1212 = this.field1204 - 1;
            }
            this.field1206 = (int) ((double) this.field1205[this.field1212] / 65536.0D * (double) arg0);
            if (this.field1206 > this.field1214) {
                this.field1210 = ((this.field1211[this.field1212] << 15) - this.field1213) / (this.field1206 - this.field1214);
            }
        }
        this.field1213 += this.field1210;
        this.field1214++;
        return this.field1213 - this.field1210 >> 15;
    }
}
