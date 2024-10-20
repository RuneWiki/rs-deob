package deob;

@ObfuscatedName("rd")
public class class449 extends class456 {

    @ObfuscatedName("rd.aq")
    public boolean field4746;

    @ObfuscatedName("rd.aw")
    public boolean field4749;

    @ObfuscatedName("rd.aq(Lrd;I)I")
    public int method7530(class449 arg0) {
        if (client.field522 == this.field4770 && client.field522 != arg0.field4770) {
            return -1;
        } else if (client.field522 == arg0.field4770 && client.field522 != this.field4770) {
            return 1;
        } else if (this.field4770 != 0 && arg0.field4770 == 0) {
            return -1;
        } else if (arg0.field4770 != 0 && this.field4770 == 0) {
            return 1;
        } else if (this.field4746 && !arg0.field4746) {
            return -1;
        } else if (!this.field4746 && arg0.field4746) {
            return 1;
        } else if (this.field4749 && !arg0.field4749) {
            return -1;
        } else if (!this.field4749 && arg0.field4749) {
            return 1;
        } else if (this.field4770 == 0) {
            return arg0.field4771 - this.field4771;
        } else {
            return this.field4771 - arg0.field4771;
        }
    }

    @ObfuscatedName("rd.aw(Lra;B)I")
    public int method7534(class452 arg0) {
        return this.method7530((class449) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7530((class449) arg0);
    }
}
