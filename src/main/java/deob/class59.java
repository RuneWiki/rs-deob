package deob;

@ObfuscatedName("bo")
public class class59 {

    @ObfuscatedName("bo.n")
    public int field1060 = 2;

    @ObfuscatedName("bo.d")
    public int[] field1058 = new int[2];

    @ObfuscatedName("bo.m")
    public int[] field1057 = new int[2];

    @ObfuscatedName("bo.h")
    public int field1059;

    @ObfuscatedName("bo.w")
    public int field1064;

    @ObfuscatedName("bo.r")
    public int field1062;

    @ObfuscatedName("bo.c")
    public int field1063;

    @ObfuscatedName("bo.p")
    public int field1061;

    @ObfuscatedName("bo.g")
    public int field1065;

    @ObfuscatedName("bo.z")
    public int field1066;

    @ObfuscatedName("bo.q")
    public int field1067;

    public class59() {
        this.field1058[0] = 0;
        this.field1058[1] = 65535;
        this.field1057[0] = 0;
        this.field1057[1] = 65535;
    }

    @ObfuscatedName("bo.n(Lfa;)V")
    public final void method1063(class161 arg0) {
        this.field1062 = arg0.method2823();
        this.field1059 = arg0.method2785();
        this.field1064 = arg0.method2785();
        this.method1064(arg0);
    }

    @ObfuscatedName("bo.d(Lfa;)V")
    public final void method1064(class161 arg0) {
        this.field1060 = arg0.method2823();
        this.field1058 = new int[this.field1060];
        this.field1057 = new int[this.field1060];
        for (int var2 = 0; var2 < this.field1060; var2++) {
            this.field1058[var2] = arg0.method2887();
            this.field1057[var2] = arg0.method2887();
        }
    }

    @ObfuscatedName("bo.m()V")
    public final void method1065() {
        this.field1063 = 0;
        this.field1061 = 0;
        this.field1065 = 0;
        this.field1066 = 0;
        this.field1067 = 0;
    }

    @ObfuscatedName("bo.h(I)I")
    public final int method1066(int arg0) {
        if (this.field1067 >= this.field1063) {
            this.field1066 = this.field1057[this.field1061++] << 15;
            if (this.field1061 >= this.field1060) {
                this.field1061 = this.field1060 - 1;
            }
            this.field1063 = (int) ((double) this.field1058[this.field1061] / 65536.0D * (double) arg0);
            if (this.field1063 > this.field1067) {
                this.field1065 = ((this.field1057[this.field1061] << 15) - this.field1066) / (this.field1063 - this.field1067);
            }
        }
        this.field1066 += this.field1065;
        this.field1067++;
        return this.field1066 - this.field1065 >> 15;
    }
}
