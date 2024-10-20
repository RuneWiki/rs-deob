package deob;

@ObfuscatedName("ct")
public class class65 extends class504 {

    @ObfuscatedName("ct.ac")
    public int field470;

    @ObfuscatedName("ct.ae")
    public int field467;

    @ObfuscatedName("ct.ag")
    public int field476;

    @ObfuscatedName("ct.am")
    public String field469;

    @ObfuscatedName("ct.ax")
    public class574 field468;

    @ObfuscatedName("ct.aq")
    public class479 field471 = class479.field5002;

    @ObfuscatedName("ct.af")
    public class479 field477 = class479.field5002;

    @ObfuscatedName("ct.at")
    public String field473;

    @ObfuscatedName("ct.au")
    public String field466;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1159(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ct.ac(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1159(int arg0, String arg1, String arg2, String arg3) {
        this.field470 = class116.method6701();
        this.field467 = client.field609;
        this.field476 = arg0;
        this.field469 = arg1;
        this.method1151();
        this.field473 = arg2;
        this.field466 = arg3;
        this.method1145();
        this.method1163();
    }

    @ObfuscatedName("ct.ae(I)V")
    public void method1145() {
        this.field471 = class479.field5002;
    }

    @ObfuscatedName("ct.ag(I)Z")
    public final boolean method1167() {
        if (class479.field5002 == this.field471) {
            this.method1147();
        }
        return class479.field5003 == this.field471;
    }

    @ObfuscatedName("ct.am(I)V")
    public void method1147() {
        this.field471 = Statics.field4723.field845.method8154(this.field468) ? class479.field5003 : class479.field5005;
    }

    @ObfuscatedName("ct.ax(B)V")
    public void method1163() {
        this.field477 = class479.field5002;
    }

    @ObfuscatedName("ct.aq(I)Z")
    public final boolean method1149() {
        if (class479.field5002 == this.field477) {
            this.method1146();
        }
        return class479.field5003 == this.field477;
    }

    @ObfuscatedName("ct.af(B)V")
    public void method1146() {
        this.field477 = Statics.field4723.field846.method8154(this.field468) ? class479.field5003 : class479.field5005;
    }

    @ObfuscatedName("ct.at(I)V")
    public final void method1151() {
        if (this.field469 == null) {
            this.field468 = null;
        } else {
            this.field468 = new class574(client.method3296(this.field469), Statics.field127);
        }
    }
}
