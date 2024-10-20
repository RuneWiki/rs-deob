package deob;

@ObfuscatedName("bj")
public class class65 extends class176 {

    @ObfuscatedName("bj.c")
    public int field572;

    @ObfuscatedName("bj.x")
    public int field568;

    @ObfuscatedName("bj.t")
    public int field569;

    @ObfuscatedName("bj.g")
    public String field570;

    @ObfuscatedName("bj.l")
    public class283 field575;

    @ObfuscatedName("bj.u")
    public class281 field579 = class281.field3587;

    @ObfuscatedName("bj.j")
    public class281 field573 = class281.field3587;

    @ObfuscatedName("bj.v")
    public String field571;

    @ObfuscatedName("bj.d")
    public String field567;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1040(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bj.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1040(int arg0, String arg1, String arg2, String arg3) {
        this.field572 = class92.method505();
        this.field568 = client.field628;
        this.field569 = arg0;
        this.field570 = arg1;
        this.method1029();
        this.field571 = arg2;
        this.field567 = arg3;
        this.method1038();
        this.method1026();
    }

    @ObfuscatedName("bj.x(I)V")
    public void method1038() {
        this.field579 = class281.field3587;
    }

    @ObfuscatedName("bj.t(I)Z")
    public final boolean method1024() {
        if (class281.field3587 == this.field579) {
            this.method1025();
        }
        return class281.field3585 == this.field579;
    }

    @ObfuscatedName("bj.g(I)V")
    public void method1025() {
        this.field579 = Statics.field2683.field1039.method4774(this.field575) ? class281.field3585 : class281.field3584;
    }

    @ObfuscatedName("bj.l(B)V")
    public void method1026() {
        this.field573 = class281.field3587;
    }

    @ObfuscatedName("bj.u(I)Z")
    public final boolean method1027() {
        if (class281.field3587 == this.field573) {
            this.method1028();
        }
        return class281.field3585 == this.field573;
    }

    @ObfuscatedName("bj.j(I)V")
    public void method1028() {
        this.field573 = Statics.field2683.field1034.method4774(this.field575) ? class281.field3585 : class281.field3584;
    }

    @ObfuscatedName("bj.v(I)V")
    public final void method1029() {
        if (this.field570 == null) {
            this.field575 = null;
        } else {
            this.field575 = new class283(client.method54(this.field570), Statics.field22);
        }
    }
}
