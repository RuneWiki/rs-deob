package deob;

@ObfuscatedName("lp")
public class class319 extends class326 {

    @ObfuscatedName("lp.v")
    public boolean field3825;

    @ObfuscatedName("lp.n")
    public boolean field3824;

    @ObfuscatedName("lp.v(Llp;I)I")
    public int method5187(class319 arg0) {
        if (client.field638 == this.field3853 && client.field638 != arg0.field3853) {
            return -1;
        } else if (client.field638 == arg0.field3853 && client.field638 != this.field3853) {
            return 1;
        } else if (this.field3853 != 0 && arg0.field3853 == 0) {
            return -1;
        } else if (arg0.field3853 != 0 && this.field3853 == 0) {
            return 1;
        } else if (this.field3825 && !arg0.field3825) {
            return -1;
        } else if (!this.field3825 && arg0.field3825) {
            return 1;
        } else if (this.field3824 && !arg0.field3824) {
            return -1;
        } else if (!this.field3824 && arg0.field3824) {
            return 1;
        } else if (this.field3853 == 0) {
            return arg0.field3850 - this.field3850;
        } else {
            return this.field3850 - arg0.field3850;
        }
    }

    @ObfuscatedName("lp.n(Llx;I)I")
    public int method5188(class322 arg0) {
        return this.method5187((class319) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5187((class319) arg0);
    }
}
