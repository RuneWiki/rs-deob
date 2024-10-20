package deob;

@ObfuscatedName("jr")
public class class274 implements Comparable {

    @ObfuscatedName("jr.b")
    public class283 field3594;

    @ObfuscatedName("jr.g")
    public class283 field3595;

    @ObfuscatedName("jr.c(I)Ljb;")
    public class283 method4716() {
        return this.field3594;
    }

    @ObfuscatedName("jr.s(B)Ljava/lang/String;")
    public String method4706() {
        return this.field3594 == null ? "" : this.field3594.method4837();
    }

    @ObfuscatedName("jr.t(B)Ljava/lang/String;")
    public String method4707() {
        return this.field3595 == null ? "" : this.field3595.method4837();
    }

    @ObfuscatedName("jr.m(Ljb;Ljb;I)V")
    public void method4718(class283 arg0, class283 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3594 = arg0;
        this.field3595 = arg1;
    }

    @ObfuscatedName("jr.v(Ljr;B)I")
    public int method4709(class274 arg0) {
        return this.field3594.method4848(arg0.field3594);
    }

    public int compareTo(Object arg0) {
        return this.method4709((class274) arg0);
    }
}
