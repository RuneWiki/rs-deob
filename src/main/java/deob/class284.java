package deob;

@ObfuscatedName("jy")
public class class284 extends class279 {

    @ObfuscatedName("jy.z")
    public boolean field3616;

    @ObfuscatedName("jy.n")
    public boolean field3615;

    @ObfuscatedName("jy.z(Ljy;I)I")
    public int method4720(class284 arg0) {
        if (client.field856 == this.field3600 && client.field856 != arg0.field3600) {
            return -1;
        } else if (client.field856 == arg0.field3600 && client.field856 != this.field3600) {
            return 1;
        } else if (this.field3600 != 0 && arg0.field3600 == 0) {
            return -1;
        } else if (arg0.field3600 != 0 && this.field3600 == 0) {
            return 1;
        } else if (this.field3616 && !arg0.field3616) {
            return -1;
        } else if (!this.field3616 && arg0.field3616) {
            return 1;
        } else if (this.field3615 && !arg0.field3615) {
            return -1;
        } else if (!this.field3615 && arg0.field3615) {
            return 1;
        } else if (this.field3600 == 0) {
            return arg0.field3598 - this.field3598;
        } else {
            return this.field3598 - arg0.field3598;
        }
    }

    @ObfuscatedName("jy.l(Ljh;I)I")
    public int method4578(class274 arg0) {
        return this.method4720((class284) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4720((class284) arg0);
    }
}
