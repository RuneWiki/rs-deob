package deob;

@ObfuscatedName("bk")
public class class56 {

    @ObfuscatedName("bk.t")
    public int field1225 = 2;

    @ObfuscatedName("bk.l")
    public int[] field1229 = new int[2];

    @ObfuscatedName("bk.c")
    public int[] field1221 = new int[2];

    @ObfuscatedName("bk.d")
    public int field1222;

    @ObfuscatedName("bk.b")
    public int field1223;

    @ObfuscatedName("bk.i")
    public int field1224;

    @ObfuscatedName("bk.p")
    public int field1228;

    @ObfuscatedName("bk.y")
    public int field1219;

    @ObfuscatedName("bk.u")
    public int field1226;

    @ObfuscatedName("bk.z")
    public int field1227;

    @ObfuscatedName("bk.j")
    public int field1220;

    public class56() {
        this.field1229[0] = 0;
        this.field1229[1] = 65535;
        this.field1221[0] = 0;
        this.field1221[1] = 65535;
    }

    @ObfuscatedName("bk.t(Ldo;)V")
    public final void method1257(class127 arg0) {
        this.field1224 = arg0.method2438();
        this.field1222 = arg0.method2448();
        this.field1223 = arg0.method2448();
        this.method1258(arg0);
    }

    @ObfuscatedName("bk.l(Ldo;)V")
    public final void method1258(class127 arg0) {
        this.field1225 = arg0.method2438();
        this.field1229 = new int[this.field1225];
        this.field1221 = new int[this.field1225];
        for (int var2 = 0; var2 < this.field1225; var2++) {
            this.field1229[var2] = arg0.method2440();
            this.field1221[var2] = arg0.method2440();
        }
    }

    @ObfuscatedName("bk.c()V")
    public final void method1259() {
        this.field1228 = 0;
        this.field1226 = 0;
        this.field1227 = 0;
        this.field1220 = 0;
        this.field1219 = 0;
    }

    @ObfuscatedName("bk.d(I)I")
    public final int method1256(int arg0) {
        if (this.field1219 >= this.field1228) {
            this.field1220 = this.field1221[this.field1226++] << 15;
            if (this.field1226 >= this.field1225) {
                this.field1226 = this.field1225 - 1;
            }
            this.field1228 = (int) ((double) this.field1229[this.field1226] / 65536.0D * (double) arg0);
            if (this.field1228 > this.field1219) {
                this.field1227 = ((this.field1221[this.field1226] << 15) - this.field1220) / (this.field1228 - this.field1219);
            }
        }
        this.field1220 += this.field1227;
        this.field1219++;
        return this.field1220 - this.field1227 >> 15;
    }
}
