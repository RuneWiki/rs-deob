package deob;

@ObfuscatedName("pk")
public class class401 extends class408 {

    @ObfuscatedName("pk.aj")
    public boolean field4510;

    @ObfuscatedName("pk.al")
    public boolean field4509;

    @ObfuscatedName("pk.aj(Lpk;I)I")
    public int method6889(class401 arg0) {
        if (client.field482 == this.field4533 && client.field482 != arg0.field4533) {
            return -1;
        } else if (client.field482 == arg0.field4533 && client.field482 != this.field4533) {
            return 1;
        } else if (this.field4533 != 0 && arg0.field4533 == 0) {
            return -1;
        } else if (arg0.field4533 != 0 && this.field4533 == 0) {
            return 1;
        } else if (this.field4510 && !arg0.field4510) {
            return -1;
        } else if (!this.field4510 && arg0.field4510) {
            return 1;
        } else if (this.field4509 && !arg0.field4509) {
            return -1;
        } else if (!this.field4509 && arg0.field4509) {
            return 1;
        } else if (this.field4533 == 0) {
            return arg0.field4534 - this.field4534;
        } else {
            return this.field4534 - arg0.field4534;
        }
    }

    @ObfuscatedName("pk.al(Lpb;I)I")
    public int method6896(class404 arg0) {
        return this.method6889((class401) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6889((class401) arg0);
    }
}
