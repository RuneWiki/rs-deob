package deob;

@ObfuscatedName("rf")
public class class467 extends class474 {

    @ObfuscatedName("rf.ak")
    public boolean field4913;

    @ObfuscatedName("rf.al")
    public boolean field4912;

    @ObfuscatedName("rf.ak(Lrf;B)I")
    public int method7848(class467 arg0) {
        if (client.field600 == this.field4932 && client.field600 != arg0.field4932) {
            return -1;
        } else if (client.field600 == arg0.field4932 && client.field600 != this.field4932) {
            return 1;
        } else if (this.field4932 != 0 && arg0.field4932 == 0) {
            return -1;
        } else if (arg0.field4932 != 0 && this.field4932 == 0) {
            return 1;
        } else if (this.field4913 && !arg0.field4913) {
            return -1;
        } else if (!this.field4913 && arg0.field4913) {
            return 1;
        } else if (this.field4912 && !arg0.field4912) {
            return -1;
        } else if (!this.field4912 && arg0.field4912) {
            return 1;
        } else if (this.field4932 == 0) {
            return arg0.field4933 - this.field4933;
        } else {
            return this.field4933 - arg0.field4933;
        }
    }

    @ObfuscatedName("rf.al(Lsg;I)I")
    public int method7852(class470 arg0) {
        return this.method7848((class467) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7848((class467) arg0);
    }
}
