package deob;

@ObfuscatedName("gl")
public class class159 extends class167 {

    // $FF: synthetic field
    public final class168 this$0;

    @ObfuscatedName("gl.ac")
    public int field1750;

    public class159(class168 arg0) {
        this.this$0 = arg0;
        this.field1750 = -1;
    }

    @ObfuscatedName("gl.ac(Lvf;B)V")
    public void method3287(class551 arg0) {
        this.field1750 = arg0.method9119();
        arg0.method8955();
        if (arg0.method8955() != 255) {
            arg0.field5415--;
            arg0.method8980();
        }
    }

    @ObfuscatedName("gl.ae(Lgm;I)V")
    public void method3286(class171 arg0) {
        arg0.method3390(this.field1750);
    }
}
