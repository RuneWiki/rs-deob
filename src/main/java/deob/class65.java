package deob;

@ObfuscatedName("ci")
public class class65 extends class502 {

    @ObfuscatedName("ci.ab")
    public int field454;

    @ObfuscatedName("ci.ay")
    public int field453;

    @ObfuscatedName("ci.an")
    public int field458;

    @ObfuscatedName("ci.au")
    public String field455;

    @ObfuscatedName("ci.ax")
    public class572 field456;

    @ObfuscatedName("ci.ao")
    public class477 field452 = class477.field4943;

    @ObfuscatedName("ci.am")
    public class477 field460 = class477.field4943;

    @ObfuscatedName("ci.ac")
    public String field459;

    @ObfuscatedName("ci.ae")
    public String field457;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1105(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ci.ab(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1105(int arg0, String arg1, String arg2, String arg3) {
        this.field454 = class114.method6872();
        this.field453 = client.field519;
        this.field458 = arg0;
        this.field455 = arg1;
        this.method1104();
        this.field459 = arg2;
        this.field457 = arg3;
        this.method1106();
        this.method1109();
    }

    @ObfuscatedName("ci.ay(I)V")
    public void method1106() {
        this.field452 = class477.field4943;
    }

    @ObfuscatedName("ci.an(B)Z")
    public final boolean method1132() {
        if (class477.field4943 == this.field452) {
            this.method1118();
        }
        return class477.field4939 == this.field452;
    }

    @ObfuscatedName("ci.au(I)V")
    public void method1118() {
        this.field452 = Statics.field3011.field826.method8000(this.field456) ? class477.field4939 : class477.field4941;
    }

    @ObfuscatedName("ci.ax(I)V")
    public void method1109() {
        this.field460 = class477.field4943;
    }

    @ObfuscatedName("ci.ao(I)Z")
    public final boolean method1110() {
        if (class477.field4943 == this.field460) {
            this.method1125();
        }
        return class477.field4939 == this.field460;
    }

    @ObfuscatedName("ci.am(B)V")
    public void method1125() {
        this.field460 = Statics.field3011.field822.method8000(this.field456) ? class477.field4939 : class477.field4941;
    }

    @ObfuscatedName("ci.ac(I)V")
    public final void method1104() {
        if (this.field455 == null) {
            this.field456 = null;
        } else {
            this.field456 = new class572(client.method1092(this.field455), Statics.field848);
        }
    }
}
