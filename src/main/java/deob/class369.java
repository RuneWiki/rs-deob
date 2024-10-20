package deob;

@ObfuscatedName("nl")
public class class369 extends class376 {

    @ObfuscatedName("nl.s")
    public boolean field4295;

    @ObfuscatedName("nl.h")
    public boolean field4294;

    @ObfuscatedName("nl.s(Lnl;I)I")
    public int method5966(class369 arg0) {
        if (client.field476 == this.field4328 && client.field476 != arg0.field4328) {
            return -1;
        } else if (client.field476 == arg0.field4328 && client.field476 != this.field4328) {
            return 1;
        } else if (this.field4328 != 0 && arg0.field4328 == 0) {
            return -1;
        } else if (arg0.field4328 != 0 && this.field4328 == 0) {
            return 1;
        } else if (this.field4295 && !arg0.field4295) {
            return -1;
        } else if (!this.field4295 && arg0.field4295) {
            return 1;
        } else if (this.field4294 && !arg0.field4294) {
            return -1;
        } else if (!this.field4294 && arg0.field4294) {
            return 1;
        } else if (this.field4328 == 0) {
            return arg0.field4325 - this.field4325;
        } else {
            return this.field4325 - arg0.field4325;
        }
    }

    @ObfuscatedName("nl.h(Lnb;I)I")
    public int method5970(class372 arg0) {
        return this.method5966((class369) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5966((class369) arg0);
    }
}
