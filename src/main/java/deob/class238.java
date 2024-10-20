package deob;

@ObfuscatedName("ju")
public class class238 extends class258 {

    @ObfuscatedName("ju.am")
    public final int field2489;

    @ObfuscatedName("ju.ap")
    public final class241 field2490;

    @ObfuscatedName("ju.af")
    public int field2491;

    @ObfuscatedName("ju.aj")
    public class253 field2492;

    @ObfuscatedName("ju.aq")
    public int field2493;

    @ObfuscatedName("ju.ar")
    public int field2494;

    public class238(class337 arg0, class337 arg1, int arg2, class241 arg3) {
        super(arg0, arg1);
        this.field2489 = arg2;
        this.field2490 = arg3;
        this.method4225();
    }

    @ObfuscatedName("ju.am(I)V")
    public void method4225() {
        this.field2491 = class202.method3023(this.field2489).method3608().field2123;
        this.field2492 = this.field2490.method4350(class178.method7281(this.field2491));
        class178 var1 = class178.method7281(this.method4226());
        class545 var2 = var1.method3275(false);
        if (var2 == null) {
            this.field2493 = 0;
            this.field2494 = 0;
        } else {
            this.field2493 = var2.field5276;
            this.field2494 = var2.field5277;
        }
    }

    @ObfuscatedName("ju.ap(I)I")
    public int method4226() {
        return this.field2491;
    }

    @ObfuscatedName("ju.af(I)Ljz;")
    public class253 method4227() {
        return this.field2492;
    }

    @ObfuscatedName("ju.aj(B)I")
    public int method4237() {
        return this.field2493;
    }

    @ObfuscatedName("ju.aq(I)I")
    public int method4224() {
        return this.field2494;
    }
}
