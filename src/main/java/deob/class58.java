package deob;

@ObfuscatedName("br")
public class class58 {

    @ObfuscatedName("br.d")
    public int field1205 = 2;

    @ObfuscatedName("br.p")
    public int[] field1202 = new int[2];

    @ObfuscatedName("br.v")
    public int[] field1211 = new int[2];

    @ObfuscatedName("br.l")
    public int field1201;

    @ObfuscatedName("br.y")
    public int field1203;

    @ObfuscatedName("br.w")
    public int field1204;

    @ObfuscatedName("br.u")
    public int field1206;

    @ObfuscatedName("br.a")
    public int field1207;

    @ObfuscatedName("br.e")
    public int field1208;

    @ObfuscatedName("br.b")
    public int field1209;

    @ObfuscatedName("br.o")
    public int field1210;

    public class58() {
        this.field1202[0] = 0;
        this.field1202[1] = 65535;
        this.field1211[0] = 0;
        this.field1211[1] = 65535;
    }

    @ObfuscatedName("br.d(Ldf;)V")
    public final void method1191(class119 arg0) {
        this.field1206 = arg0.method2357();
        this.field1201 = arg0.method2362();
        this.field1204 = arg0.method2362();
        this.method1199(arg0);
    }

    @ObfuscatedName("br.p(Ldf;)V")
    public final void method1199(class119 arg0) {
        this.field1205 = arg0.method2357();
        this.field1202 = new int[this.field1205];
        this.field1211 = new int[this.field1205];
        for (int var2 = 0; var2 < this.field1205; var2++) {
            this.field1202[var2] = arg0.method2359();
            this.field1211[var2] = arg0.method2359();
        }
    }

    @ObfuscatedName("br.v()V")
    public final void method1193() {
        this.field1207 = 0;
        this.field1208 = 0;
        this.field1209 = 0;
        this.field1210 = 0;
        this.field1203 = 0;
    }

    @ObfuscatedName("br.l(I)I")
    public final int method1194(int arg0) {
        if (this.field1203 >= this.field1207) {
            this.field1210 = this.field1211[this.field1208++] << 15;
            if (this.field1208 >= this.field1205) {
                this.field1208 = this.field1205 - 1;
            }
            this.field1207 = (int) ((double) this.field1202[this.field1208] / 65536.0D * (double) arg0);
            if (this.field1207 > this.field1203) {
                this.field1209 = ((this.field1211[this.field1208] << 15) - this.field1210) / (this.field1207 - this.field1203);
            }
        }
        this.field1210 += this.field1209;
        this.field1203++;
        return this.field1210 - this.field1209 >> 15;
    }
}
