package deob;

@ObfuscatedName("ja")
public class class284 extends class279 {

    @ObfuscatedName("ja.s")
    public boolean field3608;

    @ObfuscatedName("ja.j")
    public boolean field3607;

    @ObfuscatedName("ja.s(Lja;B)I")
    public int method4783(class284 arg0) {
        if (client.field872 == this.field3588 && client.field872 != arg0.field3588) {
            return -1;
        } else if (client.field872 == arg0.field3588 && client.field872 != this.field3588) {
            return 1;
        } else if (this.field3588 != 0 && arg0.field3588 == 0) {
            return -1;
        } else if (arg0.field3588 != 0 && this.field3588 == 0) {
            return 1;
        } else if (this.field3608 && !arg0.field3608) {
            return -1;
        } else if (!this.field3608 && arg0.field3608) {
            return 1;
        } else if (this.field3607 && !arg0.field3607) {
            return -1;
        } else if (!this.field3607 && arg0.field3607) {
            return 1;
        } else if (this.field3588 == 0) {
            return arg0.field3589 - this.field3589;
        } else {
            return this.field3589 - arg0.field3589;
        }
    }

    @ObfuscatedName("ja.ai(Lju;B)I")
    public int method4637(class274 arg0) {
        return this.method4783((class284) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method4783((class284) arg0);
    }
}
