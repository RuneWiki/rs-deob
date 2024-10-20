package deob;

@ObfuscatedName("kv")
public class class295 extends class290 {

    @ObfuscatedName("kv.y")
    public boolean field3698;

    @ObfuscatedName("kv.c")
    public boolean field3699;

    @ObfuscatedName("kv.y(Lkv;I)I")
    public int method5099(class295 arg0) {
        if (client.field627 == this.field3686 && client.field627 != arg0.field3686) {
            return -1;
        } else if (client.field627 == arg0.field3686 && client.field627 != this.field3686) {
            return 1;
        } else if (this.field3686 != 0 && arg0.field3686 == 0) {
            return -1;
        } else if (arg0.field3686 != 0 && this.field3686 == 0) {
            return 1;
        } else if (this.field3698 && !arg0.field3698) {
            return -1;
        } else if (!this.field3698 && arg0.field3698) {
            return 1;
        } else if (this.field3699 && !arg0.field3699) {
            return -1;
        } else if (!this.field3699 && arg0.field3699) {
            return 1;
        } else if (this.field3686 == 0) {
            return arg0.field3683 - this.field3683;
        } else {
            return this.field3683 - arg0.field3683;
        }
    }

    @ObfuscatedName("kv.h(Ljd;B)I")
    public int method4963(class285 arg0) {
        return this.method5099((class295) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5099((class295) arg0);
    }
}
