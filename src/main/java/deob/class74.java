package deob;

@ObfuscatedName("bg")
public class class74 extends class185 {

    @ObfuscatedName("bg.h")
    public int field599;

    @ObfuscatedName("bg.v")
    public int field596;

    @ObfuscatedName("bg.x")
    public int field597;

    @ObfuscatedName("bg.w")
    public String field598;

    @ObfuscatedName("bg.t")
    public class294 field602;

    @ObfuscatedName("bg.j")
    public class292 field600 = class292.field3654;

    @ObfuscatedName("bg.n")
    public class292 field601 = class292.field3654;

    @ObfuscatedName("bg.p")
    public String field595;

    @ObfuscatedName("bg.l")
    public String field603;

    public class74(int arg0, String arg1, String arg2, String arg3) {
        this.method1147(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1147(int arg0, String arg1, String arg2, String arg3) {
        this.field599 = class101.method1993();
        this.field596 = client.field656;
        this.field597 = arg0;
        this.field598 = arg1;
        this.method1157();
        this.field595 = arg2;
        this.field603 = arg3;
        this.method1148();
        this.method1151();
    }

    @ObfuscatedName("bg.v(B)V")
    public void method1148() {
        this.field600 = class292.field3654;
    }

    @ObfuscatedName("bg.x(I)Z")
    public final boolean method1149() {
        if (class292.field3654 == this.field600) {
            this.method1150();
        }
        return class292.field3653 == this.field600;
    }

    @ObfuscatedName("bg.w(B)V")
    public void method1150() {
        this.field600 = Statics.field2037.field1068.method4733(this.field602) ? class292.field3653 : class292.field3655;
    }

    @ObfuscatedName("bg.t(I)V")
    public void method1151() {
        this.field601 = class292.field3654;
    }

    @ObfuscatedName("bg.j(I)Z")
    public final boolean method1152() {
        if (class292.field3654 == this.field601) {
            this.method1153();
        }
        return class292.field3653 == this.field601;
    }

    @ObfuscatedName("bg.n(B)V")
    public void method1153() {
        this.field601 = Statics.field2037.field1069.method4733(this.field602) ? class292.field3653 : class292.field3655;
    }

    @ObfuscatedName("bg.p(I)V")
    public final void method1157() {
        if (this.field598 == null) {
            this.field602 = null;
        } else {
            this.field602 = new class294(client.method198(this.field598), Statics.field93);
        }
    }
}
