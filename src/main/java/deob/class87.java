package deob;

@ObfuscatedName("cj")
public final class class87 extends class145 {

    @ObfuscatedName("cj.n")
    public int field1137;

    @ObfuscatedName("cj.v")
    public int field1134;

    @ObfuscatedName("cj.d")
    public int field1130;

    @ObfuscatedName("cj.c")
    public int field1131;

    @ObfuscatedName("cj.y")
    public class270 field1136;

    @ObfuscatedName("cj.h")
    public int field1132;

    @ObfuscatedName("cj.z")
    public int field1128;

    @ObfuscatedName("cj.e")
    public int field1133 = 0;

    @ObfuscatedName("cj.q")
    public int field1129 = 0;

    @ObfuscatedName("cj.l")
    public boolean field1135 = false;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1137 = arg0;
        this.field1130 = arg1;
        this.field1131 = arg2;
        this.field1132 = arg3;
        this.field1128 = arg4;
        this.field1134 = arg5 + arg6;
        int var8 = class255.method4871(this.field1137).field3279;
        if (var8 == -1) {
            this.field1135 = true;
        } else {
            this.field1135 = false;
            this.field1136 = Statics.method1124(var8);
        }
    }

    @ObfuscatedName("cj.n(II)V")
    public final void method1985(int arg0) {
        if (this.field1135) {
            return;
        }
        this.field1129 += arg0;
        while (this.field1129 > this.field1136.field3556[this.field1133]) {
            this.field1129 -= this.field1136.field3556[this.field1133];
            this.field1133++;
            if (this.field1133 >= this.field1136.field3554.length) {
                this.field1135 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cj.q(B)Lef;")
    public final class137 method1214() {
        class255 var1 = class255.method4871(this.field1137);
        class137 var2;
        if (this.field1135) {
            var2 = var1.method4216(-1);
        } else {
            var2 = var1.method4216(this.field1133);
        }
        return var2 == null ? null : var2;
    }
}
