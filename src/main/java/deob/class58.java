package deob;

@ObfuscatedName("bh")
public class class58 {

    @ObfuscatedName("bh.y")
    public int field1202;

    @ObfuscatedName("bh.d")
    public int field1204 = 2;

    @ObfuscatedName("bh.g")
    public int[] field1198 = new int[2];

    @ObfuscatedName("bh.w")
    public int[] field1199 = new int[2];

    @ObfuscatedName("bh.e")
    public int field1200;

    @ObfuscatedName("bh.c")
    public int field1201;

    @ObfuscatedName("bh.a")
    public int field1207;

    @ObfuscatedName("bh.q")
    public int field1197;

    @ObfuscatedName("bh.m")
    public int field1206;

    @ObfuscatedName("bh.n")
    public int field1205;

    @ObfuscatedName("bh.k")
    public int field1203;

    public class58() {
        this.field1198[0] = 0;
        this.field1198[1] = 65535;
        this.field1199[0] = 0;
        this.field1199[1] = 65535;
    }

    @ObfuscatedName("bh.y(Ldd;)V")
    public final void method1195(class119 arg0) {
        this.field1207 = arg0.method2326();
        this.field1200 = arg0.method2331();
        this.field1201 = arg0.method2331();
        this.method1189(arg0);
    }

    @ObfuscatedName("bh.d(Ldd;)V")
    public final void method1189(class119 arg0) {
        this.field1204 = arg0.method2326();
        this.field1198 = new int[this.field1204];
        this.field1199 = new int[this.field1204];
        for (int var2 = 0; var2 < this.field1204; var2++) {
            this.field1198[var2] = arg0.method2525();
            this.field1199[var2] = arg0.method2525();
        }
    }

    @ObfuscatedName("bh.g()V")
    public final void method1191() {
        this.field1197 = 0;
        this.field1206 = 0;
        this.field1205 = 0;
        this.field1203 = 0;
        this.field1202 = 0;
    }

    @ObfuscatedName("bh.w(I)I")
    public final int method1193(int arg0) {
        if (this.field1202 >= this.field1197) {
            this.field1203 = this.field1199[this.field1206++] << 15;
            if (this.field1206 >= this.field1204) {
                this.field1206 = this.field1204 - 1;
            }
            this.field1197 = (int) ((double) this.field1198[this.field1206] / 65536.0D * (double) arg0);
            if (this.field1197 > this.field1202) {
                this.field1205 = ((this.field1199[this.field1206] << 15) - this.field1203) / (this.field1197 - this.field1202);
            }
        }
        this.field1203 += this.field1205;
        this.field1202++;
        return this.field1203 - this.field1205 >> 15;
    }
}
