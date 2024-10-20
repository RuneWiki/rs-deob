package deob;

@ObfuscatedName("sk")
public class class471 implements Comparable {

    @ObfuscatedName("sk.ag")
    public class569 field4946;

    @ObfuscatedName("sk.ak")
    public class569 field4945;

    @ObfuscatedName("sk.bj(I)Lvo;")
    public class569 method7842() {
        return this.field4946;
    }

    @ObfuscatedName("sk.be(I)Ljava/lang/String;")
    public String method7843() {
        return this.field4946 == null ? "" : this.field4946.method9347();
    }

    @ObfuscatedName("sk.bm(I)Ljava/lang/String;")
    public String method7844() {
        return this.field4945 == null ? "" : this.field4945.method9347();
    }

    @ObfuscatedName("sk.bo(Lvo;Lvo;I)V")
    public void method7845(class569 arg0, class569 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4946 = arg0;
        this.field4945 = arg1;
    }

    @ObfuscatedName("sk.ad(Lsk;B)I")
    public int method7810(class471 arg0) {
        return this.field4946.method9357(arg0.field4946);
    }

    public int compareTo(Object arg0) {
        return this.method7810((class471) arg0);
    }
}
