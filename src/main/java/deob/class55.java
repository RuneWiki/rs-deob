package deob;

@ObfuscatedName("bh")
public class class55 {

    @ObfuscatedName("bh.c")
    public int field1172 = 2;

    @ObfuscatedName("bh.j")
    public int[] field1168 = new int[2];

    @ObfuscatedName("bh.f")
    public int[] field1166 = new int[2];

    @ObfuscatedName("bh.y")
    public int field1176;

    @ObfuscatedName("bh.e")
    public int field1169;

    @ObfuscatedName("bh.m")
    public int field1167;

    @ObfuscatedName("bh.s")
    public int field1170;

    @ObfuscatedName("bh.p")
    public int field1171;

    @ObfuscatedName("bh.w")
    public int field1173;

    @ObfuscatedName("bh.r")
    public int field1174;

    @ObfuscatedName("bh.n")
    public int field1175;

    public class55() {
        this.field1168[0] = 0;
        this.field1168[1] = 65535;
        this.field1166[0] = 0;
        this.field1166[1] = 65535;
    }

    @ObfuscatedName("bh.c(Ldl;)V")
    public final void method1196(class125 arg0) {
        this.field1170 = arg0.method2326();
        this.field1169 = arg0.method2489();
        this.field1167 = arg0.method2489();
        this.method1202(arg0);
    }

    @ObfuscatedName("bh.j(Ldl;)V")
    public final void method1202(class125 arg0) {
        this.field1172 = arg0.method2326();
        this.field1168 = new int[this.field1172];
        this.field1166 = new int[this.field1172];
        for (int var2 = 0; var2 < this.field1172; var2++) {
            this.field1168[var2] = arg0.method2328();
            this.field1166[var2] = arg0.method2328();
        }
    }

    @ObfuscatedName("bh.f()V")
    public final void method1194() {
        this.field1171 = 0;
        this.field1173 = 0;
        this.field1174 = 0;
        this.field1175 = 0;
        this.field1176 = 0;
    }

    @ObfuscatedName("bh.y(I)I")
    public final int method1206(int arg0) {
        if (this.field1176 >= this.field1171) {
            this.field1175 = this.field1166[this.field1173++] << 15;
            if (this.field1173 >= this.field1172) {
                this.field1173 = this.field1172 - 1;
            }
            this.field1171 = (int) ((double) this.field1168[this.field1173] / 65536.0D * (double) arg0);
            if (this.field1171 > this.field1176) {
                this.field1174 = ((this.field1166[this.field1173] << 15) - this.field1175) / (this.field1171 - this.field1176);
            }
        }
        this.field1175 += this.field1174;
        this.field1176++;
        return this.field1175 - this.field1174 >> 15;
    }
}
