package deob;

@ObfuscatedName("lt")
public class class321 implements Comparable {

    @ObfuscatedName("lt.u")
    public class327 field3837;

    @ObfuscatedName("lt.p")
    public class327 field3838;

    @ObfuscatedName("lt.a(B)Llw;")
    public class327 method5088() {
        return this.field3837;
    }

    @ObfuscatedName("lt.w(I)Ljava/lang/String;")
    public String method5089() {
        return this.field3837 == null ? "" : this.field3837.method5200();
    }

    @ObfuscatedName("lt.s(B)Ljava/lang/String;")
    public String method5091() {
        return this.field3838 == null ? "" : this.field3838.method5200();
    }

    @ObfuscatedName("lt.y(Llw;Llw;B)V")
    public void method5090(class327 arg0, class327 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3837 = arg0;
        this.field3838 = arg1;
    }

    @ObfuscatedName("lt.o(Llt;I)I")
    public int method5062(class321 arg0) {
        return this.field3837.method5203(arg0.field3837);
    }

    public int compareTo(Object arg0) {
        return this.method5062((class321) arg0);
    }
}
