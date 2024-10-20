package deob;

@ObfuscatedName("qk")
public class class442 extends class449 {

    @ObfuscatedName("qk.at")
    public boolean field4682;

    @ObfuscatedName("qk.ah")
    public boolean field4680;

    @ObfuscatedName("qk.at(Lqk;I)I")
    public int method7382(class442 arg0) {
        if (client.field591 == this.field4703 && client.field591 != arg0.field4703) {
            return -1;
        } else if (client.field591 == arg0.field4703 && client.field591 != this.field4703) {
            return 1;
        } else if (this.field4703 != 0 && arg0.field4703 == 0) {
            return -1;
        } else if (arg0.field4703 != 0 && this.field4703 == 0) {
            return 1;
        } else if (this.field4682 && !arg0.field4682) {
            return -1;
        } else if (!this.field4682 && arg0.field4682) {
            return 1;
        } else if (this.field4680 && !arg0.field4680) {
            return -1;
        } else if (!this.field4680 && arg0.field4680) {
            return 1;
        } else if (this.field4703 == 0) {
            return arg0.field4702 - this.field4702;
        } else {
            return this.field4702 - arg0.field4702;
        }
    }

    @ObfuscatedName("qk.ah(Lrf;B)I")
    public int method7381(class445 arg0) {
        return this.method7382((class442) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7382((class442) arg0);
    }
}
