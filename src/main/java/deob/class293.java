package deob;

@ObfuscatedName("kt")
public class class293 extends class288 {

    @ObfuscatedName("kt.z")
    public boolean field3649;

    @ObfuscatedName("kt.w")
    public boolean field3651;

    @ObfuscatedName("kt.z(Lkt;I)I")
    public int method5037(class293 arg0) {
        if (client.field582 == this.field3629 && client.field582 != arg0.field3629) {
            return -1;
        } else if (client.field582 == arg0.field3629 && client.field582 != this.field3629) {
            return 1;
        } else if (this.field3629 != 0 && arg0.field3629 == 0) {
            return -1;
        } else if (arg0.field3629 != 0 && this.field3629 == 0) {
            return 1;
        } else if (this.field3649 && !arg0.field3649) {
            return -1;
        } else if (!this.field3649 && arg0.field3649) {
            return 1;
        } else if (this.field3651 && !arg0.field3651) {
            return -1;
        } else if (!this.field3651 && arg0.field3651) {
            return 1;
        } else if (this.field3629 == 0) {
            return arg0.field3628 - this.field3628;
        } else {
            return this.field3628 - arg0.field3628;
        }
    }

    @ObfuscatedName("kt.an(Ljx;B)I")
    public int method4901(class283 arg0) {
        return this.method5037((class293) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5037((class293) arg0);
    }
}
