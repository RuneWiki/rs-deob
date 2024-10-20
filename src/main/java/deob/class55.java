package deob;

@ObfuscatedName("bz")
public class class55 {

    @ObfuscatedName("bz.p")
    public int field1180 = 2;

    @ObfuscatedName("bz.j")
    public int[] field1184 = new int[2];

    @ObfuscatedName("bz.w")
    public int[] field1179 = new int[2];

    @ObfuscatedName("bz.h")
    public int field1182;

    @ObfuscatedName("bz.v")
    public int field1183;

    @ObfuscatedName("bz.k")
    public int field1181;

    @ObfuscatedName("bz.g")
    public int field1185;

    @ObfuscatedName("bz.n")
    public int field1186;

    @ObfuscatedName("bz.c")
    public int field1187;

    @ObfuscatedName("bz.o")
    public int field1188;

    @ObfuscatedName("bz.u")
    public int field1189;

    public class55() {
        this.field1184[0] = 0;
        this.field1184[1] = 65535;
        this.field1179[0] = 0;
        this.field1179[1] = 65535;
    }

    @ObfuscatedName("bz.p(Ldv;)V")
    public final void method1211(class126 arg0) {
        this.field1181 = arg0.method2544();
        this.field1182 = arg0.method2380();
        this.field1183 = arg0.method2380();
        this.method1212(arg0);
    }

    @ObfuscatedName("bz.j(Ldv;)V")
    public final void method1212(class126 arg0) {
        this.field1180 = arg0.method2544();
        this.field1184 = new int[this.field1180];
        this.field1179 = new int[this.field1180];
        for (int var2 = 0; var2 < this.field1180; var2++) {
            this.field1184[var2] = arg0.method2489();
            this.field1179[var2] = arg0.method2489();
        }
    }

    @ObfuscatedName("bz.w()V")
    public final void method1203() {
        this.field1185 = 0;
        this.field1186 = 0;
        this.field1187 = 0;
        this.field1188 = 0;
        this.field1189 = 0;
    }

    @ObfuscatedName("bz.h(I)I")
    public final int method1205(int arg0) {
        if (this.field1189 >= this.field1185) {
            this.field1188 = this.field1179[this.field1186++] << 15;
            if (this.field1186 >= this.field1180) {
                this.field1186 = this.field1180 - 1;
            }
            this.field1185 = (int) ((double) this.field1184[this.field1186] / 65536.0D * (double) arg0);
            if (this.field1185 > this.field1189) {
                this.field1187 = ((this.field1179[this.field1186] << 15) - this.field1188) / (this.field1185 - this.field1189);
            }
        }
        this.field1188 += this.field1187;
        this.field1189++;
        return this.field1188 - this.field1187 >> 15;
    }
}
