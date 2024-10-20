package deob;

@ObfuscatedName("gd")
public class class158 extends class143 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("gd.at")
    public long field1734;

    @ObfuscatedName("gd.an")
    public String field1731;

    @ObfuscatedName("gd.av")
    public int field1730;

    public class158(class146 arg0) {
        this.this$0 = arg0;
        this.field1734 = -1L;
        this.field1731 = null;
        this.field1730 = 0;
    }

    @ObfuscatedName("gd.at(Ltz;B)V")
    public void method2929(class501 arg0) {
        if (arg0.method8129() != 255) {
            arg0.field5017--;
            this.field1734 = arg0.method8135();
        }
        this.field1731 = arg0.method8128();
        this.field1730 = arg0.method8195();
    }

    @ObfuscatedName("gd.an(Lfs;B)V")
    public void method2928(class154 arg0) {
        arg0.method2980(this.field1734, this.field1731, this.field1730);
    }
}
