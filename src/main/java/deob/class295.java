package deob;

@ObfuscatedName("kr")
public class class295 extends class290 {

    @ObfuscatedName("kr.f")
    public boolean field3715;

    @ObfuscatedName("kr.h")
    public boolean field3714;

    @ObfuscatedName("kr.f(Lkr;I)I")
    public int method5078(class295 arg0) {
        if (client.field610 == this.field3696 && client.field610 != arg0.field3696) {
            return -1;
        } else if (client.field610 == arg0.field3696 && client.field610 != this.field3696) {
            return 1;
        } else if (this.field3696 != 0 && arg0.field3696 == 0) {
            return -1;
        } else if (arg0.field3696 != 0 && this.field3696 == 0) {
            return 1;
        } else if (this.field3715 && !arg0.field3715) {
            return -1;
        } else if (!this.field3715 && arg0.field3715) {
            return 1;
        } else if (this.field3714 && !arg0.field3714) {
            return -1;
        } else if (!this.field3714 && arg0.field3714) {
            return 1;
        } else if (this.field3696 == 0) {
            return arg0.field3694 - this.field3694;
        } else {
            return this.field3694 - arg0.field3694;
        }
    }

    @ObfuscatedName("kr.as(Ljw;S)I")
    public int method4932(class285 arg0) {
        return this.method5078((class295) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5078((class295) arg0);
    }
}
