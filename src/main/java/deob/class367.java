package deob;

@ObfuscatedName("nh")
public class class367 extends class375 {

    @ObfuscatedName("nh.v")
    public boolean field4238;

    @ObfuscatedName("nh.c")
    public boolean field4237;

    @ObfuscatedName("nh.v(Lnh;I)I")
    public int method6044(class367 arg0) {
        if (client.field723 == this.field4269 && client.field723 != arg0.field4269) {
            return -1;
        } else if (client.field723 == arg0.field4269 && client.field723 != this.field4269) {
            return 1;
        } else if (this.field4269 != 0 && arg0.field4269 == 0) {
            return -1;
        } else if (arg0.field4269 != 0 && this.field4269 == 0) {
            return 1;
        } else if (this.field4238 && !arg0.field4238) {
            return -1;
        } else if (!this.field4238 && arg0.field4238) {
            return 1;
        } else if (this.field4237 && !arg0.field4237) {
            return -1;
        } else if (!this.field4237 && arg0.field4237) {
            return 1;
        } else if (this.field4269 == 0) {
            return arg0.field4268 - this.field4268;
        } else {
            return this.field4268 - arg0.field4268;
        }
    }

    @ObfuscatedName("nh.c(Lnn;I)I")
    public int method6046(class371 arg0) {
        return this.method6044((class367) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6044((class367) arg0);
    }
}
