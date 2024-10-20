package deob;

@ObfuscatedName("mw")
public class class346 extends class354 {

    @ObfuscatedName("mw.c")
    public boolean field4086;

    @ObfuscatedName("mw.b")
    public boolean field4087;

    @ObfuscatedName("mw.c(Lmw;B)I")
    public int method5708(class346 arg0) {
        if (client.field469 == this.field4121 && client.field469 != arg0.field4121) {
            return -1;
        } else if (client.field469 == arg0.field4121 && client.field469 != this.field4121) {
            return 1;
        } else if (this.field4121 != 0 && arg0.field4121 == 0) {
            return -1;
        } else if (arg0.field4121 != 0 && this.field4121 == 0) {
            return 1;
        } else if (this.field4086 && !arg0.field4086) {
            return -1;
        } else if (!this.field4086 && arg0.field4086) {
            return 1;
        } else if (this.field4087 && !arg0.field4087) {
            return -1;
        } else if (!this.field4087 && arg0.field4087) {
            return 1;
        } else if (this.field4121 == 0) {
            return arg0.field4120 - this.field4120;
        } else {
            return this.field4120 - arg0.field4120;
        }
    }

    @ObfuscatedName("mw.b(Lmv;I)I")
    public int method5718(class350 arg0) {
        return this.method5708((class346) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5708((class346) arg0);
    }
}
