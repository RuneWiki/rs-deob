package deob;

@ObfuscatedName("sp")
public class class469 extends class476 {

    @ObfuscatedName("sp.ab")
    public boolean field4912;

    @ObfuscatedName("sp.ay")
    public boolean field4913;

    @ObfuscatedName("sp.ab(Lsp;I)I")
    public int method7905(class469 arg0) {
        if (client.field798 == this.field4938 && client.field798 != arg0.field4938) {
            return -1;
        } else if (client.field798 == arg0.field4938 && client.field798 != this.field4938) {
            return 1;
        } else if (this.field4938 != 0 && arg0.field4938 == 0) {
            return -1;
        } else if (arg0.field4938 != 0 && this.field4938 == 0) {
            return 1;
        } else if (this.field4912 && !arg0.field4912) {
            return -1;
        } else if (!this.field4912 && arg0.field4912) {
            return 1;
        } else if (this.field4913 && !arg0.field4913) {
            return -1;
        } else if (!this.field4913 && arg0.field4913) {
            return 1;
        } else if (this.field4938 == 0) {
            return arg0.field4934 - this.field4934;
        } else {
            return this.field4934 - arg0.field4934;
        }
    }

    @ObfuscatedName("sp.ay(Lsz;I)I")
    public int method7906(class472 arg0) {
        return this.method7905((class469) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7905((class469) arg0);
    }
}
