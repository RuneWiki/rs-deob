package deob;

@ObfuscatedName("kl")
public class class294 extends class289 {

    @ObfuscatedName("kl.m")
    public boolean field3656;

    @ObfuscatedName("kl.o")
    public boolean field3655;

    @ObfuscatedName("kl.m(Lkl;I)I")
    public int method4945(class294 arg0) {
        if (client.field729 == this.field3643 && client.field729 != arg0.field3643) {
            return -1;
        } else if (client.field729 == arg0.field3643 && client.field729 != this.field3643) {
            return 1;
        } else if (this.field3643 != 0 && arg0.field3643 == 0) {
            return -1;
        } else if (arg0.field3643 != 0 && this.field3643 == 0) {
            return 1;
        } else if (this.field3656 && !arg0.field3656) {
            return -1;
        } else if (!this.field3656 && arg0.field3656) {
            return 1;
        } else if (this.field3655 && !arg0.field3655) {
            return -1;
        } else if (!this.field3655 && arg0.field3655) {
            return 1;
        } else if (this.field3643 == 0) {
            return arg0.field3641 - this.field3641;
        } else {
            return this.field3641 - arg0.field3641;
        }
    }

    @ObfuscatedName("kl.ah(Ljf;I)I")
    public int method4773(class284 arg0) {
        return this.method4945((class294) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4945((class294) arg0);
    }
}
