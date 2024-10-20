package deob;

@ObfuscatedName("bc")
public final class class78 extends class136 {

    @ObfuscatedName("bc.s")
    public int field1086;

    @ObfuscatedName("bc.j")
    public int field1081;

    @ObfuscatedName("bc.i")
    public int field1082;

    @ObfuscatedName("bc.k")
    public int field1083;

    @ObfuscatedName("bc.u")
    public int field1084;

    @ObfuscatedName("bc.n")
    public int field1085;

    @ObfuscatedName("bc.t")
    public class259 field1092;

    @ObfuscatedName("bc.q")
    public int field1087 = 0;

    @ObfuscatedName("bc.x")
    public int field1088 = 0;

    @ObfuscatedName("bc.d")
    public boolean field1089 = false;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1086 = arg0;
        this.field1082 = arg1;
        this.field1083 = arg2;
        this.field1084 = arg3;
        this.field1085 = arg4;
        this.field1081 = arg5 + arg6;
        int var8 = class244.method1579(this.field1086).field3229;
        if (var8 == -1) {
            this.field1089 = true;
        } else {
            this.field1089 = false;
            this.field1092 = Statics.method3725(var8);
        }
    }

    @ObfuscatedName("bc.s(IS)V")
    public final void method1835(int arg0) {
        if (this.field1089) {
            return;
        }
        this.field1088 += arg0;
        while (this.field1088 > this.field1092.field3498[this.field1087]) {
            this.field1088 -= this.field1092.field3498[this.field1087];
            this.field1087++;
            if (this.field1087 >= this.field1092.field3496.length) {
                this.field1089 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bc.x(I)Ldo;")
    public final class128 method1064() {
        class244 var1 = class244.method1579(this.field1086);
        class128 var2;
        if (this.field1089) {
            var2 = var1.method4011(-1);
        } else {
            var2 = var1.method4011(this.field1087);
        }
        return var2 == null ? null : var2;
    }
}
