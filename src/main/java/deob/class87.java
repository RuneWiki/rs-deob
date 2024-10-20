package deob;

@ObfuscatedName("cs")
public final class class87 extends class145 {

    @ObfuscatedName("cs.x")
    public int field1136;

    @ObfuscatedName("cs.m")
    public int field1139;

    @ObfuscatedName("cs.k")
    public int field1133;

    @ObfuscatedName("cs.d")
    public int field1141;

    @ObfuscatedName("cs.w")
    public int field1134;

    @ObfuscatedName("cs.v")
    public int field1137;

    @ObfuscatedName("cs.q")
    public class269 field1138;

    @ObfuscatedName("cs.z")
    public int field1140 = 0;

    @ObfuscatedName("cs.t")
    public int field1132 = 0;

    @ObfuscatedName("cs.e")
    public boolean field1143 = false;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1139 = arg0;
        this.field1141 = arg1;
        this.field1134 = arg2;
        this.field1136 = arg3;
        this.field1137 = arg4;
        this.field1133 = arg5 + arg6;
        int var8 = class254.method1049(this.field1139).field3244;
        if (var8 == -1) {
            this.field1143 = true;
        } else {
            this.field1143 = false;
            this.field1138 = class269.method4110(var8);
        }
    }

    @ObfuscatedName("cs.x(II)V")
    public final void method1932(int arg0) {
        if (this.field1143) {
            return;
        }
        this.field1132 += arg0;
        while (this.field1132 > this.field1138.field3515[this.field1140]) {
            this.field1132 -= this.field1138.field3515[this.field1140];
            this.field1140++;
            if (this.field1140 >= this.field1138.field3514.length) {
                this.field1143 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cs.t(I)Lel;")
    public final class137 method1182() {
        class254 var1 = class254.method1049(this.field1139);
        class137 var2;
        if (this.field1143) {
            var2 = var1.method4099(-1);
        } else {
            var2 = var1.method4099(this.field1140);
        }
        return var2 == null ? null : var2;
    }
}
