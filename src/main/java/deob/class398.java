package deob;

@ObfuscatedName("ol")
public class class398 extends class405 {

    @ObfuscatedName("ol.f")
    public boolean field4554;

    @ObfuscatedName("ol.w")
    public boolean field4553;

    @ObfuscatedName("ol.f(Lol;I)I")
    public int method6987(class398 arg0) {
        if (client.field601 == this.field4577 && client.field601 != arg0.field4577) {
            return -1;
        } else if (client.field601 == arg0.field4577 && client.field601 != this.field4577) {
            return 1;
        } else if (this.field4577 != 0 && arg0.field4577 == 0) {
            return -1;
        } else if (arg0.field4577 != 0 && this.field4577 == 0) {
            return 1;
        } else if (this.field4554 && !arg0.field4554) {
            return -1;
        } else if (!this.field4554 && arg0.field4554) {
            return 1;
        } else if (this.field4553 && !arg0.field4553) {
            return -1;
        } else if (!this.field4553 && arg0.field4553) {
            return 1;
        } else if (this.field4577 == 0) {
            return arg0.field4575 - this.field4575;
        } else {
            return this.field4575 - arg0.field4575;
        }
    }

    @ObfuscatedName("ol.w(Low;I)I")
    public int method6988(class401 arg0) {
        return this.method6987((class398) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6987((class398) arg0);
    }
}
