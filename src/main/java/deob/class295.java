package deob;

@ObfuscatedName("kp")
public class class295 extends class290 {

    @ObfuscatedName("kp.v")
    public boolean field3682;

    @ObfuscatedName("kp.s")
    public boolean field3683;

    @ObfuscatedName("kp.v(Lkp;B)I")
    public int method5108(class295 arg0) {
        if (client.field711 == this.field3664 && client.field711 != arg0.field3664) {
            return -1;
        } else if (client.field711 == arg0.field3664 && client.field711 != this.field3664) {
            return 1;
        } else if (this.field3664 != 0 && arg0.field3664 == 0) {
            return -1;
        } else if (arg0.field3664 != 0 && this.field3664 == 0) {
            return 1;
        } else if (this.field3682 && !arg0.field3682) {
            return -1;
        } else if (!this.field3682 && arg0.field3682) {
            return 1;
        } else if (this.field3683 && !arg0.field3683) {
            return -1;
        } else if (!this.field3683 && arg0.field3683) {
            return 1;
        } else if (this.field3664 == 0) {
            return arg0.field3662 - this.field3662;
        } else {
            return this.field3662 - arg0.field3662;
        }
    }

    @ObfuscatedName("kp.an(Ljx;I)I")
    public int method4955(class285 arg0) {
        return this.method5108((class295) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5108((class295) arg0);
    }
}
