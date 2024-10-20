package deob;

@ObfuscatedName("rr")
public class class453 implements Comparable {

    @ObfuscatedName("rr.af")
    public class558 field4792;

    @ObfuscatedName("rr.at")
    public class558 field4791;

    @ObfuscatedName("rr.ak(I)Lvx;")
    public class558 method7433() {
        return this.field4792;
    }

    @ObfuscatedName("rr.bp(I)Ljava/lang/String;")
    public String method7435() {
        return this.field4792 == null ? "" : this.field4792.method9077();
    }

    @ObfuscatedName("rr.bz(I)Ljava/lang/String;")
    public String method7440() {
        return this.field4791 == null ? "" : this.field4791.method9077();
    }

    @ObfuscatedName("rr.bc(Lvx;Lvx;I)V")
    public void method7436(class558 arg0, class558 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4792 = arg0;
        this.field4791 = arg1;
    }

    @ObfuscatedName("rr.ah(Lrr;B)I")
    public int method7403(class453 arg0) {
        return this.field4792.method9080(arg0.field4792);
    }

    public int compareTo(Object arg0) {
        return this.method7403((class453) arg0);
    }
}
