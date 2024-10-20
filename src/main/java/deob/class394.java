package deob;

@ObfuscatedName("ov")
public class class394 implements Comparable {

    @ObfuscatedName("ov.v")
    public class490 field4528;

    @ObfuscatedName("ov.x")
    public class490 field4529;

    @ObfuscatedName("ov.au(I)Lrp;")
    public class490 method6844() {
        return this.field4528;
    }

    @ObfuscatedName("ov.ar(B)Ljava/lang/String;")
    public String method6841() {
        return this.field4528 == null ? "" : this.field4528.method8383();
    }

    @ObfuscatedName("ov.at(B)Ljava/lang/String;")
    public String method6847() {
        return this.field4529 == null ? "" : this.field4529.method8383();
    }

    @ObfuscatedName("ov.ay(Lrp;Lrp;I)V")
    public void method6843(class490 arg0, class490 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4528 = arg0;
        this.field4529 = arg1;
    }

    @ObfuscatedName("ov.e(Lov;I)I")
    public int method6805(class394 arg0) {
        return this.field4528.method8391(arg0.field4528);
    }

    public int compareTo(Object arg0) {
        return this.method6805((class394) arg0);
    }
}
