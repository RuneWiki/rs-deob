package deob;

@ObfuscatedName("nb")
public class class372 implements Comparable {

    @ObfuscatedName("nb.w")
    public class465 field4305;

    @ObfuscatedName("nb.v")
    public class465 field4304;

    @ObfuscatedName("nb.f(S)Lqy;")
    public class465 method5996() {
        return this.field4305;
    }

    @ObfuscatedName("nb.t(S)Ljava/lang/String;")
    public String method5997() {
        return this.field4305 == null ? "" : this.field4305.method7491();
    }

    @ObfuscatedName("nb.j(I)Ljava/lang/String;")
    public String method6003() {
        return this.field4304 == null ? "" : this.field4304.method7491();
    }

    @ObfuscatedName("nb.g(Lqy;Lqy;B)V")
    public void method5995(class465 arg0, class465 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4305 = arg0;
        this.field4304 = arg1;
    }

    @ObfuscatedName("nb.h(Lnb;I)I")
    public int method5970(class372 arg0) {
        return this.field4305.method7490(arg0.field4305);
    }

    public int compareTo(Object arg0) {
        return this.method5970((class372) arg0);
    }
}
