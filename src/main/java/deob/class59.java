package deob;

@ObfuscatedName("bl")
public class class59 {

    @ObfuscatedName("bl.s")
    public int field1069 = 2;

    @ObfuscatedName("bl.c")
    public int[] field1066 = new int[2];

    @ObfuscatedName("bl.f")
    public int[] field1075 = new int[2];

    @ObfuscatedName("bl.h")
    public int field1068;

    @ObfuscatedName("bl.a")
    public int field1073;

    @ObfuscatedName("bl.g")
    public int field1070;

    @ObfuscatedName("bl.k")
    public int field1071;

    @ObfuscatedName("bl.u")
    public int field1072;

    @ObfuscatedName("bl.b")
    public int field1065;

    @ObfuscatedName("bl.r")
    public int field1074;

    @ObfuscatedName("bl.n")
    public int field1067;

    public class59() {
        this.field1066[0] = 0;
        this.field1066[1] = 65535;
        this.field1075[0] = 0;
        this.field1075[1] = 65535;
    }

    @ObfuscatedName("bl.s(Lea;)V")
    public final void method1027(class154 arg0) {
        this.field1070 = arg0.method2545();
        this.field1068 = arg0.method2550();
        this.field1073 = arg0.method2550();
        this.method1028(arg0);
    }

    @ObfuscatedName("bl.c(Lea;)V")
    public final void method1028(class154 arg0) {
        this.field1069 = arg0.method2545();
        this.field1066 = new int[this.field1069];
        this.field1075 = new int[this.field1069];
        for (int var2 = 0; var2 < this.field1069; var2++) {
            this.field1066[var2] = arg0.method2541();
            this.field1075[var2] = arg0.method2541();
        }
    }

    @ObfuscatedName("bl.f()V")
    public final void method1029() {
        this.field1071 = 0;
        this.field1072 = 0;
        this.field1065 = 0;
        this.field1074 = 0;
        this.field1067 = 0;
    }

    @ObfuscatedName("bl.g(I)I")
    public final int method1031(int arg0) {
        if (this.field1067 >= this.field1071) {
            this.field1074 = this.field1075[this.field1072++] << 15;
            if (this.field1072 >= this.field1069) {
                this.field1072 = this.field1069 - 1;
            }
            this.field1071 = (int) ((double) this.field1066[this.field1072] / 65536.0D * (double) arg0);
            if (this.field1071 > this.field1067) {
                this.field1065 = ((this.field1075[this.field1072] << 15) - this.field1074) / (this.field1071 - this.field1067);
            }
        }
        this.field1074 += this.field1065;
        this.field1067++;
        return this.field1074 - this.field1065 >> 15;
    }
}
