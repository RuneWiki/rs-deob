package deob;

@ObfuscatedName("hd")
public class class221 {

    @ObfuscatedName("hd.c")
    public class222 field2653 = new class222();

    @ObfuscatedName("hd.i")
    public class222 field2652;

    public class221() {
        this.field2653.field2655 = this.field2653;
        this.field2653.field2654 = this.field2653;
    }

    @ObfuscatedName("hd.c(Lhn;)V")
    public void method3758(class222 arg0) {
        if (arg0.field2654 != null) {
            arg0.method3760();
        }
        arg0.field2654 = this.field2653.field2654;
        arg0.field2655 = this.field2653;
        arg0.field2654.field2655 = arg0;
        arg0.field2655.field2654 = arg0;
    }

    @ObfuscatedName("hd.i()Lhn;")
    public class222 method3752() {
        class222 var1 = this.field2653.field2655;
        if (this.field2653 == var1) {
            this.field2652 = null;
            return null;
        } else {
            this.field2652 = var1.field2655;
            return var1;
        }
    }

    @ObfuscatedName("hd.o()Lhn;")
    public class222 method3753() {
        class222 var1 = this.field2652;
        if (this.field2653 == var1) {
            this.field2652 = null;
            return null;
        } else {
            this.field2652 = var1.field2655;
            return var1;
        }
    }
}
