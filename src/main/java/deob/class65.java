package deob;

@ObfuscatedName("co")
public class class65 extends class481 {

    @ObfuscatedName("co.at")
    public int field471;

    @ObfuscatedName("co.ah")
    public int field463;

    @ObfuscatedName("co.ar")
    public int field468;

    @ObfuscatedName("co.ao")
    public String field465;

    @ObfuscatedName("co.ab")
    public class550 field466;

    @ObfuscatedName("co.au")
    public class450 field467 = class450.field4705;

    @ObfuscatedName("co.aa")
    public class450 field462 = class450.field4705;

    @ObfuscatedName("co.ac")
    public String field469;

    @ObfuscatedName("co.al")
    public String field464;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1135(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("co.at(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1135(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class111.field1398 - 1;
        this.field471 = var5;
        this.field463 = client.field500;
        this.field468 = arg0;
        this.field465 = arg1;
        this.method1140();
        this.field469 = arg2;
        this.field464 = arg3;
        this.method1133();
        this.method1134();
    }

    @ObfuscatedName("co.ah(I)V")
    public void method1133() {
        this.field467 = class450.field4705;
    }

    @ObfuscatedName("co.ar(S)Z")
    public final boolean method1136() {
        if (class450.field4705 == this.field467) {
            this.method1154();
        }
        return class450.field4706 == this.field467;
    }

    @ObfuscatedName("co.ao(I)V")
    public void method1154() {
        this.field467 = Statics.field52.field815.method7439(this.field466) ? class450.field4706 : class450.field4707;
    }

    @ObfuscatedName("co.ab(I)V")
    public void method1134() {
        this.field462 = class450.field4705;
    }

    @ObfuscatedName("co.au(B)Z")
    public final boolean method1139() {
        if (class450.field4705 == this.field462) {
            this.method1153();
        }
        return class450.field4706 == this.field462;
    }

    @ObfuscatedName("co.aa(I)V")
    public void method1153() {
        this.field462 = Statics.field52.field816.method7439(this.field466) ? class450.field4706 : class450.field4707;
    }

    @ObfuscatedName("co.ac(I)V")
    public final void method1140() {
        if (this.field465 == null) {
            this.field466 = null;
        } else {
            this.field466 = new class550(client.method2808(this.field465), Statics.field1079);
        }
    }
}
