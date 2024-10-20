package deob;

@ObfuscatedName("bp")
public final class class78 extends class136 {

    @ObfuscatedName("bp.f")
    public int field1096;

    @ObfuscatedName("bp.i")
    public int field1087;

    @ObfuscatedName("bp.y")
    public class259 field1092;

    @ObfuscatedName("bp.w")
    public int field1088;

    @ObfuscatedName("bp.p")
    public int field1086;

    @ObfuscatedName("bp.b")
    public int field1090;

    @ObfuscatedName("bp.e")
    public int field1091;

    @ObfuscatedName("bp.x")
    public int field1089 = 0;

    @ObfuscatedName("bp.a")
    public int field1094 = 0;

    @ObfuscatedName("bp.d")
    public boolean field1095 = false;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1096 = arg0;
        this.field1088 = arg1;
        this.field1086 = arg2;
        this.field1090 = arg3;
        this.field1091 = arg4;
        this.field1087 = arg5 + arg6;
        int var8 = class244.method3267(this.field1096).field3215;
        if (var8 == -1) {
            this.field1095 = true;
        } else {
            this.field1095 = false;
            this.field1092 = class259.method209(var8);
        }
    }

    @ObfuscatedName("bp.f(IB)V")
    public final void method1854(int arg0) {
        if (this.field1095) {
            return;
        }
        this.field1094 += arg0;
        while (this.field1094 > this.field1092.field3485[this.field1089]) {
            this.field1094 -= this.field1092.field3485[this.field1089];
            this.field1089++;
            if (this.field1089 >= this.field1092.field3483.length) {
                this.field1095 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bp.a(I)Ldw;")
    public final class128 method1101() {
        class244 var1 = class244.method3267(this.field1096);
        class128 var2;
        if (this.field1095) {
            var2 = var1.method4025(-1);
        } else {
            var2 = var1.method4025(this.field1089);
        }
        return var2 == null ? null : var2;
    }
}
