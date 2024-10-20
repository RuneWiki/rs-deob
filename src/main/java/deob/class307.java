package deob;

@ObfuscatedName("kt")
public class class307 extends class302 {

    @ObfuscatedName("kt.c")
    public boolean field3855;

    @ObfuscatedName("kt.i")
    public boolean field3856;

    @ObfuscatedName("kt.c(Lkt;B)I")
    public int method5056(class307 arg0) {
        if (client.field858 == this.field3841 && client.field858 != arg0.field3841) {
            return -1;
        } else if (client.field858 == arg0.field3841 && client.field858 != this.field3841) {
            return 1;
        } else if (this.field3841 != 0 && arg0.field3841 == 0) {
            return -1;
        } else if (arg0.field3841 != 0 && this.field3841 == 0) {
            return 1;
        } else if (this.field3855 && !arg0.field3855) {
            return -1;
        } else if (!this.field3855 && arg0.field3855) {
            return 1;
        } else if (this.field3856 && !arg0.field3856) {
            return -1;
        } else if (!this.field3856 && arg0.field3856) {
            return 1;
        } else if (this.field3841 == 0) {
            return arg0.field3840 - this.field3840;
        } else {
            return this.field3840 - arg0.field3840;
        }
    }

    @ObfuscatedName("kt.aa(Lku;B)I")
    public int method4888(class297 arg0) {
        return this.method5056((class307) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5056((class307) arg0);
    }
}
