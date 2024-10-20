package deob;

@ObfuscatedName("bm")
public class class65 extends class181 {

    @ObfuscatedName("bm.m")
    public int field576;

    @ObfuscatedName("bm.f")
    public int field571;

    @ObfuscatedName("bm.q")
    public int field570;

    @ObfuscatedName("bm.w")
    public String field573;

    @ObfuscatedName("bm.o")
    public class295 field581;

    @ObfuscatedName("bm.u")
    public class293 field575 = class293.field3706;

    @ObfuscatedName("bm.g")
    public class293 field572 = class293.field3706;

    @ObfuscatedName("bm.l")
    public String field577;

    @ObfuscatedName("bm.e")
    public String field578;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1076(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bm.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1076(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class92.field1252 - 1;
        this.field576 = var5;
        this.field571 = client.field633;
        this.field570 = arg0;
        this.field573 = arg1;
        this.method1069();
        this.field577 = arg2;
        this.field578 = arg3;
        this.method1059();
        this.method1062();
    }

    @ObfuscatedName("bm.f(I)V")
    public void method1059() {
        this.field575 = class293.field3706;
    }

    @ObfuscatedName("bm.q(I)Z")
    public final boolean method1060() {
        if (class293.field3706 == this.field575) {
            this.method1066();
        }
        return class293.field3704 == this.field575;
    }

    @ObfuscatedName("bm.w(I)V")
    public void method1066() {
        this.field575 = Statics.field205.field1037.method5072(this.field581) ? class293.field3704 : class293.field3708;
    }

    @ObfuscatedName("bm.o(I)V")
    public void method1062() {
        this.field572 = class293.field3706;
    }

    @ObfuscatedName("bm.u(B)Z")
    public final boolean method1063() {
        if (class293.field3706 == this.field572) {
            this.method1064();
        }
        return class293.field3704 == this.field572;
    }

    @ObfuscatedName("bm.g(S)V")
    public void method1064() {
        this.field572 = Statics.field205.field1034.method5072(this.field581) ? class293.field3704 : class293.field3708;
    }

    @ObfuscatedName("bm.l(B)V")
    public final void method1069() {
        if (this.field573 == null) {
            this.field581 = null;
        } else {
            this.field581 = new class295(client.method4744(this.field573), Statics.field366);
        }
    }
}
