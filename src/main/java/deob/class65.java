package deob;

@ObfuscatedName("bt")
public class class65 extends class176 {

    @ObfuscatedName("bt.a")
    public int field580;

    @ObfuscatedName("bt.t")
    public int field579;

    @ObfuscatedName("bt.n")
    public int field589;

    @ObfuscatedName("bt.q")
    public String field591;

    @ObfuscatedName("bt.v")
    public class283 field582;

    @ObfuscatedName("bt.l")
    public class281 field583 = class281.field3603;

    @ObfuscatedName("bt.c")
    public class281 field584 = class281.field3603;

    @ObfuscatedName("bt.o")
    public String field592;

    @ObfuscatedName("bt.i")
    public String field586;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1128(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bt.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public void method1128(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class92.field1251 - 1;
        this.field580 = var5;
        this.field579 = client.field643;
        this.field589 = arg0;
        this.field591 = arg1;
        this.method1116();
        this.field592 = arg2;
        this.field586 = arg3;
        this.method1123();
        this.method1113();
    }

    @ObfuscatedName("bt.t(I)V")
    public void method1123() {
        this.field583 = class281.field3603;
    }

    @ObfuscatedName("bt.n(B)Z")
    public final boolean method1139() {
        if (class281.field3603 == this.field583) {
            this.method1112();
        }
        return class281.field3600 == this.field583;
    }

    @ObfuscatedName("bt.q(I)V")
    public void method1112() {
        this.field583 = Statics.field1296.field1043.method4796(this.field582) ? class281.field3600 : class281.field3602;
    }

    @ObfuscatedName("bt.v(B)V")
    public void method1113() {
        this.field584 = class281.field3603;
    }

    @ObfuscatedName("bt.l(I)Z")
    public final boolean method1114() {
        if (class281.field3603 == this.field584) {
            this.method1115();
        }
        return class281.field3600 == this.field584;
    }

    @ObfuscatedName("bt.c(I)V")
    public void method1115() {
        this.field584 = Statics.field1296.field1044.method4796(this.field582) ? class281.field3600 : class281.field3602;
    }

    @ObfuscatedName("bt.o(I)V")
    public final void method1116() {
        if (this.field591 == null) {
            this.field582 = null;
        } else {
            this.field582 = new class283(client.method3415(this.field591), Statics.field536);
        }
    }
}
