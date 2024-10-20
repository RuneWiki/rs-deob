package deob;

@ObfuscatedName("bz")
public final class class72 extends class130 {

    @ObfuscatedName("bz.v")
    public int field1055;

    @ObfuscatedName("bz.s")
    public int field1057;

    @ObfuscatedName("bz.o")
    public int field1066;

    @ObfuscatedName("bz.k")
    public int field1058;

    @ObfuscatedName("bz.u")
    public int field1059;

    @ObfuscatedName("bz.i")
    public int field1062;

    @ObfuscatedName("bz.t")
    public class276 field1061;

    @ObfuscatedName("bz.p")
    public int field1060 = 0;

    @ObfuscatedName("bz.l")
    public int field1063 = 0;

    @ObfuscatedName("bz.b")
    public boolean field1064 = false;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1055 = arg0;
        this.field1066 = arg1;
        this.field1058 = arg2;
        this.field1059 = arg3;
        this.field1062 = arg4;
        this.field1057 = arg5 + arg6;
        int var8 = class261.method2850(this.field1055).field3301;
        if (var8 == -1) {
            this.field1064 = true;
        } else {
            this.field1064 = false;
            this.field1061 = class276.method115(var8);
        }
    }

    @ObfuscatedName("bz.v(II)V")
    public final void method1675(int arg0) {
        if (this.field1064) {
            return;
        }
        this.field1063 += arg0;
        while (this.field1063 > this.field1061.field3568[this.field1060]) {
            this.field1063 -= this.field1061.field3568[this.field1060];
            this.field1060++;
            if (this.field1060 >= this.field1061.field3566.length) {
                this.field1064 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bz.w(I)Lda;")
    public final class122 method1056() {
        class261 var1 = class261.method2850(this.field1055);
        class122 var2;
        if (this.field1064) {
            var2 = var1.method4519(-1);
        } else {
            var2 = var1.method4519(this.field1060);
        }
        return var2 == null ? null : var2;
    }
}
