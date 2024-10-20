package deob;

@ObfuscatedName("oe")
public class class391 extends class398 {

    @ObfuscatedName("oe.h")
    public boolean field4520;

    @ObfuscatedName("oe.e")
    public boolean field4519;

    @ObfuscatedName("oe.h(Loe;I)I")
    public int method6804(class391 arg0) {
        if (client.field683 == this.field4543 && client.field683 != arg0.field4543) {
            return -1;
        } else if (client.field683 == arg0.field4543 && client.field683 != this.field4543) {
            return 1;
        } else if (this.field4543 != 0 && arg0.field4543 == 0) {
            return -1;
        } else if (arg0.field4543 != 0 && this.field4543 == 0) {
            return 1;
        } else if (this.field4520 && !arg0.field4520) {
            return -1;
        } else if (!this.field4520 && arg0.field4520) {
            return 1;
        } else if (this.field4519 && !arg0.field4519) {
            return -1;
        } else if (!this.field4519 && arg0.field4519) {
            return 1;
        } else if (this.field4543 == 0) {
            return arg0.field4545 - this.field4545;
        } else {
            return this.field4545 - arg0.field4545;
        }
    }

    @ObfuscatedName("oe.e(Lov;I)I")
    public int method6805(class394 arg0) {
        return this.method6804((class391) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6804((class391) arg0);
    }
}
