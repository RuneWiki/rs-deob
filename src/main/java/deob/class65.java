package deob;

@ObfuscatedName("be")
public class class65 extends class176 {

    @ObfuscatedName("be.z")
    public int field595;

    @ObfuscatedName("be.n")
    public int field590;

    @ObfuscatedName("be.v")
    public int field585;

    @ObfuscatedName("be.u")
    public String field586;

    @ObfuscatedName("be.r")
    public class283 field587;

    @ObfuscatedName("be.p")
    public class281 field588 = class281.field3603;

    @ObfuscatedName("be.q")
    public class281 field589 = class281.field3603;

    @ObfuscatedName("be.m")
    public String field591;

    @ObfuscatedName("be.y")
    public String field594;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1060(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("be.z(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1060(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class92.field1260 - 1;
        this.field595 = var5;
        this.field590 = client.field645;
        this.field585 = arg0;
        this.field586 = arg1;
        this.method1067();
        this.field591 = arg2;
        this.field594 = arg3;
        this.method1083();
        this.method1079();
    }

    @ObfuscatedName("be.n(B)V")
    public void method1083() {
        this.field588 = class281.field3603;
    }

    @ObfuscatedName("be.v(I)Z")
    public final boolean method1064() {
        if (class281.field3603 == this.field588) {
            this.method1061();
        }
        return class281.field3605 == this.field588;
    }

    @ObfuscatedName("be.u(I)V")
    public void method1061() {
        this.field588 = Statics.field500.field1051.method4612(this.field587) ? class281.field3605 : class281.field3604;
    }

    @ObfuscatedName("be.r(I)V")
    public void method1079() {
        this.field589 = class281.field3603;
    }

    @ObfuscatedName("be.p(I)Z")
    public final boolean method1065() {
        if (class281.field3603 == this.field589) {
            this.method1066();
        }
        return class281.field3605 == this.field589;
    }

    @ObfuscatedName("be.q(I)V")
    public void method1066() {
        this.field589 = Statics.field500.field1052.method4612(this.field587) ? class281.field3605 : class281.field3604;
    }

    @ObfuscatedName("be.m(I)V")
    public final void method1067() {
        if (this.field586 == null) {
            this.field587 = null;
        } else {
            this.field587 = new class283(Statics.method236(this.field586), Statics.field275);
        }
    }
}
