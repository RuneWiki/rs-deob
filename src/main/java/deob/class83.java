package deob;

@ObfuscatedName("ct")
public final class class83 extends class140 {

    @ObfuscatedName("ct.t")
    public int field1275;

    @ObfuscatedName("ct.q")
    public int field1267;

    @ObfuscatedName("ct.i")
    public int field1266;

    @ObfuscatedName("ct.a")
    public int field1269;

    @ObfuscatedName("ct.l")
    public int field1270;

    @ObfuscatedName("ct.b")
    public int field1271;

    @ObfuscatedName("ct.e")
    public class288 field1276;

    @ObfuscatedName("ct.x")
    public int field1273 = 0;

    @ObfuscatedName("ct.p")
    public int field1274 = 0;

    @ObfuscatedName("ct.g")
    public boolean field1272 = false;

    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1275 = arg0;
        this.field1266 = arg1;
        this.field1269 = arg2;
        this.field1270 = arg3;
        this.field1271 = arg4;
        this.field1267 = arg5 + arg6;
        int var8 = class273.method346(this.field1275).field3495;
        if (var8 == -1) {
            this.field1272 = true;
        } else {
            this.field1272 = false;
            this.field1276 = class288.method2932(var8);
        }
    }

    @ObfuscatedName("ct.t(IB)V")
    public final void method1732(int arg0) {
        if (this.field1272) {
            return;
        }
        this.field1274 += arg0;
        while (this.field1274 > this.field1276.field3762[this.field1273]) {
            this.field1274 -= this.field1276.field3762[this.field1273];
            this.field1273++;
            if (this.field1273 >= this.field1276.field3760.length) {
                this.field1272 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ct.p(B)Lek;")
    public final class132 method1098() {
        class273 var1 = class273.method346(this.field1275);
        class132 var2;
        if (this.field1272) {
            var2 = var1.method4420(-1);
        } else {
            var2 = var1.method4420(this.field1273);
        }
        return var2 == null ? null : var2;
    }
}
