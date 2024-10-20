package deob;

@ObfuscatedName("bi")
public class class53 {

    @ObfuscatedName("bi.n")
    public int field1156 = 2;

    @ObfuscatedName("bi.g")
    public int[] field1162 = new int[2];

    @ObfuscatedName("bi.a")
    public int[] field1157 = new int[2];

    @ObfuscatedName("bi.m")
    public int field1159;

    @ObfuscatedName("bi.s")
    public int field1155;

    @ObfuscatedName("bi.j")
    public int field1160;

    @ObfuscatedName("bi.f")
    public int field1161;

    @ObfuscatedName("bi.b")
    public int field1163;

    @ObfuscatedName("bi.t")
    public int field1158;

    @ObfuscatedName("bi.i")
    public int field1164;

    @ObfuscatedName("bi.c")
    public int field1165;

    public class53() {
        this.field1162[0] = 0;
        this.field1162[1] = 65535;
        this.field1157[0] = 0;
        this.field1157[1] = 65535;
    }

    @ObfuscatedName("bi.n(Ldp;)V")
    public final void method1081(class111 arg0) {
        this.field1160 = arg0.method2211();
        this.field1159 = arg0.method2366();
        this.field1155 = arg0.method2366();
        this.method1080(arg0);
    }

    @ObfuscatedName("bi.g(Ldp;)V")
    public final void method1080(class111 arg0) {
        this.field1156 = arg0.method2211();
        this.field1162 = new int[this.field1156];
        this.field1157 = new int[this.field1156];
        for (int var2 = 0; var2 < this.field1156; var2++) {
            this.field1162[var2] = arg0.method2395();
            this.field1157[var2] = arg0.method2395();
        }
    }

    @ObfuscatedName("bi.a()V")
    public final void method1078() {
        this.field1161 = 0;
        this.field1163 = 0;
        this.field1158 = 0;
        this.field1164 = 0;
        this.field1165 = 0;
    }

    @ObfuscatedName("bi.m(I)I")
    public final int method1082(int arg0) {
        if (this.field1165 >= this.field1161) {
            this.field1164 = this.field1157[this.field1163++] << 15;
            if (this.field1163 >= this.field1156) {
                this.field1163 = this.field1156 - 1;
            }
            this.field1161 = (int) ((double) this.field1162[this.field1163] / 65536.0D * (double) arg0);
            if (this.field1161 > this.field1165) {
                this.field1158 = ((this.field1157[this.field1163] << 15) - this.field1164) / (this.field1161 - this.field1165);
            }
        }
        this.field1164 += this.field1158;
        this.field1165++;
        return this.field1164 - this.field1158 >> 15;
    }
}
