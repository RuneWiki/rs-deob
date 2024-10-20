package deob;

@ObfuscatedName("ba")
public class class56 {

    @ObfuscatedName("ba.p")
    public int field1191 = 2;

    @ObfuscatedName("ba.i")
    public int[] field1190 = new int[2];

    @ObfuscatedName("ba.o")
    public int[] field1192 = new int[2];

    @ObfuscatedName("ba.n")
    public int field1193;

    @ObfuscatedName("ba.l")
    public int field1199;

    @ObfuscatedName("ba.v")
    public int field1194;

    @ObfuscatedName("ba.g")
    public int field1195;

    @ObfuscatedName("ba.c")
    public int field1196;

    @ObfuscatedName("ba.f")
    public int field1197;

    @ObfuscatedName("ba.r")
    public int field1198;

    @ObfuscatedName("ba.d")
    public int field1189;

    public class56() {
        this.field1190[0] = 0;
        this.field1190[1] = 65535;
        this.field1192[0] = 0;
        this.field1192[1] = 65535;
    }

    @ObfuscatedName("ba.p(Ldt;)V")
    public final void method1267(class127 arg0) {
        this.field1194 = arg0.method2659();
        this.field1193 = arg0.method2551();
        this.field1199 = arg0.method2551();
        this.method1268(arg0);
    }

    @ObfuscatedName("ba.i(Ldt;)V")
    public final void method1268(class127 arg0) {
        this.field1191 = arg0.method2659();
        this.field1190 = new int[this.field1191];
        this.field1192 = new int[this.field1191];
        for (int var2 = 0; var2 < this.field1191; var2++) {
            this.field1190[var2] = arg0.method2652();
            this.field1192[var2] = arg0.method2652();
        }
    }

    @ObfuscatedName("ba.o()V")
    public final void method1270() {
        this.field1195 = 0;
        this.field1196 = 0;
        this.field1197 = 0;
        this.field1198 = 0;
        this.field1189 = 0;
    }

    @ObfuscatedName("ba.n(I)I")
    public final int method1271(int arg0) {
        if (this.field1189 >= this.field1195) {
            this.field1198 = this.field1192[this.field1196++] << 15;
            if (this.field1196 >= this.field1191) {
                this.field1196 = this.field1191 - 1;
            }
            this.field1195 = (int) ((double) this.field1190[this.field1196] / 65536.0D * (double) arg0);
            if (this.field1195 > this.field1189) {
                this.field1197 = ((this.field1192[this.field1196] << 15) - this.field1198) / (this.field1195 - this.field1189);
            }
        }
        this.field1198 += this.field1197;
        this.field1189++;
        return this.field1198 - this.field1197 >> 15;
    }
}
