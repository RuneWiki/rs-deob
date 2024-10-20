package deob;

@ObfuscatedName("bw")
public final class class78 extends class136 {

    @ObfuscatedName("bw.m")
    public int field1087;

    @ObfuscatedName("bw.f")
    public int field1078;

    @ObfuscatedName("bw.q")
    public int field1079;

    @ObfuscatedName("bw.w")
    public int field1080;

    @ObfuscatedName("bw.o")
    public int field1085;

    @ObfuscatedName("bw.u")
    public int field1081;

    @ObfuscatedName("bw.g")
    public class270 field1082;

    @ObfuscatedName("bw.l")
    public int field1083 = 0;

    @ObfuscatedName("bw.e")
    public int field1084 = 0;

    @ObfuscatedName("bw.x")
    public boolean field1076 = false;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1087 = arg0;
        this.field1079 = arg1;
        this.field1080 = arg2;
        this.field1085 = arg3;
        this.field1081 = arg4;
        this.field1078 = arg5 + arg6;
        int var8 = class255.method756(this.field1087).field3315;
        if (var8 == -1) {
            this.field1076 = true;
        } else {
            this.field1076 = false;
            this.field1082 = class270.method596(var8);
        }
    }

    @ObfuscatedName("bw.m(II)V")
    public final void method1817(int arg0) {
        if (this.field1076) {
            return;
        }
        this.field1084 += arg0;
        while (this.field1084 > this.field1082.field3589[this.field1083]) {
            this.field1084 -= this.field1082.field3589[this.field1083];
            this.field1083++;
            if (this.field1083 >= this.field1082.field3587.length) {
                this.field1076 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bw.e(I)Ldu;")
    public final class128 method1105() {
        class255 var1 = class255.method756(this.field1087);
        class128 var2;
        if (this.field1076) {
            var2 = var1.method4396(-1);
        } else {
            var2 = var1.method4396(this.field1083);
        }
        return var2 == null ? null : var2;
    }
}
