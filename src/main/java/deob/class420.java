package deob;

@ObfuscatedName("qr")
public class class420 {

    @ObfuscatedName("qr.ab")
    public class425 field4660 = new class425();

    @ObfuscatedName("qr.ay")
    public class424 field4658 = new class424();

    @ObfuscatedName("qr.an")
    public class424 field4659 = new class424(1.0F, 1.0F, 1.0F);

    public String toString() {
        return "[" + this.field4660.toString() + "|" + this.field4658.toString() + "|" + this.field4659.toString() + "]";
    }

    public boolean equals(Object arg0) {
        if (arg0 == null) {
            return false;
        } else if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class420)) {
            class420 var2 = (class420) arg0;
            return this.field4660.equals(var2.field4660) && this.field4658.method7192(var2.field4658) && this.field4659.method7192(var2.field4659);
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        byte var2 = 1;
        int var3 = var2 * 31 + this.field4660.hashCode();
        int var4 = var3 * 31 + this.field4658.hashCode();
        return var4 * 31 + this.field4659.hashCode();
    }
}
