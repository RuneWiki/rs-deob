package deob;

@ObfuscatedName("qo")
public class class430 extends class437 {

    @ObfuscatedName("qo.au")
    public boolean field4645;

    @ObfuscatedName("qo.ae")
    public boolean field4646;

    @ObfuscatedName("qo.au(Lqo;I)I")
    public int method7226(class430 arg0) {
        if (client.field527 == this.field4671 && client.field527 != arg0.field4671) {
            return -1;
        } else if (client.field527 == arg0.field4671 && client.field527 != this.field4671) {
            return 1;
        } else if (this.field4671 != 0 && arg0.field4671 == 0) {
            return -1;
        } else if (arg0.field4671 != 0 && this.field4671 == 0) {
            return 1;
        } else if (this.field4645 && !arg0.field4645) {
            return -1;
        } else if (!this.field4645 && arg0.field4645) {
            return 1;
        } else if (this.field4646 && !arg0.field4646) {
            return -1;
        } else if (!this.field4646 && arg0.field4646) {
            return 1;
        } else if (this.field4671 == 0) {
            return arg0.field4670 - this.field4670;
        } else {
            return this.field4670 - arg0.field4670;
        }
    }

    @ObfuscatedName("qo.ae(Lqs;I)I")
    public int method7227(class433 arg0) {
        return this.method7226((class430) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7226((class430) arg0);
    }
}
