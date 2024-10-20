package deob;

@ObfuscatedName("jr")
public class class264 {

    @ObfuscatedName("jr.c")
    public class179 field3533 = new class179();

    @ObfuscatedName("jr.t")
    public class179 field3534;

    public class264() {
        this.field3533.field2111 = this.field3533;
        this.field3533.field2110 = this.field3533;
    }

    @ObfuscatedName("jr.c(Lfq;)V")
    public void method4587(class179 arg0) {
        if (arg0.field2110 != null) {
            arg0.method3345();
        }
        arg0.field2110 = this.field3533.field2110;
        arg0.field2111 = this.field3533;
        arg0.field2110.field2111 = arg0;
        arg0.field2111.field2110 = arg0;
    }

    @ObfuscatedName("jr.t()Lfq;")
    public class179 method4579() {
        class179 var1 = this.field3533.field2111;
        if (this.field3533 == var1) {
            this.field3534 = null;
            return null;
        } else {
            this.field3534 = var1.field2111;
            return var1;
        }
    }

    @ObfuscatedName("jr.o()Lfq;")
    public class179 method4581() {
        class179 var1 = this.field3534;
        if (this.field3533 == var1) {
            this.field3534 = null;
            return null;
        } else {
            this.field3534 = var1.field2111;
            return var1;
        }
    }
}
