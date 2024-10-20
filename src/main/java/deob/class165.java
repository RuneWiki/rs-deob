package deob;

@ObfuscatedName("gk")
public class class165 extends class143 {

    // $FF: synthetic field
    public final class146 this$0;

    @ObfuscatedName("gk.at")
    public long field1775;

    @ObfuscatedName("gk.an")
    public String field1776;

    public class165(class146 arg0) {
        this.this$0 = arg0;
        this.field1775 = -1L;
        this.field1776 = null;
    }

    @ObfuscatedName("gk.at(Ltz;B)V")
    public void method2929(class501 arg0) {
        if (arg0.method8129() != 255) {
            arg0.field5017--;
            this.field1775 = arg0.method8135();
        }
        this.field1776 = arg0.method8128();
    }

    @ObfuscatedName("gk.an(Lfs;B)V")
    public void method2928(class154 arg0) {
        arg0.method2983(this.field1775, this.field1776);
    }
}
