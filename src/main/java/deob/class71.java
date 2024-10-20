package deob;

@ObfuscatedName("bo")
public class class71 extends class219 {

    @ObfuscatedName("bo.t")
    public int field806;

    @ObfuscatedName("bo.q")
    public int field803;

    @ObfuscatedName("bo.i")
    public int field804;

    @ObfuscatedName("bo.a")
    public String field810;

    @ObfuscatedName("bo.l")
    public class306 field812;

    @ObfuscatedName("bo.b")
    public class304 field805 = class304.field3851;

    @ObfuscatedName("bo.e")
    public class304 field808 = class304.field3851;

    @ObfuscatedName("bo.x")
    public String field809;

    @ObfuscatedName("bo.p")
    public String field811;

    public class71(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class96.field1423 - 1;
        this.field806 = var5;
        this.field803 = client.field1108;
        this.field804 = arg0;
        this.field810 = arg1;
        this.method1061();
        this.field809 = arg2;
        this.field811 = arg3;
    }

    @ObfuscatedName("bo.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1054(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class96.field1423 - 1;
        this.field806 = var5;
        this.field803 = client.field1108;
        this.field804 = arg0;
        this.field810 = arg1;
        this.method1061();
        this.field809 = arg2;
        this.field811 = arg3;
    }

    @ObfuscatedName("bo.q(B)V")
    public void method1055() {
        this.field805 = class304.field3851;
    }

    @ObfuscatedName("bo.i(I)Z")
    public final boolean method1063() {
        if (class304.field3851 == this.field805) {
            this.method1057();
        }
        return class304.field3847 == this.field805;
    }

    @ObfuscatedName("bo.a(I)V")
    public void method1057() {
        this.field805 = Statics.field2030.field1230.method4973(this.field812) ? class304.field3847 : class304.field3848;
    }

    @ObfuscatedName("bo.l(I)V")
    public void method1058() {
        this.field808 = class304.field3851;
    }

    @ObfuscatedName("bo.b(I)Z")
    public final boolean method1075() {
        if (class304.field3851 == this.field808) {
            this.method1060();
        }
        return class304.field3847 == this.field808;
    }

    @ObfuscatedName("bo.e(I)V")
    public void method1060() {
        this.field808 = Statics.field2030.field1234.method4973(this.field812) ? class304.field3847 : class304.field3848;
    }

    @ObfuscatedName("bo.x(B)V")
    public final void method1061() {
        if (this.field810 == null) {
            this.field812 = null;
        } else {
            this.field812 = new class306(client.method1046(this.field810), Statics.field613);
        }
    }
}
