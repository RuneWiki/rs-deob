package deob;

@ObfuscatedName("hs")
public class class216 extends class236 {

    @ObfuscatedName("hs.c")
    public final int field2613;

    @ObfuscatedName("hs.l")
    public final class219 field2617;

    @ObfuscatedName("hs.s")
    public int field2614;

    @ObfuscatedName("hs.e")
    public class231 field2615;

    @ObfuscatedName("hs.r")
    public int field2616;

    @ObfuscatedName("hs.o")
    public int field2612;

    public class216(class282 arg0, class282 arg1, int arg2, class219 arg3) {
        super(arg0, arg1);
        this.field2613 = arg2;
        this.field2617 = arg3;
        this.method3979();
    }

    @ObfuscatedName("hs.c(I)V")
    public void method3979() {
        this.field2614 = class180.method3056(this.field2613).method3151().field1997;
        this.field2615 = this.field2617.method4214(class164.method2597(this.field2614));
        class164 var1 = class164.method2597(this.method3980());
        class434 var2 = var1.method2855(false);
        if (var2 == null) {
            this.field2616 = 0;
            this.field2612 = 0;
        } else {
            this.field2616 = var2.field4602;
            this.field2612 = var2.field4603;
        }
    }

    @ObfuscatedName("hs.l(I)I")
    public int method3980() {
        return this.field2614;
    }

    @ObfuscatedName("hs.s(I)Lhp;")
    public class231 method3992() {
        return this.field2615;
    }

    @ObfuscatedName("hs.e(I)I")
    public int method4000() {
        return this.field2616;
    }

    @ObfuscatedName("hs.r(I)I")
    public int method3985() {
        return this.field2612;
    }
}
