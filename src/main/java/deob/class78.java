package deob;

@ObfuscatedName("ba")
public final class class78 extends class136 {

    @ObfuscatedName("ba.q")
    public int field1117;

    @ObfuscatedName("ba.w")
    public int field1115;

    @ObfuscatedName("ba.e")
    public int field1125;

    @ObfuscatedName("ba.p")
    public int field1118;

    @ObfuscatedName("ba.k")
    public int field1114;

    @ObfuscatedName("ba.l")
    public int field1119;

    @ObfuscatedName("ba.b")
    public class259 field1120;

    @ObfuscatedName("ba.i")
    public int field1121 = 0;

    @ObfuscatedName("ba.c")
    public int field1122 = 0;

    @ObfuscatedName("ba.f")
    public boolean field1123 = false;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1117 = arg0;
        this.field1125 = arg1;
        this.field1118 = arg2;
        this.field1114 = arg3;
        this.field1119 = arg4;
        this.field1115 = arg5 + arg6;
        int var8 = class244.method3544(this.field1117).field3239;
        if (var8 == -1) {
            this.field1123 = true;
        } else {
            this.field1123 = false;
            this.field1120 = class259.method67(var8);
        }
    }

    @ObfuscatedName("ba.q(IB)V")
    public final void method1773(int arg0) {
        if (this.field1123) {
            return;
        }
        this.field1122 += arg0;
        while (this.field1122 > this.field1120.field3523[this.field1121]) {
            this.field1122 -= this.field1120.field3523[this.field1121];
            this.field1121++;
            if (this.field1121 >= this.field1120.field3521.length) {
                this.field1123 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ba.c(I)Ldm;")
    public final class128 method1087() {
        class244 var1 = class244.method3544(this.field1117);
        class128 var2;
        if (this.field1123) {
            var2 = var1.method4023(-1);
        } else {
            var2 = var1.method4023(this.field1121);
        }
        return var2 == null ? null : var2;
    }
}
