package deob;

@ObfuscatedName("kh")
public class class307 extends class302 {

    @ObfuscatedName("kh.o")
    public boolean field3863;

    @ObfuscatedName("kh.k")
    public boolean field3862;

    @ObfuscatedName("kh.o(Lkh;I)I")
    public int method5034(class307 arg0) {
        if (client.field871 == this.field3848 && client.field871 != arg0.field3848) {
            return -1;
        } else if (client.field871 == arg0.field3848 && client.field871 != this.field3848) {
            return 1;
        } else if (this.field3848 != 0 && arg0.field3848 == 0) {
            return -1;
        } else if (arg0.field3848 != 0 && this.field3848 == 0) {
            return 1;
        } else if (this.field3863 && !arg0.field3863) {
            return -1;
        } else if (!this.field3863 && arg0.field3863) {
            return 1;
        } else if (this.field3862 && !arg0.field3862) {
            return -1;
        } else if (!this.field3862 && arg0.field3862) {
            return 1;
        } else if (this.field3848 == 0) {
            return arg0.field3846 - this.field3846;
        } else {
            return this.field3846 - arg0.field3846;
        }
    }

    @ObfuscatedName("kh.at(Lku;I)I")
    public int method4880(class297 arg0) {
        return this.method5034((class307) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5034((class307) arg0);
    }
}
