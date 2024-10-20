package deob;

@ObfuscatedName("co")
public class class65 extends class469 {

    @ObfuscatedName("co.au")
    public int field503;

    @ObfuscatedName("co.ae")
    public int field499;

    @ObfuscatedName("co.ao")
    public int field500;

    @ObfuscatedName("co.at")
    public String field501;

    @ObfuscatedName("co.ac")
    public class538 field502;

    @ObfuscatedName("co.ai")
    public class438 field498 = class438.field4675;

    @ObfuscatedName("co.az")
    public class438 field504 = class438.field4675;

    @ObfuscatedName("co.ap")
    public String field505;

    @ObfuscatedName("co.aa")
    public String field506;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1130(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("co.au(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1130(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class111.field1422 - 1;
        this.field503 = var5;
        this.field499 = client.field833;
        this.field500 = arg0;
        this.field501 = arg1;
        this.method1151();
        this.field505 = arg2;
        this.field506 = arg3;
        this.method1127();
        this.method1143();
    }

    @ObfuscatedName("co.ae(I)V")
    public void method1127() {
        this.field498 = class438.field4675;
    }

    @ObfuscatedName("co.ao(B)Z")
    public final boolean method1145() {
        if (class438.field4675 == this.field498) {
            this.method1129();
        }
        return class438.field4674 == this.field498;
    }

    @ObfuscatedName("co.at(B)V")
    public void method1129() {
        this.field498 = Statics.field3367.field855.method7307(this.field502) ? class438.field4674 : class438.field4673;
    }

    @ObfuscatedName("co.ac(B)V")
    public void method1143() {
        this.field504 = class438.field4675;
    }

    @ObfuscatedName("co.ai(I)Z")
    public final boolean method1131() {
        if (class438.field4675 == this.field504) {
            this.method1148();
        }
        return class438.field4674 == this.field504;
    }

    @ObfuscatedName("co.az(I)V")
    public void method1148() {
        this.field504 = Statics.field3367.field853.method7307(this.field502) ? class438.field4674 : class438.field4673;
    }

    @ObfuscatedName("co.ap(B)V")
    public final void method1151() {
        if (this.field501 == null) {
            this.field502 = null;
        } else {
            this.field502 = new class538(client.method3264(this.field501), Statics.field4388);
        }
    }
}
