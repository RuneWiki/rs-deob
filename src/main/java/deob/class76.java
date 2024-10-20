package deob;

@ObfuscatedName("h")
public final class class76 extends class107 {

    @ObfuscatedName("h.g")
    public boolean field1091 = false;

    @ObfuscatedName("h.d")
    public int field1084 = 0;

    @ObfuscatedName("h.b")
    public int field1079;

    @ObfuscatedName("h.c")
    public int field1078;

    @ObfuscatedName("h.m")
    public int field1081;

    @ObfuscatedName("h.j")
    public int field1085 = 0;

    @ObfuscatedName("h.i")
    public int field1080;

    @ObfuscatedName("h.v")
    public int field1082;

    @ObfuscatedName("h.z")
    public int field1086;

    @ObfuscatedName("h.x")
    public class165 field1077;

    @ObfuscatedName("h.v(II)V")
    public final void method1197(int arg0) {
        if (this.field1091) {
            return;
        }
        this.field1085 += arg0;
        while (this.field1085 > this.field1077.field2526[this.field1084]) {
            this.field1085 -= this.field1077.field2526[this.field1084];
            this.field1084++;
            if (this.field1084 >= this.field1077.field2522.length) {
                this.field1091 = true;
                break;
            }
        }
    }

    @ObfuscatedName("h.c(I)Ldk;")
    public final class43 method908() {
        class173 var1 = class173.method1223(this.field1082);
        class43 var2;
        if (this.field1091) {
            var2 = var1.method3134(-1);
        } else {
            var2 = var1.method3134(this.field1084);
        }
        return var2 == null ? null : var2;
    }

    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1082 = arg0;
        this.field1079 = arg1;
        this.field1080 = arg2;
        this.field1081 = arg3;
        this.field1086 = arg4;
        this.field1078 = arg5 + arg6;
        int var8 = class173.method1223(this.field1082).field2661;
        if (var8 == -1) {
            this.field1091 = true;
        } else {
            this.field1091 = false;
            this.field1077 = class165.method3233(var8);
        }
    }
}
