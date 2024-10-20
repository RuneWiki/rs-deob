package deob;

@ObfuscatedName("kx")
public class class295 extends class290 {

    @ObfuscatedName("kx.h")
    public boolean field3667;

    @ObfuscatedName("kx.v")
    public boolean field3668;

    @ObfuscatedName("kx.h(Lkx;I)I")
    public int method4839(class295 arg0) {
        if (client.field646 == this.field3651 && client.field646 != arg0.field3651) {
            return -1;
        } else if (client.field646 == arg0.field3651 && client.field646 != this.field3651) {
            return 1;
        } else if (this.field3651 != 0 && arg0.field3651 == 0) {
            return -1;
        } else if (arg0.field3651 != 0 && this.field3651 == 0) {
            return 1;
        } else if (this.field3667 && !arg0.field3667) {
            return -1;
        } else if (!this.field3667 && arg0.field3667) {
            return 1;
        } else if (this.field3668 && !arg0.field3668) {
            return -1;
        } else if (!this.field3668 && arg0.field3668) {
            return 1;
        } else if (this.field3651 == 0) {
            return arg0.field3650 - this.field3650;
        } else {
            return this.field3650 - arg0.field3650;
        }
    }

    @ObfuscatedName("kx.au(Lju;I)I")
    public int method4703(class285 arg0) {
        return this.method4839((class295) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4839((class295) arg0);
    }
}
