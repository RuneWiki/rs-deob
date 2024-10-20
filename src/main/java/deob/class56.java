package deob;

@ObfuscatedName("bw")
public class class56 {

    @ObfuscatedName("bw.i")
    public int field1193 = 2;

    @ObfuscatedName("bw.v")
    public int[] field1190 = new int[2];

    @ObfuscatedName("bw.m")
    public int[] field1191 = new int[2];

    @ObfuscatedName("bw.j")
    public int field1192;

    @ObfuscatedName("bw.o")
    public int field1198;

    @ObfuscatedName("bw.l")
    public int field1194;

    @ObfuscatedName("bw.g")
    public int field1195;

    @ObfuscatedName("bw.w")
    public int field1196;

    @ObfuscatedName("bw.c")
    public int field1197;

    @ObfuscatedName("bw.z")
    public int field1189;

    @ObfuscatedName("bw.f")
    public int field1199;

    public class56() {
        this.field1190[0] = 0;
        this.field1190[1] = 65535;
        this.field1191[0] = 0;
        this.field1191[1] = 65535;
    }

    @ObfuscatedName("bw.i(Lda;)V")
    public final void method1267(class127 arg0) {
        this.field1194 = arg0.method2491();
        this.field1192 = arg0.method2668();
        this.field1198 = arg0.method2668();
        this.method1269(arg0);
    }

    @ObfuscatedName("bw.v(Lda;)V")
    public final void method1269(class127 arg0) {
        this.field1193 = arg0.method2491();
        this.field1190 = new int[this.field1193];
        this.field1191 = new int[this.field1193];
        for (int var2 = 0; var2 < this.field1193; var2++) {
            this.field1190[var2] = arg0.method2493();
            this.field1191[var2] = arg0.method2493();
        }
    }

    @ObfuscatedName("bw.m()V")
    public final void method1271() {
        this.field1195 = 0;
        this.field1196 = 0;
        this.field1197 = 0;
        this.field1189 = 0;
        this.field1199 = 0;
    }

    @ObfuscatedName("bw.j(I)I")
    public final int method1268(int arg0) {
        if (this.field1199 >= this.field1195) {
            this.field1189 = this.field1191[this.field1196++] << 15;
            if (this.field1196 >= this.field1193) {
                this.field1196 = this.field1193 - 1;
            }
            this.field1195 = (int) ((double) this.field1190[this.field1196] / 65536.0D * (double) arg0);
            if (this.field1195 > this.field1199) {
                this.field1197 = ((this.field1191[this.field1196] << 15) - this.field1189) / (this.field1195 - this.field1199);
            }
        }
        this.field1189 += this.field1197;
        this.field1199++;
        return this.field1189 - this.field1197 >> 15;
    }
}
