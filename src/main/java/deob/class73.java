package deob;

@ObfuscatedName("bs")
public class class73 extends class346 {

    @ObfuscatedName("bs.f")
    public int field583;

    @ObfuscatedName("bs.o")
    public int field584;

    @ObfuscatedName("bs.u")
    public int field586;

    @ObfuscatedName("bs.p")
    public String field582;

    @ObfuscatedName("bs.b")
    public class327 field581;

    @ObfuscatedName("bs.e")
    public class326 field585 = class326.field3860;

    @ObfuscatedName("bs.k")
    public class326 field587 = class326.field3860;

    @ObfuscatedName("bs.g")
    public String field588;

    @ObfuscatedName("bs.h")
    public String field589;

    public class73(int arg0, String arg1, String arg2, String arg3) {
        this.method940(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bs.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method940(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class111.field1375 - 1;
        this.field583 = var5;
        this.field584 = client.field611;
        this.field586 = arg0;
        this.field582 = arg1;
        this.method947();
        this.field588 = arg2;
        this.field589 = arg3;
        this.method941();
        this.method945();
    }

    @ObfuscatedName("bs.o(I)V")
    public void method941() {
        this.field585 = class326.field3860;
    }

    @ObfuscatedName("bs.u(I)Z")
    public final boolean method942() {
        if (class326.field3860 == this.field585) {
            this.method943();
        }
        return class326.field3856 == this.field585;
    }

    @ObfuscatedName("bs.p(B)V")
    public void method943() {
        this.field585 = Statics.field118.field907.method5168(this.field581) ? class326.field3856 : class326.field3857;
    }

    @ObfuscatedName("bs.b(I)V")
    public void method945() {
        this.field587 = class326.field3860;
    }

    @ObfuscatedName("bs.e(I)Z")
    public final boolean method944() {
        if (class326.field3860 == this.field587) {
            this.method939();
        }
        return class326.field3856 == this.field587;
    }

    @ObfuscatedName("bs.k(I)V")
    public void method939() {
        this.field587 = Statics.field118.field908.method5168(this.field581) ? class326.field3856 : class326.field3857;
    }

    @ObfuscatedName("bs.g(I)V")
    public final void method947() {
        if (this.field582 == null) {
            this.field581 = null;
        } else {
            this.field581 = new class327(client.method15(this.field582), Statics.field3841);
        }
    }
}
