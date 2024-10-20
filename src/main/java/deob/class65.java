package deob;

@ObfuscatedName("bs")
public class class65 extends class183 {

    @ObfuscatedName("bs.f")
    public int field588;

    @ObfuscatedName("bs.i")
    public int field577;

    @ObfuscatedName("bs.y")
    public int field583;

    @ObfuscatedName("bs.w")
    public String field579;

    @ObfuscatedName("bs.p")
    public class283 field580;

    @ObfuscatedName("bs.b")
    public class281 field576 = class281.field3597;

    @ObfuscatedName("bs.e")
    public class281 field582 = class281.field3597;

    @ObfuscatedName("bs.x")
    public String field578;

    @ObfuscatedName("bs.a")
    public String field584;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1050(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bs.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1050(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class92.field1258 - 1;
        this.field588 = var5;
        this.field577 = client.field641;
        this.field583 = arg0;
        this.field579 = arg1;
        this.method1057();
        this.field578 = arg2;
        this.field584 = arg3;
        this.method1052();
        this.method1060();
    }

    @ObfuscatedName("bs.i(I)V")
    public void method1052() {
        this.field576 = class281.field3597;
    }

    @ObfuscatedName("bs.y(I)Z")
    public final boolean method1053() {
        if (class281.field3597 == this.field576) {
            this.method1054();
        }
        return class281.field3596 == this.field576;
    }

    @ObfuscatedName("bs.w(I)V")
    public void method1054() {
        this.field576 = Statics.field586.field1044.method4720(this.field580) ? class281.field3596 : class281.field3598;
    }

    @ObfuscatedName("bs.p(I)V")
    public void method1060() {
        this.field582 = class281.field3597;
    }

    @ObfuscatedName("bs.b(I)Z")
    public final boolean method1070() {
        if (class281.field3597 == this.field582) {
            this.method1081();
        }
        return class281.field3596 == this.field582;
    }

    @ObfuscatedName("bs.e(B)V")
    public void method1081() {
        this.field582 = Statics.field586.field1042.method4720(this.field580) ? class281.field3596 : class281.field3598;
    }

    @ObfuscatedName("bs.x(I)V")
    public final void method1057() {
        if (this.field579 == null) {
            this.field580 = null;
        } else {
            this.field580 = new class283(client.method564(this.field579), Statics.field2325);
        }
    }
}
