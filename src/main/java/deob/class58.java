package deob;

@ObfuscatedName("bo")
public class class58 extends class406 {

    @ObfuscatedName("bo.o")
    public int field471;

    @ObfuscatedName("bo.q")
    public int field462;

    @ObfuscatedName("bo.l")
    public int field466;

    @ObfuscatedName("bo.k")
    public String field468;

    @ObfuscatedName("bo.a")
    public class461 field465;

    @ObfuscatedName("bo.m")
    public class377 field463 = class377.field4338;

    @ObfuscatedName("bo.p")
    public class377 field467 = class377.field4338;

    @ObfuscatedName("bo.s")
    public String field461;

    @ObfuscatedName("bo.r")
    public String field469;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method999(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bo.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method999(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class99.field1335 - 1;
        this.field471 = var5;
        this.field462 = client.field631;
        this.field466 = arg0;
        this.field468 = arg1;
        this.method1006();
        this.field461 = arg2;
        this.field469 = arg3;
        this.method1000();
        this.method1028();
    }

    @ObfuscatedName("bo.q(I)V")
    public void method1000() {
        this.field463 = class377.field4338;
    }

    @ObfuscatedName("bo.l(B)Z")
    public final boolean method1001() {
        if (class377.field4338 == this.field463) {
            this.method1002();
        }
        return class377.field4337 == this.field463;
    }

    @ObfuscatedName("bo.k(I)V")
    public void method1002() {
        this.field463 = Statics.field4350.field802.method6029(this.field465) ? class377.field4337 : class377.field4339;
    }

    @ObfuscatedName("bo.a(B)V")
    public void method1028() {
        this.field467 = class377.field4338;
    }

    @ObfuscatedName("bo.m(I)Z")
    public final boolean method1004() {
        if (class377.field4338 == this.field467) {
            this.method1021();
        }
        return class377.field4337 == this.field467;
    }

    @ObfuscatedName("bo.p(I)V")
    public void method1021() {
        this.field467 = Statics.field4350.field800.method6029(this.field465) ? class377.field4337 : class377.field4339;
    }

    @ObfuscatedName("bo.s(I)V")
    public final void method1006() {
        if (this.field468 == null) {
            this.field465 = null;
        } else {
            this.field465 = new class461(client.method2783(this.field468), Statics.field4426);
        }
    }
}
