package deob;

@ObfuscatedName("jy")
public class class274 implements Comparable {

    @ObfuscatedName("jy.y")
    public class283 field3571;

    @ObfuscatedName("jy.w")
    public class283 field3570;

    @ObfuscatedName("jy.ao(I)Ljc;")
    public class283 method4678() {
        return this.field3571;
    }

    @ObfuscatedName("jy.an(I)Ljava/lang/String;")
    public String method4681() {
        return this.field3571 == null ? "" : this.field3571.method4822();
    }

    @ObfuscatedName("jy.ar(B)Ljava/lang/String;")
    public String method4680() {
        return this.field3570 == null ? "" : this.field3570.method4822();
    }

    @ObfuscatedName("jy.az(Ljc;Ljc;B)V")
    public void method4679(class283 arg0, class283 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3571 = arg0;
        this.field3570 = arg1;
    }

    @ObfuscatedName("jy.ay(Ljy;S)I")
    public int method4686(class274 arg0) {
        return this.field3571.method4825(arg0.field3571);
    }

    public int compareTo(Object arg0) {
        return this.method4686((class274) arg0);
    }
}
