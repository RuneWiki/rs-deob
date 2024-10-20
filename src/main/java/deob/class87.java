package deob;

@ObfuscatedName("cm")
public final class class87 extends class145 {

    @ObfuscatedName("cm.z")
    public int field1141;

    @ObfuscatedName("cm.k")
    public int field1143;

    @ObfuscatedName("cm.s")
    public int field1139;

    @ObfuscatedName("cm.t")
    public int field1138;

    @ObfuscatedName("cm.i")
    public int field1144;

    @ObfuscatedName("cm.o")
    public int field1142;

    @ObfuscatedName("cm.x")
    public class269 field1149;

    @ObfuscatedName("cm.w")
    public int field1145 = 0;

    @ObfuscatedName("cm.g")
    public int field1146 = 0;

    @ObfuscatedName("cm.m")
    public boolean field1147 = false;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1143 = arg0;
        this.field1138 = arg1;
        this.field1144 = arg2;
        this.field1142 = arg3;
        this.field1141 = arg4;
        this.field1139 = arg5 + arg6;
        int var8 = class254.method1045(this.field1143).field3268;
        if (var8 == -1) {
            this.field1147 = true;
        } else {
            this.field1147 = false;
            this.field1149 = class269.method536(var8);
        }
    }

    @ObfuscatedName("cm.z(II)V")
    public final void method1919(int arg0) {
        if (this.field1147) {
            return;
        }
        this.field1146 += arg0;
        while (this.field1146 > this.field1149.field3541[this.field1145]) {
            this.field1146 -= this.field1149.field3541[this.field1145];
            this.field1145++;
            if (this.field1145 >= this.field1149.field3535.length) {
                this.field1147 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cm.g(I)Ler;")
    public final class137 method1141() {
        class254 var1 = class254.method1045(this.field1143);
        class137 var2;
        if (this.field1147) {
            var2 = var1.method4116(-1);
        } else {
            var2 = var1.method4116(this.field1145);
        }
        return var2 == null ? null : var2;
    }
}
