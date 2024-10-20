package deob;

@ObfuscatedName("ba")
public class class65 extends class176 {

    @ObfuscatedName("ba.u")
    public int field596;

    @ObfuscatedName("ba.f")
    public int field592;

    @ObfuscatedName("ba.b")
    public int field595;

    @ObfuscatedName("ba.g")
    public String field603;

    @ObfuscatedName("ba.z")
    public class283 field593;

    @ObfuscatedName("ba.p")
    public class281 field597 = class281.field3617;

    @ObfuscatedName("ba.h")
    public class281 field598 = class281.field3617;

    @ObfuscatedName("ba.y")
    public String field594;

    @ObfuscatedName("ba.w")
    public String field600;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1073(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ba.u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1073(int arg0, String arg1, String arg2, String arg3) {
        this.field596 = class92.method1940();
        this.field592 = client.field655;
        this.field595 = arg0;
        this.field603 = arg1;
        this.method1062();
        this.field594 = arg2;
        this.field600 = arg3;
        this.method1066();
        this.method1063();
    }

    @ObfuscatedName("ba.f(I)V")
    public void method1066() {
        this.field597 = class281.field3617;
    }

    @ObfuscatedName("ba.b(I)Z")
    public final boolean method1061() {
        if (class281.field3617 == this.field597) {
            this.method1067();
        }
        return class281.field3615 == this.field597;
    }

    @ObfuscatedName("ba.g(B)V")
    public void method1067() {
        this.field597 = Statics.field1745.field1058.method4749(this.field593) ? class281.field3615 : class281.field3616;
    }

    @ObfuscatedName("ba.z(I)V")
    public void method1063() {
        this.field598 = class281.field3617;
    }

    @ObfuscatedName("ba.p(I)Z")
    public final boolean method1064() {
        if (class281.field3617 == this.field598) {
            this.method1065();
        }
        return class281.field3615 == this.field598;
    }

    @ObfuscatedName("ba.h(I)V")
    public void method1065() {
        this.field598 = Statics.field1745.field1061.method4749(this.field593) ? class281.field3615 : class281.field3616;
    }

    @ObfuscatedName("ba.y(I)V")
    public final void method1062() {
        if (this.field603 == null) {
            this.field593 = null;
        } else {
            this.field593 = new class283(client.method2752(this.field603), Statics.field120);
        }
    }
}
