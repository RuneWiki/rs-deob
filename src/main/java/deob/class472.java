package deob;

@ObfuscatedName("sk")
public class class472 extends class479 {

    @ObfuscatedName("sk.ap")
    public boolean field5000;

    @ObfuscatedName("sk.aw")
    public boolean field4998;

    @ObfuscatedName("sk.ap(Lsk;I)I")
    public int method8300(class472 arg0) {
        if (client.field502 == this.field5022 && client.field502 != arg0.field5022) {
            return -1;
        } else if (client.field502 == arg0.field5022 && client.field502 != this.field5022) {
            return 1;
        } else if (this.field5022 != 0 && arg0.field5022 == 0) {
            return -1;
        } else if (arg0.field5022 != 0 && this.field5022 == 0) {
            return 1;
        } else if (this.field5000 && !arg0.field5000) {
            return -1;
        } else if (!this.field5000 && arg0.field5000) {
            return 1;
        } else if (this.field4998 && !arg0.field4998) {
            return -1;
        } else if (!this.field4998 && arg0.field4998) {
            return 1;
        } else if (this.field5022 == 0) {
            return arg0.field5025 - this.field5025;
        } else {
            return this.field5025 - arg0.field5025;
        }
    }

    @ObfuscatedName("sk.aw(Lse;S)I")
    public int method8303(class475 arg0) {
        return this.method8300((class472) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method8300((class472) arg0);
    }
}
