package deob;

@ObfuscatedName("kn")
public class class289 implements Comparable {

    @ObfuscatedName("kn.g")
    public class298 field3694;

    @ObfuscatedName("kn.x")
    public class298 field3695;

    @ObfuscatedName("kn.an(I)Lkx;")
    public class298 method5090() {
        return this.field3694;
    }

    @ObfuscatedName("kn.at(I)Ljava/lang/String;")
    public String method5101() {
        return this.field3694 == null ? "" : this.field3694.method5236();
    }

    @ObfuscatedName("kn.ae(I)Ljava/lang/String;")
    public String method5092() {
        return this.field3695 == null ? "" : this.field3695.method5236();
    }

    @ObfuscatedName("kn.av(Lkx;Lkx;I)V")
    public void method5103(class298 arg0, class298 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3694 = arg0;
        this.field3695 = arg1;
    }

    @ObfuscatedName("kn.au(Lkn;I)I")
    public int method5091(class289 arg0) {
        return this.field3694.method5239(arg0.field3694);
    }

    public int compareTo(Object arg0) {
        return this.method5091((class289) arg0);
    }
}
