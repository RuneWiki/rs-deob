package deob;

@ObfuscatedName("ah")
public final class class27 extends class79 {

    @ObfuscatedName("ah.f")
    public int field643;

    @ObfuscatedName("ah.k")
    public int field632;

    @ObfuscatedName("ah.y")
    public class39 field637;

    @ObfuscatedName("ah.e")
    public int field642;

    @ObfuscatedName("ah.r")
    public int field633;

    @ObfuscatedName("ah.a")
    public int field631;

    @ObfuscatedName("ah.n")
    public int field636;

    @ObfuscatedName("ah.x")
    public int field638 = 0;

    @ObfuscatedName("ah.g")
    public int field639 = 0;

    @ObfuscatedName("ah.o")
    public boolean field640 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field643 = arg0;
        this.field642 = arg1;
        this.field633 = arg2;
        this.field631 = arg3;
        this.field636 = arg4;
        this.field632 = arg5 + arg6;
        int var8 = class40.method99(this.field643).field943;
        if (var8 == -1) {
            this.field640 = true;
        } else {
            this.field640 = false;
            this.field637 = class39.method547(var8);
        }
    }

    @ObfuscatedName("ah.f(II)V")
    public final void method560(int arg0) {
        if (this.field640) {
            return;
        }
        this.field639 += arg0;
        while (this.field639 > this.field637.field918[this.field638]) {
            this.field639 -= this.field637.field918[this.field638];
            this.field638++;
            if (this.field638 >= this.field637.field913.length) {
                this.field640 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ah.k(I)Lci;")
    public final class99 method16() {
        class40 var1 = class40.method99(this.field643);
        class99 var2;
        if (this.field640) {
            var2 = var1.method783(-1);
        } else {
            var2 = var1.method783(this.field638);
        }
        return var2 == null ? null : var2;
    }
}
