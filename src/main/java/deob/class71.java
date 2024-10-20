package deob;

@ObfuscatedName("bk")
public class class71 extends class219 {

    @ObfuscatedName("bk.c")
    public int field812 = class96.method2660();

    @ObfuscatedName("bk.i")
    public int field815 = client.field867;

    @ObfuscatedName("bk.o")
    public int field806;

    @ObfuscatedName("bk.j")
    public String field807;

    @ObfuscatedName("bk.k")
    public class306 field804;

    @ObfuscatedName("bk.x")
    public class304 field809 = class304.field3843;

    @ObfuscatedName("bk.z")
    public class304 field810 = class304.field3843;

    @ObfuscatedName("bk.p")
    public String field808;

    @ObfuscatedName("bk.w")
    public String field813;

    public class71(int arg0, String arg1, String arg2, String arg3) {
        this.field806 = arg0;
        this.field807 = arg1;
        this.method1010();
        this.field808 = arg2;
        this.field813 = arg3;
    }

    @ObfuscatedName("bk.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1003(int arg0, String arg1, String arg2, String arg3) {
        this.field812 = class96.method2660();
        this.field815 = client.field867;
        this.field806 = arg0;
        this.field807 = arg1;
        this.method1010();
        this.field808 = arg2;
        this.field813 = arg3;
    }

    @ObfuscatedName("bk.i(I)V")
    public void method1026() {
        this.field809 = class304.field3843;
    }

    @ObfuscatedName("bk.o(I)Z")
    public final boolean method1005() {
        if (class304.field3843 == this.field809) {
            this.method1006();
        }
        return class304.field3842 == this.field809;
    }

    @ObfuscatedName("bk.j(I)V")
    public void method1006() {
        this.field809 = Statics.field2183.field1251.method4940(this.field804) ? class304.field3842 : class304.field3844;
    }

    @ObfuscatedName("bk.k(I)V")
    public void method1002() {
        this.field810 = class304.field3843;
    }

    @ObfuscatedName("bk.x(B)Z")
    public final boolean method1008() {
        if (class304.field3843 == this.field810) {
            this.method1009();
        }
        return class304.field3842 == this.field810;
    }

    @ObfuscatedName("bk.z(I)V")
    public void method1009() {
        this.field810 = Statics.field2183.field1250.method4940(this.field804) ? class304.field3842 : class304.field3844;
    }

    @ObfuscatedName("bk.p(I)V")
    public final void method1010() {
        if (this.field807 == null) {
            this.field804 = null;
        } else {
            this.field804 = new class306(client.method665(this.field807), Statics.field1108);
        }
    }
}
