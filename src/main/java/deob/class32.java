package deob;

@ObfuscatedName("ai")
public final class class32 extends class89 {

    @ObfuscatedName("ai.m")
    public int field715;

    @ObfuscatedName("ai.w")
    public int field708;

    @ObfuscatedName("ai.e")
    public int field713;

    @ObfuscatedName("ai.o")
    public int field709;

    @ObfuscatedName("ai.g")
    public int field711;

    @ObfuscatedName("ai.l")
    public int field712;

    @ObfuscatedName("ai.j")
    public class45 field710;

    @ObfuscatedName("ai.r")
    public int field714 = 0;

    @ObfuscatedName("ai.x")
    public int field707 = 0;

    @ObfuscatedName("ai.k")
    public boolean field716 = false;

    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field715 = arg0;
        this.field713 = arg1;
        this.field709 = arg2;
        this.field711 = arg3;
        this.field712 = arg4;
        this.field708 = arg5 + arg6;
        int var8 = class46.method3219(this.field715).field1029;
        if (var8 == -1) {
            this.field716 = true;
        } else {
            this.field716 = false;
            this.field710 = class45.method637(var8);
        }
    }

    @ObfuscatedName("ai.m(II)V")
    public final void method653(int arg0) {
        if (this.field716) {
            return;
        }
        this.field707 += arg0;
        while (this.field707 > this.field710.field1012[this.field714]) {
            this.field707 -= this.field710.field1012[this.field714];
            this.field714++;
            if (this.field714 >= this.field710.field1010.length) {
                this.field716 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ai.e(I)Ldg;")
    public final class109 method22() {
        class46 var1 = class46.method3219(this.field715);
        class109 var2;
        if (this.field716) {
            var2 = var1.method908(-1);
        } else {
            var2 = var1.method908(this.field714);
        }
        return var2 == null ? null : var2;
    }
}
