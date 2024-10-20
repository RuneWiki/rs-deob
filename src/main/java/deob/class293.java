package deob;

@ObfuscatedName("km")
public class class293 extends class288 {

    @ObfuscatedName("km.b")
    public boolean field3737;

    @ObfuscatedName("km.q")
    public boolean field3738;

    @ObfuscatedName("km.b(Lkm;I)I")
    public int method4950(class293 arg0) {
        if (client.field1043 == this.field3721 && client.field1043 != arg0.field3721) {
            return -1;
        } else if (client.field1043 == arg0.field3721 && client.field1043 != this.field3721) {
            return 1;
        } else if (this.field3721 != 0 && arg0.field3721 == 0) {
            return -1;
        } else if (arg0.field3721 != 0 && this.field3721 == 0) {
            return 1;
        } else if (this.field3737 && !arg0.field3737) {
            return -1;
        } else if (!this.field3737 && arg0.field3737) {
            return 1;
        } else if (this.field3738 && !arg0.field3738) {
            return -1;
        } else if (!this.field3738 && arg0.field3738) {
            return 1;
        } else if (this.field3721 == 0) {
            return arg0.field3719 - this.field3719;
        } else {
            return this.field3719 - arg0.field3719;
        }
    }

    @ObfuscatedName("km.af(Ljw;I)I")
    public int method4799(class283 arg0) {
        return this.method4950((class293) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4950((class293) arg0);
    }
}
