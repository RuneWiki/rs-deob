package deob;

@ObfuscatedName("bc")
public class class58 extends class364 {

    @ObfuscatedName("bc.n")
    public int field455;

    @ObfuscatedName("bc.c")
    public int field454;

    @ObfuscatedName("bc.m")
    public int field458;

    @ObfuscatedName("bc.k")
    public String field457;

    @ObfuscatedName("bc.o")
    public class421 field456;

    @ObfuscatedName("bc.g")
    public class342 field459 = class342.field3967;

    @ObfuscatedName("bc.z")
    public class342 field460 = class342.field3967;

    @ObfuscatedName("bc.a")
    public String field461;

    @ObfuscatedName("bc.u")
    public String field462;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method1015(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bc.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1015(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class98.field1271 - 1;
        this.field455 = var5;
        this.field454 = client.field744;
        this.field458 = arg0;
        this.field457 = arg1;
        this.method1022();
        this.field461 = arg2;
        this.field462 = arg3;
        this.method1016();
        this.method1019();
    }

    @ObfuscatedName("bc.c(I)V")
    public void method1016() {
        this.field459 = class342.field3967;
    }

    @ObfuscatedName("bc.m(I)Z")
    public final boolean method1017() {
        if (class342.field3967 == this.field459) {
            this.method1039();
        }
        return class342.field3969 == this.field459;
    }

    @ObfuscatedName("bc.k(I)V")
    public void method1039() {
        this.field459 = Statics.field100.field792.method5489(this.field456) ? class342.field3969 : class342.field3968;
    }

    @ObfuscatedName("bc.o(I)V")
    public void method1019() {
        this.field460 = class342.field3967;
    }

    @ObfuscatedName("bc.g(I)Z")
    public final boolean method1020() {
        if (class342.field3967 == this.field460) {
            this.method1021();
        }
        return class342.field3969 == this.field460;
    }

    @ObfuscatedName("bc.z(I)V")
    public void method1021() {
        this.field460 = Statics.field100.field791.method5489(this.field456) ? class342.field3969 : class342.field3968;
    }

    @ObfuscatedName("bc.a(I)V")
    public final void method1022() {
        if (this.field457 == null) {
            this.field456 = null;
        } else {
            this.field456 = new class421(client.method3267(this.field457), Statics.field310);
        }
    }
}
