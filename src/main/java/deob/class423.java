package deob;

@ObfuscatedName("qj")
public class class423 {

    @ObfuscatedName("qj.ap")
    public class428 field4753 = class428.method4930();

    @ObfuscatedName("qj.aw")
    public class427 field4754 = class427.method5841();

    @ObfuscatedName("qj.ak")
    public class427 field4755 = class427.method1235(1.0F, 1.0F, 1.0F);

    @ObfuscatedName("qj.ap(I)V")
    public void method7493() {
        this.field4753.method7593();
        this.field4754.method7534();
        this.field4755.method7534();
    }

    public String toString() {
        return "[" + this.field4753.toString() + "|" + this.field4754.toString() + "|" + this.field4755.toString() + "]";
    }

    public boolean equals(Object arg0) {
        if (arg0 == null) {
            return false;
        } else if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class423)) {
            class423 var2 = (class423) arg0;
            return this.field4753.equals(var2.field4753) && this.field4754.method7537(var2.field4754) && this.field4755.method7537(var2.field4755);
        } else {
            return false;
        }
    }

    public int hashCode() {
        boolean var1 = true;
        byte var2 = 1;
        int var3 = var2 * 31 + this.field4753.hashCode();
        int var4 = var3 * 31 + this.field4754.hashCode();
        return var4 * 31 + this.field4755.hashCode();
    }
}
