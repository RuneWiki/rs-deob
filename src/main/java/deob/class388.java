package deob;

@ObfuscatedName("np")
public class class388 extends class395 {

    @ObfuscatedName("np.a")
    public boolean field4473;

    @ObfuscatedName("np.f")
    public boolean field4474;

    @ObfuscatedName("np.a(Lnp;I)I")
    public int method6691(class388 arg0) {
        if (client.field726 == this.field4495 && client.field726 != arg0.field4495) {
            return -1;
        } else if (client.field726 == arg0.field4495 && client.field726 != this.field4495) {
            return 1;
        } else if (this.field4495 != 0 && arg0.field4495 == 0) {
            return -1;
        } else if (arg0.field4495 != 0 && this.field4495 == 0) {
            return 1;
        } else if (this.field4473 && !arg0.field4473) {
            return -1;
        } else if (!this.field4473 && arg0.field4473) {
            return 1;
        } else if (this.field4474 && !arg0.field4474) {
            return -1;
        } else if (!this.field4474 && arg0.field4474) {
            return 1;
        } else if (this.field4495 == 0) {
            return arg0.field4494 - this.field4494;
        } else {
            return this.field4494 - arg0.field4494;
        }
    }

    @ObfuscatedName("np.f(Loj;I)I")
    public int method6692(class391 arg0) {
        return this.method6691((class388) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6691((class388) arg0);
    }
}
