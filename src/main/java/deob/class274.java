package deob;

@ObfuscatedName("ju")
public class class274 implements Comparable {

    @ObfuscatedName("ju.i")
    public class283 field3572;

    @ObfuscatedName("ju.k")
    public class283 field3573;

    @ObfuscatedName("ju.m(B)Ljx;")
    public class283 method4632() {
        return this.field3572;
    }

    @ObfuscatedName("ju.o(I)Ljava/lang/String;")
    public String method4634() {
        return this.field3572 == null ? "" : this.field3572.method4767();
    }

    @ObfuscatedName("ju.av(B)Ljava/lang/String;")
    public String method4647() {
        return this.field3573 == null ? "" : this.field3573.method4767();
    }

    @ObfuscatedName("ju.am(Ljx;Ljx;I)V")
    public void method4636(class283 arg0, class283 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3572 = arg0;
        this.field3573 = arg1;
    }

    @ObfuscatedName("ju.ai(Lju;B)I")
    public int method4637(class274 arg0) {
        return this.field3572.method4770(arg0.field3572);
    }

    public int compareTo(Object arg0) {
        return this.method4637((class274) arg0);
    }
}
