package deob;

@ObfuscatedName("ju")
public class class274 implements Comparable {

    @ObfuscatedName("ju.j")
    public class281 field3679;

    @ObfuscatedName("ju.a")
    public class281 field3678;

    @ObfuscatedName("ju.ay(I)Ljr;")
    public class281 method4648() {
        return this.field3679;
    }

    @ObfuscatedName("ju.ax(B)Ljava/lang/String;")
    public String method4658() {
        return this.field3679 == null ? "" : this.field3679.method4758();
    }

    @ObfuscatedName("ju.ae(I)Ljava/lang/String;")
    public String method4649() {
        return this.field3678 == null ? "" : this.field3678.method4758();
    }

    @ObfuscatedName("ju.ah(Ljr;Ljr;B)V")
    public void method4664(class281 arg0, class281 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3679 = arg0;
        this.field3678 = arg1;
    }

    @ObfuscatedName("ju.ai(Lju;B)I")
    public int method4651(class274 arg0) {
        return this.field3679.method4756(arg0.field3679);
    }

    public int compareTo(Object arg0) {
        return this.method4651((class274) arg0);
    }
}
