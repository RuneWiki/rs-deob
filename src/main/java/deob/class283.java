package deob;

@ObfuscatedName("jn")
public class class283 implements Comparable {

    @ObfuscatedName("jn.q")
    public class292 field3631;

    @ObfuscatedName("jn.b")
    public class292 field3630;

    @ObfuscatedName("jn.ac(B)Lkm;")
    public class292 method4910() {
        return this.field3631;
    }

    @ObfuscatedName("jn.ay(I)Ljava/lang/String;")
    public String method4911() {
        return this.field3631 == null ? "" : this.field3631.method5048();
    }

    @ObfuscatedName("jn.an(B)Ljava/lang/String;")
    public String method4912() {
        return this.field3630 == null ? "" : this.field3630.method5048();
    }

    @ObfuscatedName("jn.as(Lkm;Lkm;I)V")
    public void method4927(class292 arg0, class292 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3631 = arg0;
        this.field3630 = arg1;
    }

    @ObfuscatedName("jn.aw(Ljn;I)I")
    public int method4914(class283 arg0) {
        return this.field3631.method5050(arg0.field3631);
    }

    public int compareTo(Object arg0) {
        return this.method4914((class283) arg0);
    }
}
