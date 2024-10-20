package deob;

@ObfuscatedName("ks")
public class class307 extends class302 {

    @ObfuscatedName("ks.t")
    public boolean field3863;

    @ObfuscatedName("ks.q")
    public boolean field3862;

    @ObfuscatedName("ks.t(Lks;B)I")
    public int method5024(class307 arg0) {
        if (client.field850 == this.field3845 && client.field850 != arg0.field3845) {
            return -1;
        } else if (client.field850 == arg0.field3845 && client.field850 != this.field3845) {
            return 1;
        } else if (this.field3845 != 0 && arg0.field3845 == 0) {
            return -1;
        } else if (arg0.field3845 != 0 && this.field3845 == 0) {
            return 1;
        } else if (this.field3863 && !arg0.field3863) {
            return -1;
        } else if (!this.field3863 && arg0.field3863) {
            return 1;
        } else if (this.field3862 && !arg0.field3862) {
            return -1;
        } else if (!this.field3862 && arg0.field3862) {
            return 1;
        } else if (this.field3845 == 0) {
            return arg0.field3843 - this.field3843;
        } else {
            return this.field3843 - arg0.field3843;
        }
    }

    @ObfuscatedName("ks.aj(Lkv;I)I")
    public int method4859(class297 arg0) {
        return this.method5024((class307) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5024((class307) arg0);
    }
}
