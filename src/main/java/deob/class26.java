package deob;

@ObfuscatedName("i")
public final class class26 extends class78 {

    @ObfuscatedName("i.g")
    public int field618;

    @ObfuscatedName("i.s")
    public int field629;

    @ObfuscatedName("i.h")
    public int field619;

    @ObfuscatedName("i.m")
    public int field620;

    @ObfuscatedName("i.u")
    public int field621;

    @ObfuscatedName("i.j")
    public int field622;

    @ObfuscatedName("i.b")
    public class38 field623;

    @ObfuscatedName("i.v")
    public int field624 = 0;

    @ObfuscatedName("i.y")
    public int field625 = 0;

    @ObfuscatedName("i.w")
    public boolean field617 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field618 = arg0;
        this.field619 = arg1;
        this.field620 = arg2;
        this.field621 = arg3;
        this.field622 = arg4;
        this.field629 = arg5 + arg6;
        int var8 = class39.method3306(this.field618).field917;
        if (var8 == -1) {
            this.field617 = true;
        } else {
            this.field617 = false;
            this.field623 = class38.method114(var8);
        }
    }

    @ObfuscatedName("i.g(IB)V")
    public final void method534(int arg0) {
        if (this.field617) {
            return;
        }
        this.field625 += arg0;
        while (this.field625 > this.field623.field895[this.field624]) {
            this.field625 -= this.field623.field895[this.field624];
            this.field624++;
            if (this.field624 >= this.field623.field900.length) {
                this.field617 = true;
                break;
            }
        }
    }

    @ObfuscatedName("i.s(I)Lcl;")
    public final class98 method17() {
        class39 var1 = class39.method3306(this.field618);
        class98 var2;
        if (this.field617) {
            var2 = var1.method743(-1);
        } else {
            var2 = var1.method743(this.field624);
        }
        return var2 == null ? null : var2;
    }
}
