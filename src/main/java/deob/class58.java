package deob;

@ObfuscatedName("bd")
public class class58 {

    @ObfuscatedName("bd.e")
    public int field1181 = 2;

    @ObfuscatedName("bd.w")
    public int[] field1172 = new int[2];

    @ObfuscatedName("bd.f")
    public int[] field1171 = new int[2];

    @ObfuscatedName("bd.s")
    public int field1180;

    @ObfuscatedName("bd.p")
    public int field1175;

    @ObfuscatedName("bd.h")
    public int field1176;

    @ObfuscatedName("bd.g")
    public int field1177;

    @ObfuscatedName("bd.a")
    public int field1178;

    @ObfuscatedName("bd.r")
    public int field1179;

    @ObfuscatedName("bd.k")
    public int field1173;

    @ObfuscatedName("bd.m")
    public int field1174;

    public class58() {
        this.field1172[0] = 0;
        this.field1172[1] = 65535;
        this.field1171[0] = 0;
        this.field1171[1] = 65535;
    }

    @ObfuscatedName("bd.e(Ldq;)V")
    public final void method1187(class120 arg0) {
        this.field1176 = arg0.method2355();
        this.field1180 = arg0.method2360();
        this.field1175 = arg0.method2360();
        this.method1189(arg0);
    }

    @ObfuscatedName("bd.w(Ldq;)V")
    public final void method1189(class120 arg0) {
        this.field1181 = arg0.method2355();
        this.field1172 = new int[this.field1181];
        this.field1171 = new int[this.field1181];
        for (int var2 = 0; var2 < this.field1181; var2++) {
            this.field1172[var2] = arg0.method2532();
            this.field1171[var2] = arg0.method2532();
        }
    }

    @ObfuscatedName("bd.f()V")
    public final void method1183() {
        this.field1177 = 0;
        this.field1178 = 0;
        this.field1179 = 0;
        this.field1173 = 0;
        this.field1174 = 0;
    }

    @ObfuscatedName("bd.s(I)I")
    public final int method1184(int arg0) {
        if (this.field1174 >= this.field1177) {
            this.field1173 = this.field1171[this.field1178++] << 15;
            if (this.field1178 >= this.field1181) {
                this.field1178 = this.field1181 - 1;
            }
            this.field1177 = (int) ((double) this.field1172[this.field1178] / 65536.0D * (double) arg0);
            if (this.field1177 > this.field1174) {
                this.field1179 = ((this.field1171[this.field1178] << 15) - this.field1173) / (this.field1177 - this.field1174);
            }
        }
        this.field1173 += this.field1179;
        this.field1174++;
        return this.field1173 - this.field1179 >> 15;
    }
}
