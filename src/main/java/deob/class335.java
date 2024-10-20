package deob;

@ObfuscatedName("lg")
public class class335 extends class342 {

    @ObfuscatedName("lg.l")
    public boolean field3950;

    @ObfuscatedName("lg.q")
    public boolean field3949;

    @ObfuscatedName("lg.l(Llg;I)I")
    public int method5485(class335 arg0) {
        if (client.field483 == this.field3976 && client.field483 != arg0.field3976) {
            return -1;
        } else if (client.field483 == arg0.field3976 && client.field483 != this.field3976) {
            return 1;
        } else if (this.field3976 != 0 && arg0.field3976 == 0) {
            return -1;
        } else if (arg0.field3976 != 0 && this.field3976 == 0) {
            return 1;
        } else if (this.field3950 && !arg0.field3950) {
            return -1;
        } else if (!this.field3950 && arg0.field3950) {
            return 1;
        } else if (this.field3949 && !arg0.field3949) {
            return -1;
        } else if (!this.field3949 && arg0.field3949) {
            return 1;
        } else if (this.field3976 == 0) {
            return arg0.field3975 - this.field3975;
        } else {
            return this.field3975 - arg0.field3975;
        }
    }

    @ObfuscatedName("lg.q(Llu;B)I")
    public int method5482(class338 arg0) {
        return this.method5485((class335) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5485((class335) arg0);
    }
}
