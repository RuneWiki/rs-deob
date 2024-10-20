package deob;

@ObfuscatedName("nn")
public class class371 implements Comparable {

    @ObfuscatedName("nn.i")
    public class459 field4256;

    @ObfuscatedName("nn.f")
    public class459 field4255;

    @ObfuscatedName("nn.z(B)Lqb;")
    public class459 method6104() {
        return this.field4256;
    }

    @ObfuscatedName("nn.h(I)Ljava/lang/String;")
    public String method6107() {
        return this.field4256 == null ? "" : this.field4256.method7528();
    }

    @ObfuscatedName("nn.ae(I)Ljava/lang/String;")
    public String method6106() {
        return this.field4255 == null ? "" : this.field4255.method7528();
    }

    @ObfuscatedName("nn.aq(Lqb;Lqb;B)V")
    public void method6111(class459 arg0, class459 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4256 = arg0;
        this.field4255 = arg1;
    }

    @ObfuscatedName("nn.c(Lnn;I)I")
    public int method6046(class371 arg0) {
        return this.field4256.method7527(arg0.field4256);
    }

    public int compareTo(Object arg0) {
        return this.method6046((class371) arg0);
    }
}
