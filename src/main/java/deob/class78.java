package deob;

@ObfuscatedName("bk")
public final class class78 extends class136 {

    @ObfuscatedName("bk.u")
    public int field1110;

    @ObfuscatedName("bk.f")
    public int field1105;

    @ObfuscatedName("bk.b")
    public int field1106;

    @ObfuscatedName("bk.g")
    public int field1108;

    @ObfuscatedName("bk.z")
    public int field1109;

    @ObfuscatedName("bk.p")
    public int field1114;

    @ObfuscatedName("bk.h")
    public class259 field1115;

    @ObfuscatedName("bk.y")
    public int field1111 = 0;

    @ObfuscatedName("bk.w")
    public int field1112 = 0;

    @ObfuscatedName("bk.i")
    public boolean field1104 = false;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1110 = arg0;
        this.field1106 = arg1;
        this.field1108 = arg2;
        this.field1114 = arg3;
        this.field1109 = arg4;
        this.field1105 = arg5 + arg6;
        int var8 = class244.method420(this.field1110).field3252;
        if (var8 == -1) {
            this.field1104 = true;
        } else {
            this.field1104 = false;
            this.field1115 = class259.method154(var8);
        }
    }

    @ObfuscatedName("bk.u(IB)V")
    public final void method1851(int arg0) {
        if (this.field1104) {
            return;
        }
        this.field1112 += arg0;
        while (this.field1112 > this.field1115.field3523[this.field1111]) {
            this.field1112 -= this.field1115.field3523[this.field1111];
            this.field1111++;
            if (this.field1111 >= this.field1115.field3521.length) {
                this.field1104 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bk.w(I)Ldf;")
    public final class128 method1103() {
        class244 var1 = class244.method420(this.field1110);
        class128 var2;
        if (this.field1104) {
            var2 = var1.method4091(-1);
        } else {
            var2 = var1.method4091(this.field1111);
        }
        return var2 == null ? null : var2;
    }
}
