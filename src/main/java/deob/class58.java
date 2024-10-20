package deob;

@ObfuscatedName("bo")
public class class58 {

    @ObfuscatedName("bo.j")
    public int field1193 = 2;

    @ObfuscatedName("bo.h")
    public int[] field1184 = new int[2];

    @ObfuscatedName("bo.m")
    public int[] field1192 = new int[2];

    @ObfuscatedName("bo.z")
    public int field1185;

    @ObfuscatedName("bo.e")
    public int field1187;

    @ObfuscatedName("bo.i")
    public int field1188;

    @ObfuscatedName("bo.c")
    public int field1189;

    @ObfuscatedName("bo.n")
    public int field1186;

    @ObfuscatedName("bo.l")
    public int field1191;

    @ObfuscatedName("bo.u")
    public int field1183;

    @ObfuscatedName("bo.r")
    public int field1190;

    public class58() {
        this.field1184[0] = 0;
        this.field1184[1] = 65535;
        this.field1192[0] = 0;
        this.field1192[1] = 65535;
    }

    @ObfuscatedName("bo.j(Ldx;)V")
    public final void method1188(class120 arg0) {
        this.field1188 = arg0.method2361();
        this.field1185 = arg0.method2366();
        this.field1187 = arg0.method2366();
        this.method1189(arg0);
    }

    @ObfuscatedName("bo.h(Ldx;)V")
    public final void method1189(class120 arg0) {
        this.field1193 = arg0.method2361();
        this.field1184 = new int[this.field1193];
        this.field1192 = new int[this.field1193];
        for (int var2 = 0; var2 < this.field1193; var2++) {
            this.field1184[var2] = arg0.method2363();
            this.field1192[var2] = arg0.method2363();
        }
    }

    @ObfuscatedName("bo.m()V")
    public final void method1192() {
        this.field1189 = 0;
        this.field1186 = 0;
        this.field1191 = 0;
        this.field1183 = 0;
        this.field1190 = 0;
    }

    @ObfuscatedName("bo.z(I)I")
    public final int method1190(int arg0) {
        if (this.field1190 >= this.field1189) {
            this.field1183 = this.field1192[this.field1186++] << 15;
            if (this.field1186 >= this.field1193) {
                this.field1186 = this.field1193 - 1;
            }
            this.field1189 = (int) ((double) this.field1184[this.field1186] / 65536.0D * (double) arg0);
            if (this.field1189 > this.field1190) {
                this.field1191 = ((this.field1192[this.field1186] << 15) - this.field1183) / (this.field1189 - this.field1190);
            }
        }
        this.field1183 += this.field1191;
        this.field1190++;
        return this.field1183 - this.field1191 >> 15;
    }
}
