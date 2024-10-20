package deob;

@ObfuscatedName("ky")
public class class294 extends class289 {

    @ObfuscatedName("ky.x")
    public boolean field3626;

    @ObfuscatedName("ky.m")
    public boolean field3624;

    @ObfuscatedName("ky.x(Lky;I)I")
    public int method4866(class294 arg0) {
        if (client.field681 == this.field3611 && client.field681 != arg0.field3611) {
            return -1;
        } else if (client.field681 == arg0.field3611 && client.field681 != this.field3611) {
            return 1;
        } else if (this.field3611 != 0 && arg0.field3611 == 0) {
            return -1;
        } else if (arg0.field3611 != 0 && this.field3611 == 0) {
            return 1;
        } else if (this.field3626 && !arg0.field3626) {
            return -1;
        } else if (!this.field3626 && arg0.field3626) {
            return 1;
        } else if (this.field3624 && !arg0.field3624) {
            return -1;
        } else if (!this.field3624 && arg0.field3624) {
            return 1;
        } else if (this.field3611 == 0) {
            return arg0.field3610 - this.field3610;
        } else {
            return this.field3610 - arg0.field3610;
        }
    }

    @ObfuscatedName("ky.am(Ljd;I)I")
    public int method4699(class284 arg0) {
        return this.method4866((class294) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4866((class294) arg0);
    }
}
