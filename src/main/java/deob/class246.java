package deob;

@ObfuscatedName("jh")
public class class246 extends class266 {

    @ObfuscatedName("jh.aq")
    public final int field2553;

    @ObfuscatedName("jh.ad")
    public final class249 field2557;

    @ObfuscatedName("jh.ag")
    public int field2555;

    @ObfuscatedName("jh.ak")
    public class261 field2556;

    @ObfuscatedName("jh.ap")
    public int field2554;

    @ObfuscatedName("jh.an")
    public int field2558;

    public class246(class348 arg0, class348 arg1, int arg2, class249 arg3) {
        super(arg0, arg1);
        this.field2553 = arg2;
        this.field2557 = arg3;
        this.method4214();
    }

    @ObfuscatedName("jh.aq(I)V")
    public void method4214() {
        this.field2555 = class207.method95(this.field2553).method3616().field2181;
        this.field2556 = this.field2557.method4372(class182.method3196(this.field2555));
        class182 var1 = class182.method3196(this.method4215());
        class561 var2 = var1.method3287(false);
        if (var2 == null) {
            this.field2554 = 0;
            this.field2558 = 0;
        } else {
            this.field2554 = var2.field5458;
            this.field2558 = var2.field5461;
        }
    }

    @ObfuscatedName("jh.ad(B)I")
    public int method4215() {
        return this.field2555;
    }

    @ObfuscatedName("jh.ag(I)Lkm;")
    public class261 method4216() {
        return this.field2556;
    }

    @ObfuscatedName("jh.ak(I)I")
    public int method4217() {
        return this.field2554;
    }

    @ObfuscatedName("jh.ap(I)I")
    public int method4230() {
        return this.field2558;
    }
}
