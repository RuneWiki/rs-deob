package deob;

@ObfuscatedName("bi")
public class class65 extends class176 {

    @ObfuscatedName("bi.s")
    public int field583;

    @ObfuscatedName("bi.j")
    public int field574;

    @ObfuscatedName("bi.i")
    public int field575;

    @ObfuscatedName("bi.k")
    public String field576;

    @ObfuscatedName("bi.u")
    public class283 field578;

    @ObfuscatedName("bi.n")
    public class281 field573 = class281.field3594;

    @ObfuscatedName("bi.t")
    public class281 field579 = class281.field3594;

    @ObfuscatedName("bi.q")
    public String field580;

    @ObfuscatedName("bi.x")
    public String field581;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1019(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bi.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1019(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class92.field1245 - 1;
        this.field583 = var5;
        this.field574 = client.field635;
        this.field575 = arg0;
        this.field576 = arg1;
        this.method1025();
        this.field580 = arg2;
        this.field581 = arg3;
        this.method1020();
        this.method1038();
    }

    @ObfuscatedName("bi.j(I)V")
    public void method1020() {
        this.field573 = class281.field3594;
    }

    @ObfuscatedName("bi.i(I)Z")
    public final boolean method1044() {
        if (class281.field3594 == this.field573) {
            this.method1022();
        }
        return class281.field3595 == this.field573;
    }

    @ObfuscatedName("bi.k(I)V")
    public void method1022() {
        this.field573 = Statics.field265.field1044.method4673(this.field578) ? class281.field3595 : class281.field3593;
    }

    @ObfuscatedName("bi.u(I)V")
    public void method1038() {
        this.field579 = class281.field3594;
    }

    @ObfuscatedName("bi.n(B)Z")
    public final boolean method1024() {
        if (class281.field3594 == this.field579) {
            this.method1026();
        }
        return class281.field3595 == this.field579;
    }

    @ObfuscatedName("bi.t(I)V")
    public void method1026() {
        this.field579 = Statics.field265.field1045.method4673(this.field578) ? class281.field3595 : class281.field3593;
    }

    @ObfuscatedName("bi.q(I)V")
    public final void method1025() {
        if (this.field576 == null) {
            this.field578 = null;
        } else {
            this.field578 = new class283(client.method3252(this.field576), Statics.field3649);
        }
    }
}
