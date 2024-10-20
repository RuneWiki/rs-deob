package deob;

@ObfuscatedName("ky")
public class class295 extends class290 {

    @ObfuscatedName("ky.g")
    public boolean field3724;

    @ObfuscatedName("ky.r")
    public boolean field3725;

    @ObfuscatedName("ky.g(Lky;I)I")
    public int method5291(class295 arg0) {
        if (client.field692 == this.field3709 && client.field692 != arg0.field3709) {
            return -1;
        } else if (client.field692 == arg0.field3709 && client.field692 != this.field3709) {
            return 1;
        } else if (this.field3709 != 0 && arg0.field3709 == 0) {
            return -1;
        } else if (arg0.field3709 != 0 && this.field3709 == 0) {
            return 1;
        } else if (this.field3724 && !arg0.field3724) {
            return -1;
        } else if (!this.field3724 && arg0.field3724) {
            return 1;
        } else if (this.field3725 && !arg0.field3725) {
            return -1;
        } else if (!this.field3725 && arg0.field3725) {
            return 1;
        } else if (this.field3709 == 0) {
            return arg0.field3707 - this.field3707;
        } else {
            return this.field3707 - arg0.field3707;
        }
    }

    @ObfuscatedName("ky.aw(Ljr;I)I")
    public int method5132(class285 arg0) {
        return this.method5291((class295) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5291((class295) arg0);
    }
}
