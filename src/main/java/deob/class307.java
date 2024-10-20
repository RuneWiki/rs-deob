package deob;

@ObfuscatedName("ke")
public class class307 extends class302 {

    @ObfuscatedName("ke.g")
    public boolean field3868;

    @ObfuscatedName("ke.e")
    public boolean field3869;

    @ObfuscatedName("ke.g(Lke;I)I")
    public int method5080(class307 arg0) {
        if (client.field994 == this.field3854 && client.field994 != arg0.field3854) {
            return -1;
        } else if (client.field994 == arg0.field3854 && client.field994 != this.field3854) {
            return 1;
        } else if (this.field3854 != 0 && arg0.field3854 == 0) {
            return -1;
        } else if (arg0.field3854 != 0 && this.field3854 == 0) {
            return 1;
        } else if (this.field3868 && !arg0.field3868) {
            return -1;
        } else if (!this.field3868 && arg0.field3868) {
            return 1;
        } else if (this.field3869 && !arg0.field3869) {
            return -1;
        } else if (!this.field3869 && arg0.field3869) {
            return 1;
        } else if (this.field3854 == 0) {
            return arg0.field3852 - this.field3852;
        } else {
            return this.field3852 - arg0.field3852;
        }
    }

    @ObfuscatedName("ke.ag(Lkg;I)I")
    public int method4932(class297 arg0) {
        return this.method5080((class307) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5080((class307) arg0);
    }
}
