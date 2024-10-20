package deob;

@ObfuscatedName("rh")
public class class450 extends class457 {

    @ObfuscatedName("rh.az")
    public boolean field4784;

    @ObfuscatedName("rh.ah")
    public boolean field4783;

    @ObfuscatedName("rh.az(Lrh;I)I")
    public int method7407(class450 arg0) {
        if (client.field509 == this.field4807 && client.field509 != arg0.field4807) {
            return -1;
        } else if (client.field509 == arg0.field4807 && client.field509 != this.field4807) {
            return 1;
        } else if (this.field4807 != 0 && arg0.field4807 == 0) {
            return -1;
        } else if (arg0.field4807 != 0 && this.field4807 == 0) {
            return 1;
        } else if (this.field4784 && !arg0.field4784) {
            return -1;
        } else if (!this.field4784 && arg0.field4784) {
            return 1;
        } else if (this.field4783 && !arg0.field4783) {
            return -1;
        } else if (!this.field4783 && arg0.field4783) {
            return 1;
        } else if (this.field4807 == 0) {
            return arg0.field4804 - this.field4804;
        } else {
            return this.field4804 - arg0.field4804;
        }
    }

    @ObfuscatedName("rh.ah(Lrr;B)I")
    public int method7403(class453 arg0) {
        return this.method7407((class450) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7407((class450) arg0);
    }
}
