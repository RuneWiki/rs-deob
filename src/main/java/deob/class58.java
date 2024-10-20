package deob;

@ObfuscatedName("br")
public class class58 extends class405 {

    @ObfuscatedName("br.c")
    public int field455;

    @ObfuscatedName("br.v")
    public int field453;

    @ObfuscatedName("br.q")
    public int field460;

    @ObfuscatedName("br.f")
    public String field463;

    @ObfuscatedName("br.j")
    public class464 field456;

    @ObfuscatedName("br.e")
    public class376 field457 = class376.field4334;

    @ObfuscatedName("br.g")
    public class376 field461 = class376.field4334;

    @ObfuscatedName("br.w")
    public String field459;

    @ObfuscatedName("br.y")
    public String field452;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method985(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("br.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public void method985(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class99.field1338 - 1;
        this.field455 = var5;
        this.field453 = client.field552;
        this.field460 = arg0;
        this.field463 = arg1;
        this.method992();
        this.field459 = arg2;
        this.field452 = arg3;
        this.method1000();
        this.method989();
    }

    @ObfuscatedName("br.v(I)V")
    public void method1000() {
        this.field457 = class376.field4334;
    }

    @ObfuscatedName("br.q(I)Z")
    public final boolean method987() {
        if (class376.field4334 == this.field457) {
            this.method988();
        }
        return class376.field4331 == this.field457;
    }

    @ObfuscatedName("br.f(I)V")
    public void method988() {
        this.field457 = Statics.field1116.field801.method6158(this.field456) ? class376.field4331 : class376.field4332;
    }

    @ObfuscatedName("br.j(I)V")
    public void method989() {
        this.field461 = class376.field4334;
    }

    @ObfuscatedName("br.e(B)Z")
    public final boolean method990() {
        if (class376.field4334 == this.field461) {
            this.method991();
        }
        return class376.field4331 == this.field461;
    }

    @ObfuscatedName("br.g(I)V")
    public void method991() {
        this.field461 = Statics.field1116.field802.method6158(this.field456) ? class376.field4331 : class376.field4332;
    }

    @ObfuscatedName("br.w(I)V")
    public final void method992() {
        if (this.field463 == null) {
            this.field456 = null;
        } else {
            this.field456 = new class464(client.method2273(this.field463), Statics.field1888);
        }
    }
}
