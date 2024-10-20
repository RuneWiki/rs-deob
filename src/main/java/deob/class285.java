package deob;

@ObfuscatedName("jy")
public class class285 extends class280 {

    @ObfuscatedName("jy.c")
    public boolean field3619;

    @ObfuscatedName("jy.t")
    public boolean field3620;

    @ObfuscatedName("jy.c(Ljy;S)I")
    public int method4853(class285 arg0) {
        if (client.field646 == this.field3600 && client.field646 != arg0.field3600) {
            return -1;
        } else if (client.field646 == arg0.field3600 && client.field646 != this.field3600) {
            return 1;
        } else if (this.field3600 != 0 && arg0.field3600 == 0) {
            return -1;
        } else if (arg0.field3600 != 0 && this.field3600 == 0) {
            return 1;
        } else if (this.field3619 && !arg0.field3619) {
            return -1;
        } else if (!this.field3619 && arg0.field3619) {
            return 1;
        } else if (this.field3620 && !arg0.field3620) {
            return -1;
        } else if (!this.field3620 && arg0.field3620) {
            return 1;
        } else if (this.field3600 == 0) {
            return arg0.field3601 - this.field3601;
        } else {
            return this.field3601 - arg0.field3601;
        }
    }

    @ObfuscatedName("jy.az(Ljk;I)I")
    public int method4693(class275 arg0) {
        return this.method4853((class285) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4853((class285) arg0);
    }
}
