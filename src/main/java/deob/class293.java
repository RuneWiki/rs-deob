package deob;

@ObfuscatedName("kf")
public class class293 extends class288 {

    @ObfuscatedName("kf.w")
    public boolean field3665;

    @ObfuscatedName("kf.m")
    public boolean field3664;

    @ObfuscatedName("kf.w(Lkf;I)I")
    public int method5067(class293 arg0) {
        if (client.field677 == this.field3649 && client.field677 != arg0.field3649) {
            return -1;
        } else if (client.field677 == arg0.field3649 && client.field677 != this.field3649) {
            return 1;
        } else if (this.field3649 != 0 && arg0.field3649 == 0) {
            return -1;
        } else if (arg0.field3649 != 0 && this.field3649 == 0) {
            return 1;
        } else if (this.field3665 && !arg0.field3665) {
            return -1;
        } else if (!this.field3665 && arg0.field3665) {
            return 1;
        } else if (this.field3664 && !arg0.field3664) {
            return -1;
        } else if (!this.field3664 && arg0.field3664) {
            return 1;
        } else if (this.field3649 == 0) {
            return arg0.field3650 - this.field3650;
        } else {
            return this.field3650 - arg0.field3650;
        }
    }

    @ObfuscatedName("kf.aw(Ljn;I)I")
    public int method4914(class283 arg0) {
        return this.method5067((class293) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5067((class293) arg0);
    }
}
