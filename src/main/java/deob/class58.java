package deob;

@ObfuscatedName("bc")
public class class58 {

    @ObfuscatedName("bc.n")
    public int field1199 = 2;

    @ObfuscatedName("bc.q")
    public int[] field1193 = new int[2];

    @ObfuscatedName("bc.c")
    public int[] field1194 = new int[2];

    @ObfuscatedName("bc.l")
    public int field1196;

    @ObfuscatedName("bc.r")
    public int field1195;

    @ObfuscatedName("bc.u")
    public int field1197;

    @ObfuscatedName("bc.j")
    public int field1198;

    @ObfuscatedName("bc.w")
    public int field1192;

    @ObfuscatedName("bc.y")
    public int field1202;

    @ObfuscatedName("bc.o")
    public int field1200;

    @ObfuscatedName("bc.h")
    public int field1201;

    public class58() {
        this.field1193[0] = 0;
        this.field1193[1] = 65535;
        this.field1194[0] = 0;
        this.field1194[1] = 65535;
    }

    @ObfuscatedName("bc.n(Ldc;)V")
    public final void method1214(class119 arg0) {
        this.field1197 = arg0.method2360();
        this.field1196 = arg0.method2365();
        this.field1195 = arg0.method2365();
        this.method1209(arg0);
    }

    @ObfuscatedName("bc.q(Ldc;)V")
    public final void method1209(class119 arg0) {
        this.field1199 = arg0.method2360();
        this.field1193 = new int[this.field1199];
        this.field1194 = new int[this.field1199];
        for (int var2 = 0; var2 < this.field1199; var2++) {
            this.field1193[var2] = arg0.method2430();
            this.field1194[var2] = arg0.method2430();
        }
    }

    @ObfuscatedName("bc.c()V")
    public final void method1220() {
        this.field1198 = 0;
        this.field1192 = 0;
        this.field1200 = 0;
        this.field1201 = 0;
        this.field1202 = 0;
    }

    @ObfuscatedName("bc.l(I)I")
    public final int method1208(int arg0) {
        if (this.field1202 >= this.field1198) {
            this.field1201 = this.field1194[this.field1192++] << 15;
            if (this.field1192 >= this.field1199) {
                this.field1192 = this.field1199 - 1;
            }
            this.field1198 = (int) ((double) this.field1193[this.field1192] / 65536.0D * (double) arg0);
            if (this.field1198 > this.field1202) {
                this.field1200 = ((this.field1194[this.field1192] << 15) - this.field1201) / (this.field1198 - this.field1202);
            }
        }
        this.field1201 += this.field1200;
        this.field1202++;
        return this.field1201 - this.field1200 >> 15;
    }
}
