package deob;

@ObfuscatedName("bb")
public class class58 extends class406 {

    @ObfuscatedName("bb.s")
    public int field466;

    @ObfuscatedName("bb.h")
    public int field458;

    @ObfuscatedName("bb.w")
    public int field459;

    @ObfuscatedName("bb.v")
    public String field460;

    @ObfuscatedName("bb.c")
    public class465 field457;

    @ObfuscatedName("bb.q")
    public class377 field465 = class377.field4329;

    @ObfuscatedName("bb.i")
    public class377 field462 = class377.field4329;

    @ObfuscatedName("bb.k")
    public String field464;

    @ObfuscatedName("bb.o")
    public String field463;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method962(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bb.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method962(int arg0, String arg1, String arg2, String arg3) {
        this.field466 = class99.method1867();
        this.field458 = client.field487;
        this.field459 = arg0;
        this.field460 = arg1;
        this.method969();
        this.field464 = arg2;
        this.field463 = arg3;
        this.method963();
        this.method966();
    }

    @ObfuscatedName("bb.h(B)V")
    public void method963() {
        this.field465 = class377.field4329;
    }

    @ObfuscatedName("bb.w(B)Z")
    public final boolean method987() {
        if (class377.field4329 == this.field465) {
            this.method965();
        }
        return class377.field4330 == this.field465;
    }

    @ObfuscatedName("bb.v(B)V")
    public void method965() {
        this.field465 = Statics.field4063.field793.method6022(this.field457) ? class377.field4330 : class377.field4331;
    }

    @ObfuscatedName("bb.c(B)V")
    public void method966() {
        this.field462 = class377.field4329;
    }

    @ObfuscatedName("bb.q(S)Z")
    public final boolean method985() {
        if (class377.field4329 == this.field462) {
            this.method967();
        }
        return class377.field4330 == this.field462;
    }

    @ObfuscatedName("bb.i(I)V")
    public void method967() {
        this.field462 = Statics.field4063.field791.method6022(this.field457) ? class377.field4330 : class377.field4331;
    }

    @ObfuscatedName("bb.k(I)V")
    public final void method969() {
        if (this.field460 == null) {
            this.field457 = null;
        } else {
            this.field457 = new class465(client.method4440(this.field460), Statics.field2008);
        }
    }
}
