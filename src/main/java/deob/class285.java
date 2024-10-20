package deob;

@ObfuscatedName("jg")
public class class285 extends class279 {

    @ObfuscatedName("jg.f")
    public boolean field3618;

    @ObfuscatedName("jg.i")
    public boolean field3619;

    @ObfuscatedName("jg.f(Ljg;B)I")
    public int method4869(class285 arg0) {
        if (client.field829 == this.field3595 && client.field829 != arg0.field3595) {
            return -1;
        } else if (client.field829 == arg0.field3595 && client.field829 != this.field3595) {
            return 1;
        } else if (this.field3595 != 0 && arg0.field3595 == 0) {
            return -1;
        } else if (arg0.field3595 != 0 && this.field3595 == 0) {
            return 1;
        } else if (this.field3618 && !arg0.field3618) {
            return -1;
        } else if (!this.field3618 && arg0.field3618) {
            return 1;
        } else if (this.field3619 && !arg0.field3619) {
            return -1;
        } else if (!this.field3619 && arg0.field3619) {
            return 1;
        } else if (this.field3595 == 0) {
            return arg0.field3593 - this.field3593;
        } else {
            return this.field3593 - arg0.field3593;
        }
    }

    @ObfuscatedName("jg.ay(Ljy;S)I")
    public int method4686(class274 arg0) {
        return this.method4869((class285) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4869((class285) arg0);
    }
}
