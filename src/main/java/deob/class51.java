package deob;

@ObfuscatedName("ac")
public class class51 {

    @ObfuscatedName("ac.z")
    public int field1070 = 2;

    @ObfuscatedName("ac.j")
    public int[] field1067 = new int[2];

    @ObfuscatedName("ac.a")
    public int[] field1074 = new int[2];

    @ObfuscatedName("ac.y")
    public int field1072;

    @ObfuscatedName("ac.i")
    public int field1069;

    @ObfuscatedName("ac.b")
    public int field1068;

    @ObfuscatedName("ac.s")
    public int field1071;

    @ObfuscatedName("ac.q")
    public int field1076;

    @ObfuscatedName("ac.p")
    public int field1073;

    @ObfuscatedName("ac.h")
    public int field1066;

    @ObfuscatedName("ac.r")
    public int field1075;

    public class51() {
        this.field1067[0] = 0;
        this.field1067[1] = 65535;
        this.field1074[0] = 0;
        this.field1074[1] = 65535;
    }

    @ObfuscatedName("ac.z(Ldq;)V")
    public final void method1000(class107 arg0) {
        this.field1071 = arg0.method2122();
        this.field1069 = arg0.method2127();
        this.field1068 = arg0.method2127();
        this.method1002(arg0);
    }

    @ObfuscatedName("ac.j(Ldq;)V")
    public final void method1002(class107 arg0) {
        this.field1070 = arg0.method2122();
        this.field1067 = new int[this.field1070];
        this.field1074 = new int[this.field1070];
        for (int var2 = 0; var2 < this.field1070; var2++) {
            this.field1067[var2] = arg0.method2239();
            this.field1074[var2] = arg0.method2239();
        }
    }

    @ObfuscatedName("ac.a()V")
    public final void method1001() {
        this.field1076 = 0;
        this.field1073 = 0;
        this.field1066 = 0;
        this.field1075 = 0;
        this.field1072 = 0;
    }

    @ObfuscatedName("ac.y(I)I")
    public final int method1003(int arg0) {
        if (this.field1072 >= this.field1076) {
            this.field1075 = this.field1074[this.field1073++] << 15;
            if (this.field1073 >= this.field1070) {
                this.field1073 = this.field1070 - 1;
            }
            this.field1076 = (int) ((double) this.field1067[this.field1073] / 65536.0D * (double) arg0);
            if (this.field1076 > this.field1072) {
                this.field1066 = ((this.field1074[this.field1073] << 15) - this.field1075) / (this.field1076 - this.field1072);
            }
        }
        this.field1075 += this.field1066;
        this.field1072++;
        return this.field1075 - this.field1066 >> 15;
    }
}
