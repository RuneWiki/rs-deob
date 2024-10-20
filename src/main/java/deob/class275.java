package deob;

@ObfuscatedName("jd")
public class class275 implements Comparable {

    @ObfuscatedName("jd.e")
    public class284 field3616;

    @ObfuscatedName("jd.p")
    public class284 field3615;

    @ObfuscatedName("jd.aw(I)Ljv;")
    public class284 method4656() {
        return this.field3616;
    }

    @ObfuscatedName("jd.ad(I)Ljava/lang/String;")
    public String method4657() {
        return this.field3616 == null ? "" : this.field3616.method4790();
    }

    @ObfuscatedName("jd.ag(I)Ljava/lang/String;")
    public String method4658() {
        return this.field3615 == null ? "" : this.field3615.method4790();
    }

    @ObfuscatedName("jd.ar(Ljv;Ljv;B)V")
    public void method4663(class284 arg0, class284 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3616 = arg0;
        this.field3615 = arg1;
    }

    @ObfuscatedName("jd.ax(Ljd;I)I")
    public int method4660(class275 arg0) {
        return this.field3616.method4791(arg0.field3616);
    }

    public int compareTo(Object arg0) {
        return this.method4660((class275) arg0);
    }
}
