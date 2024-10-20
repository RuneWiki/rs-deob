package deob;

@ObfuscatedName("bk")
public class class65 extends class214 {

    @ObfuscatedName("bk.n")
    public int field583;

    @ObfuscatedName("bk.h")
    public int field579;

    @ObfuscatedName("bk.l")
    public int field578;

    @ObfuscatedName("bk.g")
    public String field581;

    @ObfuscatedName("bk.b")
    public class297 field582;

    @ObfuscatedName("bk.a")
    public class295 field586 = class295.field3706;

    @ObfuscatedName("bk.c")
    public class295 field584 = class295.field3706;

    @ObfuscatedName("bk.z")
    public String field585;

    @ObfuscatedName("bk.j")
    public String field580;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class91.field1238 - 1;
        this.field583 = var5;
        this.field579 = client.field899;
        this.field578 = arg0;
        this.field581 = arg1;
        this.method1066();
        this.field585 = arg2;
        this.field580 = arg3;
    }

    @ObfuscatedName("bk.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1067(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class91.field1238 - 1;
        this.field583 = var5;
        this.field579 = client.field899;
        this.field578 = arg0;
        this.field581 = arg1;
        this.method1066();
        this.field585 = arg2;
        this.field580 = arg3;
    }

    @ObfuscatedName("bk.h(I)V")
    public void method1060() {
        this.field586 = class295.field3706;
    }

    @ObfuscatedName("bk.l(I)Z")
    public final boolean method1061() {
        if (class295.field3706 == this.field586) {
            this.method1080();
        }
        return class295.field3705 == this.field586;
    }

    @ObfuscatedName("bk.g(I)V")
    public void method1080() {
        this.field586 = Statics.field2434.field1025.method5166(this.field582) ? class295.field3705 : class295.field3704;
    }

    @ObfuscatedName("bk.b(I)V")
    public void method1063() {
        this.field584 = class295.field3706;
    }

    @ObfuscatedName("bk.a(I)Z")
    public final boolean method1064() {
        if (class295.field3706 == this.field584) {
            this.method1065();
        }
        return class295.field3705 == this.field584;
    }

    @ObfuscatedName("bk.c(B)V")
    public void method1065() {
        this.field584 = Statics.field2434.field1026.method5166(this.field582) ? class295.field3705 : class295.field3704;
    }

    @ObfuscatedName("bk.z(B)V")
    public final void method1066() {
        if (this.field581 == null) {
            this.field582 = null;
        } else {
            this.field582 = new class297(client.method5321(this.field581), Statics.field346);
        }
    }
}
