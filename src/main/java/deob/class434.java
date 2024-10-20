package deob;

@ObfuscatedName("qe")
public class class434 implements Comparable {

    @ObfuscatedName("qe.ar")
    public class538 field4655;

    @ObfuscatedName("qe.am")
    public class538 field4656;

    @ObfuscatedName("qe.af(I)Lui;")
    public class538 method7233() {
        return this.field4655;
    }

    @ObfuscatedName("qe.ai(B)Ljava/lang/String;")
    public String method7241() {
        return this.field4655 == null ? "" : this.field4655.method8881();
    }

    @ObfuscatedName("qe.al(B)Ljava/lang/String;")
    public String method7236() {
        return this.field4656 == null ? "" : this.field4656.method8881();
    }

    @ObfuscatedName("qe.bd(Lui;Lui;I)V")
    public void method7235(class538 arg0, class538 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4655 = arg0;
        this.field4656 = arg1;
    }

    @ObfuscatedName("qe.ay(Lqe;B)I")
    public int method7203(class434 arg0) {
        return this.field4655.method8880(arg0.field4655);
    }

    public int compareTo(Object arg0) {
        return this.method7203((class434) arg0);
    }
}
