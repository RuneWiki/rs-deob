package deob;

@ObfuscatedName("my")
public class class355 implements Comparable {

    @ObfuscatedName("my.s")
    public class442 field4157;

    @ObfuscatedName("my.e")
    public class442 field4156;

    @ObfuscatedName("my.ak(B)Lpb;")
    public class442 method5770() {
        return this.field4157;
    }

    @ObfuscatedName("my.av(I)Ljava/lang/String;")
    public String method5761() {
        return this.field4157 == null ? "" : this.field4157.method7231();
    }

    @ObfuscatedName("my.ar(I)Ljava/lang/String;")
    public String method5762() {
        return this.field4156 == null ? "" : this.field4156.method7231();
    }

    @ObfuscatedName("my.al(Lpb;Lpb;B)V")
    public void method5763(class442 arg0, class442 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4157 = arg0;
        this.field4156 = arg1;
    }

    @ObfuscatedName("my.l(Lmy;I)I")
    public int method5701(class355 arg0) {
        return this.field4157.method7234(arg0.field4157);
    }

    public int compareTo(Object arg0) {
        return this.method5701((class355) arg0);
    }
}
