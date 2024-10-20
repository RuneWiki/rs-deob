package deob;

@ObfuscatedName("lv")
public class class318 extends class325 {

    @ObfuscatedName("lv.f")
    public boolean field3829;

    @ObfuscatedName("lv.o")
    public boolean field3828;

    @ObfuscatedName("lv.f(Llv;B)I")
    public int method5066(class318 arg0) {
        if (client.field600 == this.field3852 && client.field600 != arg0.field3852) {
            return -1;
        } else if (client.field600 == arg0.field3852 && client.field600 != this.field3852) {
            return 1;
        } else if (this.field3852 != 0 && arg0.field3852 == 0) {
            return -1;
        } else if (arg0.field3852 != 0 && this.field3852 == 0) {
            return 1;
        } else if (this.field3829 && !arg0.field3829) {
            return -1;
        } else if (!this.field3829 && arg0.field3829) {
            return 1;
        } else if (this.field3828 && !arg0.field3828) {
            return -1;
        } else if (!this.field3828 && arg0.field3828) {
            return 1;
        } else if (this.field3852 == 0) {
            return arg0.field3851 - this.field3851;
        } else {
            return this.field3851 - arg0.field3851;
        }
    }

    @ObfuscatedName("lv.o(Llt;I)I")
    public int method5062(class321 arg0) {
        return this.method5066((class318) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5066((class318) arg0);
    }
}
