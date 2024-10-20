package deob;

@ObfuscatedName("bc")
public class class58 {

    @ObfuscatedName("bc.i")
    public int field1205 = 2;

    @ObfuscatedName("bc.v")
    public int[] field1196 = new int[2];

    @ObfuscatedName("bc.f")
    public int[] field1197 = new int[2];

    @ObfuscatedName("bc.h")
    public int field1199;

    @ObfuscatedName("bc.a")
    public int field1202;

    @ObfuscatedName("bc.s")
    public int field1200;

    @ObfuscatedName("bc.p")
    public int field1201;

    @ObfuscatedName("bc.r")
    public int field1204;

    @ObfuscatedName("bc.k")
    public int field1203;

    @ObfuscatedName("bc.d")
    public int field1195;

    @ObfuscatedName("bc.n")
    public int field1198;

    public class58() {
        this.field1196[0] = 0;
        this.field1196[1] = 65535;
        this.field1197[0] = 0;
        this.field1197[1] = 65535;
    }

    @ObfuscatedName("bc.i(Ldj;)V")
    public final void method1163(class119 arg0) {
        this.field1200 = arg0.method2310();
        this.field1199 = arg0.method2315();
        this.field1202 = arg0.method2315();
        this.method1161(arg0);
    }

    @ObfuscatedName("bc.v(Ldj;)V")
    public final void method1161(class119 arg0) {
        this.field1205 = arg0.method2310();
        this.field1196 = new int[this.field1205];
        this.field1197 = new int[this.field1205];
        for (int var2 = 0; var2 < this.field1205; var2++) {
            this.field1196[var2] = arg0.method2312();
            this.field1197[var2] = arg0.method2312();
        }
    }

    @ObfuscatedName("bc.f()V")
    public final void method1155() {
        this.field1201 = 0;
        this.field1204 = 0;
        this.field1203 = 0;
        this.field1195 = 0;
        this.field1198 = 0;
    }

    @ObfuscatedName("bc.h(I)I")
    public final int method1153(int arg0) {
        if (this.field1198 >= this.field1201) {
            this.field1195 = this.field1197[this.field1204++] << 15;
            if (this.field1204 >= this.field1205) {
                this.field1204 = this.field1205 - 1;
            }
            this.field1201 = (int) ((double) this.field1196[this.field1204] / 65536.0D * (double) arg0);
            if (this.field1201 > this.field1198) {
                this.field1203 = ((this.field1197[this.field1204] << 15) - this.field1195) / (this.field1201 - this.field1198);
            }
        }
        this.field1195 += this.field1203;
        this.field1198++;
        return this.field1195 - this.field1203 >> 15;
    }
}
