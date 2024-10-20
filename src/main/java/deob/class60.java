package deob;

@ObfuscatedName("bq")
public class class60 extends class209 {

    @ObfuscatedName("bq.c")
    public int field603;

    @ObfuscatedName("bq.q")
    public int field591;

    @ObfuscatedName("bq.m")
    public int field592;

    @ObfuscatedName("bq.j")
    public String field593;

    @ObfuscatedName("bq.g")
    public class294 field600;

    @ObfuscatedName("bq.i")
    public class292 field590 = class292.field3682;

    @ObfuscatedName("bq.h")
    public class292 field596 = class292.field3682;

    @ObfuscatedName("bq.l")
    public String field597;

    @ObfuscatedName("bq.d")
    public String field598;

    public class60(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1237 - 1;
        this.field603 = var5;
        this.field591 = client.field654;
        this.field592 = arg0;
        this.field593 = arg1;
        this.method999();
        this.field597 = arg2;
        this.field598 = arg3;
    }

    @ObfuscatedName("bq.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1001(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class86.field1237 - 1;
        this.field603 = var5;
        this.field591 = client.field654;
        this.field592 = arg0;
        this.field593 = arg1;
        this.method999();
        this.field597 = arg2;
        this.field598 = arg3;
    }

    @ObfuscatedName("bq.q(I)V")
    public void method994() {
        this.field590 = class292.field3682;
    }

    @ObfuscatedName("bq.m(I)Z")
    public final boolean method1004() {
        if (class292.field3682 == this.field590) {
            this.method996();
        }
        return class292.field3683 == this.field590;
    }

    @ObfuscatedName("bq.j(B)V")
    public void method996() {
        this.field590 = Statics.field40.field1025.method4972(this.field600) ? class292.field3683 : class292.field3684;
    }

    @ObfuscatedName("bq.g(B)V")
    public void method997() {
        this.field596 = class292.field3682;
    }

    @ObfuscatedName("bq.i(B)Z")
    public final boolean method1010() {
        if (class292.field3682 == this.field596) {
            this.method998();
        }
        return class292.field3683 == this.field596;
    }

    @ObfuscatedName("bq.h(I)V")
    public void method998() {
        this.field596 = Statics.field40.field1029.method4972(this.field600) ? class292.field3683 : class292.field3684;
    }

    @ObfuscatedName("bq.l(B)V")
    public final void method999() {
        if (this.field593 == null) {
            this.field600 = null;
        } else {
            this.field600 = new class294(client.method3842(this.field593), Statics.field252);
        }
    }
}
