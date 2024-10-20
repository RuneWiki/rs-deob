package deob;

@ObfuscatedName("bn")
public class class65 extends class176 {

    @ObfuscatedName("bn.c")
    public int field601;

    @ObfuscatedName("bn.t")
    public int field596;

    @ObfuscatedName("bn.o")
    public int field597;

    @ObfuscatedName("bn.e")
    public String field606;

    @ObfuscatedName("bn.i")
    public class284 field599;

    @ObfuscatedName("bn.g")
    public class282 field600 = class282.field3606;

    @ObfuscatedName("bn.d")
    public class282 field595 = class282.field3606;

    @ObfuscatedName("bn.l")
    public String field602;

    @ObfuscatedName("bn.j")
    public String field603;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1066(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bn.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1066(int arg0, String arg1, String arg2, String arg3) {
        this.field601 = class92.method41();
        this.field596 = client.field656;
        this.field597 = arg0;
        this.field606 = arg1;
        this.method1068();
        this.field602 = arg2;
        this.field603 = arg3;
        this.method1073();
        this.method1100();
    }

    @ObfuscatedName("bn.t(I)V")
    public void method1073() {
        this.field600 = class282.field3606;
    }

    @ObfuscatedName("bn.o(B)Z")
    public final boolean method1070() {
        if (class282.field3606 == this.field600) {
            this.method1069();
        }
        return class282.field3605 == this.field600;
    }

    @ObfuscatedName("bn.e(B)V")
    public void method1069() {
        this.field600 = Statics.field415.field1055.method4735(this.field599) ? class282.field3605 : class282.field3604;
    }

    @ObfuscatedName("bn.i(I)V")
    public void method1100() {
        this.field595 = class282.field3606;
    }

    @ObfuscatedName("bn.g(I)Z")
    public final boolean method1071() {
        if (class282.field3606 == this.field595) {
            this.method1072();
        }
        return class282.field3605 == this.field595;
    }

    @ObfuscatedName("bn.d(I)V")
    public void method1072() {
        this.field595 = Statics.field415.field1059.method4735(this.field599) ? class282.field3605 : class282.field3604;
    }

    @ObfuscatedName("bn.l(I)V")
    public final void method1068() {
        if (this.field606 == null) {
            this.field599 = null;
        } else {
            this.field599 = new class284(client.method1060(this.field606), Statics.field2390);
        }
    }
}
