package deob;

@ObfuscatedName("gg")
public class class168 {

    @ObfuscatedName("gg.ap")
    public long field1820;

    @ObfuscatedName("gg.aw")
    public long field1819 = -1L;

    @ObfuscatedName("gg.ak")
    public class413 field1821 = new class413();

    public class168(class558 arg0) {
        this.method3532(arg0);
    }

    @ObfuscatedName("gg.ap(Lvl;B)V")
    public void method3532(class558 arg0) {
        this.field1820 = arg0.method9265();
        this.field1819 = arg0.method9265();
        for (int var2 = arg0.method9258(); var2 != 0; var2 = arg0.method9258()) {
            class167 var3;
            if (var2 == 1) {
                var3 = new class163(this);
            } else if (var2 == 4) {
                var3 = new class174(this);
            } else if (var2 == 3) {
                var3 = new class159(this);
            } else if (var2 == 2) {
                var3 = new class157(this);
            } else if (var2 == 5) {
                var3 = new class164(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3436(arg0);
            this.field1821.method7299(var3);
        }
    }

    @ObfuscatedName("gg.aw(Lgw;S)V")
    public void method3535(class171 arg0) {
        if (this.field1820 != arg0.field5170 || this.field1819 != arg0.field1837) {
            throw new RuntimeException("");
        }
        for (class167 var2 = (class167) this.field1821.method7322(); var2 != null; var2 = (class167) this.field1821.method7303()) {
            var2.method3434(arg0);
        }
        arg0.field1837++;
    }
}
