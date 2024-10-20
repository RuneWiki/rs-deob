package deob;

@ObfuscatedName("kq")
public class class296 extends class291 {

    @ObfuscatedName("kq.m")
    public boolean field3720;

    @ObfuscatedName("kq.f")
    public boolean field3719;

    @ObfuscatedName("kq.m(Lkq;I)I")
    public int method5151(class296 arg0) {
        if (client.field622 == this.field3703 && client.field622 != arg0.field3703) {
            return -1;
        } else if (client.field622 == arg0.field3703 && client.field622 != this.field3703) {
            return 1;
        } else if (this.field3703 != 0 && arg0.field3703 == 0) {
            return -1;
        } else if (arg0.field3703 != 0 && this.field3703 == 0) {
            return 1;
        } else if (this.field3720 && !arg0.field3720) {
            return -1;
        } else if (!this.field3720 && arg0.field3720) {
            return 1;
        } else if (this.field3719 && !arg0.field3719) {
            return -1;
        } else if (!this.field3719 && arg0.field3719) {
            return 1;
        } else if (this.field3703 == 0) {
            return arg0.field3701 - this.field3701;
        } else {
            return this.field3701 - arg0.field3701;
        }
    }

    @ObfuscatedName("kq.aj(Ljs;I)I")
    public int method4991(class286 arg0) {
        return this.method5151((class296) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5151((class296) arg0);
    }
}
