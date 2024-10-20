package deob;

@ObfuscatedName("gt")
public class class162 {

    @ObfuscatedName("gt.az")
    public long field1781;

    @ObfuscatedName("gt.ah")
    public long field1782 = -1L;

    @ObfuscatedName("gt.af")
    public class400 field1787 = new class400();

    public class162(class535 arg0) {
        this.method3098(arg0);
    }

    @ObfuscatedName("gt.az(Lur;B)V")
    public void method3098(class535 arg0) {
        this.field1781 = arg0.method8469();
        this.field1782 = arg0.method8469();
        for (int var2 = arg0.method8462(); var2 != 0; var2 = arg0.method8462()) {
            class161 var3;
            if (var2 == 1) {
                var3 = new class157(this);
            } else if (var2 == 4) {
                var3 = new class168(this);
            } else if (var2 == 3) {
                var3 = new class153(this);
            } else if (var2 == 2) {
                var3 = new class151(this);
            } else if (var2 == 5) {
                var3 = new class158(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3001(arg0);
            this.field1787.method6647(var3);
        }
    }

    @ObfuscatedName("gt.ah(Lgi;B)V")
    public void method3099(class165 arg0) {
        if (this.field1781 != arg0.field4951 || this.field1782 != arg0.field1796) {
            throw new RuntimeException("");
        }
        for (class161 var2 = (class161) this.field1787.method6649(); var2 != null; var2 = (class161) this.field1787.method6650()) {
            var2.method3000(arg0);
        }
        arg0.field1796++;
    }
}
