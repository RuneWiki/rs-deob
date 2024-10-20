package deob;

@ObfuscatedName("oz")
public class class404 extends class401 {

    @ObfuscatedName("oz.f")
    public int field4572;

    @ObfuscatedName("oz.f(Loz;I)I")
    public int method7128(class404 arg0) {
        return this.field4572 - arg0.field4572;
    }

    @ObfuscatedName("oz.w(Low;I)I")
    public int method6988(class401 arg0) {
        return this.method7128((class404) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7128((class404) arg0);
    }
}
