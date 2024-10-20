package deob;

@ObfuscatedName("lf")
public class class323 implements Comparable {

    @ObfuscatedName("lf.v")
    public class329 field3834;

    @ObfuscatedName("lf.y")
    public class329 field3835;

    @ObfuscatedName("lf.a(I)Llc;")
    public class329 method5177() {
        return this.field3834;
    }

    @ObfuscatedName("lf.aw(I)Ljava/lang/String;")
    public String method5178() {
        return this.field3834 == null ? "" : this.field3834.method5264();
    }

    @ObfuscatedName("lf.ak(I)Ljava/lang/String;")
    public String method5179() {
        return this.field3835 == null ? "" : this.field3835.method5264();
    }

    @ObfuscatedName("lf.ad(Llc;Llc;I)V")
    public void method5180(class329 arg0, class329 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3834 = arg0;
        this.field3835 = arg1;
    }

    @ObfuscatedName("lf.e(Llf;I)I")
    public int method5145(class323 arg0) {
        return this.field3834.method5266(arg0.field3834);
    }

    public int compareTo(Object arg0) {
        return this.method5145((class323) arg0);
    }
}
