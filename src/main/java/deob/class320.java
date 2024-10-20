package deob;

@ObfuscatedName("lp")
public class class320 extends class327 {

    @ObfuscatedName("lp.f")
    public boolean field3825;

    @ObfuscatedName("lp.e")
    public boolean field3826;

    @ObfuscatedName("lp.f(Llp;I)I")
    public int method5146(class320 arg0) {
        if (client.field804 == this.field3848 && client.field804 != arg0.field3848) {
            return -1;
        } else if (client.field804 == arg0.field3848 && client.field804 != this.field3848) {
            return 1;
        } else if (this.field3848 != 0 && arg0.field3848 == 0) {
            return -1;
        } else if (arg0.field3848 != 0 && this.field3848 == 0) {
            return 1;
        } else if (this.field3825 && !arg0.field3825) {
            return -1;
        } else if (!this.field3825 && arg0.field3825) {
            return 1;
        } else if (this.field3826 && !arg0.field3826) {
            return -1;
        } else if (!this.field3826 && arg0.field3826) {
            return 1;
        } else if (this.field3848 == 0) {
            return arg0.field3847 - this.field3847;
        } else {
            return this.field3847 - arg0.field3847;
        }
    }

    @ObfuscatedName("lp.e(Llf;I)I")
    public int method5145(class323 arg0) {
        return this.method5146((class320) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5146((class320) arg0);
    }
}
