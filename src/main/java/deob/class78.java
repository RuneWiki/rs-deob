package deob;

@ObfuscatedName("bp")
public final class class78 extends class136 {

    @ObfuscatedName("bp.z")
    public int field1100;

    @ObfuscatedName("bp.n")
    public int field1106;

    @ObfuscatedName("bp.v")
    public int field1095;

    @ObfuscatedName("bp.u")
    public int field1102;

    @ObfuscatedName("bp.r")
    public int field1097;

    @ObfuscatedName("bp.p")
    public int field1098;

    @ObfuscatedName("bp.q")
    public class259 field1104;

    @ObfuscatedName("bp.m")
    public int field1101 = 0;

    @ObfuscatedName("bp.y")
    public int field1094 = 0;

    @ObfuscatedName("bp.i")
    public boolean field1103 = false;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1106 = arg0;
        this.field1102 = arg1;
        this.field1097 = arg2;
        this.field1098 = arg3;
        this.field1100 = arg4;
        this.field1095 = arg5 + arg6;
        int var8 = class244.method1038(this.field1106).field3224;
        if (var8 == -1) {
            this.field1103 = true;
        } else {
            this.field1103 = false;
            this.field1104 = class259.method122(var8);
        }
    }

    @ObfuscatedName("bp.z(IB)V")
    public final void method1841(int arg0) {
        if (this.field1103) {
            return;
        }
        this.field1094 += arg0;
        while (this.field1094 > this.field1104.field3507[this.field1101]) {
            this.field1094 -= this.field1104.field3507[this.field1101];
            this.field1101++;
            if (this.field1101 >= this.field1104.field3515.length) {
                this.field1103 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bp.y(I)Ldh;")
    public final class128 method1115() {
        class244 var1 = class244.method1038(this.field1106);
        class128 var2;
        if (this.field1103) {
            var2 = var1.method3979(-1);
        } else {
            var2 = var1.method3979(this.field1101);
        }
        return var2 == null ? null : var2;
    }
}
