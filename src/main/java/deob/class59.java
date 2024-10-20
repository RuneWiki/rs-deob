package deob;

@ObfuscatedName("bb")
public class class59 {

    @ObfuscatedName("bb.u")
    public int field1061 = 2;

    @ObfuscatedName("bb.i")
    public int[] field1059 = new int[2];

    @ObfuscatedName("bb.a")
    public int[] field1060 = new int[2];

    @ObfuscatedName("bb.f")
    public int field1068;

    @ObfuscatedName("bb.c")
    public int field1062;

    @ObfuscatedName("bb.d")
    public int field1063;

    @ObfuscatedName("bb.l")
    public int field1064;

    @ObfuscatedName("bb.g")
    public int field1065;

    @ObfuscatedName("bb.z")
    public int field1067;

    @ObfuscatedName("bb.t")
    public int field1058;

    @ObfuscatedName("bb.m")
    public int field1066;

    public class59() {
        this.field1059[0] = 0;
        this.field1059[1] = 65535;
        this.field1060[0] = 0;
        this.field1060[1] = 65535;
    }

    @ObfuscatedName("bb.u(Len;)V")
    public final void method1049(class154 arg0) {
        this.field1063 = arg0.method2708();
        this.field1068 = arg0.method2593();
        this.field1062 = arg0.method2593();
        this.method1045(arg0);
    }

    @ObfuscatedName("bb.x(Len;)V")
    public final void method1045(class154 arg0) {
        this.field1061 = arg0.method2708();
        this.field1059 = new int[this.field1061];
        this.field1060 = new int[this.field1061];
        for (int var2 = 0; var2 < this.field1061; var2++) {
            this.field1059[var2] = arg0.method2581();
            this.field1060[var2] = arg0.method2581();
        }
    }

    @ObfuscatedName("bb.i()V")
    public final void method1046() {
        this.field1064 = 0;
        this.field1065 = 0;
        this.field1067 = 0;
        this.field1058 = 0;
        this.field1066 = 0;
    }

    @ObfuscatedName("bb.a(I)I")
    public final int method1047(int arg0) {
        if (this.field1066 >= this.field1064) {
            this.field1058 = this.field1060[this.field1065++] << 15;
            if (this.field1065 >= this.field1061) {
                this.field1065 = this.field1061 - 1;
            }
            this.field1064 = (int) ((double) this.field1059[this.field1065] / 65536.0D * (double) arg0);
            if (this.field1064 > this.field1066) {
                this.field1067 = ((this.field1060[this.field1065] << 15) - this.field1058) / (this.field1064 - this.field1066);
            }
        }
        this.field1058 += this.field1067;
        this.field1066++;
        return this.field1058 - this.field1067 >> 15;
    }
}
