package deob;

@ObfuscatedName("hz")
public class class224 extends class236 {

    @ObfuscatedName("hz.c")
    public final int field2698;

    @ObfuscatedName("hz.l")
    public final class231 field2695;

    @ObfuscatedName("hz.s")
    public final int field2696;

    @ObfuscatedName("hz.e")
    public final int field2694;

    public class224(class282 arg0, class282 arg1, int arg2, class231 arg3) {
        super(arg0, arg1);
        this.field2698 = arg2;
        this.field2695 = arg3;
        class164 var5 = class164.method2597(this.method3980());
        class434 var6 = var5.method2855(false);
        if (var6 == null) {
            this.field2696 = 0;
            this.field2694 = 0;
        } else {
            this.field2696 = var6.field4602;
            this.field2694 = var6.field4603;
        }
    }

    @ObfuscatedName("hz.l(I)I")
    public int method3980() {
        return this.field2698;
    }

    @ObfuscatedName("hz.s(I)Lhp;")
    public class231 method3992() {
        return this.field2695;
    }

    @ObfuscatedName("hz.e(I)I")
    public int method4000() {
        return this.field2696;
    }

    @ObfuscatedName("hz.r(I)I")
    public int method3985() {
        return this.field2694;
    }
}
