package deob;

@ObfuscatedName("bf")
public class class56 {

    @ObfuscatedName("bf.i")
    public int field1189 = 2;

    @ObfuscatedName("bf.p")
    public int[] field1190 = new int[2];

    @ObfuscatedName("bf.a")
    public int[] field1191 = new int[2];

    @ObfuscatedName("bf.l")
    public int field1197;

    @ObfuscatedName("bf.q")
    public int field1193;

    @ObfuscatedName("bf.b")
    public int field1195;

    @ObfuscatedName("bf.u")
    public int field1192;

    @ObfuscatedName("bf.d")
    public int field1196;

    @ObfuscatedName("bf.m")
    public int field1194;

    @ObfuscatedName("bf.v")
    public int field1198;

    @ObfuscatedName("bf.j")
    public int field1199;

    public class56() {
        this.field1190[0] = 0;
        this.field1190[1] = 65535;
        this.field1191[0] = 0;
        this.field1191[1] = 65535;
    }

    @ObfuscatedName("bf.i(Ldn;)V")
    public final void method1204(class127 arg0) {
        this.field1195 = arg0.method2411();
        this.field1197 = arg0.method2416();
        this.field1193 = arg0.method2416();
        this.method1198(arg0);
    }

    @ObfuscatedName("bf.p(Ldn;)V")
    public final void method1198(class127 arg0) {
        this.field1189 = arg0.method2411();
        this.field1190 = new int[this.field1189];
        this.field1191 = new int[this.field1189];
        for (int var2 = 0; var2 < this.field1189; var2++) {
            this.field1190[var2] = arg0.method2413();
            this.field1191[var2] = arg0.method2413();
        }
    }

    @ObfuscatedName("bf.a()V")
    public final void method1199() {
        this.field1192 = 0;
        this.field1196 = 0;
        this.field1194 = 0;
        this.field1198 = 0;
        this.field1199 = 0;
    }

    @ObfuscatedName("bf.l(I)I")
    public final int method1200(int arg0) {
        if (this.field1199 >= this.field1192) {
            this.field1198 = this.field1191[this.field1196++] << 15;
            if (this.field1196 >= this.field1189) {
                this.field1196 = this.field1189 - 1;
            }
            this.field1192 = (int) ((double) this.field1190[this.field1196] / 65536.0D * (double) arg0);
            if (this.field1192 > this.field1199) {
                this.field1194 = ((this.field1191[this.field1196] << 15) - this.field1198) / (this.field1192 - this.field1199);
            }
        }
        this.field1198 += this.field1194;
        this.field1199++;
        return this.field1198 - this.field1194 >> 15;
    }
}
