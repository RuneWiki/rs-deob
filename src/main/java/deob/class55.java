package deob;

@ObfuscatedName("ba")
public class class55 {

    @ObfuscatedName("ba.j")
    public int field1169 = 2;

    @ObfuscatedName("ba.y")
    public int field1176;

    @ObfuscatedName("ba.z")
    public int[] field1167 = new int[2];

    @ObfuscatedName("ba.c")
    public int[] field1166 = new int[2];

    @ObfuscatedName("ba.e")
    public int field1175;

    @ObfuscatedName("ba.s")
    public int field1170;

    @ObfuscatedName("ba.i")
    public int field1168;

    @ObfuscatedName("ba.g")
    public int field1172;

    @ObfuscatedName("ba.q")
    public int field1173;

    @ObfuscatedName("ba.w")
    public int field1174;

    @ObfuscatedName("ba.k")
    public int field1171;

    public class55() {
        this.field1167[0] = 0;
        this.field1167[1] = 65535;
        this.field1166[0] = 0;
        this.field1166[1] = 65535;
    }

    @ObfuscatedName("ba.j(Ldr;)V")
    public final void method1223(class126 arg0) {
        this.field1168 = arg0.method2399();
        this.field1175 = arg0.method2387();
        this.field1170 = arg0.method2387();
        this.method1222(arg0);
    }

    @ObfuscatedName("ba.y(Ldr;)V")
    public final void method1222(class126 arg0) {
        this.field1169 = arg0.method2399();
        this.field1167 = new int[this.field1169];
        this.field1166 = new int[this.field1169];
        for (int var2 = 0; var2 < this.field1169; var2++) {
            this.field1167[var2] = arg0.method2405();
            this.field1166[var2] = arg0.method2405();
        }
    }

    @ObfuscatedName("ba.x()V")
    public final void method1214() {
        this.field1172 = 0;
        this.field1173 = 0;
        this.field1174 = 0;
        this.field1171 = 0;
        this.field1176 = 0;
    }

    @ObfuscatedName("ba.z(I)I")
    public final int method1220(int arg0) {
        if (this.field1176 >= this.field1172) {
            this.field1171 = this.field1166[this.field1173++] << 15;
            if (this.field1173 >= this.field1169) {
                this.field1173 = this.field1169 - 1;
            }
            this.field1172 = (int) ((double) this.field1167[this.field1173] / 65536.0D * (double) arg0);
            if (this.field1172 > this.field1176) {
                this.field1174 = ((this.field1166[this.field1173] << 15) - this.field1171) / (this.field1172 - this.field1176);
            }
        }
        this.field1171 += this.field1174;
        this.field1176++;
        return this.field1171 - this.field1174 >> 15;
    }
}
