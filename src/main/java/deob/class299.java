package deob;

@ObfuscatedName("ks")
public class class299 extends class294 {

    @ObfuscatedName("ks.a")
    public boolean field3730;

    @ObfuscatedName("ks.s")
    public boolean field3731;

    @ObfuscatedName("ks.a(Lks;B)I")
    public int method5257(class299 arg0) {
        if (client.field650 == this.field3713 && client.field650 != arg0.field3713) {
            return -1;
        } else if (client.field650 == arg0.field3713 && client.field650 != this.field3713) {
            return 1;
        } else if (this.field3713 != 0 && arg0.field3713 == 0) {
            return -1;
        } else if (arg0.field3713 != 0 && this.field3713 == 0) {
            return 1;
        } else if (this.field3730 && !arg0.field3730) {
            return -1;
        } else if (!this.field3730 && arg0.field3730) {
            return 1;
        } else if (this.field3731 && !arg0.field3731) {
            return -1;
        } else if (!this.field3731 && arg0.field3731) {
            return 1;
        } else if (this.field3713 == 0) {
            return arg0.field3712 - this.field3712;
        } else {
            return this.field3712 - arg0.field3712;
        }
    }

    @ObfuscatedName("ks.au(Lkn;I)I")
    public int method5091(class289 arg0) {
        return this.method5257((class299) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5257((class299) arg0);
    }
}
