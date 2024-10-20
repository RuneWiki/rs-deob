package deob;

@ObfuscatedName("jf")
public class class284 extends class279 {

    @ObfuscatedName("jf.a")
    public boolean field3614;

    @ObfuscatedName("jf.t")
    public boolean field3612;

    @ObfuscatedName("jf.a(Ljf;I)I")
    public int method4872(class284 arg0) {
        if (client.field701 == this.field3597 && client.field701 != arg0.field3597) {
            return -1;
        } else if (client.field701 == arg0.field3597 && client.field701 != this.field3597) {
            return 1;
        } else if (this.field3597 != 0 && arg0.field3597 == 0) {
            return -1;
        } else if (arg0.field3597 != 0 && this.field3597 == 0) {
            return 1;
        } else if (this.field3614 && !arg0.field3614) {
            return -1;
        } else if (!this.field3614 && arg0.field3614) {
            return 1;
        } else if (this.field3612 && !arg0.field3612) {
            return -1;
        } else if (!this.field3612 && arg0.field3612) {
            return 1;
        } else if (this.field3597 == 0) {
            return arg0.field3598 - this.field3598;
        } else {
            return this.field3598 - arg0.field3598;
        }
    }

    @ObfuscatedName("jf.av(Ljg;I)I")
    public int method4715(class274 arg0) {
        return this.method4872((class284) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4872((class284) arg0);
    }
}
