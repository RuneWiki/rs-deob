package deob;

@ObfuscatedName("ce")
public class class65 extends class511 {

    @ObfuscatedName("ce.ap")
    public int field456;

    @ObfuscatedName("ce.aw")
    public int field453;

    @ObfuscatedName("ce.ak")
    public int field454;

    @ObfuscatedName("ce.aj")
    public String field455;

    @ObfuscatedName("ce.ai")
    public class581 field458;

    @ObfuscatedName("ce.ay")
    public class480 field457 = class480.field5026;

    @ObfuscatedName("ce.as")
    public class480 field463 = class480.field5026;

    @ObfuscatedName("ce.ae")
    public String field452;

    @ObfuscatedName("ce.am")
    public String field459;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1166(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ce.ap(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1166(int arg0, String arg1, String arg2, String arg3) {
        this.field456 = class116.method2908();
        this.field453 = client.field518;
        this.field454 = arg0;
        this.field455 = arg1;
        this.method1172();
        this.field452 = arg2;
        this.field459 = arg3;
        this.method1182();
        this.method1169();
    }

    @ObfuscatedName("ce.aw(B)V")
    public void method1182() {
        this.field457 = class480.field5026;
    }

    @ObfuscatedName("ce.ak(I)Z")
    public final boolean method1165() {
        if (class480.field5026 == this.field457) {
            this.method1179();
        }
        return class480.field5028 == this.field457;
    }

    @ObfuscatedName("ce.aj(I)V")
    public void method1179() {
        this.field457 = Statics.field1072.field826.method8358(this.field458) ? class480.field5028 : class480.field5027;
    }

    @ObfuscatedName("ce.ai(I)V")
    public void method1169() {
        this.field463 = class480.field5026;
    }

    @ObfuscatedName("ce.ay(B)Z")
    public final boolean method1170() {
        if (class480.field5026 == this.field463) {
            this.method1171();
        }
        return class480.field5028 == this.field463;
    }

    @ObfuscatedName("ce.as(I)V")
    public void method1171() {
        this.field463 = Statics.field1072.field832.method8358(this.field458) ? class480.field5028 : class480.field5027;
    }

    @ObfuscatedName("ce.ae(I)V")
    public final void method1172() {
        if (this.field455 == null) {
            this.field458 = null;
        } else {
            this.field458 = new class581(client.method5237(this.field455), Statics.field3276);
        }
    }
}
