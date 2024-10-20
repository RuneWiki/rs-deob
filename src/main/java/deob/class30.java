package deob;

@ObfuscatedName("af")
public final class class30 extends class85 {

    @ObfuscatedName("af.h")
    public int field718;

    @ObfuscatedName("af.q")
    public int field708;

    @ObfuscatedName("af.v")
    public int field710;

    @ObfuscatedName("af.n")
    public int field711;

    @ObfuscatedName("af.f")
    public int field712;

    @ObfuscatedName("af.g")
    public int field713;

    @ObfuscatedName("af.o")
    public class43 field714;

    @ObfuscatedName("af.s")
    public int field709 = 0;

    @ObfuscatedName("af.k")
    public int field716 = 0;

    @ObfuscatedName("af.b")
    public boolean field715 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field718 = arg0;
        this.field710 = arg1;
        this.field711 = arg2;
        this.field712 = arg3;
        this.field713 = arg4;
        this.field708 = arg5 + arg6;
        int var8 = class44.method2821(this.field718).field1019;
        if (var8 == -1) {
            this.field715 = true;
        } else {
            this.field715 = false;
            this.field714 = class43.method733(var8);
        }
    }

    @ObfuscatedName("af.h(IB)V")
    public final void method637(int arg0) {
        if (this.field715) {
            return;
        }
        this.field716 += arg0;
        while (this.field716 > this.field714.field996[this.field709]) {
            this.field716 -= this.field714.field996[this.field709];
            this.field709++;
            if (this.field709 >= this.field714.field994.length) {
                this.field715 = true;
                break;
            }
        }
    }

    @ObfuscatedName("af.v(B)Ldg;")
    public final class105 method32() {
        class44 var1 = class44.method2821(this.field718);
        class105 var2;
        if (this.field715) {
            var2 = var1.method886(-1);
        } else {
            var2 = var1.method886(this.field709);
        }
        return var2 == null ? null : var2;
    }
}
