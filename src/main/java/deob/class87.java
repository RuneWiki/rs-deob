package deob;

@ObfuscatedName("ce")
public final class class87 extends class145 {

    @ObfuscatedName("ce.h")
    public int field1116;

    @ObfuscatedName("ce.v")
    public int field1120;

    @ObfuscatedName("ce.x")
    public int field1115;

    @ObfuscatedName("ce.w")
    public int field1113;

    @ObfuscatedName("ce.t")
    public int field1114;

    @ObfuscatedName("ce.j")
    public int field1112;

    @ObfuscatedName("ce.n")
    public class270 field1117;

    @ObfuscatedName("ce.p")
    public int field1111 = 0;

    @ObfuscatedName("ce.l")
    public int field1119 = 0;

    @ObfuscatedName("ce.z")
    public boolean field1121 = false;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1116 = arg0;
        this.field1113 = arg1;
        this.field1114 = arg2;
        this.field1115 = arg3;
        this.field1112 = arg4;
        this.field1120 = arg5 + arg6;
        int var8 = class255.method2025(this.field1116).field3285;
        if (var8 == -1) {
            this.field1121 = true;
        } else {
            this.field1121 = false;
            this.field1117 = class270.method4174(var8);
        }
    }

    @ObfuscatedName("ce.h(II)V")
    public final void method1938(int arg0) {
        if (this.field1121) {
            return;
        }
        this.field1119 += arg0;
        while (this.field1119 > this.field1117.field3553[this.field1111]) {
            this.field1119 -= this.field1117.field3553[this.field1111];
            this.field1111++;
            if (this.field1111 >= this.field1117.field3551.length) {
                this.field1121 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ce.l(I)Leh;")
    public final class137 method1198() {
        class255 var1 = class255.method2025(this.field1116);
        class137 var2;
        if (this.field1121) {
            var2 = var1.method4075(-1);
        } else {
            var2 = var1.method4075(this.field1111);
        }
        return var2 == null ? null : var2;
    }
}
