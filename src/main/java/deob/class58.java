package deob;

@ObfuscatedName("br")
public class class58 {

    @ObfuscatedName("br.s")
    public int field1211 = 2;

    @ObfuscatedName("br.j")
    public int[] field1215 = new int[2];

    @ObfuscatedName("br.p")
    public int[] field1206 = new int[2];

    @ObfuscatedName("br.d")
    public int field1209;

    @ObfuscatedName("br.u")
    public int field1210;

    @ObfuscatedName("br.o")
    public int field1207;

    @ObfuscatedName("br.b")
    public int field1212;

    @ObfuscatedName("br.k")
    public int field1213;

    @ObfuscatedName("br.c")
    public int field1214;

    @ObfuscatedName("br.l")
    public int field1208;

    @ObfuscatedName("br.t")
    public int field1216;

    public class58() {
        this.field1215[0] = 0;
        this.field1215[1] = 65535;
        this.field1206[0] = 0;
        this.field1206[1] = 65535;
    }

    @ObfuscatedName("br.s(Lds;)V")
    public final void method1167(class120 arg0) {
        this.field1207 = arg0.method2338();
        this.field1209 = arg0.method2343();
        this.field1210 = arg0.method2343();
        this.method1168(arg0);
    }

    @ObfuscatedName("br.j(Lds;)V")
    public final void method1168(class120 arg0) {
        this.field1211 = arg0.method2338();
        this.field1215 = new int[this.field1211];
        this.field1206 = new int[this.field1211];
        for (int var2 = 0; var2 < this.field1211; var2++) {
            this.field1215[var2] = arg0.method2430();
            this.field1206[var2] = arg0.method2430();
        }
    }

    @ObfuscatedName("br.p()V")
    public final void method1169() {
        this.field1212 = 0;
        this.field1213 = 0;
        this.field1214 = 0;
        this.field1208 = 0;
        this.field1216 = 0;
    }

    @ObfuscatedName("br.x(I)I")
    public final int method1170(int arg0) {
        if (this.field1216 >= this.field1212) {
            this.field1208 = this.field1206[this.field1213++] << 15;
            if (this.field1213 >= this.field1211) {
                this.field1213 = this.field1211 - 1;
            }
            this.field1212 = (int) ((double) this.field1215[this.field1213] / 65536.0D * (double) arg0);
            if (this.field1212 > this.field1216) {
                this.field1214 = ((this.field1206[this.field1213] << 15) - this.field1208) / (this.field1212 - this.field1216);
            }
        }
        this.field1208 += this.field1214;
        this.field1216++;
        return this.field1208 - this.field1214 >> 15;
    }
}
