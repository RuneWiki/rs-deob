package deob;

@ObfuscatedName("gl")
public class class158 extends class151 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("gl.ap")
    public boolean field1746;

    @ObfuscatedName("gl.aw")
    public byte field1742;

    @ObfuscatedName("gl.ak")
    public byte field1745;

    @ObfuscatedName("gl.aj")
    public byte field1743;

    @ObfuscatedName("gl.ai")
    public byte field1744;

    public class158(class154 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("gl.ap(Lvl;I)V")
    public void method3401(class558 arg0) {
        this.field1746 = arg0.method9258() == 1;
        this.field1742 = arg0.method9259();
        this.field1745 = arg0.method9259();
        this.field1743 = arg0.method9259();
        this.field1744 = arg0.method9259();
    }

    @ObfuscatedName("gl.aw(Lgy;I)V")
    public void method3402(class162 arg0) {
        arg0.field1772 = this.field1746;
        arg0.field1773 = this.field1742;
        arg0.field1777 = this.field1745;
        arg0.field1791 = this.field1743;
        arg0.field1776 = this.field1744;
    }
}
