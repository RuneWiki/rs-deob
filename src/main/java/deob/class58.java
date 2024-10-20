package deob;

@ObfuscatedName("bc")
public class class58 {

    @ObfuscatedName("bc.f")
    public int field1220 = 2;

    @ObfuscatedName("bc.u")
    public int[] field1212 = new int[2];

    @ObfuscatedName("bc.b")
    public int[] field1221 = new int[2];

    @ObfuscatedName("bc.l")
    public int field1214;

    @ObfuscatedName("bc.d")
    public int field1215;

    @ObfuscatedName("bc.n")
    public int field1211;

    @ObfuscatedName("bc.m")
    public int field1217;

    @ObfuscatedName("bc.g")
    public int field1218;

    @ObfuscatedName("bc.s")
    public int field1219;

    @ObfuscatedName("bc.r")
    public int field1216;

    @ObfuscatedName("bc.k")
    public int field1213;

    public class58() {
        this.field1212[0] = 0;
        this.field1212[1] = 65535;
        this.field1221[0] = 0;
        this.field1221[1] = 65535;
    }

    @ObfuscatedName("bc.f(Ldj;)V")
    public final void method1241(class120 arg0) {
        this.field1211 = arg0.method2385();
        this.field1214 = arg0.method2527();
        this.field1215 = arg0.method2527();
        this.method1248(arg0);
    }

    @ObfuscatedName("bc.u(Ldj;)V")
    public final void method1248(class120 arg0) {
        this.field1220 = arg0.method2385();
        this.field1212 = new int[this.field1220];
        this.field1221 = new int[this.field1220];
        for (int var2 = 0; var2 < this.field1220; var2++) {
            this.field1212[var2] = arg0.method2387();
            this.field1221[var2] = arg0.method2387();
        }
    }

    @ObfuscatedName("bc.x()V")
    public final void method1243() {
        this.field1217 = 0;
        this.field1218 = 0;
        this.field1219 = 0;
        this.field1216 = 0;
        this.field1213 = 0;
    }

    @ObfuscatedName("bc.b(I)I")
    public final int method1244(int arg0) {
        if (this.field1213 >= this.field1217) {
            this.field1216 = this.field1221[this.field1218++] << 15;
            if (this.field1218 >= this.field1220) {
                this.field1218 = this.field1220 - 1;
            }
            this.field1217 = (int) ((double) this.field1212[this.field1218] / 65536.0D * (double) arg0);
            if (this.field1217 > this.field1213) {
                this.field1219 = ((this.field1221[this.field1218] << 15) - this.field1216) / (this.field1217 - this.field1213);
            }
        }
        this.field1216 += this.field1219;
        this.field1213++;
        return this.field1216 - this.field1219 >> 15;
    }
}
