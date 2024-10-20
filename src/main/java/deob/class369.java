package deob;

@ObfuscatedName("nn")
public class class369 extends class376 {

    @ObfuscatedName("nn.o")
    public boolean field4312;

    @ObfuscatedName("nn.q")
    public boolean field4313;

    @ObfuscatedName("nn.o(Lnn;I)I")
    public int method5980(class369 arg0) {
        if (client.field539 == this.field4335 && client.field539 != arg0.field4335) {
            return -1;
        } else if (client.field539 == arg0.field4335 && client.field539 != this.field4335) {
            return 1;
        } else if (this.field4335 != 0 && arg0.field4335 == 0) {
            return -1;
        } else if (arg0.field4335 != 0 && this.field4335 == 0) {
            return 1;
        } else if (this.field4312 && !arg0.field4312) {
            return -1;
        } else if (!this.field4312 && arg0.field4312) {
            return 1;
        } else if (this.field4313 && !arg0.field4313) {
            return -1;
        } else if (!this.field4313 && arg0.field4313) {
            return 1;
        } else if (this.field4335 == 0) {
            return arg0.field4336 - this.field4336;
        } else {
            return this.field4336 - arg0.field4336;
        }
    }

    @ObfuscatedName("nn.q(Lnb;I)I")
    public int method5974(class372 arg0) {
        return this.method5980((class369) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5980((class369) arg0);
    }
}
