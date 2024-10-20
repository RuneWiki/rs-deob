package deob;

@ObfuscatedName("la")
public class class334 extends class341 {

    @ObfuscatedName("la.n")
    public boolean field3937;

    @ObfuscatedName("la.c")
    public boolean field3938;

    @ObfuscatedName("la.n(Lla;I)I")
    public int method5417(class334 arg0) {
        if (client.field654 == this.field3965 && client.field654 != arg0.field3965) {
            return -1;
        } else if (client.field654 == arg0.field3965 && client.field654 != this.field3965) {
            return 1;
        } else if (this.field3965 != 0 && arg0.field3965 == 0) {
            return -1;
        } else if (arg0.field3965 != 0 && this.field3965 == 0) {
            return 1;
        } else if (this.field3937 && !arg0.field3937) {
            return -1;
        } else if (!this.field3937 && arg0.field3937) {
            return 1;
        } else if (this.field3938 && !arg0.field3938) {
            return -1;
        } else if (!this.field3938 && arg0.field3938) {
            return 1;
        } else if (this.field3965 == 0) {
            return arg0.field3963 - this.field3963;
        } else {
            return this.field3963 - arg0.field3963;
        }
    }

    @ObfuscatedName("la.c(Lle;I)I")
    public int method5424(class337 arg0) {
        return this.method5417((class334) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5417((class334) arg0);
    }
}
