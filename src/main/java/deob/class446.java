package deob;

@ObfuscatedName("rm")
public class class446 extends class453 {

    @ObfuscatedName("rm.am")
    public boolean field4719;

    @ObfuscatedName("rm.ap")
    public boolean field4718;

    @ObfuscatedName("rm.am(Lrm;I)I")
    public int method7511(class446 arg0) {
        if (client.field499 == this.field4743 && client.field499 != arg0.field4743) {
            return -1;
        } else if (client.field499 == arg0.field4743 && client.field499 != this.field4743) {
            return 1;
        } else if (this.field4743 != 0 && arg0.field4743 == 0) {
            return -1;
        } else if (arg0.field4743 != 0 && this.field4743 == 0) {
            return 1;
        } else if (this.field4719 && !arg0.field4719) {
            return -1;
        } else if (!this.field4719 && arg0.field4719) {
            return 1;
        } else if (this.field4718 && !arg0.field4718) {
            return -1;
        } else if (!this.field4718 && arg0.field4718) {
            return 1;
        } else if (this.field4743 == 0) {
            return arg0.field4741 - this.field4741;
        } else {
            return this.field4741 - arg0.field4741;
        }
    }

    @ObfuscatedName("rm.ap(Lrq;B)I")
    public int method7509(class449 arg0) {
        return this.method7511((class446) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7511((class446) arg0);
    }
}
