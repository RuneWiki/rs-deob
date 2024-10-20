package deob;

@ObfuscatedName("fs")
public class class153 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("fs.az")
    public int field1723;

    public class153(class162 arg0) {
        this.this$0 = arg0;
        this.field1723 = -1;
    }

    @ObfuscatedName("fs.az(Lur;B)V")
    public void method3001(class535 arg0) {
        this.field1723 = arg0.method8670();
        arg0.method8462();
        if (arg0.method8462() != 255) {
            arg0.field5233--;
            arg0.method8469();
        }
    }

    @ObfuscatedName("fs.ah(Lgi;B)V")
    public void method3000(class165 arg0) {
        arg0.method3109(this.field1723);
    }
}
