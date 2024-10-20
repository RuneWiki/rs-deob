package deob;

@ObfuscatedName("js")
public class class285 extends class280 {

    @ObfuscatedName("js.q")
    public boolean field3651;

    @ObfuscatedName("js.w")
    public boolean field3652;

    @ObfuscatedName("js.q(Ljs;I)I")
    public int method4811(class285 arg0) {
        if (client.field808 == this.field3637 && client.field808 != arg0.field3637) {
            return -1;
        } else if (client.field808 == arg0.field3637 && client.field808 != this.field3637) {
            return 1;
        } else if (this.field3637 != 0 && arg0.field3637 == 0) {
            return -1;
        } else if (arg0.field3637 != 0 && this.field3637 == 0) {
            return 1;
        } else if (this.field3651 && !arg0.field3651) {
            return -1;
        } else if (!this.field3651 && arg0.field3651) {
            return 1;
        } else if (this.field3652 && !arg0.field3652) {
            return -1;
        } else if (!this.field3652 && arg0.field3652) {
            return 1;
        } else if (this.field3637 == 0) {
            return arg0.field3634 - this.field3634;
        } else {
            return this.field3634 - arg0.field3634;
        }
    }

    @ObfuscatedName("js.ax(Ljd;I)I")
    public int method4660(class275 arg0) {
        return this.method4811((class285) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4811((class285) arg0);
    }
}
