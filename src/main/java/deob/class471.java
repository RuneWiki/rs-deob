package deob;

@ObfuscatedName("sr")
public class class471 extends class478 {

    @ObfuscatedName("sr.ac")
    public boolean field4974;

    @ObfuscatedName("sr.ae")
    public boolean field4973;

    @ObfuscatedName("sr.ac(Lsr;I)I")
    public int method8032(class471 arg0) {
        if (client.field516 == this.field4998 && client.field516 != arg0.field4998) {
            return -1;
        } else if (client.field516 == arg0.field4998 && client.field516 != this.field4998) {
            return 1;
        } else if (this.field4998 != 0 && arg0.field4998 == 0) {
            return -1;
        } else if (arg0.field4998 != 0 && this.field4998 == 0) {
            return 1;
        } else if (this.field4974 && !arg0.field4974) {
            return -1;
        } else if (!this.field4974 && arg0.field4974) {
            return 1;
        } else if (this.field4973 && !arg0.field4973) {
            return -1;
        } else if (!this.field4973 && arg0.field4973) {
            return 1;
        } else if (this.field4998 == 0) {
            return arg0.field4997 - this.field4997;
        } else {
            return this.field4997 - arg0.field4997;
        }
    }

    @ObfuscatedName("sr.ae(Lss;S)I")
    public int method8037(class474 arg0) {
        return this.method8032((class471) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method8032((class471) arg0);
    }
}
