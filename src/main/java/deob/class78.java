package deob;

@ObfuscatedName("bp")
public final class class78 extends class136 {

    @ObfuscatedName("bp.a")
    public int field1100;

    @ObfuscatedName("bp.t")
    public int field1089;

    @ObfuscatedName("bp.n")
    public int field1090;

    @ObfuscatedName("bp.q")
    public int field1091;

    @ObfuscatedName("bp.v")
    public int field1092;

    @ObfuscatedName("bp.l")
    public int field1093;

    @ObfuscatedName("bp.c")
    public class259 field1101;

    @ObfuscatedName("bp.o")
    public int field1094 = 0;

    @ObfuscatedName("bp.i")
    public int field1096 = 0;

    @ObfuscatedName("bp.d")
    public boolean field1097 = false;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1100 = arg0;
        this.field1090 = arg1;
        this.field1091 = arg2;
        this.field1092 = arg3;
        this.field1093 = arg4;
        this.field1089 = arg5 + arg6;
        int var8 = class244.method1992(this.field1100).field3225;
        if (var8 == -1) {
            this.field1097 = true;
        } else {
            this.field1097 = false;
            this.field1101 = class259.method3856(var8);
        }
    }

    @ObfuscatedName("bp.a(IB)V")
    public final void method1946(int arg0) {
        if (this.field1097) {
            return;
        }
        this.field1096 += arg0;
        while (this.field1096 > this.field1101.field3511[this.field1094]) {
            this.field1096 -= this.field1101.field3511[this.field1094];
            this.field1094++;
            if (this.field1094 >= this.field1101.field3521.length) {
                this.field1097 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bp.i(B)Ldv;")
    public final class128 method1159() {
        class244 var1 = class244.method1992(this.field1100);
        class128 var2;
        if (this.field1097) {
            var2 = var1.method4119(-1);
        } else {
            var2 = var1.method4119(this.field1094);
        }
        return var2 == null ? null : var2;
    }
}
