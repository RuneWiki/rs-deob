package deob;

@ObfuscatedName("br")
public final class class78 extends class136 {

    @ObfuscatedName("br.c")
    public int field1102;

    @ObfuscatedName("br.t")
    public int field1100;

    @ObfuscatedName("br.o")
    public int field1101;

    @ObfuscatedName("br.e")
    public int field1099;

    @ObfuscatedName("br.i")
    public int field1104;

    @ObfuscatedName("br.g")
    public int field1107;

    @ObfuscatedName("br.d")
    public class260 field1105;

    @ObfuscatedName("br.l")
    public int field1106 = 0;

    @ObfuscatedName("br.j")
    public int field1103 = 0;

    @ObfuscatedName("br.m")
    public boolean field1108 = false;

    public class78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1102 = arg0;
        this.field1101 = arg1;
        this.field1099 = arg2;
        this.field1104 = arg3;
        this.field1107 = arg4;
        this.field1100 = arg5 + arg6;
        int var8 = class245.method1108(this.field1102).field3246;
        if (var8 == -1) {
            this.field1108 = true;
        } else {
            this.field1108 = false;
            this.field1105 = class260.method5476(var8);
        }
    }

    @ObfuscatedName("br.c(II)V")
    public final void method1881(int arg0) {
        if (this.field1108) {
            return;
        }
        this.field1103 += arg0;
        while (this.field1103 > this.field1105.field3515[this.field1106]) {
            this.field1103 -= this.field1105.field3515[this.field1106];
            this.field1106++;
            if (this.field1106 >= this.field1105.field3526.length) {
                this.field1108 = true;
                break;
            }
        }
    }

    @ObfuscatedName("br.j(I)Ldx;")
    public final class128 method1118() {
        class245 var1 = class245.method1108(this.field1102);
        class128 var2;
        if (this.field1108) {
            var2 = var1.method4090(-1);
        } else {
            var2 = var1.method4090(this.field1106);
        }
        return var2 == null ? null : var2;
    }
}
