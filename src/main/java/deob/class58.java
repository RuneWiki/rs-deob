package deob;

@ObfuscatedName("bp")
public class class58 {

    @ObfuscatedName("bp.v")
    public int field1195 = 2;

    @ObfuscatedName("bp.f")
    public int[] field1196 = new int[2];

    @ObfuscatedName("bp.i")
    public int[] field1197 = new int[2];

    @ObfuscatedName("bp.d")
    public int field1203;

    @ObfuscatedName("bp.o")
    public int field1200;

    @ObfuscatedName("bp.c")
    public int field1198;

    @ObfuscatedName("bp.p")
    public int field1201;

    @ObfuscatedName("bp.j")
    public int field1202;

    @ObfuscatedName("bp.a")
    public int field1205;

    @ObfuscatedName("bp.y")
    public int field1199;

    @ObfuscatedName("bp.h")
    public int field1204;

    public class58() {
        this.field1196[0] = 0;
        this.field1196[1] = 65535;
        this.field1197[0] = 0;
        this.field1197[1] = 65535;
    }

    @ObfuscatedName("bp.v(Ldx;)V")
    public final void method1205(class119 arg0) {
        this.field1198 = arg0.method2400();
        this.field1203 = arg0.method2354();
        this.field1200 = arg0.method2354();
        this.method1194(arg0);
    }

    @ObfuscatedName("bp.f(Ldx;)V")
    public final void method1194(class119 arg0) {
        this.field1195 = arg0.method2400();
        this.field1196 = new int[this.field1195];
        this.field1197 = new int[this.field1195];
        for (int var2 = 0; var2 < this.field1195; var2++) {
            this.field1196[var2] = arg0.method2334();
            this.field1197[var2] = arg0.method2334();
        }
    }

    @ObfuscatedName("bp.i()V")
    public final void method1195() {
        this.field1201 = 0;
        this.field1202 = 0;
        this.field1205 = 0;
        this.field1204 = 0;
        this.field1199 = 0;
    }

    @ObfuscatedName("bp.d(I)I")
    public final int method1196(int arg0) {
        if (this.field1199 >= this.field1201) {
            this.field1204 = this.field1197[this.field1202++] << 15;
            if (this.field1202 >= this.field1195) {
                this.field1202 = this.field1195 - 1;
            }
            this.field1201 = (int) ((double) this.field1196[this.field1202] / 65536.0D * (double) arg0);
            if (this.field1201 > this.field1199) {
                this.field1205 = ((this.field1197[this.field1202] << 15) - this.field1204) / (this.field1201 - this.field1199);
            }
        }
        this.field1204 += this.field1205;
        this.field1199++;
        return this.field1204 - this.field1205 >> 15;
    }
}
