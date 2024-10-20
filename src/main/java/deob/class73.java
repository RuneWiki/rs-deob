package deob;

@ObfuscatedName("bl")
public class class73 extends class348 {

    @ObfuscatedName("bl.f")
    public int field598;

    @ObfuscatedName("bl.e")
    public int field595;

    @ObfuscatedName("bl.v")
    public int field596;

    @ObfuscatedName("bl.y")
    public String field597;

    @ObfuscatedName("bl.j")
    public class329 field599;

    @ObfuscatedName("bl.o")
    public class328 field600 = class328.field3853;

    @ObfuscatedName("bl.m")
    public class328 field605 = class328.field3853;

    @ObfuscatedName("bl.r")
    public String field601;

    @ObfuscatedName("bl.h")
    public String field602;

    public class73(int arg0, String arg1, String arg2, String arg3) {
        this.method1032(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bl.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1032(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class112.field1392 - 1;
        this.field598 = var5;
        this.field595 = client.field631;
        this.field596 = arg0;
        this.field597 = arg1;
        this.method1015();
        this.field601 = arg2;
        this.field602 = arg3;
        this.method1022();
        this.method1012();
    }

    @ObfuscatedName("bl.e(B)V")
    public void method1022() {
        this.field600 = class328.field3853;
    }

    @ObfuscatedName("bl.v(B)Z")
    public final boolean method1007() {
        if (class328.field3853 == this.field600) {
            this.method1011();
        }
        return class328.field3852 == this.field600;
    }

    @ObfuscatedName("bl.y(B)V")
    public void method1011() {
        this.field600 = Statics.field288.field924.method5252(this.field599) ? class328.field3852 : class328.field3851;
    }

    @ObfuscatedName("bl.j(I)V")
    public void method1012() {
        this.field605 = class328.field3853;
    }

    @ObfuscatedName("bl.o(I)Z")
    public final boolean method1025() {
        if (class328.field3853 == this.field605) {
            this.method1014();
        }
        return class328.field3852 == this.field605;
    }

    @ObfuscatedName("bl.m(I)V")
    public void method1014() {
        this.field605 = Statics.field288.field926.method5252(this.field599) ? class328.field3852 : class328.field3851;
    }

    @ObfuscatedName("bl.r(B)V")
    public final void method1015() {
        if (this.field597 == null) {
            this.field599 = null;
        } else {
            this.field599 = new class329(client.method1003(this.field597), Statics.field1311);
        }
    }
}
