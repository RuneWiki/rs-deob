package deob;

@ObfuscatedName("bp")
public class class58 {

    @ObfuscatedName("bp.n")
    public int field1185 = 2;

    @ObfuscatedName("bp.d")
    public int[] field1186 = new int[2];

    @ObfuscatedName("bp.s")
    public int[] field1187 = new int[2];

    @ObfuscatedName("bp.q")
    public int field1188;

    @ObfuscatedName("bp.j")
    public int field1189;

    @ObfuscatedName("bp.k")
    public int field1190;

    @ObfuscatedName("bp.i")
    public int field1192;

    @ObfuscatedName("bp.m")
    public int field1194;

    @ObfuscatedName("bp.p")
    public int field1193;

    @ObfuscatedName("bp.h")
    public int field1191;

    @ObfuscatedName("bp.e")
    public int field1195;

    public class58() {
        this.field1186[0] = 0;
        this.field1186[1] = 65535;
        this.field1187[0] = 0;
        this.field1187[1] = 65535;
    }

    @ObfuscatedName("bp.n(Ldq;)V")
    public final void method1166(class119 arg0) {
        this.field1190 = arg0.method2338();
        this.field1188 = arg0.method2343();
        this.field1189 = arg0.method2343();
        this.method1165(arg0);
    }

    @ObfuscatedName("bp.d(Ldq;)V")
    public final void method1165(class119 arg0) {
        this.field1185 = arg0.method2338();
        this.field1186 = new int[this.field1185];
        this.field1187 = new int[this.field1185];
        for (int var2 = 0; var2 < this.field1185; var2++) {
            this.field1186[var2] = arg0.method2377();
            this.field1187[var2] = arg0.method2377();
        }
    }

    @ObfuscatedName("bp.s()V")
    public final void method1174() {
        this.field1192 = 0;
        this.field1194 = 0;
        this.field1193 = 0;
        this.field1191 = 0;
        this.field1195 = 0;
    }

    @ObfuscatedName("bp.q(I)I")
    public final int method1169(int arg0) {
        if (this.field1195 >= this.field1192) {
            this.field1191 = this.field1187[this.field1194++] << 15;
            if (this.field1194 >= this.field1185) {
                this.field1194 = this.field1185 - 1;
            }
            this.field1192 = (int) ((double) this.field1186[this.field1194] / 65536.0D * (double) arg0);
            if (this.field1192 > this.field1195) {
                this.field1193 = ((this.field1187[this.field1194] << 15) - this.field1191) / (this.field1192 - this.field1195);
            }
        }
        this.field1191 += this.field1193;
        this.field1195++;
        return this.field1191 - this.field1193 >> 15;
    }
}
