package deob;

@ObfuscatedName("jy")
public class class246 extends class258 {

    @ObfuscatedName("jy.am")
    public final int field2576;

    @ObfuscatedName("jy.ap")
    public final class253 field2578;

    @ObfuscatedName("jy.af")
    public final int field2575;

    @ObfuscatedName("jy.aj")
    public final int field2577;

    public class246(class337 arg0, class337 arg1, int arg2, class253 arg3) {
        super(arg0, arg1);
        this.field2576 = arg2;
        this.field2578 = arg3;
        class178 var5 = class178.method7281(this.method4226());
        class545 var6 = var5.method3275(false);
        if (var6 == null) {
            this.field2575 = 0;
            this.field2577 = 0;
        } else {
            this.field2575 = var6.field5276;
            this.field2577 = var6.field5277;
        }
    }

    @ObfuscatedName("jy.ap(I)I")
    public int method4226() {
        return this.field2576;
    }

    @ObfuscatedName("jy.af(I)Ljz;")
    public class253 method4227() {
        return this.field2578;
    }

    @ObfuscatedName("jy.aj(B)I")
    public int method4237() {
        return this.field2575;
    }

    @ObfuscatedName("jy.aq(I)I")
    public int method4224() {
        return this.field2577;
    }
}
