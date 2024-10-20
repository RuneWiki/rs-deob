package deob;

@ObfuscatedName("ba")
public class class58 {

    @ObfuscatedName("ba.b")
    public int field1175 = 2;

    @ObfuscatedName("ba.g")
    public int[] field1171 = new int[2];

    @ObfuscatedName("ba.j")
    public int[] field1172 = new int[2];

    @ObfuscatedName("ba.d")
    public int field1173;

    @ObfuscatedName("ba.y")
    public int field1180;

    @ObfuscatedName("ba.r")
    public int field1174;

    @ObfuscatedName("ba.c")
    public int field1179;

    @ObfuscatedName("ba.l")
    public int field1176;

    @ObfuscatedName("ba.u")
    public int field1177;

    @ObfuscatedName("ba.p")
    public int field1178;

    @ObfuscatedName("ba.n")
    public int field1170;

    public class58() {
        this.field1171[0] = 0;
        this.field1171[1] = 65535;
        this.field1172[0] = 0;
        this.field1172[1] = 65535;
    }

    @ObfuscatedName("ba.b(Lds;)V")
    public final void method1186(class120 arg0) {
        this.field1179 = arg0.method2344();
        this.field1173 = arg0.method2349();
        this.field1174 = arg0.method2349();
        this.method1198(arg0);
    }

    @ObfuscatedName("ba.g(Lds;)V")
    public final void method1198(class120 arg0) {
        this.field1175 = arg0.method2344();
        this.field1171 = new int[this.field1175];
        this.field1172 = new int[this.field1175];
        for (int var2 = 0; var2 < this.field1175; var2++) {
            this.field1171[var2] = arg0.method2346();
            this.field1172[var2] = arg0.method2346();
        }
    }

    @ObfuscatedName("ba.j()V")
    public final void method1187() {
        this.field1176 = 0;
        this.field1177 = 0;
        this.field1178 = 0;
        this.field1170 = 0;
        this.field1180 = 0;
    }

    @ObfuscatedName("ba.d(I)I")
    public final int method1188(int arg0) {
        if (this.field1180 >= this.field1176) {
            this.field1170 = this.field1172[this.field1177++] << 15;
            if (this.field1177 >= this.field1175) {
                this.field1177 = this.field1175 - 1;
            }
            this.field1176 = (int) ((double) this.field1171[this.field1177] / 65536.0D * (double) arg0);
            if (this.field1176 > this.field1180) {
                this.field1178 = ((this.field1172[this.field1177] << 15) - this.field1170) / (this.field1176 - this.field1180);
            }
        }
        this.field1170 += this.field1178;
        this.field1180++;
        return this.field1170 - this.field1178 >> 15;
    }
}
