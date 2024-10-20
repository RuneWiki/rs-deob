package deob;

@ObfuscatedName("cj")
public final class class87 extends class145 {

    @ObfuscatedName("cj.m")
    public int field1146;

    @ObfuscatedName("cj.o")
    public int field1136;

    @ObfuscatedName("cj.q")
    public int field1135;

    @ObfuscatedName("cj.j")
    public int field1147;

    @ObfuscatedName("cj.p")
    public int field1139;

    @ObfuscatedName("cj.g")
    public int field1144;

    @ObfuscatedName("cj.n")
    public class269 field1141;

    @ObfuscatedName("cj.u")
    public int field1142 = 0;

    @ObfuscatedName("cj.a")
    public int field1143 = 0;

    @ObfuscatedName("cj.z")
    public boolean field1145 = false;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1146 = arg0;
        this.field1135 = arg1;
        this.field1147 = arg2;
        this.field1139 = arg3;
        this.field1144 = arg4;
        this.field1136 = arg5 + arg6;
        int var8 = class254.method41(this.field1146).field3274;
        if (var8 == -1) {
            this.field1145 = true;
        } else {
            this.field1145 = false;
            this.field1141 = class269.method3330(var8);
        }
    }

    @ObfuscatedName("cj.m(II)V")
    public final void method1919(int arg0) {
        if (this.field1145) {
            return;
        }
        this.field1143 += arg0;
        while (this.field1143 > this.field1141.field3551[this.field1142]) {
            this.field1143 -= this.field1141.field3551[this.field1142];
            this.field1142++;
            if (this.field1142 >= this.field1141.field3552.length) {
                this.field1145 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cj.a(I)Lef;")
    public final class137 method1131() {
        class254 var1 = class254.method41(this.field1146);
        class137 var2;
        if (this.field1145) {
            var2 = var1.method4145(-1);
        } else {
            var2 = var1.method4145(this.field1142);
        }
        return var2 == null ? null : var2;
    }
}
