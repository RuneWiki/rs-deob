package deob;

@ObfuscatedName("br")
public class class56 {

    @ObfuscatedName("br.j")
    public int field1189 = 2;

    @ObfuscatedName("br.f")
    public int[] field1197 = new int[2];

    @ObfuscatedName("br.o")
    public int[] field1190 = new int[2];

    @ObfuscatedName("br.h")
    public int field1191;

    @ObfuscatedName("br.u")
    public int field1192;

    @ObfuscatedName("br.a")
    public int field1188;

    @ObfuscatedName("br.q")
    public int field1194;

    @ObfuscatedName("br.t")
    public int field1195;

    @ObfuscatedName("br.n")
    public int field1196;

    @ObfuscatedName("br.i")
    public int field1193;

    @ObfuscatedName("br.c")
    public int field1198;

    public class56() {
        this.field1197[0] = 0;
        this.field1197[1] = 65535;
        this.field1190[0] = 0;
        this.field1190[1] = 65535;
    }

    @ObfuscatedName("br.j(Ldq;)V")
    public final void method1252(class127 arg0) {
        this.field1188 = arg0.method2464();
        this.field1191 = arg0.method2508();
        this.field1192 = arg0.method2508();
        this.method1244(arg0);
    }

    @ObfuscatedName("br.f(Ldq;)V")
    public final void method1244(class127 arg0) {
        this.field1189 = arg0.method2464();
        this.field1197 = new int[this.field1189];
        this.field1190 = new int[this.field1189];
        for (int var2 = 0; var2 < this.field1189; var2++) {
            this.field1197[var2] = arg0.method2582();
            this.field1190[var2] = arg0.method2582();
        }
    }

    @ObfuscatedName("br.o()V")
    public final void method1247() {
        this.field1194 = 0;
        this.field1195 = 0;
        this.field1196 = 0;
        this.field1193 = 0;
        this.field1198 = 0;
    }

    @ObfuscatedName("br.h(I)I")
    public final int method1243(int arg0) {
        if (this.field1198 >= this.field1194) {
            this.field1193 = this.field1190[this.field1195++] << 15;
            if (this.field1195 >= this.field1189) {
                this.field1195 = this.field1189 - 1;
            }
            this.field1194 = (int) ((double) this.field1197[this.field1195] / 65536.0D * (double) arg0);
            if (this.field1194 > this.field1198) {
                this.field1196 = ((this.field1190[this.field1195] << 15) - this.field1193) / (this.field1194 - this.field1198);
            }
        }
        this.field1193 += this.field1196;
        this.field1198++;
        return this.field1193 - this.field1196 >> 15;
    }
}
