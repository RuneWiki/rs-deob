package deob;

@ObfuscatedName("mp")
public class class351 extends class359 {

    @ObfuscatedName("mp.c")
    public boolean field4134;

    @ObfuscatedName("mp.l")
    public boolean field4135;

    @ObfuscatedName("mp.c(Lmp;I)I")
    public int method5699(class351 arg0) {
        if (client.field496 == this.field4172 && client.field496 != arg0.field4172) {
            return -1;
        } else if (client.field496 == arg0.field4172 && client.field496 != this.field4172) {
            return 1;
        } else if (this.field4172 != 0 && arg0.field4172 == 0) {
            return -1;
        } else if (arg0.field4172 != 0 && this.field4172 == 0) {
            return 1;
        } else if (this.field4134 && !arg0.field4134) {
            return -1;
        } else if (!this.field4134 && arg0.field4134) {
            return 1;
        } else if (this.field4135 && !arg0.field4135) {
            return -1;
        } else if (!this.field4135 && arg0.field4135) {
            return 1;
        } else if (this.field4172 == 0) {
            return arg0.field4173 - this.field4173;
        } else {
            return this.field4173 - arg0.field4173;
        }
    }

    @ObfuscatedName("mp.l(Lmy;I)I")
    public int method5701(class355 arg0) {
        return this.method5699((class351) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5699((class351) arg0);
    }
}
