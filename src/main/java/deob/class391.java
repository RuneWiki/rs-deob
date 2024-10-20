package deob;

@ObfuscatedName("oj")
public class class391 implements Comparable {

    @ObfuscatedName("oj.c")
    public class486 field4482;

    @ObfuscatedName("oj.x")
    public class486 field4483;

    @ObfuscatedName("oj.ac(B)Lrg;")
    public class486 method6728() {
        return this.field4482;
    }

    @ObfuscatedName("oj.af(B)Ljava/lang/String;")
    public String method6740() {
        return this.field4482 == null ? "" : this.field4482.method8298();
    }

    @ObfuscatedName("oj.ad(B)Ljava/lang/String;")
    public String method6729() {
        return this.field4483 == null ? "" : this.field4483.method8298();
    }

    @ObfuscatedName("oj.av(Lrg;Lrg;I)V")
    public void method6730(class486 arg0, class486 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4482 = arg0;
        this.field4483 = arg1;
    }

    @ObfuscatedName("oj.f(Loj;I)I")
    public int method6692(class391 arg0) {
        return this.field4482.method8304(arg0.field4482);
    }

    public int compareTo(Object arg0) {
        return this.method6692((class391) arg0);
    }
}
