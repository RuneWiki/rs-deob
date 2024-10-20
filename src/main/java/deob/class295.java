package deob;

@ObfuscatedName("ko")
public class class295 extends class290 {

    @ObfuscatedName("ko.n")
    public boolean field3664;

    @ObfuscatedName("ko.v")
    public boolean field3662;

    @ObfuscatedName("ko.n(Lko;I)I")
    public int method4983(class295 arg0) {
        if (client.field844 == this.field3645 && client.field844 != arg0.field3645) {
            return -1;
        } else if (client.field844 == arg0.field3645 && client.field844 != this.field3645) {
            return 1;
        } else if (this.field3645 != 0 && arg0.field3645 == 0) {
            return -1;
        } else if (arg0.field3645 != 0 && this.field3645 == 0) {
            return 1;
        } else if (this.field3664 && !arg0.field3664) {
            return -1;
        } else if (!this.field3664 && arg0.field3664) {
            return 1;
        } else if (this.field3662 && !arg0.field3662) {
            return -1;
        } else if (!this.field3662 && arg0.field3662) {
            return 1;
        } else if (this.field3645 == 0) {
            return arg0.field3647 - this.field3647;
        } else {
            return this.field3647 - arg0.field3647;
        }
    }

    @ObfuscatedName("ko.at(Ljn;I)I")
    public int method4844(class285 arg0) {
        return this.method4983((class295) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4983((class295) arg0);
    }
}
