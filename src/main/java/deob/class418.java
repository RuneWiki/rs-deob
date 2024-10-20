package deob;

@ObfuscatedName("qx")
public class class418 extends class425 {

    @ObfuscatedName("qx.at")
    public boolean field4590;

    @ObfuscatedName("qx.an")
    public boolean field4591;

    @ObfuscatedName("qx.at(Lqx;I)I")
    public int method7107(class418 arg0) {
        if (client.field504 == this.field4612 && client.field504 != arg0.field4612) {
            return -1;
        } else if (client.field504 == arg0.field4612 && client.field504 != this.field4612) {
            return 1;
        } else if (this.field4612 != 0 && arg0.field4612 == 0) {
            return -1;
        } else if (arg0.field4612 != 0 && this.field4612 == 0) {
            return 1;
        } else if (this.field4590 && !arg0.field4590) {
            return -1;
        } else if (!this.field4590 && arg0.field4590) {
            return 1;
        } else if (this.field4591 && !arg0.field4591) {
            return -1;
        } else if (!this.field4591 && arg0.field4591) {
            return 1;
        } else if (this.field4612 == 0) {
            return arg0.field4613 - this.field4613;
        } else {
            return this.field4613 - arg0.field4613;
        }
    }

    @ObfuscatedName("qx.an(Lqm;I)I")
    public int method7110(class421 arg0) {
        return this.method7107((class418) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method7107((class418) arg0);
    }
}
