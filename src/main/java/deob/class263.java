package deob;

@ObfuscatedName("jo")
public class class263 {

    @ObfuscatedName("jo.c")
    public class179 field3511 = new class179();

    @ObfuscatedName("jo.x")
    public class179 field3512;

    public class263() {
        this.field3511.field2091 = this.field3511;
        this.field3511.field2092 = this.field3511;
    }

    @ObfuscatedName("jo.c(Lfx;)V")
    public void method4583(class179 arg0) {
        if (arg0.field2092 != null) {
            arg0.method3322();
        }
        arg0.field2092 = this.field3511.field2092;
        arg0.field2091 = this.field3511;
        arg0.field2092.field2091 = arg0;
        arg0.field2091.field2092 = arg0;
    }

    @ObfuscatedName("jo.x()Lfx;")
    public class179 method4584() {
        class179 var1 = this.field3511.field2091;
        if (this.field3511 == var1) {
            this.field3512 = null;
            return null;
        } else {
            this.field3512 = var1.field2091;
            return var1;
        }
    }

    @ObfuscatedName("jo.t()Lfx;")
    public class179 method4585() {
        class179 var1 = this.field3512;
        if (this.field3511 == var1) {
            this.field3512 = null;
            return null;
        } else {
            this.field3512 = var1.field2091;
            return var1;
        }
    }
}
