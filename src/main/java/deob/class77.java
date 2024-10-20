package deob;

@ObfuscatedName("fc")
public class class77 {

    @ObfuscatedName("fc.c")
    public class20 field1097;

    @ObfuscatedName("fc.v")
    public class20 field1096 = new class20();

    @ObfuscatedName("fc.v(Lfn;)V")
    public void method1204(class20 arg0) {
        if (arg0.field231 != null) {
            arg0.method192();
        }
        arg0.field231 = this.field1096.field231;
        arg0.field232 = this.field1096;
        arg0.field231.field232 = arg0;
        arg0.field232.field231 = arg0;
    }

    @ObfuscatedName("fc.c()Lfn;")
    public class20 method1205() {
        class20 var1 = this.field1096.field232;
        if (this.field1096 == var1) {
            this.field1097 = null;
            return null;
        } else {
            this.field1097 = var1.field232;
            return var1;
        }
    }

    @ObfuscatedName("fc.b()Lfn;")
    public class20 method1208() {
        class20 var1 = this.field1097;
        if (this.field1096 == var1) {
            this.field1097 = null;
            return null;
        } else {
            this.field1097 = var1.field232;
            return var1;
        }
    }

    public class77() {
        this.field1096.field232 = this.field1096;
        this.field1096.field231 = this.field1096;
    }
}
