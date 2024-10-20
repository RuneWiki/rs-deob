package deob;

@ObfuscatedName("bx")
public class class59 {

    @ObfuscatedName("bx.k")
    public int field1069 = 2;

    @ObfuscatedName("bx.y")
    public int field1074;

    @ObfuscatedName("bx.o")
    public int[] field1065 = new int[2];

    @ObfuscatedName("bx.r")
    public int[] field1066 = new int[2];

    @ObfuscatedName("bx.w")
    public int field1064;

    @ObfuscatedName("bx.j")
    public int field1068;

    @ObfuscatedName("bx.q")
    public int field1067;

    @ObfuscatedName("bx.d")
    public int field1073;

    @ObfuscatedName("bx.n")
    public int field1071;

    @ObfuscatedName("bx.c")
    public int field1072;

    @ObfuscatedName("bx.s")
    public int field1070;

    public class59() {
        this.field1065[0] = 0;
        this.field1065[1] = 65535;
        this.field1066[0] = 0;
        this.field1066[1] = 65535;
    }

    @ObfuscatedName("bx.k(Lfm;)V")
    public final void method1089(class161 arg0) {
        this.field1067 = arg0.method2733();
        this.field1064 = arg0.method2868();
        this.field1068 = arg0.method2868();
        this.method1081(arg0);
    }

    @ObfuscatedName("bx.y(Lfm;)V")
    public final void method1081(class161 arg0) {
        this.field1069 = arg0.method2733();
        this.field1065 = new int[this.field1069];
        this.field1066 = new int[this.field1069];
        for (int var2 = 0; var2 < this.field1069; var2++) {
            this.field1065[var2] = arg0.method2735();
            this.field1066[var2] = arg0.method2735();
        }
    }

    @ObfuscatedName("bx.o()V")
    public final void method1079() {
        this.field1073 = 0;
        this.field1071 = 0;
        this.field1072 = 0;
        this.field1070 = 0;
        this.field1074 = 0;
    }

    @ObfuscatedName("bx.r(I)I")
    public final int method1083(int arg0) {
        if (this.field1074 >= this.field1073) {
            this.field1070 = this.field1066[this.field1071++] << 15;
            if (this.field1071 >= this.field1069) {
                this.field1071 = this.field1069 - 1;
            }
            this.field1073 = (int) ((double) this.field1065[this.field1071] / 65536.0D * (double) arg0);
            if (this.field1073 > this.field1074) {
                this.field1072 = ((this.field1066[this.field1071] << 15) - this.field1070) / (this.field1073 - this.field1074);
            }
        }
        this.field1070 += this.field1072;
        this.field1074++;
        return this.field1070 - this.field1072 >> 15;
    }
}
