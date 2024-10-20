package deob;

@ObfuscatedName("jw")
public class class283 extends class274 {

    @ObfuscatedName("jw.s")
    public int field3740 = -1;

    @ObfuscatedName("jw.g")
    public int field3739;

    @ObfuscatedName("jw.m")
    public int field3741;

    @ObfuscatedName("jw.h")
    public boolean field3742;

    @ObfuscatedName("jw.t")
    public boolean field3743;

    @ObfuscatedName("jw.s(Ljw;I)I")
    public int method4975(class283 arg0) {
        if (client.field841 == this.field3740 && client.field841 != arg0.field3740) {
            return -1;
        } else if (client.field841 == arg0.field3740 && client.field841 != this.field3740) {
            return 1;
        } else if (this.field3740 != 0 && arg0.field3740 == 0) {
            return -1;
        } else if (arg0.field3740 != 0 && this.field3740 == 0) {
            return 1;
        } else if (this.field3742 && !arg0.field3742) {
            return -1;
        } else if (!this.field3742 && arg0.field3742) {
            return 1;
        } else if (this.field3743 && !arg0.field3743) {
            return -1;
        } else if (!this.field3743 && arg0.field3743) {
            return 1;
        } else if (this.field3740 == 0) {
            return arg0.field3739 - this.field3739;
        } else {
            return this.field3739 - arg0.field3739;
        }
    }

    @ObfuscatedName("jw.aw(Ljq;I)I")
    public int method4809(class274 arg0) {
        return this.method4975((class283) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4975((class283) arg0);
    }
}
