package deob;

@ObfuscatedName("kc")
public class class294 extends class289 {

    @ObfuscatedName("kc.z")
    public boolean field3652;

    @ObfuscatedName("kc.k")
    public boolean field3653;

    @ObfuscatedName("kc.z(Lkc;I)I")
    public int method4904(class294 arg0) {
        if (client.field672 == this.field3632 && client.field672 != arg0.field3632) {
            return -1;
        } else if (client.field672 == arg0.field3632 && client.field672 != this.field3632) {
            return 1;
        } else if (this.field3632 != 0 && arg0.field3632 == 0) {
            return -1;
        } else if (arg0.field3632 != 0 && this.field3632 == 0) {
            return 1;
        } else if (this.field3652 && !arg0.field3652) {
            return -1;
        } else if (!this.field3652 && arg0.field3652) {
            return 1;
        } else if (this.field3653 && !arg0.field3653) {
            return -1;
        } else if (!this.field3653 && arg0.field3653) {
            return 1;
        } else if (this.field3632 == 0) {
            return arg0.field3633 - this.field3633;
        } else {
            return this.field3633 - arg0.field3633;
        }
    }

    @ObfuscatedName("kc.ar(Ljc;I)I")
    public int method4762(class284 arg0) {
        return this.method4904((class294) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4904((class294) arg0);
    }
}
