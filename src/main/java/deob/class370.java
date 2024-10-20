package deob;

@ObfuscatedName("ne")
public class class370 extends class377 {

    @ObfuscatedName("ne.c")
    public boolean field4340;

    @ObfuscatedName("ne.p")
    public boolean field4341;

    @ObfuscatedName("ne.c(Lne;I)I")
    public int method6193(class370 arg0) {
        if (client.field493 == this.field4366 && client.field493 != arg0.field4366) {
            return -1;
        } else if (client.field493 == arg0.field4366 && client.field493 != this.field4366) {
            return 1;
        } else if (this.field4366 != 0 && arg0.field4366 == 0) {
            return -1;
        } else if (arg0.field4366 != 0 && this.field4366 == 0) {
            return 1;
        } else if (this.field4340 && !arg0.field4340) {
            return -1;
        } else if (!this.field4340 && arg0.field4340) {
            return 1;
        } else if (this.field4341 && !arg0.field4341) {
            return -1;
        } else if (!this.field4341 && arg0.field4341) {
            return 1;
        } else if (this.field4366 == 0) {
            return arg0.field4367 - this.field4367;
        } else {
            return this.field4367 - arg0.field4367;
        }
    }

    @ObfuscatedName("ne.p(Lnc;I)I")
    public int method6198(class373 arg0) {
        return this.method6193((class370) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method6193((class370) arg0);
    }
}
