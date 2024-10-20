package deob;

@ObfuscatedName("kf")
public class class295 extends class290 {

    @ObfuscatedName("kf.c")
    public boolean field3692;

    @ObfuscatedName("kf.q")
    public boolean field3693;

    @ObfuscatedName("kf.c(Lkf;I)I")
    public int method5093(class295 arg0) {
        if (client.field738 == this.field3679 && client.field738 != arg0.field3679) {
            return -1;
        } else if (client.field738 == arg0.field3679 && client.field738 != this.field3679) {
            return 1;
        } else if (this.field3679 != 0 && arg0.field3679 == 0) {
            return -1;
        } else if (arg0.field3679 != 0 && this.field3679 == 0) {
            return 1;
        } else if (this.field3692 && !arg0.field3692) {
            return -1;
        } else if (!this.field3692 && arg0.field3692) {
            return 1;
        } else if (this.field3693 && !arg0.field3693) {
            return -1;
        } else if (!this.field3693 && arg0.field3693) {
            return 1;
        } else if (this.field3679 == 0) {
            return arg0.field3678 - this.field3678;
        } else {
            return this.field3678 - arg0.field3678;
        }
    }

    @ObfuscatedName("kf.a(Ljx;B)I")
    public int method4937(class285 arg0) {
        return this.method5093((class295) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5093((class295) arg0);
    }
}
