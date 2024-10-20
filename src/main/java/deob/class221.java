package deob;

@ObfuscatedName("hs")
public class class221 {

    @ObfuscatedName("hs.o")
    public class222 field2662 = new class222();

    @ObfuscatedName("hs.k")
    public class222 field2661;

    public class221() {
        this.field2662.field2664 = this.field2662;
        this.field2662.field2663 = this.field2662;
    }

    @ObfuscatedName("hs.o(Lhl;)V")
    public void method3731(class222 arg0) {
        if (arg0.field2663 != null) {
            arg0.method3741();
        }
        arg0.field2663 = this.field2662.field2663;
        arg0.field2664 = this.field2662;
        arg0.field2663.field2664 = arg0;
        arg0.field2664.field2663 = arg0;
    }

    @ObfuscatedName("hs.k()Lhl;")
    public class222 method3735() {
        class222 var1 = this.field2662.field2664;
        if (this.field2662 == var1) {
            this.field2661 = null;
            return null;
        } else {
            this.field2661 = var1.field2664;
            return var1;
        }
    }

    @ObfuscatedName("hs.t()Lhl;")
    public class222 method3734() {
        class222 var1 = this.field2661;
        if (this.field2662 == var1) {
            this.field2661 = null;
            return null;
        } else {
            this.field2661 = var1.field2664;
            return var1;
        }
    }
}
