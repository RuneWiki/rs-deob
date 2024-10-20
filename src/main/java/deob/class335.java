package deob;

@ObfuscatedName("lv")
public class class335 extends class342 {

    @ObfuscatedName("lv.i")
    public boolean field3943;

    @ObfuscatedName("lv.w")
    public boolean field3942;

    @ObfuscatedName("lv.i(Llv;I)I")
    public int method5438(class335 arg0) {
        if (client.field463 == this.field3965 && client.field463 != arg0.field3965) {
            return -1;
        } else if (client.field463 == arg0.field3965 && client.field463 != this.field3965) {
            return 1;
        } else if (this.field3965 != 0 && arg0.field3965 == 0) {
            return -1;
        } else if (arg0.field3965 != 0 && this.field3965 == 0) {
            return 1;
        } else if (this.field3943 && !arg0.field3943) {
            return -1;
        } else if (!this.field3943 && arg0.field3943) {
            return 1;
        } else if (this.field3942 && !arg0.field3942) {
            return -1;
        } else if (!this.field3942 && arg0.field3942) {
            return 1;
        } else if (this.field3965 == 0) {
            return arg0.field3966 - this.field3966;
        } else {
            return this.field3966 - arg0.field3966;
        }
    }

    @ObfuscatedName("lv.w(Lla;I)I")
    public int method5447(class338 arg0) {
        return this.method5438((class335) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5438((class335) arg0);
    }
}
