package deob;

@ObfuscatedName("kk")
public class class295 extends class290 {

    @ObfuscatedName("kk.f")
    public boolean field3718;

    @ObfuscatedName("kk.l")
    public boolean field3717;

    @ObfuscatedName("kk.f(Lkk;I)I")
    public int method5152(class295 arg0) {
        if (client.field683 == this.field3703 && client.field683 != arg0.field3703) {
            return -1;
        } else if (client.field683 == arg0.field3703 && client.field683 != this.field3703) {
            return 1;
        } else if (this.field3703 != 0 && arg0.field3703 == 0) {
            return -1;
        } else if (arg0.field3703 != 0 && this.field3703 == 0) {
            return 1;
        } else if (this.field3718 && !arg0.field3718) {
            return -1;
        } else if (!this.field3718 && arg0.field3718) {
            return 1;
        } else if (this.field3717 && !arg0.field3717) {
            return -1;
        } else if (!this.field3717 && arg0.field3717) {
            return 1;
        } else if (this.field3703 == 0) {
            return arg0.field3700 - this.field3700;
        } else {
            return this.field3700 - arg0.field3700;
        }
    }

    @ObfuscatedName("kk.am(Ljb;I)I")
    public int method4995(class285 arg0) {
        return this.method5152((class295) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5152((class295) arg0);
    }
}
