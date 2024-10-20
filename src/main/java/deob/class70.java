package deob;

@ObfuscatedName("bl")
public class class70 extends class206 {

    @ObfuscatedName("bl.p")
    public int field775 = Statics.method955();

    @ObfuscatedName("bl.i")
    public int field772 = client.field832;

    @ObfuscatedName("bl.w")
    public int field773;

    @ObfuscatedName("bl.s")
    public String field774;

    @ObfuscatedName("bl.j")
    public class281 field778;

    @ObfuscatedName("bl.a")
    public class279 field776 = class279.field3691;

    @ObfuscatedName("bl.t")
    public class279 field777 = class279.field3691;

    @ObfuscatedName("bl.r")
    public String field771;

    @ObfuscatedName("bl.m")
    public String field779;

    public class70(int arg0, String arg1, String arg2, String arg3) {
        this.field773 = arg0;
        this.field774 = arg1;
        this.method1005();
        this.field771 = arg2;
        this.field779 = arg3;
    }

    @ObfuscatedName("bl.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1006(int arg0, String arg1, String arg2, String arg3) {
        this.field775 = Statics.method955();
        this.field772 = client.field832;
        this.field773 = arg0;
        this.field774 = arg1;
        this.method1005();
        this.field771 = arg2;
        this.field779 = arg3;
    }

    @ObfuscatedName("bl.i(B)V")
    public void method1022() {
        this.field776 = class279.field3691;
    }

    @ObfuscatedName("bl.w(B)Z")
    public final boolean method1000() {
        if (class279.field3691 == this.field776) {
            this.method1001();
        }
        return class279.field3692 == this.field776;
    }

    @ObfuscatedName("bl.s(I)V")
    public void method1001() {
        this.field776 = Statics.field2282.field1192.method4684(this.field778) ? class279.field3692 : class279.field3693;
    }

    @ObfuscatedName("bl.j(I)V")
    public void method1002() {
        this.field777 = class279.field3691;
    }

    @ObfuscatedName("bl.a(I)Z")
    public final boolean method1025() {
        if (class279.field3691 == this.field777) {
            this.method1004();
        }
        return class279.field3692 == this.field777;
    }

    @ObfuscatedName("bl.t(I)V")
    public void method1004() {
        this.field777 = Statics.field2282.field1197.method4684(this.field778) ? class279.field3692 : class279.field3693;
    }

    @ObfuscatedName("bl.r(I)V")
    public final void method1005() {
        if (this.field774 == null) {
            this.field778 = null;
        } else {
            this.field778 = new class281(client.method330(this.field774), Statics.field459);
        }
    }
}
