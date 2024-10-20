package deob;

@ObfuscatedName("qh")
public class class422 {

    @ObfuscatedName("qh.ac")
    public class427 field4705 = class427.method3295();

    @ObfuscatedName("qh.ae")
    public class426 field4708 = class426.method7267();

    @ObfuscatedName("qh.ag")
    public class426 field4707 = class426.method5154(1.0F, 1.0F, 1.0F);

    @ObfuscatedName("qh.ac(B)V")
    public void method7252() {
        this.field4705.method7330();
        this.field4708.method7316();
        this.field4707.method7316();
    }

    public String toString() {
        return "[" + this.field4705.toString() + "|" + this.field4708.toString() + "|" + this.field4707.toString() + "]";
    }

    public boolean equals(Object arg0) {
        if (arg0 == null) {
            return false;
        } else if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class422)) {
            class422 var2 = (class422) arg0;
            return this.field4705.equals(var2.field4705) && this.field4708.method7306(var2.field4708) && this.field4707.method7306(var2.field4707);
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        byte var2 = 1;
        int var3 = var2 * 31 + this.field4705.hashCode();
        int var4 = var3 * 31 + this.field4708.hashCode();
        return var4 * 31 + this.field4707.hashCode();
    }
}
