package deob;

@ObfuscatedName("bs")
public class class56 {

    @ObfuscatedName("bs.j")
    public int field1175 = 2;

    @ObfuscatedName("bs.y")
    public int field1170;

    @ObfuscatedName("bs.z")
    public int[] field1178 = new int[2];

    @ObfuscatedName("bs.l")
    public int[] field1168 = new int[2];

    @ObfuscatedName("bs.w")
    public int field1171;

    @ObfuscatedName("bs.d")
    public int field1172;

    @ObfuscatedName("bs.f")
    public int field1173;

    @ObfuscatedName("bs.i")
    public int field1174;

    @ObfuscatedName("bs.a")
    public int field1169;

    @ObfuscatedName("bs.o")
    public int field1176;

    @ObfuscatedName("bs.u")
    public int field1177;

    public class56() {
        this.field1178[0] = 0;
        this.field1178[1] = 65535;
        this.field1168[0] = 0;
        this.field1168[1] = 65535;
    }

    @ObfuscatedName("bs.j(Lde;)V")
    public final void method1228(class114 arg0) {
        this.field1173 = arg0.method2322();
        this.field1171 = arg0.method2327();
        this.field1172 = arg0.method2327();
        this.method1230(arg0);
    }

    @ObfuscatedName("bs.y(Lde;)V")
    public final void method1230(class114 arg0) {
        this.field1175 = arg0.method2322();
        this.field1178 = new int[this.field1175];
        this.field1168 = new int[this.field1175];
        for (int var2 = 0; var2 < this.field1175; var2++) {
            this.field1178[var2] = arg0.method2324();
            this.field1168[var2] = arg0.method2324();
        }
    }

    @ObfuscatedName("bs.z()V")
    public final void method1231() {
        this.field1174 = 0;
        this.field1169 = 0;
        this.field1176 = 0;
        this.field1177 = 0;
        this.field1170 = 0;
    }

    @ObfuscatedName("bs.l(I)I")
    public final int method1233(int arg0) {
        if (this.field1170 >= this.field1174) {
            this.field1177 = this.field1168[this.field1169++] << 15;
            if (this.field1169 >= this.field1175) {
                this.field1169 = this.field1175 - 1;
            }
            this.field1174 = (int) ((double) this.field1178[this.field1169] / 65536.0D * (double) arg0);
            if (this.field1174 > this.field1170) {
                this.field1176 = ((this.field1168[this.field1169] << 15) - this.field1177) / (this.field1174 - this.field1170);
            }
        }
        this.field1177 += this.field1176;
        this.field1170++;
        return this.field1177 - this.field1176 >> 15;
    }
}
