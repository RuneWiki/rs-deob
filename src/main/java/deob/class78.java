package deob;

@ObfuscatedName("bq")
public final class class78 extends class136 {

    @ObfuscatedName("bq.c")
    public int field1083;

    @ObfuscatedName("bq.x")
    public int field1080;

    @ObfuscatedName("bq.t")
    public int field1077;

    @ObfuscatedName("bq.g")
    public int field1076;

    @ObfuscatedName("bq.l")
    public int field1079;

    @ObfuscatedName("bq.u")
    public int field1081;

    @ObfuscatedName("bq.j")
    public class259 field1082;

    @ObfuscatedName("bq.v")
    public int field1078 = 0;

    @ObfuscatedName("bq.d")
    public int field1086 = 0;

    @ObfuscatedName("bq.z")
    public boolean field1085 = false;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1083 = arg0;
        this.field1076 = arg1;
        this.field1079 = arg2;
        this.field1080 = arg3;
        this.field1081 = arg4;
        this.field1077 = arg5 + arg6;
        int var8 = class244.method3966(this.field1083).field3220;
        if (var8 == -1) {
            this.field1085 = true;
        } else {
            this.field1085 = false;
            this.field1082 = class259.method1897(var8);
        }
    }

    @ObfuscatedName("bq.c(II)V")
    public final void method1856(int arg0) {
        if (this.field1085) {
            return;
        }
        this.field1086 += arg0;
        while (this.field1086 > this.field1082.field3485[this.field1078]) {
            this.field1086 -= this.field1082.field3485[this.field1078];
            this.field1078++;
            if (this.field1078 >= this.field1082.field3490.length) {
                this.field1085 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bq.d(B)Ldr;")
    public final class128 method1062() {
        class244 var1 = class244.method3966(this.field1083);
        class128 var2;
        if (this.field1085) {
            var2 = var1.method4082(-1);
        } else {
            var2 = var1.method4082(this.field1078);
        }
        return var2 == null ? null : var2;
    }
}
