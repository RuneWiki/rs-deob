package deob;

@ObfuscatedName("bv")
public class class71 extends class219 {

    @ObfuscatedName("bv.o")
    public int field828;

    @ObfuscatedName("bv.k")
    public int field829;

    @ObfuscatedName("bv.t")
    public int field823;

    @ObfuscatedName("bv.d")
    public String field824;

    @ObfuscatedName("bv.h")
    public class306 field825;

    @ObfuscatedName("bv.m")
    public class304 field821 = class304.field3852;

    @ObfuscatedName("bv.z")
    public class304 field822 = class304.field3852;

    @ObfuscatedName("bv.i")
    public String field826;

    @ObfuscatedName("bv.u")
    public String field827;

    public class71(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class96.field1453 - 1;
        this.field828 = var5;
        this.field829 = client.field929;
        this.field823 = arg0;
        this.field824 = arg1;
        this.method1040();
        this.field826 = arg2;
        this.field827 = arg3;
    }

    @ObfuscatedName("bv.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1033(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class96.field1453 - 1;
        this.field828 = var5;
        this.field829 = client.field929;
        this.field823 = arg0;
        this.field824 = arg1;
        this.method1040();
        this.field826 = arg2;
        this.field827 = arg3;
    }

    @ObfuscatedName("bv.k(I)V")
    public void method1035() {
        this.field821 = class304.field3852;
    }

    @ObfuscatedName("bv.t(B)Z")
    public final boolean method1036() {
        if (class304.field3852 == this.field821) {
            this.method1037();
        }
        return class304.field3851 == this.field821;
    }

    @ObfuscatedName("bv.d(I)V")
    public void method1037() {
        this.field821 = Statics.field426.field1257.method4918(this.field825) ? class304.field3851 : class304.field3850;
    }

    @ObfuscatedName("bv.h(B)V")
    public void method1049() {
        this.field822 = class304.field3852;
    }

    @ObfuscatedName("bv.m(I)Z")
    public final boolean method1039() {
        if (class304.field3852 == this.field822) {
            this.method1048();
        }
        return class304.field3851 == this.field822;
    }

    @ObfuscatedName("bv.z(I)V")
    public void method1048() {
        this.field822 = Statics.field426.field1255.method4918(this.field825) ? class304.field3851 : class304.field3850;
    }

    @ObfuscatedName("bv.i(I)V")
    public final void method1040() {
        if (this.field824 == null) {
            this.field825 = null;
        } else {
            this.field825 = new class306(client.method5067(this.field824), Statics.field2519);
        }
    }
}
