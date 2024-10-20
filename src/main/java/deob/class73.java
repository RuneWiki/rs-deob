package deob;

@ObfuscatedName("bi")
public class class73 extends class347 {

    @ObfuscatedName("bi.v")
    public int field626;

    @ObfuscatedName("bi.n")
    public int field617;

    @ObfuscatedName("bi.f")
    public int field618;

    @ObfuscatedName("bi.y")
    public String field623;

    @ObfuscatedName("bi.p")
    public class328 field627;

    @ObfuscatedName("bi.j")
    public class327 field616 = class327.field3856;

    @ObfuscatedName("bi.r")
    public class327 field622 = class327.field3856;

    @ObfuscatedName("bi.b")
    public String field619;

    @ObfuscatedName("bi.d")
    public String field624;

    public class73(int arg0, String arg1, String arg2, String arg3) {
        this.method969(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bi.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method969(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class111.field1399 - 1;
        this.field626 = var5;
        this.field617 = client.field650;
        this.field618 = arg0;
        this.field623 = arg1;
        this.method970();
        this.field619 = arg2;
        this.field624 = arg3;
        this.method992();
        this.method975();
    }

    @ObfuscatedName("bi.n(I)V")
    public void method992() {
        this.field616 = class327.field3856;
    }

    @ObfuscatedName("bi.f(I)Z")
    public final boolean method986() {
        if (class327.field3856 == this.field616) {
            this.method982();
        }
        return class327.field3855 == this.field616;
    }

    @ObfuscatedName("bi.y(B)V")
    public void method982() {
        this.field616 = Statics.field1508.field945.method5248(this.field627) ? class327.field3855 : class327.field3854;
    }

    @ObfuscatedName("bi.p(I)V")
    public void method975() {
        this.field622 = class327.field3856;
    }

    @ObfuscatedName("bi.j(I)Z")
    public final boolean method973() {
        if (class327.field3856 == this.field622) {
            this.method974();
        }
        return class327.field3855 == this.field622;
    }

    @ObfuscatedName("bi.r(B)V")
    public void method974() {
        this.field622 = Statics.field1508.field946.method5248(this.field627) ? class327.field3855 : class327.field3854;
    }

    @ObfuscatedName("bi.b(I)V")
    public final void method970() {
        if (this.field623 == null) {
            this.field627 = null;
        } else {
            this.field627 = new class328(client.method147(this.field623), Statics.field2039);
        }
    }
}
