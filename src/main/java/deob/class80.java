package deob;

@ObfuscatedName("cx")
public final class class80 extends class200 {

    @ObfuscatedName("cx.f")
    public int field979;

    @ObfuscatedName("cx.e")
    public int field971;

    @ObfuscatedName("cx.v")
    public int field972;

    @ObfuscatedName("cx.y")
    public class158 field977;

    @ObfuscatedName("cx.j")
    public int field976;

    @ObfuscatedName("cx.o")
    public int field974;

    @ObfuscatedName("cx.m")
    public int field975;

    @ObfuscatedName("cx.r")
    public int field973 = 0;

    @ObfuscatedName("cx.h")
    public int field978 = 0;

    @ObfuscatedName("cx.d")
    public boolean field980 = false;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field979 = arg0;
        this.field972 = arg1;
        this.field976 = arg2;
        this.field974 = arg3;
        this.field975 = arg4;
        this.field971 = arg5 + arg6;
        int var8 = class149.method1892(this.field979).field1692;
        if (var8 == -1) {
            this.field980 = true;
        } else {
            this.field980 = false;
            this.field977 = class158.method3363(var8);
        }
    }

    @ObfuscatedName("cx.f(II)V")
    public final void method1755(int arg0) {
        if (this.field980) {
            return;
        }
        this.field978 += arg0;
        while (this.field978 > this.field977.field1884[this.field973]) {
            this.field978 -= this.field977.field1884[this.field973];
            this.field973++;
            if (this.field973 >= this.field977.field1882.length) {
                this.field980 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cx.e(I)Lgd;")
    public final class206 method1758() {
        class149 var1 = class149.method1892(this.field979);
        class206 var2;
        if (this.field980) {
            var2 = var1.method2580(-1);
        } else {
            var2 = var1.method2580(this.field973);
        }
        return var2 == null ? null : var2;
    }
}
