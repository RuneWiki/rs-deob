package deob;

@ObfuscatedName("gx")
public class class165 {

    @ObfuscatedName("gx.ak")
    public long field1813;

    @ObfuscatedName("gx.al")
    public long field1807 = -1L;

    @ObfuscatedName("gx.aj")
    public class408 field1808 = new class408();

    public class165(class546 arg0) {
        this.method3188(arg0);
    }

    @ObfuscatedName("gx.ak(Lua;I)V")
    public void method3188(class546 arg0) {
        this.field1813 = arg0.method8802();
        this.field1807 = arg0.method8802();
        for (int var2 = arg0.method8796(); var2 != 0; var2 = arg0.method8796()) {
            class164 var3;
            if (var2 == 1) {
                var3 = new class160(this);
            } else if (var2 == 4) {
                var3 = new class171(this);
            } else if (var2 == 3) {
                var3 = new class156(this);
            } else if (var2 == 2) {
                var3 = new class154(this);
            } else if (var2 == 5) {
                var3 = new class161(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3089(arg0);
            this.field1808.method6886(var3);
        }
    }

    @ObfuscatedName("gx.al(Lgo;I)V")
    public void method3182(class168 arg0) {
        if (this.field1813 != arg0.field5049 || this.field1807 != arg0.field1827) {
            throw new RuntimeException("");
        }
        for (class164 var2 = (class164) this.field1808.method6889(); var2 != null; var2 = (class164) this.field1808.method6926()) {
            var2.method3091(arg0);
        }
        arg0.field1827++;
    }
}
