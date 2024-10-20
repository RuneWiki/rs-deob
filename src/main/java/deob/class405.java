package deob;

@ObfuscatedName("pr")
public class class405 extends class412 {

    @ObfuscatedName("pr.af")
    public boolean field4572;

    @ObfuscatedName("pr.an")
    public boolean field4571;

    @ObfuscatedName("pr.af(Lpr;B)I")
    public int method7134(class405 arg0) {
        if (client.field579 == this.field4600 && client.field579 != arg0.field4600) {
            return -1;
        } else if (client.field579 == arg0.field4600 && client.field579 != this.field4600) {
            return 1;
        } else if (this.field4600 != 0 && arg0.field4600 == 0) {
            return -1;
        } else if (arg0.field4600 != 0 && this.field4600 == 0) {
            return 1;
        } else if (this.field4572 && !arg0.field4572) {
            return -1;
        } else if (!this.field4572 && arg0.field4572) {
            return 1;
        } else if (this.field4571 && !arg0.field4571) {
            return -1;
        } else if (!this.field4571 && arg0.field4571) {
            return 1;
        } else if (this.field4600 == 0) {
            return arg0.field4598 - this.field4598;
        } else {
            return this.field4598 - arg0.field4598;
        }
    }

    @ObfuscatedName("pr.an(Lpw;I)I")
    public int method7139(class408 arg0) {
        return this.method7134((class405) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7134((class405) arg0);
    }
}
