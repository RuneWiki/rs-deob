package deob;

@ObfuscatedName("bo")
public class class58 extends class365 {

    @ObfuscatedName("bo.l")
    public int field460;

    @ObfuscatedName("bo.q")
    public int field461;

    @ObfuscatedName("bo.f")
    public int field467;

    @ObfuscatedName("bo.j")
    public String field463;

    @ObfuscatedName("bo.m")
    public class422 field462;

    @ObfuscatedName("bo.k")
    public class343 field465 = class343.field3978;

    @ObfuscatedName("bo.t")
    public class343 field466 = class343.field3978;

    @ObfuscatedName("bo.a")
    public String field471;

    @ObfuscatedName("bo.e")
    public String field468;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method1009(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bo.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1009(int arg0, String arg1, String arg2, String arg3) {
        this.field460 = class98.method2827();
        this.field461 = client.field494;
        this.field467 = arg0;
        this.field463 = arg1;
        this.method1019();
        this.field471 = arg2;
        this.field468 = arg3;
        this.method1010();
        this.method1013();
    }

    @ObfuscatedName("bo.q(B)V")
    public void method1010() {
        this.field465 = class343.field3978;
    }

    @ObfuscatedName("bo.f(I)Z")
    public final boolean method1011() {
        if (class343.field3978 == this.field465) {
            this.method1012();
        }
        return class343.field3977 == this.field465;
    }

    @ObfuscatedName("bo.j(I)V")
    public void method1012() {
        this.field465 = Statics.field464.field796.method5539(this.field462) ? class343.field3977 : class343.field3979;
    }

    @ObfuscatedName("bo.m(I)V")
    public void method1013() {
        this.field466 = class343.field3978;
    }

    @ObfuscatedName("bo.k(S)Z")
    public final boolean method1014() {
        if (class343.field3978 == this.field466) {
            this.method1015();
        }
        return class343.field3977 == this.field466;
    }

    @ObfuscatedName("bo.t(B)V")
    public void method1015() {
        this.field466 = Statics.field464.field794.method5539(this.field462) ? class343.field3977 : class343.field3979;
    }

    @ObfuscatedName("bo.a(I)V")
    public final void method1019() {
        if (this.field463 == null) {
            this.field462 = null;
        } else {
            this.field462 = new class422(client.method5711(this.field463), Statics.field2137);
        }
    }
}
