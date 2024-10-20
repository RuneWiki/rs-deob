package deob;

@ObfuscatedName("bc")
public class class58 {

    @ObfuscatedName("bc.h")
    public int field1202 = 2;

    @ObfuscatedName("bc.q")
    public int[] field1199 = new int[2];

    @ObfuscatedName("bc.v")
    public int[] field1198 = new int[2];

    @ObfuscatedName("bc.n")
    public int field1201;

    @ObfuscatedName("bc.f")
    public int field1203;

    @ObfuscatedName("bc.g")
    public int field1200;

    @ObfuscatedName("bc.o")
    public int field1204;

    @ObfuscatedName("bc.s")
    public int field1205;

    @ObfuscatedName("bc.k")
    public int field1206;

    @ObfuscatedName("bc.b")
    public int field1207;

    @ObfuscatedName("bc.c")
    public int field1208;

    public class58() {
        this.field1199[0] = 0;
        this.field1199[1] = 65535;
        this.field1198[0] = 0;
        this.field1198[1] = 65535;
    }

    @ObfuscatedName("bc.h(Ldm;)V")
    public final void method1207(class119 arg0) {
        this.field1200 = arg0.method2383();
        this.field1201 = arg0.method2388();
        this.field1203 = arg0.method2388();
        this.method1202(arg0);
    }

    @ObfuscatedName("bc.q(Ldm;)V")
    public final void method1202(class119 arg0) {
        this.field1202 = arg0.method2383();
        this.field1199 = new int[this.field1202];
        this.field1198 = new int[this.field1202];
        for (int var2 = 0; var2 < this.field1202; var2++) {
            this.field1199[var2] = arg0.method2385();
            this.field1198[var2] = arg0.method2385();
        }
    }

    @ObfuscatedName("bc.v()V")
    public final void method1203() {
        this.field1204 = 0;
        this.field1205 = 0;
        this.field1206 = 0;
        this.field1207 = 0;
        this.field1208 = 0;
    }

    @ObfuscatedName("bc.n(I)I")
    public final int method1211(int arg0) {
        if (this.field1208 >= this.field1204) {
            this.field1207 = this.field1198[this.field1205++] << 15;
            if (this.field1205 >= this.field1202) {
                this.field1205 = this.field1202 - 1;
            }
            this.field1204 = (int) ((double) this.field1199[this.field1205] / 65536.0D * (double) arg0);
            if (this.field1204 > this.field1208) {
                this.field1206 = ((this.field1198[this.field1205] << 15) - this.field1207) / (this.field1204 - this.field1208);
            }
        }
        this.field1207 += this.field1206;
        this.field1208++;
        return this.field1207 - this.field1206 >> 15;
    }
}
