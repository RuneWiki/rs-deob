package deob;

@ObfuscatedName("nr")
public class class368 extends class375 {

    @ObfuscatedName("nr.c")
    public boolean field4300;

    @ObfuscatedName("nr.v")
    public boolean field4299;

    @ObfuscatedName("nr.c(Lnr;I)I")
    public int method6034(class368 arg0) {
        if (client.field697 == this.field4325 && client.field697 != arg0.field4325) {
            return -1;
        } else if (client.field697 == arg0.field4325 && client.field697 != this.field4325) {
            return 1;
        } else if (this.field4325 != 0 && arg0.field4325 == 0) {
            return -1;
        } else if (arg0.field4325 != 0 && this.field4325 == 0) {
            return 1;
        } else if (this.field4300 && !arg0.field4300) {
            return -1;
        } else if (!this.field4300 && arg0.field4300) {
            return 1;
        } else if (this.field4299 && !arg0.field4299) {
            return -1;
        } else if (!this.field4299 && arg0.field4299) {
            return 1;
        } else if (this.field4325 == 0) {
            return arg0.field4326 - this.field4326;
        } else {
            return this.field4326 - arg0.field4326;
        }
    }

    @ObfuscatedName("nr.v(Lne;B)I")
    public int method6033(class371 arg0) {
        return this.method6034((class368) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6034((class368) arg0);
    }
}
