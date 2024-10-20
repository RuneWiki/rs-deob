package deob;

@ObfuscatedName("cn")
public class class65 extends class489 {

    @ObfuscatedName("cn.az")
    public int field468;

    @ObfuscatedName("cn.ah")
    public int field465;

    @ObfuscatedName("cn.af")
    public int field464;

    @ObfuscatedName("cn.at")
    public String field467;

    @ObfuscatedName("cn.an")
    public class558 field472;

    @ObfuscatedName("cn.ao")
    public class458 field469 = class458.field4813;

    @ObfuscatedName("cn.ab")
    public class458 field470 = class458.field4813;

    @ObfuscatedName("cn.aw")
    public String field471;

    @ObfuscatedName("cn.ad")
    public String field466;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1084(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cn.az(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1084(int arg0, String arg1, String arg2, String arg3) {
        this.field468 = class112.method2861();
        this.field465 = client.field523;
        this.field464 = arg0;
        this.field467 = arg1;
        this.method1091();
        this.field471 = arg2;
        this.field466 = arg3;
        this.method1085();
        this.method1090();
    }

    @ObfuscatedName("cn.ah(I)V")
    public void method1085() {
        this.field469 = class458.field4813;
    }

    @ObfuscatedName("cn.af(I)Z")
    public final boolean method1100() {
        if (class458.field4813 == this.field469) {
            this.method1087();
        }
        return class458.field4809 == this.field469;
    }

    @ObfuscatedName("cn.at(S)V")
    public void method1087() {
        this.field469 = Statics.field3621.field834.method7475(this.field472) ? class458.field4809 : class458.field4810;
    }

    @ObfuscatedName("cn.an(B)V")
    public void method1090() {
        this.field470 = class458.field4813;
    }

    @ObfuscatedName("cn.ao(I)Z")
    public final boolean method1089() {
        if (class458.field4813 == this.field470) {
            this.method1102();
        }
        return class458.field4809 == this.field470;
    }

    @ObfuscatedName("cn.ab(B)V")
    public void method1102() {
        this.field470 = Statics.field3621.field840.method7475(this.field472) ? class458.field4809 : class458.field4810;
    }

    @ObfuscatedName("cn.aw(I)V")
    public final void method1091() {
        if (this.field467 == null) {
            this.field472 = null;
        } else {
            this.field472 = new class558(client.method5709(this.field467), Statics.field1527);
        }
    }
}
