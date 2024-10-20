package deob;

@ObfuscatedName("bj")
public class class65 extends class176 {

    @ObfuscatedName("bj.q")
    public int field601;

    @ObfuscatedName("bj.w")
    public int field599;

    @ObfuscatedName("bj.e")
    public int field603;

    @ObfuscatedName("bj.p")
    public String field600;

    @ObfuscatedName("bj.k")
    public class284 field602;

    @ObfuscatedName("bj.l")
    public class282 field609 = class282.field3638;

    @ObfuscatedName("bj.b")
    public class282 field604 = class282.field3638;

    @ObfuscatedName("bj.i")
    public String field598;

    @ObfuscatedName("bj.c")
    public String field606;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1005(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bj.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1005(int arg0, String arg1, String arg2, String arg3) {
        this.field601 = class92.method4317();
        this.field599 = client.field882;
        this.field603 = arg0;
        this.field600 = arg1;
        this.method1026();
        this.field598 = arg2;
        this.field606 = arg3;
        this.method1020();
        this.method1008();
    }

    @ObfuscatedName("bj.w(I)V")
    public void method1020() {
        this.field609 = class282.field3638;
    }

    @ObfuscatedName("bj.e(I)Z")
    public final boolean method1006() {
        if (class282.field3638 == this.field609) {
            this.method1007();
        }
        return class282.field3639 == this.field609;
    }

    @ObfuscatedName("bj.p(I)V")
    public void method1007() {
        this.field609 = Statics.field547.field1071.method4695(this.field602) ? class282.field3639 : class282.field3640;
    }

    @ObfuscatedName("bj.k(I)V")
    public void method1008() {
        this.field604 = class282.field3638;
    }

    @ObfuscatedName("bj.l(I)Z")
    public final boolean method1009() {
        if (class282.field3638 == this.field604) {
            this.method1010();
        }
        return class282.field3639 == this.field604;
    }

    @ObfuscatedName("bj.b(I)V")
    public void method1010() {
        this.field604 = Statics.field547.field1072.method4695(this.field602) ? class282.field3639 : class282.field3640;
    }

    @ObfuscatedName("bj.i(I)V")
    public final void method1026() {
        if (this.field600 == null) {
            this.field602 = null;
        } else {
            this.field602 = new class284(client.method80(this.field600), Statics.field354);
        }
    }
}
