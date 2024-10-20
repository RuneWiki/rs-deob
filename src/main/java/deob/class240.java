package deob;

@ObfuscatedName("iz")
public class class240 extends class260 {

    @ObfuscatedName("iz.f")
    public final int field2833;

    @ObfuscatedName("iz.w")
    public final class243 field2827;

    @ObfuscatedName("iz.v")
    public int field2828;

    @ObfuscatedName("iz.s")
    public class255 field2829;

    @ObfuscatedName("iz.z")
    public int field2830;

    @ObfuscatedName("iz.j")
    public int field2831;

    public class240(class301 arg0, class301 arg1, int arg2, class243 arg3) {
        super(arg0, arg1);
        this.field2833 = arg2;
        this.field2827 = arg3;
        this.method4529();
    }

    @ObfuscatedName("iz.f(B)V")
    public void method4529() {
        this.field2828 = class200.method7839(this.field2833).method3612().field2170;
        this.field2829 = this.field2827.method4677(class183.method18(this.field2828));
        class183 var1 = class183.method18(this.method4535());
        class488 var2 = var1.method3318(false);
        if (var2 == null) {
            this.field2830 = 0;
            this.field2831 = 0;
        } else {
            this.field2830 = var2.field5034;
            this.field2831 = var2.field5032;
        }
    }

    @ObfuscatedName("iz.w(I)I")
    public int method4535() {
        return this.field2828;
    }

    @ObfuscatedName("iz.v(I)Lil;")
    public class255 method4528() {
        return this.field2829;
    }

    @ObfuscatedName("iz.s(B)I")
    public int method4527() {
        return this.field2830;
    }

    @ObfuscatedName("iz.z(I)I")
    public int method4530() {
        return this.field2831;
    }
}
