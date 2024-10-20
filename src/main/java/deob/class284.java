package deob;

@ObfuscatedName("jy")
public class class284 extends class279 {

    @ObfuscatedName("jy.c")
    public boolean field3600;

    @ObfuscatedName("jy.x")
    public boolean field3599;

    @ObfuscatedName("jy.c(Ljy;B)I")
    public int method4836(class284 arg0) {
        if (client.field624 == this.field3582 && client.field624 != arg0.field3582) {
            return -1;
        } else if (client.field624 == arg0.field3582 && client.field624 != this.field3582) {
            return 1;
        } else if (this.field3582 != 0 && arg0.field3582 == 0) {
            return -1;
        } else if (arg0.field3582 != 0 && this.field3582 == 0) {
            return 1;
        } else if (this.field3600 && !arg0.field3600) {
            return -1;
        } else if (!this.field3600 && arg0.field3600) {
            return 1;
        } else if (this.field3599 && !arg0.field3599) {
            return -1;
        } else if (!this.field3599 && arg0.field3599) {
            return 1;
        } else if (this.field3582 == 0) {
            return arg0.field3581 - this.field3581;
        } else {
            return this.field3581 - arg0.field3581;
        }
    }

    @ObfuscatedName("jy.an(Ljw;B)I")
    public int method4686(class274 arg0) {
        return this.method4836((class284) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4836((class284) arg0);
    }
}
