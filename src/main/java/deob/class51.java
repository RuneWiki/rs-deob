package deob;

@ObfuscatedName("as")
public class class51 {

    @ObfuscatedName("as.j")
    public int field1108 = 2;

    @ObfuscatedName("as.z")
    public int[] field1110 = new int[2];

    @ObfuscatedName("as.y")
    public int field1105;

    @ObfuscatedName("as.h")
    public int[] field1103 = new int[2];

    @ObfuscatedName("as.r")
    public int field1106;

    @ObfuscatedName("as.e")
    public int field1107;

    @ObfuscatedName("as.k")
    public int field1104;

    @ObfuscatedName("as.b")
    public int field1109;

    @ObfuscatedName("as.n")
    public int field1113;

    @ObfuscatedName("as.a")
    public int field1111;

    @ObfuscatedName("as.q")
    public int field1112;

    public class51() {
        this.field1110[0] = 0;
        this.field1110[1] = 65535;
        this.field1103[0] = 0;
        this.field1103[1] = 65535;
    }

    @ObfuscatedName("as.j(Lde;)V")
    public final void method1006(class107 arg0) {
        this.field1104 = arg0.method2130();
        this.field1106 = arg0.method2135();
        this.field1107 = arg0.method2135();
        this.method1019(arg0);
    }

    @ObfuscatedName("as.z(Lde;)V")
    public final void method1019(class107 arg0) {
        this.field1108 = arg0.method2130();
        this.field1110 = new int[this.field1108];
        this.field1103 = new int[this.field1108];
        for (int var2 = 0; var2 < this.field1108; var2++) {
            this.field1110[var2] = arg0.method2132();
            this.field1103[var2] = arg0.method2132();
        }
    }

    @ObfuscatedName("as.y()V")
    public final void method1007() {
        this.field1109 = 0;
        this.field1113 = 0;
        this.field1111 = 0;
        this.field1112 = 0;
        this.field1105 = 0;
    }

    @ObfuscatedName("as.h(I)I")
    public final int method1009(int arg0) {
        if (this.field1105 >= this.field1109) {
            this.field1112 = this.field1103[this.field1113++] << 15;
            if (this.field1113 >= this.field1108) {
                this.field1113 = this.field1108 - 1;
            }
            this.field1109 = (int) ((double) this.field1110[this.field1113] / 65536.0D * (double) arg0);
            if (this.field1109 > this.field1105) {
                this.field1111 = ((this.field1103[this.field1113] << 15) - this.field1112) / (this.field1109 - this.field1105);
            }
        }
        this.field1112 += this.field1111;
        this.field1105++;
        return this.field1112 - this.field1111 >> 15;
    }
}
