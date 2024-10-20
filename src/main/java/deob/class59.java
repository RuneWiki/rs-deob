package deob;

@ObfuscatedName("bm")
public class class59 {

    @ObfuscatedName("bm.p")
    public int field1067 = 2;

    @ObfuscatedName("bm.g")
    public int[] field1066 = new int[2];

    @ObfuscatedName("bm.q")
    public int[] field1071 = new int[2];

    @ObfuscatedName("bm.d")
    public int field1072;

    @ObfuscatedName("bm.k")
    public int field1069;

    @ObfuscatedName("bm.j")
    public int field1065;

    @ObfuscatedName("bm.s")
    public int field1070;

    @ObfuscatedName("bm.o")
    public int field1068;

    @ObfuscatedName("bm.a")
    public int field1073;

    @ObfuscatedName("bm.c")
    public int field1074;

    @ObfuscatedName("bm.m")
    public int field1075;

    public class59() {
        this.field1066[0] = 0;
        this.field1066[1] = 65535;
        this.field1071[0] = 0;
        this.field1071[1] = 65535;
    }

    @ObfuscatedName("bm.p(Lev;)V")
    public final void method1049(class154 arg0) {
        this.field1065 = arg0.method2593();
        this.field1072 = arg0.method2598();
        this.field1069 = arg0.method2598();
        this.method1047(arg0);
    }

    @ObfuscatedName("bm.g(Lev;)V")
    public final void method1047(class154 arg0) {
        this.field1067 = arg0.method2593();
        this.field1066 = new int[this.field1067];
        this.field1071 = new int[this.field1067];
        for (int var2 = 0; var2 < this.field1067; var2++) {
            this.field1066[var2] = arg0.method2595();
            this.field1071[var2] = arg0.method2595();
        }
    }

    @ObfuscatedName("bm.x()V")
    public final void method1057() {
        this.field1070 = 0;
        this.field1068 = 0;
        this.field1073 = 0;
        this.field1074 = 0;
        this.field1075 = 0;
    }

    @ObfuscatedName("bm.q(I)I")
    public final int method1055(int arg0) {
        if (this.field1075 >= this.field1070) {
            this.field1074 = this.field1071[this.field1068++] << 15;
            if (this.field1068 >= this.field1067) {
                this.field1068 = this.field1067 - 1;
            }
            this.field1070 = (int) ((double) this.field1066[this.field1068] / 65536.0D * (double) arg0);
            if (this.field1070 > this.field1075) {
                this.field1073 = ((this.field1071[this.field1068] << 15) - this.field1074) / (this.field1070 - this.field1075);
            }
        }
        this.field1074 += this.field1073;
        this.field1075++;
        return this.field1074 - this.field1073 >> 15;
    }
}
