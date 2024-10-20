package deob;

@ObfuscatedName("bk")
public class class62 extends class425 {

    @ObfuscatedName("bk.a")
    public int field467;

    @ObfuscatedName("bk.f")
    public int field466;

    @ObfuscatedName("bk.c")
    public int field468;

    @ObfuscatedName("bk.x")
    public String field471;

    @ObfuscatedName("bk.h")
    public class486 field470;

    @ObfuscatedName("bk.j")
    public class396 field473 = class396.field4500;

    @ObfuscatedName("bk.y")
    public class396 field472 = class396.field4500;

    @ObfuscatedName("bk.d")
    public String field469;

    @ObfuscatedName("bk.n")
    public String field474;

    public class62(int arg0, String arg1, String arg2, String arg3) {
        this.method1078(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bk.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1078(int arg0, String arg1, String arg2, String arg3) {
        this.field467 = class106.method7135();
        this.field466 = client.field503;
        this.field468 = arg0;
        this.field471 = arg1;
        this.method1085();
        this.field469 = arg2;
        this.field474 = arg3;
        this.method1079();
        this.method1082();
    }

    @ObfuscatedName("bk.f(I)V")
    public void method1079() {
        this.field473 = class396.field4500;
    }

    @ObfuscatedName("bk.c(I)Z")
    public final boolean method1080() {
        if (class396.field4500 == this.field473) {
            this.method1081();
        }
        return class396.field4497 == this.field473;
    }

    @ObfuscatedName("bk.x(I)V")
    public void method1081() {
        this.field473 = Statics.field2726.field818.method6823(this.field470) ? class396.field4497 : class396.field4498;
    }

    @ObfuscatedName("bk.h(I)V")
    public void method1082() {
        this.field472 = class396.field4500;
    }

    @ObfuscatedName("bk.j(B)Z")
    public final boolean method1083() {
        if (class396.field4500 == this.field472) {
            this.method1101();
        }
        return class396.field4497 == this.field472;
    }

    @ObfuscatedName("bk.y(I)V")
    public void method1101() {
        this.field472 = Statics.field2726.field814.method6823(this.field470) ? class396.field4497 : class396.field4498;
    }

    @ObfuscatedName("bk.d(B)V")
    public final void method1085() {
        if (this.field471 == null) {
            this.field470 = null;
        } else {
            this.field470 = new class486(client.method3708(this.field471), Statics.field2682);
        }
    }
}
