package deob;

@ObfuscatedName("ow")
public class class401 implements Comparable {

    @ObfuscatedName("ow.v")
    public class497 field4563;

    @ObfuscatedName("ow.s")
    public class497 field4562;

    @ObfuscatedName("ow.al(I)Lsi;")
    public class497 method7024() {
        return this.field4563;
    }

    @ObfuscatedName("ow.at(B)Ljava/lang/String;")
    public String method7025() {
        return this.field4563 == null ? "" : this.field4563.method8556();
    }

    @ObfuscatedName("ow.aj(I)Ljava/lang/String;")
    public String method7031() {
        return this.field4562 == null ? "" : this.field4562.method8556();
    }

    @ObfuscatedName("ow.ax(Lsi;Lsi;I)V")
    public void method7027(class497 arg0, class497 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4563 = arg0;
        this.field4562 = arg1;
    }

    @ObfuscatedName("ow.w(Low;I)I")
    public int method6988(class401 arg0) {
        return this.field4563.method8561(arg0.field4563);
    }

    public int compareTo(Object arg0) {
        return this.method6988((class401) arg0);
    }
}
