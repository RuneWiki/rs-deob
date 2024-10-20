package deob;

@ObfuscatedName("bn")
public class class71 extends class219 {

    @ObfuscatedName("bn.g")
    public int field807 = class96.method39();

    @ObfuscatedName("bn.e")
    public int field803 = client.field913;

    @ObfuscatedName("bn.b")
    public int field804;

    @ObfuscatedName("bn.z")
    public String field805;

    @ObfuscatedName("bn.n")
    public class306 field802;

    @ObfuscatedName("bn.l")
    public class304 field810 = class304.field3857;

    @ObfuscatedName("bn.s")
    public class304 field808 = class304.field3857;

    @ObfuscatedName("bn.y")
    public String field809;

    @ObfuscatedName("bn.c")
    public String field806;

    public class71(int arg0, String arg1, String arg2, String arg3) {
        this.field804 = arg0;
        this.field805 = arg1;
        this.method1080();
        this.field809 = arg2;
        this.field806 = arg3;
    }

    @ObfuscatedName("bn.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public void method1073(int arg0, String arg1, String arg2, String arg3) {
        this.field807 = class96.method39();
        this.field803 = client.field913;
        this.field804 = arg0;
        this.field805 = arg1;
        this.method1080();
        this.field809 = arg2;
        this.field806 = arg3;
    }

    @ObfuscatedName("bn.e(I)V")
    public void method1078() {
        this.field810 = class304.field3857;
    }

    @ObfuscatedName("bn.b(I)Z")
    public final boolean method1094() {
        if (class304.field3857 == this.field810) {
            this.method1076();
        }
        return class304.field3859 == this.field810;
    }

    @ObfuscatedName("bn.z(I)V")
    public void method1076() {
        this.field810 = Statics.field1666.field1238.method4972(this.field802) ? class304.field3859 : class304.field3856;
    }

    @ObfuscatedName("bn.n(I)V")
    public void method1077() {
        this.field808 = class304.field3857;
    }

    @ObfuscatedName("bn.l(B)Z")
    public final boolean method1090() {
        if (class304.field3857 == this.field808) {
            this.method1079();
        }
        return class304.field3859 == this.field808;
    }

    @ObfuscatedName("bn.s(I)V")
    public void method1079() {
        this.field808 = Statics.field1666.field1239.method4972(this.field802) ? class304.field3859 : class304.field3856;
    }

    @ObfuscatedName("bn.y(I)V")
    public final void method1080() {
        if (this.field805 == null) {
            this.field802 = null;
        } else {
            this.field802 = new class306(client.method322(this.field805), Statics.field2078);
        }
    }
}
