package deob;

@ObfuscatedName("bt")
public class class53 {

    @ObfuscatedName("bt.y")
    public int field1138;

    @ObfuscatedName("bt.k")
    public int field1133 = 2;

    @ObfuscatedName("bt.g")
    public int[] field1129 = new int[2];

    @ObfuscatedName("bt.n")
    public int[] field1130 = new int[2];

    @ObfuscatedName("bt.t")
    public int field1131;

    @ObfuscatedName("bt.e")
    public int field1128;

    @ObfuscatedName("bt.q")
    public int field1134;

    @ObfuscatedName("bt.z")
    public int field1136;

    @ObfuscatedName("bt.v")
    public int field1135;

    @ObfuscatedName("bt.b")
    public int field1132;

    @ObfuscatedName("bt.f")
    public int field1137;

    public class53() {
        this.field1129[0] = 0;
        this.field1129[1] = 65535;
        this.field1130[0] = 0;
        this.field1130[1] = 65535;
    }

    @ObfuscatedName("bt.y(Ldw;)V")
    public final void method1084(class111 arg0) {
        this.field1134 = arg0.method2205();
        this.field1131 = arg0.method2165();
        this.field1128 = arg0.method2165();
        this.method1085(arg0);
    }

    @ObfuscatedName("bt.k(Ldw;)V")
    public final void method1085(class111 arg0) {
        this.field1133 = arg0.method2205();
        this.field1129 = new int[this.field1133];
        this.field1130 = new int[this.field1133];
        for (int var2 = 0; var2 < this.field1133; var2++) {
            this.field1129[var2] = arg0.method2339();
            this.field1130[var2] = arg0.method2339();
        }
    }

    @ObfuscatedName("bt.g()V")
    public final void method1091() {
        this.field1136 = 0;
        this.field1135 = 0;
        this.field1132 = 0;
        this.field1137 = 0;
        this.field1138 = 0;
    }

    @ObfuscatedName("bt.n(I)I")
    public final int method1087(int arg0) {
        if (this.field1138 >= this.field1136) {
            this.field1137 = this.field1130[this.field1135++] << 15;
            if (this.field1135 >= this.field1133) {
                this.field1135 = this.field1133 - 1;
            }
            this.field1136 = (int) ((double) this.field1129[this.field1135] / 65536.0D * (double) arg0);
            if (this.field1136 > this.field1138) {
                this.field1132 = ((this.field1130[this.field1135] << 15) - this.field1137) / (this.field1136 - this.field1138);
            }
        }
        this.field1137 += this.field1132;
        this.field1138++;
        return this.field1137 - this.field1132 >> 15;
    }
}
