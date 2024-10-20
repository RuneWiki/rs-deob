package deob;

@ObfuscatedName("bn")
public class class59 extends class207 {

    @ObfuscatedName("bn.w")
    public int field547;

    @ObfuscatedName("bn.m")
    public int field538;

    @ObfuscatedName("bn.q")
    public int field539;

    @ObfuscatedName("bn.b")
    public String field540;

    @ObfuscatedName("bn.f")
    public class292 field541;

    @ObfuscatedName("bn.n")
    public class290 field542 = class290.field3653;

    @ObfuscatedName("bn.h")
    public class290 field552 = class290.field3653;

    @ObfuscatedName("bn.x")
    public String field543;

    @ObfuscatedName("bn.j")
    public String field545;

    public class59(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class84.field1209 - 1;
        this.field547 = var5;
        this.field538 = client.field680;
        this.field539 = arg0;
        this.field540 = arg1;
        this.method1010();
        this.field543 = arg2;
        this.field545 = arg3;
    }

    @ObfuscatedName("bn.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1015(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class84.field1209 - 1;
        this.field547 = var5;
        this.field538 = client.field680;
        this.field539 = arg0;
        this.field540 = arg1;
        this.method1010();
        this.field543 = arg2;
        this.field545 = arg3;
    }

    @ObfuscatedName("bn.m(I)V")
    public void method1004() {
        this.field542 = class290.field3653;
    }

    @ObfuscatedName("bn.q(I)Z")
    public final boolean method1005() {
        if (class290.field3653 == this.field542) {
            this.method1018();
        }
        return class290.field3652 == this.field542;
    }

    @ObfuscatedName("bn.x(I)V")
    public void method1018() {
        this.field542 = Statics.field1454.field990.method4954(this.field541) ? class290.field3652 : class290.field3651;
    }

    @ObfuscatedName("bn.j(B)V")
    public void method1007() {
        this.field552 = class290.field3653;
    }

    @ObfuscatedName("bn.a(B)Z")
    public final boolean method1008() {
        if (class290.field3653 == this.field552) {
            this.method1009();
        }
        return class290.field3652 == this.field552;
    }

    @ObfuscatedName("bn.l(B)V")
    public void method1009() {
        this.field552 = Statics.field1454.field994.method4954(this.field541) ? class290.field3652 : class290.field3651;
    }

    @ObfuscatedName("bn.d(I)V")
    public final void method1010() {
        if (this.field540 == null) {
            this.field541 = null;
        } else {
            this.field541 = new class292(client.method98(this.field540), Statics.field169);
        }
    }
}
