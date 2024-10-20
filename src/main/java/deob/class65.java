package deob;

@ObfuscatedName("bl")
public class class65 extends class214 {

    @ObfuscatedName("bl.a")
    public int field602;

    @ObfuscatedName("bl.s")
    public int field595;

    @ObfuscatedName("bl.g")
    public int field604;

    @ObfuscatedName("bl.x")
    public String field594;

    @ObfuscatedName("bl.h")
    public class298 field598;

    @ObfuscatedName("bl.f")
    public class296 field599 = class296.field3721;

    @ObfuscatedName("bl.p")
    public class296 field600 = class296.field3721;

    @ObfuscatedName("bl.m")
    public String field601;

    @ObfuscatedName("bl.q")
    public String field596;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1074(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bl.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1074(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class91.field1263 - 1;
        this.field602 = var5;
        this.field595 = client.field660;
        this.field604 = arg0;
        this.field594 = arg1;
        this.method1090();
        this.field601 = arg2;
        this.field596 = arg3;
        this.method1075();
        this.method1078();
    }

    @ObfuscatedName("bl.s(I)V")
    public void method1075() {
        this.field599 = class296.field3721;
    }

    @ObfuscatedName("bl.g(I)Z")
    public final boolean method1076() {
        if (class296.field3721 == this.field599) {
            this.method1073();
        }
        return class296.field3717 == this.field599;
    }

    @ObfuscatedName("bl.x(I)V")
    public void method1073() {
        this.field599 = Statics.field355.field1045.method5151(this.field598) ? class296.field3717 : class296.field3718;
    }

    @ObfuscatedName("bl.h(I)V")
    public void method1078() {
        this.field600 = class296.field3721;
    }

    @ObfuscatedName("bl.f(B)Z")
    public final boolean method1079() {
        if (class296.field3721 == this.field600) {
            this.method1091();
        }
        return class296.field3717 == this.field600;
    }

    @ObfuscatedName("bl.p(B)V")
    public void method1091() {
        this.field600 = Statics.field355.field1046.method5151(this.field598) ? class296.field3717 : class296.field3718;
    }

    @ObfuscatedName("bl.m(B)V")
    public final void method1090() {
        if (this.field594 == null) {
            this.field598 = null;
        } else {
            this.field598 = new class298(client.method4602(this.field594), Statics.field415);
        }
    }
}
