package deob;

@ObfuscatedName("kr")
public class class298 extends class293 {

    @ObfuscatedName("kr.n")
    public boolean field3716;

    @ObfuscatedName("kr.h")
    public boolean field3717;

    @ObfuscatedName("kr.n(Lkr;I)I")
    public int method5280(class298 arg0) {
        if (client.field630 == this.field3701 && client.field630 != arg0.field3701) {
            return -1;
        } else if (client.field630 == arg0.field3701 && client.field630 != this.field3701) {
            return 1;
        } else if (this.field3701 != 0 && arg0.field3701 == 0) {
            return -1;
        } else if (arg0.field3701 != 0 && this.field3701 == 0) {
            return 1;
        } else if (this.field3716 && !arg0.field3716) {
            return -1;
        } else if (!this.field3716 && arg0.field3716) {
            return 1;
        } else if (this.field3717 && !arg0.field3717) {
            return -1;
        } else if (!this.field3717 && arg0.field3717) {
            return 1;
        } else if (this.field3701 == 0) {
            return arg0.field3702 - this.field3702;
        } else {
            return this.field3702 - arg0.field3702;
        }
    }

    @ObfuscatedName("kr.ag(Lke;B)I")
    public int method5140(class288 arg0) {
        return this.method5280((class298) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5280((class298) arg0);
    }
}
