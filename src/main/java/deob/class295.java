package deob;

@ObfuscatedName("ki")
public class class295 extends class290 {

    @ObfuscatedName("ki.f")
    public boolean field3660;

    @ObfuscatedName("ki.b")
    public boolean field3661;

    @ObfuscatedName("ki.f(Lki;I)I")
    public int method4919(class295 arg0) {
        if (client.field817 == this.field3641 && client.field817 != arg0.field3641) {
            return -1;
        } else if (client.field817 == arg0.field3641 && client.field817 != this.field3641) {
            return 1;
        } else if (this.field3641 != 0 && arg0.field3641 == 0) {
            return -1;
        } else if (arg0.field3641 != 0 && this.field3641 == 0) {
            return 1;
        } else if (this.field3660 && !arg0.field3660) {
            return -1;
        } else if (!this.field3660 && arg0.field3660) {
            return 1;
        } else if (this.field3661 && !arg0.field3661) {
            return -1;
        } else if (!this.field3661 && arg0.field3661) {
            return 1;
        } else if (this.field3641 == 0) {
            return arg0.field3642 - this.field3642;
        } else {
            return this.field3642 - arg0.field3642;
        }
    }

    @ObfuscatedName("ki.av(Ljh;B)I")
    public int method4771(class285 arg0) {
        return this.method4919((class295) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4919((class295) arg0);
    }
}
