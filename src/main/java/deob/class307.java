package deob;

@ObfuscatedName("ke")
public class class307 extends class302 {

    @ObfuscatedName("ke.d")
    public boolean field3855;

    @ObfuscatedName("ke.z")
    public boolean field3856;

    @ObfuscatedName("ke.d(Lke;I)I")
    public int method5116(class307 arg0) {
        if (client.field1084 == this.field3840 && client.field1084 != arg0.field3840) {
            return -1;
        } else if (client.field1084 == arg0.field3840 && client.field1084 != this.field3840) {
            return 1;
        } else if (this.field3840 != 0 && arg0.field3840 == 0) {
            return -1;
        } else if (arg0.field3840 != 0 && this.field3840 == 0) {
            return 1;
        } else if (this.field3855 && !arg0.field3855) {
            return -1;
        } else if (!this.field3855 && arg0.field3855) {
            return 1;
        } else if (this.field3856 && !arg0.field3856) {
            return -1;
        } else if (!this.field3856 && arg0.field3856) {
            return 1;
        } else if (this.field3840 == 0) {
            return arg0.field3841 - this.field3841;
        } else {
            return this.field3841 - arg0.field3841;
        }
    }

    @ObfuscatedName("ke.au(Lkm;I)I")
    public int method4960(class297 arg0) {
        return this.method5116((class307) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5116((class307) arg0);
    }
}
