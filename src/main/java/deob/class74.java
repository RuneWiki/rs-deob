package deob;

@ObfuscatedName("br")
public class class74 extends class185 {

    @ObfuscatedName("br.m")
    public int field625;

    @ObfuscatedName("br.o")
    public int field617;

    @ObfuscatedName("br.q")
    public int field618;

    @ObfuscatedName("br.j")
    public String field619;

    @ObfuscatedName("br.p")
    public class293 field629;

    @ObfuscatedName("br.g")
    public class291 field621 = class291.field3648;

    @ObfuscatedName("br.n")
    public class291 field620 = class291.field3648;

    @ObfuscatedName("br.u")
    public String field623;

    @ObfuscatedName("br.a")
    public String field622;

    public class74(int arg0, String arg1, String arg2, String arg3) {
        this.method1087(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("br.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1087(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class101.field1306 - 1;
        this.field625 = var5;
        this.field617 = client.field671;
        this.field618 = arg0;
        this.field619 = arg1;
        this.method1094();
        this.field623 = arg2;
        this.field622 = arg3;
        this.method1090();
        this.method1092();
    }

    @ObfuscatedName("br.o(I)V")
    public void method1090() {
        this.field621 = class291.field3648;
    }

    @ObfuscatedName("br.q(I)Z")
    public final boolean method1089() {
        if (class291.field3648 == this.field621) {
            this.method1113();
        }
        return class291.field3645 == this.field621;
    }

    @ObfuscatedName("br.j(I)V")
    public void method1113() {
        this.field621 = Statics.field2418.field1092.method4889(this.field629) ? class291.field3645 : class291.field3646;
    }

    @ObfuscatedName("br.p(B)V")
    public void method1092() {
        this.field620 = class291.field3648;
    }

    @ObfuscatedName("br.g(B)Z")
    public final boolean method1093() {
        if (class291.field3648 == this.field620) {
            this.method1088();
        }
        return class291.field3645 == this.field620;
    }

    @ObfuscatedName("br.n(I)V")
    public void method1088() {
        this.field620 = Statics.field2418.field1090.method4889(this.field629) ? class291.field3645 : class291.field3646;
    }

    @ObfuscatedName("br.u(I)V")
    public final void method1094() {
        if (this.field619 == null) {
            this.field629 = null;
        } else {
            this.field629 = new class293(client.method3235(this.field619), Statics.field2368);
        }
    }
}
