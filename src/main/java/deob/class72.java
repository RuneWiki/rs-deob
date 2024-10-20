package deob;

@ObfuscatedName("bx")
public final class class72 extends class130 {

    @ObfuscatedName("bx.g")
    public int field1093;

    @ObfuscatedName("bx.r")
    public int field1086;

    @ObfuscatedName("bx.e")
    public int field1087;

    @ObfuscatedName("bx.q")
    public int field1088;

    @ObfuscatedName("bx.c")
    public int field1089;

    @ObfuscatedName("bx.l")
    public int field1090;

    @ObfuscatedName("bx.b")
    public class276 field1091;

    @ObfuscatedName("bx.w")
    public int field1085 = 0;

    @ObfuscatedName("bx.n")
    public int field1095 = 0;

    @ObfuscatedName("bx.i")
    public boolean field1094 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1093 = arg0;
        this.field1087 = arg1;
        this.field1088 = arg2;
        this.field1089 = arg3;
        this.field1090 = arg4;
        this.field1086 = arg5 + arg6;
        int var8 = class261.method4525(this.field1093).field3349;
        if (var8 == -1) {
            this.field1094 = true;
        } else {
            this.field1094 = false;
            this.field1091 = class276.method493(var8);
        }
    }

    @ObfuscatedName("bx.g(IB)V")
    public final void method1845(int arg0) {
        if (this.field1094) {
            return;
        }
        this.field1095 += arg0;
        while (this.field1095 > this.field1091.field3631[this.field1085]) {
            this.field1095 -= this.field1091.field3631[this.field1085];
            this.field1085++;
            if (this.field1085 >= this.field1091.field3624.length) {
                this.field1094 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bx.d(I)Ldl;")
    public final class122 method1130() {
        class261 var1 = class261.method4525(this.field1093);
        class122 var2;
        if (this.field1094) {
            var2 = var1.method4680(-1);
        } else {
            var2 = var1.method4680(this.field1085);
        }
        return var2 == null ? null : var2;
    }
}
