package deob;

@ObfuscatedName("jn")
public class class284 extends class279 {

    @ObfuscatedName("jn.u")
    public boolean field3630;

    @ObfuscatedName("jn.f")
    public boolean field3631;

    @ObfuscatedName("jn.u(Ljn;I)I")
    public int method4854(class284 arg0) {
        if (client.field645 == this.field3614 && client.field645 != arg0.field3614) {
            return -1;
        } else if (client.field645 == arg0.field3614 && client.field645 != this.field3614) {
            return 1;
        } else if (this.field3614 != 0 && arg0.field3614 == 0) {
            return -1;
        } else if (arg0.field3614 != 0 && this.field3614 == 0) {
            return 1;
        } else if (this.field3630 && !arg0.field3630) {
            return -1;
        } else if (!this.field3630 && arg0.field3630) {
            return 1;
        } else if (this.field3631 && !arg0.field3631) {
            return -1;
        } else if (!this.field3631 && arg0.field3631) {
            return 1;
        } else if (this.field3614 == 0) {
            return arg0.field3613 - this.field3613;
        } else {
            return this.field3613 - arg0.field3613;
        }
    }

    @ObfuscatedName("jn.v(Ljr;B)I")
    public int method4709(class274 arg0) {
        return this.method4854((class284) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4854((class284) arg0);
    }
}
