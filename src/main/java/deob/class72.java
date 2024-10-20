package deob;

@ObfuscatedName("bf")
public final class class72 extends class130 {

    @ObfuscatedName("bf.y")
    public class276 field1065;

    @ObfuscatedName("bf.c")
    public int field1066;

    @ObfuscatedName("bf.n")
    public int field1064;

    @ObfuscatedName("bf.u")
    public int field1068;

    @ObfuscatedName("bf.i")
    public int field1071;

    @ObfuscatedName("bf.r")
    public int field1067;

    @ObfuscatedName("bf.j")
    public int field1063;

    @ObfuscatedName("bf.p")
    public int field1070 = 0;

    @ObfuscatedName("bf.e")
    public int field1069 = 0;

    @ObfuscatedName("bf.s")
    public boolean field1072 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1066 = arg0;
        this.field1068 = arg1;
        this.field1071 = arg2;
        this.field1067 = arg3;
        this.field1063 = arg4;
        this.field1064 = arg5 + arg6;
        int var8 = class261.method1754(this.field1066).field3323;
        if (var8 == -1) {
            this.field1072 = true;
        } else {
            this.field1072 = false;
            this.field1065 = class276.method3241(var8);
        }
    }

    @ObfuscatedName("bf.y(II)V")
    public final void method1659(int arg0) {
        if (this.field1072) {
            return;
        }
        this.field1069 += arg0;
        while (this.field1069 > this.field1065.field3586[this.field1070]) {
            this.field1069 -= this.field1065.field3586[this.field1070];
            this.field1070++;
            if (this.field1070 >= this.field1065.field3594.length) {
                this.field1072 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bf.v(I)Lde;")
    public final class122 method1059() {
        class261 var1 = class261.method1754(this.field1066);
        class122 var2;
        if (this.field1072) {
            var2 = var1.method4499(-1);
        } else {
            var2 = var1.method4499(this.field1070);
        }
        return var2 == null ? null : var2;
    }
}
