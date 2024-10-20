package deob;

@ObfuscatedName("bd")
public class class70 extends class215 {

    @ObfuscatedName("bd.b")
    public int field773 = class95.method109();

    @ObfuscatedName("bd.q")
    public int field766 = client.field830;

    @ObfuscatedName("bd.o")
    public int field765;

    @ObfuscatedName("bd.p")
    public String field768;

    @ObfuscatedName("bd.a")
    public class292 field777;

    @ObfuscatedName("bd.h")
    public class290 field770 = class290.field3724;

    @ObfuscatedName("bd.l")
    public class290 field771 = class290.field3724;

    @ObfuscatedName("bd.y")
    public String field772;

    @ObfuscatedName("bd.g")
    public String field769;

    public class70(int arg0, String arg1, String arg2, String arg3) {
        this.field765 = arg0;
        this.field768 = arg1;
        this.method1058();
        this.field772 = arg2;
        this.field769 = arg3;
    }

    @ObfuscatedName("bd.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1051(int arg0, String arg1, String arg2, String arg3) {
        this.field773 = class95.method109();
        this.field766 = client.field830;
        this.field765 = arg0;
        this.field768 = arg1;
        this.method1058();
        this.field772 = arg2;
        this.field769 = arg3;
    }

    @ObfuscatedName("bd.q(I)V")
    public void method1052() {
        this.field770 = class290.field3724;
    }

    @ObfuscatedName("bd.o(B)Z")
    public final boolean method1057() {
        if (class290.field3724 == this.field770) {
            this.method1072();
        }
        return class290.field3723 == this.field770;
    }

    @ObfuscatedName("bd.p(I)V")
    public void method1072() {
        this.field770 = Statics.field1278.field1195.method4829(this.field777) ? class290.field3723 : class290.field3727;
    }

    @ObfuscatedName("bd.a(I)V")
    public void method1053() {
        this.field771 = class290.field3724;
    }

    @ObfuscatedName("bd.h(S)Z")
    public final boolean method1075() {
        if (class290.field3724 == this.field771) {
            this.method1055();
        }
        return class290.field3723 == this.field771;
    }

    @ObfuscatedName("bd.l(I)V")
    public void method1055() {
        this.field771 = Statics.field1278.field1194.method4829(this.field777) ? class290.field3723 : class290.field3727;
    }

    @ObfuscatedName("bd.y(B)V")
    public final void method1058() {
        if (this.field768 == null) {
            this.field777 = null;
        } else {
            this.field777 = new class292(client.method1717(this.field768), Statics.field2759);
        }
    }
}
