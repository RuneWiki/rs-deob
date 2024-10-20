package deob;

@ObfuscatedName("be")
public class class58 extends class404 {

    @ObfuscatedName("be.v")
    public int field479;

    @ObfuscatedName("be.c")
    public int field470;

    @ObfuscatedName("be.i")
    public int field471;

    @ObfuscatedName("be.f")
    public String field472;

    @ObfuscatedName("be.b")
    public class459 field469;

    @ObfuscatedName("be.n")
    public class376 field475 = class376.field4271;

    @ObfuscatedName("be.s")
    public class376 field473 = class376.field4271;

    @ObfuscatedName("be.l")
    public String field476;

    @ObfuscatedName("be.q")
    public String field474;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method1024(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("be.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1024(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class99.field1307 - 1;
        this.field479 = var5;
        this.field470 = client.field507;
        this.field471 = arg0;
        this.field472 = arg1;
        this.method1031();
        this.field476 = arg2;
        this.field474 = arg3;
        this.method1025();
        this.method1051();
    }

    @ObfuscatedName("be.c(I)V")
    public void method1025() {
        this.field475 = class376.field4271;
    }

    @ObfuscatedName("be.i(B)Z")
    public final boolean method1026() {
        if (class376.field4271 == this.field475) {
            this.method1027();
        }
        return class376.field4274 == this.field475;
    }

    @ObfuscatedName("be.f(I)V")
    public void method1027() {
        this.field475 = Statics.field399.field802.method6131(this.field469) ? class376.field4274 : class376.field4273;
    }

    @ObfuscatedName("be.b(I)V")
    public void method1051() {
        this.field473 = class376.field4271;
    }

    @ObfuscatedName("be.n(I)Z")
    public final boolean method1029() {
        if (class376.field4271 == this.field473) {
            this.method1030();
        }
        return class376.field4274 == this.field473;
    }

    @ObfuscatedName("be.s(I)V")
    public void method1030() {
        this.field473 = Statics.field399.field807.method6131(this.field469) ? class376.field4274 : class376.field4273;
    }

    @ObfuscatedName("be.l(I)V")
    public final void method1031() {
        if (this.field472 == null) {
            this.field469 = null;
        } else {
            this.field469 = new class459(client.method2970(this.field472), Statics.field1480);
        }
    }
}
