package deob;

@ObfuscatedName("bu")
public class class59 {

    @ObfuscatedName("bu.o")
    public int field1073 = 2;

    @ObfuscatedName("bu.m")
    public int[] field1065 = new int[2];

    @ObfuscatedName("bu.b")
    public int[] field1066 = new int[2];

    @ObfuscatedName("bu.g")
    public int field1067;

    @ObfuscatedName("bu.h")
    public int field1068;

    @ObfuscatedName("bu.v")
    public int field1064;

    @ObfuscatedName("bu.l")
    public int field1070;

    @ObfuscatedName("bu.c")
    public int field1071;

    @ObfuscatedName("bu.u")
    public int field1072;

    @ObfuscatedName("bu.k")
    public int field1069;

    @ObfuscatedName("bu.z")
    public int field1074;

    public class59() {
        this.field1065[0] = 0;
        this.field1065[1] = 65535;
        this.field1066[0] = 0;
        this.field1066[1] = 65535;
    }

    @ObfuscatedName("bu.o(Lez;)V")
    public final void method1060(class154 arg0) {
        this.field1064 = arg0.method2552();
        this.field1067 = arg0.method2557();
        this.field1068 = arg0.method2557();
        this.method1061(arg0);
    }

    @ObfuscatedName("bu.m(Lez;)V")
    public final void method1061(class154 arg0) {
        this.field1073 = arg0.method2552();
        this.field1065 = new int[this.field1073];
        this.field1066 = new int[this.field1073];
        for (int var2 = 0; var2 < this.field1073; var2++) {
            this.field1065[var2] = arg0.method2554();
            this.field1066[var2] = arg0.method2554();
        }
    }

    @ObfuscatedName("bu.b()V")
    public final void method1064() {
        this.field1070 = 0;
        this.field1071 = 0;
        this.field1072 = 0;
        this.field1069 = 0;
        this.field1074 = 0;
    }

    @ObfuscatedName("bu.g(I)I")
    public final int method1063(int arg0) {
        if (this.field1074 >= this.field1070) {
            this.field1069 = this.field1066[this.field1071++] << 15;
            if (this.field1071 >= this.field1073) {
                this.field1071 = this.field1073 - 1;
            }
            this.field1070 = (int) ((double) this.field1065[this.field1071] / 65536.0D * (double) arg0);
            if (this.field1070 > this.field1074) {
                this.field1072 = ((this.field1066[this.field1071] << 15) - this.field1069) / (this.field1070 - this.field1074);
            }
        }
        this.field1069 += this.field1072;
        this.field1074++;
        return this.field1069 - this.field1072 >> 15;
    }
}
