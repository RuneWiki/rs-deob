package deob;

@ObfuscatedName("bd")
public class class60 extends class209 {

    @ObfuscatedName("bd.f")
    public int field559;

    @ObfuscatedName("bd.h")
    public int field564;

    @ObfuscatedName("bd.e")
    public int field560;

    @ObfuscatedName("bd.b")
    public String field563;

    @ObfuscatedName("bd.l")
    public class294 field562;

    @ObfuscatedName("bd.w")
    public class292 field567 = class292.field3700;

    @ObfuscatedName("bd.d")
    public class292 field566 = class292.field3700;

    @ObfuscatedName("bd.n")
    public String field565;

    @ObfuscatedName("bd.s")
    public String field561;

    public class60(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1229 - 1;
        this.field559 = var5;
        this.field564 = client.field633;
        this.field560 = arg0;
        this.field563 = arg1;
        this.method978();
        this.field565 = arg2;
        this.field561 = arg3;
    }

    @ObfuscatedName("bd.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method980(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1229 - 1;
        this.field559 = var5;
        this.field564 = client.field633;
        this.field560 = arg0;
        this.field563 = arg1;
        this.method978();
        this.field565 = arg2;
        this.field561 = arg3;
    }

    @ObfuscatedName("bd.h(B)V")
    public void method972() {
        this.field567 = class292.field3700;
    }

    @ObfuscatedName("bd.e(B)Z")
    public final boolean method973() {
        if (class292.field3700 == this.field567) {
            this.method999();
        }
        return class292.field3699 == this.field567;
    }

    @ObfuscatedName("bd.b(B)V")
    public void method999() {
        this.field567 = Statics.field191.field1000.method4968(this.field562) ? class292.field3699 : class292.field3701;
    }

    @ObfuscatedName("bd.l(B)V")
    public void method975() {
        this.field566 = class292.field3700;
    }

    @ObfuscatedName("bd.w(B)Z")
    public final boolean method976() {
        if (class292.field3700 == this.field566) {
            this.method977();
        }
        return class292.field3699 == this.field566;
    }

    @ObfuscatedName("bd.d(I)V")
    public void method977() {
        this.field566 = Statics.field191.field1001.method4968(this.field562) ? class292.field3699 : class292.field3701;
    }

    @ObfuscatedName("bd.n(B)V")
    public final void method978() {
        if (this.field563 == null) {
            this.field562 = null;
        } else {
            this.field562 = new class294(client.method2128(this.field563), Statics.field459);
        }
    }
}
