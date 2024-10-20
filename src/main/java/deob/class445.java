package deob;

@ObfuscatedName("rq")
public class class445 extends class452 {

    @ObfuscatedName("rq.ac")
    public boolean field4690;

    @ObfuscatedName("rq.al")
    public boolean field4689;

    @ObfuscatedName("rq.ac(Lrq;B)I")
    public int method7302(class445 arg0) {
        if (client.field519 == this.field4712 && client.field519 != arg0.field4712) {
            return -1;
        } else if (client.field519 == arg0.field4712 && client.field519 != this.field4712) {
            return 1;
        } else if (this.field4712 != 0 && arg0.field4712 == 0) {
            return -1;
        } else if (arg0.field4712 != 0 && this.field4712 == 0) {
            return 1;
        } else if (this.field4690 && !arg0.field4690) {
            return -1;
        } else if (!this.field4690 && arg0.field4690) {
            return 1;
        } else if (this.field4689 && !arg0.field4689) {
            return -1;
        } else if (!this.field4689 && arg0.field4689) {
            return 1;
        } else if (this.field4712 == 0) {
            return arg0.field4711 - this.field4711;
        } else {
            return this.field4711 - arg0.field4711;
        }
    }

    @ObfuscatedName("rq.al(Lrp;I)I")
    public int method7303(class448 arg0) {
        return this.method7302((class445) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7302((class445) arg0);
    }
}
