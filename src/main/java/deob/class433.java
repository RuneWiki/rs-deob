package deob;

@ObfuscatedName("qs")
public class class433 implements Comparable {

    @ObfuscatedName("qs.ao")
    public class538 field4655;

    @ObfuscatedName("qs.at")
    public class538 field4657;

    @ObfuscatedName("qs.as(I)Luc;")
    public class538 method7250() {
        return this.field4655;
    }

    @ObfuscatedName("qs.ay(I)Ljava/lang/String;")
    public String method7251() {
        return this.field4655 == null ? "" : this.field4655.method8917();
    }

    @ObfuscatedName("qs.aj(I)Ljava/lang/String;")
    public String method7252() {
        return this.field4657 == null ? "" : this.field4657.method8917();
    }

    @ObfuscatedName("qs.av(Luc;Luc;I)V")
    public void method7253(class538 arg0, class538 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4655 = arg0;
        this.field4657 = arg1;
    }

    @ObfuscatedName("qs.ae(Lqs;I)I")
    public int method7227(class433 arg0) {
        return this.field4655.method8912(arg0.field4655);
    }

    public int compareTo(Object arg0) {
        return this.method7227((class433) arg0);
    }
}
