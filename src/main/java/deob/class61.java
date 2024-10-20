package deob;

@ObfuscatedName("bz")
public class class61 {

    @ObfuscatedName("bz.r")
    public int field1249 = 2;

    @ObfuscatedName("bz.j")
    public int[] field1255 = new int[2];

    @ObfuscatedName("bz.z")
    public int[] field1247 = new int[2];

    @ObfuscatedName("bz.i")
    public int field1248;

    @ObfuscatedName("bz.b")
    public int field1252;

    @ObfuscatedName("bz.l")
    public int field1250;

    @ObfuscatedName("bz.m")
    public int field1246;

    @ObfuscatedName("bz.p")
    public int field1251;

    @ObfuscatedName("bz.f")
    public int field1245;

    @ObfuscatedName("bz.d")
    public int field1254;

    @ObfuscatedName("bz.v")
    public int field1253;

    public class61() {
        this.field1255[0] = 0;
        this.field1255[1] = 65535;
        this.field1247[0] = 0;
        this.field1247[1] = 65535;
    }

    @ObfuscatedName("bz.x(Ldp;)V")
    public final void method1258(class123 arg0) {
        this.field1250 = arg0.method2408();
        this.field1248 = arg0.method2413();
        this.field1252 = arg0.method2413();
        this.method1250(arg0);
    }

    @ObfuscatedName("bz.r(Ldp;)V")
    public final void method1250(class123 arg0) {
        this.field1249 = arg0.method2408();
        this.field1255 = new int[this.field1249];
        this.field1247 = new int[this.field1249];
        for (int var2 = 0; var2 < this.field1249; var2++) {
            this.field1255[var2] = arg0.method2403();
            this.field1247[var2] = arg0.method2403();
        }
    }

    @ObfuscatedName("bz.j()V")
    public final void method1251() {
        this.field1246 = 0;
        this.field1251 = 0;
        this.field1245 = 0;
        this.field1254 = 0;
        this.field1253 = 0;
    }

    @ObfuscatedName("bz.z(I)I")
    public final int method1252(int arg0) {
        if (this.field1253 >= this.field1246) {
            this.field1254 = this.field1247[this.field1251++] << 15;
            if (this.field1251 >= this.field1249) {
                this.field1251 = this.field1249 - 1;
            }
            this.field1246 = (int) ((double) this.field1255[this.field1251] / 65536.0D * (double) arg0);
            if (this.field1246 > this.field1253) {
                this.field1245 = ((this.field1247[this.field1251] << 15) - this.field1254) / (this.field1246 - this.field1253);
            }
        }
        this.field1254 += this.field1245;
        this.field1253++;
        return this.field1254 - this.field1245 >> 15;
    }
}
