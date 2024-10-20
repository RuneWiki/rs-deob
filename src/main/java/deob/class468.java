package deob;

@ObfuscatedName("rn")
public class class468 extends class475 {

    @ObfuscatedName("rn.aq")
    public boolean field4933;

    @ObfuscatedName("rn.ad")
    public boolean field4934;

    @ObfuscatedName("rn.aq(Lrn;B)I")
    public int method7809(class468 arg0) {
        if (client.field500 == this.field4957 && client.field500 != arg0.field4957) {
            return -1;
        } else if (client.field500 == arg0.field4957 && client.field500 != this.field4957) {
            return 1;
        } else if (this.field4957 != 0 && arg0.field4957 == 0) {
            return -1;
        } else if (arg0.field4957 != 0 && this.field4957 == 0) {
            return 1;
        } else if (this.field4933 && !arg0.field4933) {
            return -1;
        } else if (!this.field4933 && arg0.field4933) {
            return 1;
        } else if (this.field4934 && !arg0.field4934) {
            return -1;
        } else if (!this.field4934 && arg0.field4934) {
            return 1;
        } else if (this.field4957 == 0) {
            return arg0.field4956 - this.field4956;
        } else {
            return this.field4956 - arg0.field4956;
        }
    }

    @ObfuscatedName("rn.ad(Lsk;B)I")
    public int method7810(class471 arg0) {
        return this.method7809((class468) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7809((class468) arg0);
    }
}
