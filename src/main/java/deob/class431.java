package deob;

@ObfuscatedName("qi")
public class class431 extends class438 {

    @ObfuscatedName("qi.aw")
    public boolean field4647;

    @ObfuscatedName("qi.ay")
    public boolean field4648;

    @ObfuscatedName("qi.aw(Lqi;I)I")
    public int method7202(class431 arg0) {
        if (client.field517 == this.field4669 && client.field517 != arg0.field4669) {
            return -1;
        } else if (client.field517 == arg0.field4669 && client.field517 != this.field4669) {
            return 1;
        } else if (this.field4669 != 0 && arg0.field4669 == 0) {
            return -1;
        } else if (arg0.field4669 != 0 && this.field4669 == 0) {
            return 1;
        } else if (this.field4647 && !arg0.field4647) {
            return -1;
        } else if (!this.field4647 && arg0.field4647) {
            return 1;
        } else if (this.field4648 && !arg0.field4648) {
            return -1;
        } else if (!this.field4648 && arg0.field4648) {
            return 1;
        } else if (this.field4669 == 0) {
            return arg0.field4670 - this.field4670;
        } else {
            return this.field4670 - arg0.field4670;
        }
    }

    @ObfuscatedName("qi.ay(Lqe;B)I")
    public int method7203(class434 arg0) {
        return this.method7202((class431) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7202((class431) arg0);
    }
}
