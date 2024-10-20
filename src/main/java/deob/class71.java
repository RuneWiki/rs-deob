package deob;

@ObfuscatedName("bv")
public class class71 extends class219 {

    @ObfuscatedName("bv.d")
    public int field818 = class96.method18();

    @ObfuscatedName("bv.z")
    public int field811 = client.field866;

    @ObfuscatedName("bv.n")
    public int field812;

    @ObfuscatedName("bv.r")
    public String field813;

    @ObfuscatedName("bv.e")
    public class306 field814;

    @ObfuscatedName("bv.y")
    public class304 field815 = class304.field3845;

    @ObfuscatedName("bv.k")
    public class304 field820 = class304.field3845;

    @ObfuscatedName("bv.s")
    public String field817;

    @ObfuscatedName("bv.p")
    public String field816;

    public class71(int arg0, String arg1, String arg2, String arg3) {
        this.field812 = arg0;
        this.field813 = arg1;
        this.method1006();
        this.field817 = arg2;
        this.field816 = arg3;
    }

    @ObfuscatedName("bv.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method999(int arg0, String arg1, String arg2, String arg3) {
        this.field818 = class96.method18();
        this.field811 = client.field866;
        this.field812 = arg0;
        this.field813 = arg1;
        this.method1006();
        this.field817 = arg2;
        this.field816 = arg3;
    }

    @ObfuscatedName("bv.z(B)V")
    public void method1000() {
        this.field815 = class304.field3845;
    }

    @ObfuscatedName("bv.n(I)Z")
    public final boolean method1001() {
        if (class304.field3845 == this.field815) {
            this.method998();
        }
        return class304.field3843 == this.field815;
    }

    @ObfuscatedName("bv.r(I)V")
    public void method998() {
        this.field815 = Statics.field1319.field1236.method5002(this.field814) ? class304.field3843 : class304.field3844;
    }

    @ObfuscatedName("bv.e(I)V")
    public void method1020() {
        this.field820 = class304.field3845;
    }

    @ObfuscatedName("bv.y(I)Z")
    public final boolean method1024() {
        if (class304.field3845 == this.field820) {
            this.method1003();
        }
        return class304.field3843 == this.field820;
    }

    @ObfuscatedName("bv.k(I)V")
    public void method1003() {
        this.field820 = Statics.field1319.field1234.method5002(this.field814) ? class304.field3843 : class304.field3844;
    }

    @ObfuscatedName("bv.s(I)V")
    public final void method1006() {
        if (this.field813 == null) {
            this.field814 = null;
        } else {
            this.field814 = new class306(client.method545(this.field813), Statics.field347);
        }
    }
}
