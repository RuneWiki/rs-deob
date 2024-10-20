package deob;

@ObfuscatedName("jq")
public class class274 implements Comparable {

    @ObfuscatedName("jq.i")
    public class281 field3702;

    @ObfuscatedName("jq.w")
    public class281 field3701;

    @ObfuscatedName("jq.af(S)Lja;")
    public class281 method4805() {
        return this.field3702;
    }

    @ObfuscatedName("jq.as(I)Ljava/lang/String;")
    public String method4806() {
        return this.field3702 == null ? "" : this.field3702.method4922();
    }

    @ObfuscatedName("jq.ax(I)Ljava/lang/String;")
    public String method4814() {
        return this.field3701 == null ? "" : this.field3701.method4922();
    }

    @ObfuscatedName("jq.ak(Lja;Lja;I)V")
    public void method4808(class281 arg0, class281 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3702 = arg0;
        this.field3701 = arg1;
    }

    @ObfuscatedName("jq.aw(Ljq;I)I")
    public int method4809(class274 arg0) {
        return this.field3702.method4925(arg0.field3702);
    }

    public int compareTo(Object arg0) {
        return this.method4809((class274) arg0);
    }
}
